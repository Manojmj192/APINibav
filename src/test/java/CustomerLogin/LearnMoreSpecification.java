package CustomerLogin;


import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;

public class LearnMoreSpecification {

	
	@Test
	public void PostSpecification() {
		
		
		String Jsonbody ="{\r\n"
				+ "        \"productTags\": [\r\n"
				+ "            \"ros\",\r\n"
				+ "            \"persons\",\r\n"
				+ "            \"external-size\",\r\n"
				+ "            \"payload\",\r\n"
				+ "            \"ros-shortText\",\r\n"
				+ "            \"ros-text\"\r\n"
				+ "        ],\r\n"
				+ "        \"tags\": [\r\n"
				+ "            \"explore-now\"\r\n"
				+ "        ],\r\n"
				+ "        \"outerTags\": [\r\n"
				+ "            \"ros-shortText\",\r\n"
				+ "            \"ros-text\"\r\n"
				+ "        ]\r\n"	
				+ "    }";
		
		
		given().contentType("application/json").body(Jsonbody)
		.when().post("https://dev01.nibavlifts.com/api/v1/products/learn-more/series-iii-max/specification")
		.then().statusCode(201).log().all();
		
		
		
		
		
		

	}
	
	
	
	
	
}
