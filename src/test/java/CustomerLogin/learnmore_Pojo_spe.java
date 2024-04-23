package CustomerLogin;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;

import java.util.List;

import Pojo_Class.Specification_Pojoclass;

public class learnmore_Pojo_spe extends Specification_Pojoclass {

//	@Test
	public void learn() {

		Specification_Pojoclass data = new Specification_Pojoclass();

		data.setProductTags(List.of("ros", "persons", "external-size", "payload", "ros-shortText", "ros-text"));

		data.setTags(List.of("explore-now"));
		data.setOuterTags(List.of("ros-shortText", "ros-text"));

		given().contentType("application/json").body(data)

				.when().post("https://dev01.nibavlifts.com/api/v1/products/learn-more/series-iii-max/specification")

				.then().statusCode(201).log().all();

	}

	@Test
	public void second() {

		Specification_Pojoclass m = new Specification_Pojoclass();
		m.setProductTags(List.of("ros", "persons", "external-size", "payload", "ros-shortText", "ros-text"));
		m.setTags(List.of("explore-now"));
		m.setOuterTags(List.of("\"ros-shortText\",\r\n" + "        \"ros-text\""));

		given().contentType("application/json").body(m).when()
				.post("https://dev01.nibavlifts.com/api/v1/products/learn-more/series-iii-max/specification").then()
				.statusCode(201).log().all();

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
