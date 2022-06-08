package base;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class APIbaseOperations {

    @Test
    public void getMethodWithRestAssured(){
        when().get();
    }

    @Test
    public void assertionUseCase(){
        when().get().then().assertThat().statusCode(200);
        when().get().then().assertThat().body("JsonPath", equalTo(""));
    }
}
