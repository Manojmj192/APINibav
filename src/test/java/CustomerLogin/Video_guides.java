package CustomerLogin;

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
import net.minidev.json.JSONArray;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;

public class Video_guides {

	@Test(priority = 1)
	public void statusCode_videoguides() {

		given().contentType(ContentType.JSON).when().get("https://dev01.nibavlifts.com/api/v1/videoGuides/videos")
				.then().statusCode(200).log().all();

	}

	@Test(priority = 2)
	public void responseBody_videoguides() {

		Response response = given().contentType(ContentType.JSON).when()
				.get("https://dev01.nibavlifts.com/api/v1/videoGuides/videos");

		String string = response.jsonPath().get("product[3].label").toString();

		Assert.assertEquals("series-iii-max", string);

		String string2 = response.jsonPath().get("product[3].name").toString();
		Assert.assertEquals("Series III Max", string2);

	}

	@Test(priority = 3)
	public void listofProduct() {
		Response response = given().contentType(ContentType.JSON).when()
				.get("https://dev01.nibavlifts.com/api/v1/videoGuides/videos");

		String value = "";

		String asString = response.asString();

		Boolean check = false;

		JSONObject obj = new JSONObject(asString);

		for (int i = 0; i < obj.getJSONArray("product").length(); i++) {

			value = obj.getJSONArray("product").getJSONObject(i).get("name").toString();

			if (value.equals("Series III Classic")) {

				check = true;
				break;

			}

		}

		Assert.assertEquals(true, check);

	}

}
