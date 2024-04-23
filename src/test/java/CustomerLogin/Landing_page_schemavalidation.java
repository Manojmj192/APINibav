package CustomerLogin;


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


public class Landing_page_schemavalidation {

	@Test
	public void land_schema() {
		
		
		given()
		.when().get("https://dev01.nibavlifts.com/api/v1/products/landing-page")
		.then()
		.assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("landingPage.json"));
		

	}
	
	
	
	
	
}
