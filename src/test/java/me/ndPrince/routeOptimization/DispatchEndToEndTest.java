package me.ndPrince.routeOptimization;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import me.ndPrince.routeOptimization.annotation.EndToEndTest;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

@ExtendWith(MockitoExtension.class)
@EndToEndTest
class DispatchEndToEndTest {

    private RequestSpecification requestSpecification;
    private String dispatchUrl = "http://localhost:8080/dispatch";

    @BeforeEach
    void setUp(){
        requestSpecification = given().contentType(ContentType.JSON).accept(ContentType.JSON);
    }

    @Test
    void dispatchRequest_basic() throws JSONException {
        Response response = requestSpecification
                .body(EndToEndTestUtil.normalRequest())
                .post(dispatchUrl);
        response.then().assertThat().statusCode(200);

        JSONObject jsonObject = new JSONObject(response.getBody().jsonPath().prettyPrint());
        // JSONArray vehicleSchedules = jsonObject.getJSONArray("vehicleSchedules"); // can't extract from null
        JSONArray dummyList = jsonObject.getJSONArray("dummyList");
        String id = jsonObject.getString("id");

        assertEquals(3, dummyList.length());
        assertEquals("1", id);
    }

}