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
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import net.minidev.json.JSONArray;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;

public class Save_config {

	
	@Test
	public void saveconfig() throws FileNotFoundException {
		
		File file = new File(".//SaveConfig.json");
		FileReader reader = new FileReader(file);
		
		JSONTokener token = new JSONTokener(reader) ;
		
		JSONObject object = new JSONObject(token);
		
		String string = object.toString();
		
		
		
		
		given().contentType(ContentType.JSON).body(string)
		.when().post("https://dev01.nibavlifts.com/api/v1/products/configurations/series-iii-classic")
		
		
		
		
		
		
		

	}

}
