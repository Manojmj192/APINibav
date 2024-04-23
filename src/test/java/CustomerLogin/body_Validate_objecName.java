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

public class body_Validate_objecName {

	@Test
	public void Validate() {

		Response res = given().contentType(ContentType.JSON).when()
				.get("https://dev01.nibavlifts.com/api/v1/products/landing-page");

		String asString = res.asString();

		boolean Check = false;

		JSONObject obj = new JSONObject(asString);

		for (int i = 0; i < obj.getJSONArray("products").length(); i++) {

			String string = obj.getJSONArray("products").getJSONObject(i).get("name").toString();

			System.out.println(string);
			if (string.equals("Series III Classic")) {

				Check = true;
				break;

			}

		}

		
		 Assert.assertEquals(Check, true);
		
	}

}
