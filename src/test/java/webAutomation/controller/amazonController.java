package webAutomation.controller;

import io.restassured.RestAssured;
import org.json.JSONObject;
import org.junit.Test;
import org.openqa.selenium.remote.Response;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class amazonController {


    public static io.restassured.internal.RestAssuredResponseImpl toptal1(){
        baseURI = "https://reqres.in";
        io.restassured.internal.RestAssuredResponseImpl response =
                (io.restassured.internal.RestAssuredResponseImpl) given()
                        .queryParam("page", 2)
                        .get("/api/users");
        return response;

    }
    public static io.restassured.internal.RestAssuredResponseImpl toptal2(){
        baseURI = "https://reqres.in";
        io.restassured.internal.RestAssuredResponseImpl response =
                (io.restassured.internal.RestAssuredResponseImpl) given()
                        .body("").get("/api/users/2");
        return response;

    }
    public static io.restassured.internal.RestAssuredResponseImpl toptal3(){
        baseURI = "https://reqres.in";
        JSONObject obj = new JSONObject();
        obj.put("name","John");
        obj.put("job","Tester");


        io.restassured.internal.RestAssuredResponseImpl response =
                (io.restassured.internal.RestAssuredResponseImpl) given()
                        .body(obj.toString()).post("/api/users");
        return response;

    }
    public static io.restassured.internal.RestAssuredResponseImpl toptal4(){
        baseURI = "https://reqres.in";
        io.restassured.internal.RestAssuredResponseImpl response =
                (io.restassured.internal.RestAssuredResponseImpl) given()
                        .body("").delete("/api/users/2");
        return response;

    }
    public static io.restassured.internal.RestAssuredResponseImpl toptal5(){
        baseURI = "https://reqres.in";
        JSONObject obj = new JSONObject();
        obj.put("email","webAutomation.test.test@qa");
        io.restassured.internal.RestAssuredResponseImpl response =
                (io.restassured.internal.RestAssuredResponseImpl) given()
                        .body(obj.toString()).post("/api/register");
        return response;

    }
}
