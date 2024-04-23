package ResponseBodyValidation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;import static org.testng.Assert.assertEquals;

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


public class Config_save_body {
	
	
	public void Series3_classic() throws FileNotFoundException {
		
		      File file = new File(".//SaveConfig");
		
		      FileReader reader = new FileReader(file);
		     
		      JSONTokener tokner = new JSONTokener(reader);
		      
		      JSONObject obj = new JSONObject(tokner);
		      
		      
		      
		      
		      
		      
		      
		      
		      

	}
	
	
	
	

}
