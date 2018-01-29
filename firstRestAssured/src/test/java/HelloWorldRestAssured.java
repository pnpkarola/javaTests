/**
 * Created by karol on 30.05.17.
 */

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;
import org.testng.Assert;

import static io.restassured.RestAssured.given;

// import static io.restassured.RestAssured.given;

public class HelloWorldRestAssured {


    @Test
    public void makeSureThatGoogleIsUp() {

        given().when().get("http://white-dev.isaacloud.com/api/users/59020c0246e0fb000ae1441a").then().statusCode(200);
    }


//
//        @Test
//        public void signupCupclub() {
//              Response resp =  given().contentType("application/json").body("{\"name\":\"Jimi Hendrix\"}").when().post("http://white-dev.isaacloud.com/api/users").then().extract().response();
//            String responseBody = resp.getBody().asString();
//            System.out.println("XXXXX"+responseBody);
//        }

    @Test
    public void signupCupclub() {
        Response resp = given().contentType("application/json").body("{ \"password\": \"Karol2017@\", \"repassword\": \"Karol2017@\", \"email\": \"v6Ccq9@frisby.soi\" }").when().post("http://white-dev.isaacloud.com/api/users").then().extract().response();
        String responseBody = resp.getBody().asString();
        String rr = resp.print();
        System.out.println("XXXXX" + responseBody);
    }

    @Test
    public void LoginCupclub() {
        Response resp = given().contentType("application/json").header("authorization", "Basic SnZORnV4dXBsTW1ocnVWQGZyaXNieS5zb2k6S2Fyb2wyMDE3QA==").body("{}").when().post("http://white-dev.isaacloud.com/api/users").then().extract().response();
        String responseBody = resp.getBody().asString();
        System.out.println("ResponseBody" + responseBody);
        String rr = resp.print();

    }

    @Test
    public void GetWeatherDetails() {
        // Specify the base URL to the RESTful web service
        RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";

        // Get the RequestSpecification of the request that you want to sent
        // to the server. The server is specified by the BaseURI that we have
        // specified in the above step.
        RequestSpecification httpRequest = RestAssured.given();

        // Make a request to the server by specifying the method Type and the method URL.
        // This will return the Response from the server. Store the response in a variable.
        Response response = httpRequest.request(Method.GET, "/Hyderabad");
        int statusCodeActual = response.getStatusCode();
        System.out.println("STATUS CODE: " + statusCodeActual);
        Assert.assertEquals(200, statusCodeActual,"CORRECT");
        Assert.assertEquals(statusCodeActual /*actual value*/, 200 /*expected value*/, "Correct status code returned");

        Headers allHeaders = response.getHeaders();
        System.out.println("HEADERS"+allHeaders);
        for(Header header : allHeaders)
        {
            System.out.println("Key: " + header.getName() + " Value: " + header.getValue());
        }




        // Now let us print the body of the message to see what response
        // we have recieved from the server
        String responseBody = response.getBody().asString();
        System.out.println("Response Body is =>  " + responseBody);


    }

}





