import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class RequestMethodTest {

    @Test
    public void getRequest() {
        given().log().body()
                .baseUri("https://postman-echo.com")
                .queryParam("foo1", "bar1")
                .queryParam("foo2", "bar2")
                .when()
                .get("/get")
                .then().log().body()
                .assertThat().statusCode(HttpStatus.SC_OK)
                .and().body("args.foo1", equalTo("bar1"))
                .and().body("args.foo2", equalTo("bar2"))
                .and().body("url", equalTo("https://postman-echo.com/get?foo1=bar1&foo2=bar2"));
    }

    @Test
    public void postRequestRawText() {
        String rawText = "This is expected to be sent back as part of response body.";
        given().log().body()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain")
                .body(rawText)
                .when()
                .post("/post")
                .then().log().body()
                .assertThat().statusCode(HttpStatus.SC_OK)
                .and().body("args",anEmptyMap())
                .and().body("data", equalTo(rawText))
                .and().body("files", anEmptyMap())
                .and().body("form", anEmptyMap())
                .and().body("url", equalTo("https://postman-echo.com/post"));
    }

    @Test
    public void postRequestFromData() {
        given().log().body()
                .baseUri("https://postman-echo.com")
                .formParam("foo1", "bar1")
                .formParam("foo2", "bar2")
                .contentType("application/x-www-form-urlencoded; charset=UTF-8")
                .when()
                .post("/post")
                .then().log().body()
                .assertThat().statusCode(HttpStatus.SC_OK)
                .and().body("args", anEmptyMap())
                .and().body("data", emptyString())
                .and().body("form.foo1", equalTo("bar1"))
                .and().body("form.foo2", equalTo("bar2"))
                .and().body("url", equalTo("https://postman-echo.com/post"));
    }

    @Test
    public void putRequest() {
        String dataText = "This is expected to be sent back as part of response body.";
        given().log().body()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain")
                .body(dataText)
                .when()
                .put("/put")
                .then().log().body()
                .assertThat().statusCode(HttpStatus.SC_OK)
                .and().body("args",anEmptyMap())
                .and().body("data", equalTo(dataText))
                .and().body("files", anEmptyMap())
                .and().body("form", anEmptyMap())
                .and().body("url", equalTo("https://postman-echo.com/put"));
    }

    @Test
    public void patchRequest() {
        String dataText = "This is expected to be sent back as part of response body.";
        given().log().body()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain")
                .body(dataText)
                .when()
                .patch("/patch")
                .then().log().body()
                .assertThat().statusCode(HttpStatus.SC_OK)
                .and().body("args",anEmptyMap())
                .and().body("data", equalTo(dataText))
                .and().body("files", anEmptyMap())
                .and().body("form", anEmptyMap())
                .and().body("url", equalTo("https://postman-echo.com/patch"));
    }

    @Test
    public void deleteRequest() {
        String dataText = "This is expected to be sent back as part of response body.";
        given().log().body()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain")
                .body(dataText)
                .when()
                .delete("/delete")
                .then().log().body()
                .assertThat().statusCode(HttpStatus.SC_OK)
                .and().body("args",anEmptyMap())
                .and().body("data", equalTo(dataText))
                .and().body("files", anEmptyMap())
                .and().body("form", anEmptyMap())
                .and().body("url", equalTo("https://postman-echo.com/delete"));
    }
}