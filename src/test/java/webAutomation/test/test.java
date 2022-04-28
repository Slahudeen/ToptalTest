package webAutomation.test;

import org.junit.Test;
import
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Response;
import org.openqa.selenium.support.ui.Select;

public class test {

    utils shUtils = new utils();
    public static void main(String[] args) throws InterruptedException {

    }

    @Test
    public void toptal1() {
        io.restassured.internal.RestAssuredResponseImpl response = utils.toptal1();
        System.out.println(response.getBody().asString());
        assert (response.path("page").equals(2));
        assert (response.getStatusCode() == 200);
    }

    @Test
    public void toptal2() {
        io.restassured.internal.RestAssuredResponseImpl response = utils.toptal2();
        System.out.println(response.getBody().toString());
        System.out.println(response.getStatusCode());
        assert (response.getStatusCode() == 200);
    }

    @Test
    public void toptal3() {
        io.restassured.internal.RestAssuredResponseImpl response = utils.toptal3();
        System.out.println(response.getBody().toString());
        System.out.println(response.getStatusCode());
    }

    @Test
    public void toptal4() {
        io.restassured.internal.RestAssuredResponseImpl response = utils.toptal4();
        System.out.println(response.getBody().toString());
        System.out.println(response.getStatusCode());
    }

    @Test
    public void toptal5() {
        io.restassured.internal.RestAssuredResponseImpl response = utils.toptal5();
        System.out.println(response.getBody().toString());
        System.out.println(response.getStatusCode());
    }
}
