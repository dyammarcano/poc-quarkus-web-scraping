package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;


@QuarkusTest
class FraseMotivacionalResourceTest {

    @Test
    void FraceMotivacionalEndpoint() {
        given()
            .when().get("/frase-motivacional")
            .then()
            .statusCode(200);
    }
}