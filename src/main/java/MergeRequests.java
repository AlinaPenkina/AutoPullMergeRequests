//import javax.xml.ws.Response;
//import static io.restassured.RestAssured.given;
//
//
//public class MergeRequests {
//    public static void getMergeRequests(){
//        Response response =
//                given().log().all()
//                        .when()
//                        .queryParam("scope","all")
//                        .queryParam("state","opened")
//                        .header("Authorization","Bearer glpat--Lz7zhn1XaXEdySiMcG9")
//                        .get("https://gitlab.com/api/v4/projects/38089268/merge_requests")
//                        .then().log().all()
//                        .statusCode(200)
//                        .extract()
//                        .body()
//                        .jsonPath().get();
//        System.out.println(response);
//    }
//}
