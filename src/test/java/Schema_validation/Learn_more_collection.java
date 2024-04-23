package Schema_validation;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.http.Headers;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;

public class Learn_more_collection {

	@Test(priority = 1)
	public void learnmore_S3_classic_collection() {

		given().

				when().get("https://dev01.nibavlifts.com/api/v1/products/learn-more/series-iii-classic/features")

				.then().assertThat()
				.body(JsonSchemaValidator.matchesJsonSchemaInClasspath("Learnmore_ collection.json"));

	}
	
	

	@Test(priority = 2)
	public void learnmore_s3_max_collection() {
		
		given()
		
		.when().get("https://dev01.nibavlifts.com/api/v1/products/learn-more/series-iii-max/features")
		
		.then().assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("Learnmore_ collection.json"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
