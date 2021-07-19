package org.example;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONException;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;


import static org.hamcrest.Matchers.is;

public class RestTest {
    @Test
    public void getRequestTest() {
        RestAssured.
                when().get("https://reqres.in/api/users/2").
                then().assertThat().statusCode(200).
                and().body("data.email", is("janet.weaver@reqres.in"));
    }

    @Test
    public void postRequestTest() throws JSONException {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "Mihail");
        requestBody.put("job", "manager");
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        request.body(requestBody.toString());
        Response response = request.post("https://reqres.in/api/users");
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 201);
    }

    @Test
    public void putRequestTest() throws JSONException {
        RestAssured.baseURI = "https://reqres.in/api/users/";
        RequestSpecification request = RestAssured.given();
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "Sergey");
        requestBody.put("job", "developer");
        request.body(requestBody.toString());
        Response response = request.put("2");
        int statusCode = response.getStatusCode();
        System.out.println(response.asString());
        Assert.assertEquals(statusCode, 200);
    }

    @Test
    public void deleteRequestTest() {
        RestAssured.baseURI = "https://reqres.in/api/users/";
        RequestSpecification request = RestAssured.given();
        Response response = request.delete("2");
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 204);
    }
}

