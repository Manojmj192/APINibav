package CustomerLogin;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;

import org.json.JSONObject;
import org.json.JSONTokener;


public class LandingPage_Externel {

	@Test
	public void landing() throws FileNotFoundException {
		
		File file = new File(".//body.Json");
		
	    FileReader reader = new FileReader(file);
	    
	    JSONTokener json =  new JSONTokener(reader);
	    
	    JSONObject data = new JSONObject(json);
	    
	    
	    
	    given().contentType("application/json").body(data.toString())
	    .when().post("https://dev01.nibavlifts.com/api/v1/products/learn-more/series-iii-max/specification")
        .then().statusCode(201).log().all();	    
	    
	    
	    
	    
	    
	    
	    
	    
		

	}
	
	
	
	
	
}
