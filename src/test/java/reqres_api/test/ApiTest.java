package reqres_api.test;

import reqres_api.pojo.SendUserData;
import reqres_api.specification.ApiSpecification;
import reqres_api.pojo.ResponseUserData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class ApiTest {

    private final static String URL = "https://reqres.in";

    @Test
    public void testSingleResource() {
        String getUri = "/api/unknown/2";
        String checkText = "To keep ReqRes free, contributions towards server costs are appreciated!";

        ApiSpecification.installSpec(ApiSpecification.requestSpec(URL), ApiSpecification.responseSpec(200));

        ResponseUserData responseUserData = given()
                .when()
                .get(getUri)
                .then().log().all()
                .extract().body().jsonPath()
                .getObject("support", ResponseUserData.class);

        Assert.assertEquals(responseUserData.getText(), checkText);

    }

    @Test
    public void testSingleUserNotFound() {
        String getUri = "/api/users/23";

        ApiSpecification.installSpec(ApiSpecification.requestSpec(URL), ApiSpecification.responseSpec(404));

        given()
                .when()
                .get(getUri)
                .then().log().all();
    }

    @Test
    public void testListUsers() {
        String getUri = "/api/users?page=2";
        String checkAvatar = "https://reqres.in/img/faces/%d-image.jpg";
        ApiSpecification.installSpec(ApiSpecification.requestSpec(URL),
                ApiSpecification.responseSpec(200));
        List<ResponseUserData> userData = given()
                .when()
                .get(getUri)
                .then().log().all()
                .extract().body().jsonPath().getList("data", ResponseUserData.class);
        userData.forEach(x -> Assert.assertEquals(String.format(checkAvatar, x.getId()), x.getAvatar()));
        Assert.assertTrue(userData.stream().allMatch(x -> x.getEmail().endsWith("@reqres.in")));
    }

    @Test
    public void testRegisterSuccessful() {
        String postUri = "/api/register";
        String postEmail = "eve.holt@reqres.in";
        String postPassword = "pistol";
        String checkToken = "QpwL5tke4Pnpja7X4";
        Integer checkId = 4;

        ApiSpecification.installSpec(ApiSpecification.requestSpec(URL), ApiSpecification.responseSpec(200));
        SendUserData sendUserData = new SendUserData(postEmail, postPassword);
        ResponseUserData responseUserData = given()
                .body(sendUserData)
                .when()
                .post(postUri)
                .then().log().all()
                .extract().as(ResponseUserData.class);

        Assert.assertNotNull(responseUserData.getId());
        Assert.assertNotNull(responseUserData.getToken());
        Assert.assertEquals(checkId, responseUserData.getId());
        Assert.assertEquals(checkToken, responseUserData.getToken());
    }

    @Test
    public void testRegisterUnsuccessful() {
        String postUri = "/api/register";
        String postEmail = "sydney@fife";
        String checkError = "Missing password";
        ApiSpecification.installSpec(ApiSpecification.requestSpec(URL), ApiSpecification.responseSpec(400));
        SendUserData sendUserData = new SendUserData(postEmail);
        ResponseUserData responseUserData = given()
                .body(sendUserData)
                .when()
                .post(postUri)
                .then().log().all()
                .extract().as(ResponseUserData.class);
        Assert.assertNotNull(responseUserData.getError());
        Assert.assertEquals(responseUserData.getError(), checkError);
    }

    @Test
    public void testListResource() {
        String getUri = "/api/unknown";
        ApiSpecification.installSpec(ApiSpecification.requestSpec(URL), ApiSpecification.responseSpec(200));
        List<ResponseUserData> responseUserData = given()
                .when()
                .get(getUri)
                .then().log().all()
                .extract().body().jsonPath().getList("data", ResponseUserData.class);
        List<String> actualYears = responseUserData.stream().map(ResponseUserData::getYear).toList();
        List<String> expectedYears = actualYears.stream().sorted().toList();
        Assert.assertEquals(actualYears, expectedYears);
    }

    @Test
    public void testDelete() {
        String deleteUri = "/api/users/2";
        ApiSpecification.installSpec(ApiSpecification.requestSpec(URL), ApiSpecification.responseSpec(204));
        given()
                .when()
                .delete(deleteUri)
                .then().log().all();
    }
}
