import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;
import pojos.MergeRequestsResponse;

import static io.restassured.RestAssured.given;

public class MergeTest {

    @Test
    public void getMergeRequestsTest(){
        System.out.println("Hello");
        MergeRequestsResponse response =
                given().log().all()
                        .when()
                        .queryParam("scope","all")
                        .queryParam("state","opened")
                        .contentType(ContentType.JSON)
                        .header("Authorization","Bearer ")
                        .get("https://gitlab.com/api/v4/projects/38089268/merge_requests")
                        .then().log().all()
                        .statusCode(200)
                        .extract()
                        .body()
                        .as(MergeRequestsResponse.class);
        System.out.println(response);
    }
}
