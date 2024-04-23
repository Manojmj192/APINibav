package CustomerLogin;

import static org.testng.Assert.assertEquals;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.http.Headers;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;

public class Configuration {

	
	public void Conf() {
		
		
		given().contentType(ContentType.JSON)
		
		.when().get("");
		
		
		
		
		
		

	}
	
	
	
	
}
