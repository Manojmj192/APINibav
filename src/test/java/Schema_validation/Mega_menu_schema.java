package Schema_validation;

import static org.testng.Assert.assertEquals;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.http.Headers;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;

public class Mega_menu_schema {

	
	@Test
	private void megamenu() {
		// TODO Auto-generated method stub

		given()

				.when().get("https://dev01.nibavlifts.com/api/v1/products/mega-menu")

				.then().assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("Megamenu.json"));

		
		
	}

	
}
