package CustomerLogin;

import java.util.HashMap;
import java.util.Map;
import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.http.Headers;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;
public class Language_configuration {

	@Test
	public void langConfig() {
	
		Map<String,String>  mp = new HashMap<>();
		mp.put("locale", "fr-FR");
		
		
		
		given().headers(mp)
		
		.when().get("https://dev01.nibavlifts.com/api/v1/products/configurations/series-iii-classic")
		
		.then().statusCode(200).log().all();
		
		
		

	}
	
	
}
