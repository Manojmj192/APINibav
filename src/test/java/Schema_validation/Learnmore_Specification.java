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

public class Learnmore_Specification {

	@Test(priority=1)
	public void Learmore_S3_classic() throws FileNotFoundException {

		File file = new File("C:\\Users\\Manoj\\eclipse-workspace\\APINibav\\body.Json");

		FileReader reader = new FileReader(file);

		JSONTokener json = new JSONTokener(reader);

		JSONObject obj = new JSONObject(json);

		given().contentType("application/json").body(obj.toString())

				.when().post("https://dev01.nibavlifts.com/api/v1/products/learn-more/series-iii-classic/specification")

				.then().assertThat()
				.body(JsonSchemaValidator.matchesJsonSchemaInClasspath("LearnMore_Specification.json"));

	}
	
	
     @Test(priority=2)
	public void Learnmore_S3_max() throws FileNotFoundException {

		File file = new File(".//body.json");
		FileReader reader = new FileReader(file);

		JSONTokener json = new JSONTokener(reader);

		JSONObject data = new JSONObject(json);

		String string = data.toString();

		given().contentType(ContentType.JSON).body(string)

				.when().post("https://dev01.nibavlifts.com/api/v1/products/learn-more/series-iii-max/specification")

				.then().assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("LearnMore_Specification.json")).log().all();

	}

     
     
     
}
