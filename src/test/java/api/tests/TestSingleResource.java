package api.tests;

import api.pojo.ResponseSingleResource;
import api.config.ApiSpec;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class TestSingleResource {

    private final static String URL = "https://reqres.in/";

    @Test
    public void responseSingleResource() {

        String text = "To keep ReqRes free, contributions towards server costs are appreciated!";

        ApiSpec.installSpec(ApiSpec.requestSpec(URL),
                ApiSpec.responseSpec(200));

       ResponseSingleResource responseSingleResource = given()
                .when()
                .get("api/unknown/2")
                .then().log().all()
                .extract().body().jsonPath()
                       .getObject("support", ResponseSingleResource.class);

       Assert.assertEquals(responseSingleResource.getText(),text);

    }
}
