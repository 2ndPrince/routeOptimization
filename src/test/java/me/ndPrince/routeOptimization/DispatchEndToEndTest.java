package me.ndPrince.routeOptimization;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import me.ndPrince.routeOptimization.annotation.EndToEndTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.IOException;

import static io.restassured.RestAssured.given;

@ExtendWith(MockitoExtension.class)
@EndToEndTest
class DispatchEndToEndTest {

    private RequestSpecification requestSpecification;
    private String dispatchUrl = "localhost:8080/dispatch";

    @BeforeEach
    void setUp(){
        requestSpecification = given().contentType(ContentType.JSON).accept(ContentType.JSON);
    }

    @Test
    void dispatchRequest_basic() throws IOException {
        try{
            Response response = requestSpecification
                    .body(EndToEndTestUtil.normalRequest())
                    .post(dispatchUrl);
            response.then().assertThat().statusCode(200);
        } finally {

        }

    }

}