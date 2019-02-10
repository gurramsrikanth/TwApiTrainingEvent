import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class SImpleGetTest {

    @Test
    public void testGet(){
        given()
                .auth()
                .preemptive()
                .basic("admin", "district")
                .pathParam("dataElementId", "pnyc4lIW5CD")
                .when()
                .get("https://play.dhis2.org/2.29/api/29/dataElements/{dataElementId}")
                .then()
                .assertThat()
                .statusCode(200);

    }
}
