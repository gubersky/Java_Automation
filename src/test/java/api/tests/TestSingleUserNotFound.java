package api.tests;

import api.config.ApiSpec;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class TestSingleUserNotFound {

    private final static String URL = "https://reqres.in/";

    @Test
    public void userNotFound(){

        ApiSpec.installSpec(ApiSpec.requestSpec(URL),
        ApiSpec.responseSpec(404));

        given()
                .when()
                .get("api/users/23")
                .then().log().all();
    }
}
