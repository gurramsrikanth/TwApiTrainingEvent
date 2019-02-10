import io.restassured.RestAssured;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class SimpleDelete {
    @BeforeSuite
    public void initializeBaseUrl(){
        RestAssured.baseURI = "https://play.dhis2.org/2.29/api/29/";
        RestAssured.basePath = "attributes";
    }

    @Test
    public void testDelete(){
        given()
                .contentType("application/json")
                .auth()
                .preemptive()
                .basic("admin", "district")
                .when()
                .delete("/CAr86MCa4Jq")
                .then()
                .statusCode(200)
                .and()
                .assertThat()
                .body("httpStatus", equalTo("OK"));
    }

}
