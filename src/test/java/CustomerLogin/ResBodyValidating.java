package CustomerLogin;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.http.Headers;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;

public class ResBodyValidating {

	@Test(priority = 1)
	public void resBodyforSeriesiiiClassic() {// validating the Series-iii-classic name and price

		Response res = given().contentType(ContentType.JSON)

				.when().get("https://dev01.nibavlifts.com/api/v1/products/landing-page");

		String string = res.jsonPath().get("products[3].name").toString();
		Assert.assertEquals(string, "Series III Classic");

		String string2 = res.jsonPath().get("products[3].priceFrom").toString();
		Assert.assertEquals(string2, "990000");

	}
	
	

	@Test(priority = 2)
	public void resbodyforSeriesiiiMax() { // validating the Series-iii-max name and price

		Response res = given().contentType("ContentType.JSON")

				.when().get("https://dev01.nibavlifts.com/api/v1/products/landing-page");

		String string = res.jsonPath().get("products[2].name").toString();

		Assert.assertEquals(string, "Series III Max");

		String string2 = res.jsonPath().get("products[2].priceFrom").toString();
		Assert.assertEquals(string2, "1290000");
            
		
		
		
	}

	
	
	
	
	
}
