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

public class Products_learnmore {
	
	@Test(priority=1)
	public void learmoremax() {
		
		given()
		
		.when().get("https://dev01.nibavlifts.com/api/v1/products/learn-more/series-iii-max")
		
		.then().assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("Products_learnmore_Schema.json"));
		
		

	}
	
	@Test(priority=2)
    public void learnmoreClassic() {
		
    	given()
    	
    	.when().get("https://dev01.nibavlifts.com/api/v1/products/learn-more/series-iii-classic")
    	
    	.then().assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("Products_learnmore_Schema.json"));
    	

	}	
	
	

}
