package Schema_validation;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.http.Headers;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;

public class Config_Schema {

	@Test(priority=1)
	public void Config_S3_Classic() {

		given()

				.when().get("https://dev01.nibavlifts.com/api/v1/products/configurations/series-iii-classic")

				.then().assertThat()
				.body(JsonSchemaValidator.matchesJsonSchemaInClasspath("Configuration_Schema.json"));

	}
    @Test(priority=2)
	public void Config_S3_Max() {

		given().when().get("https://dev01.nibavlifts.com/api/v1/products/configurations/series-iii-max").then()
				.assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("Configuration_Schema.json"));

	}

}
