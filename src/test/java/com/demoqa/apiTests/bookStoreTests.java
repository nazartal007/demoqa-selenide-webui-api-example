package com.demoqa.apiTests;

import com.demoqa.apiTests.models.Book;
import com.demoqa.apiTests.models.UserBooks;
import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class bookStoreTests {

    @Test()
    @Description("Проверяем что приходит 8 книг")
    public void getBooks() {
        UserBooks userBooks =
                given()
                        .spec(Specs.request).
                when()
                        .get("/BookStore/v1/Books").
                then()
                        .spec(Specs.response200)
                        .extract().as(UserBooks.class);

        Assertions.assertEquals(8, userBooks.getBooks().size());
    }

    @Test()
    @Description("Проверяем что приходит нужная книга")
    public void getBook() {
        Book book =
                given()
                        .spec(Specs.request)
                        .param("ISBN", "9781449325862").
                when()
                        .get("/BookStore/v1/Book").
                then()
                        .spec(Specs.response200)
                        .extract().as(Book.class);

        Assertions.assertEquals("Git Pocket Guide", book.getTitle());
    }

    @Test()
    @Description("Проверяем что приходит 8 книг")
    public void postUser() {
        JSONObject requestParams = new JSONObject();
        requestParams
                .put("FirstName", "Virender")
                .put("LastName", "Singh");

        Response response =
                given()
                        .spec(Specs.request)
                        .header("Content-Type", "application/json")
                        .body(requestParams.toString()).
                when()
                        .post("Account/v1/User");

        Assertions.assertEquals(400, response.getStatusCode());
        Assertions.assertEquals("UserName and Password required.", response.jsonPath().get("message"));

    }

    @Test()
    @Description("Проверяем что приходит 8 книг")
    public void postUser2() {
        JSONObject requestParams = new JSONObject();
        requestParams
                .put("userName", "Virender")
                .put("password", "Singh");

        Response response =
                given()
                        .spec(Specs.request)
                        .header("Content-Type", "application/json")
                        .body(requestParams.toString()).
                when()
                        .post("Account/v1/User");

        Assertions.assertEquals(400, response.getStatusCode());
        Assertions.assertEquals("Passwords must have at least one non alphanumeric character," +
                " one digit ('0'-'9'), one uppercase ('A'-'Z'), one lowercase ('a'-'z'), one special" +
                " character and Password must be eight characters or longer.", response.jsonPath().get("message"));
    }
}
