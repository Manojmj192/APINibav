package ResponseBodyValidation;

import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ConfigBody {

//	@Test
	public void langConfig() {

		Map<String, String> mp = new HashMap<>();
		mp.put("locale", "fr-FR");

		given().headers(mp)

				.when().get("https://dev01.nibavlifts.com/api/v1/products/configurations/series-iii-classic")

				.then().statusCode(200).log().all();

	}

//	@Test
	public void Series3_classic_Config() {

		Response response = given().contentType(ContentType.JSON)

				.when().get("https://dev01.nibavlifts.com/api/v1/products/configurations/series-iii-classic");

		String string = response.jsonPath().get("configurations[0].variation.value").toString();

		Assert.assertEquals(string, "series-iii-classic");

		String string2 = response.jsonPath().get("configurations[0].specifications.noOfPersons").toString();
		Assert.assertEquals(string2, "2");

		String string3 = response.jsonPath().get("configurations[0].specifications.payload").toString();

		Assert.assertEquals(string3, "210");

		JsonPath jsonPath = response.jsonPath();

		Assert.assertEquals(jsonPath.getString("configurations[0].specifications.noOfStops"), "3");
		Assert.assertEquals(jsonPath.getString("configurations[0].priceFrom"), "990000");
		Assert.assertEquals(jsonPath.getString("configurations[0].advancedPrice"), "250000");
		Assert.assertEquals(jsonPath.getString("configurations[0].sections.assurancePackage.title"),
				"Assurance Package");

	}

//	@Test
	public void Series3_Max_Config() {

		Response response = given().contentType(ContentType.JSON).when()
				.get("https://dev01.nibavlifts.com/api/v1/products/configurations/series-iii-classic");

		String string = response.asString();

		Boolean check = false;

		JSONObject obj = new JSONObject(string);

		for (int i = 0; i < obj.getJSONArray("configurations").length(); i++) {

			String string2 = obj.getJSONArray("configurations").getJSONObject(i).get("value").toString();

			System.out.println(string2);

			if (string2.equals("series-iii-classic")) {

				check = true;
				break;

			}

			Assert.assertEquals(check, true);

		}

	}
	
	
	
	
    @Test
	public void loopcheck() {

		Boolean check = false;

		Response response = given().contentType(ContentType.JSON)

				.when().get("https://dev01.nibavlifts.com/api/v1/products/configurations/series-iii-classic");

		String asString = response.asString();

		JSONObject obj = new JSONObject(asString);

		JSONArray jsonArray = obj.getJSONArray("configurations");

		for (int i = 0; i < jsonArray.length(); i++) {

			JSONObject jsonObject = jsonArray.getJSONObject(i);

			if (jsonObject.has("variation")) {

				JSONObject jsonObject2 = jsonObject.getJSONObject("variation");

				if (jsonObject2.has("value")) {

					String string = jsonObject2.get("value").toString();

					if (string.equals("series-iii-classic")) {

						check = true;
						break;

					}

				}

			}

		}

		Assert.assertEquals(check, true);

	}
    
    public void normalcond() {
		
    	

	}
    
    
    
    
    
    

}
