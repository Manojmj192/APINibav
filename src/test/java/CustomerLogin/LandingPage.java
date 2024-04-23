package CustomerLogin;


import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;


public class LandingPage {
	
	@Test
	public void getLanding() {
		
		given()
		.when().get("https://dev01.nibavlifts.com/api/v1/products/landing-page")
		.then()
		   .statusCode(200)
		   .log().all();
		
		
		
		

	}
	
	
	
	
	
	

}
