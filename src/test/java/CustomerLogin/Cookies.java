package CustomerLogin;

import org.testng.annotations.Test;

import io.restassured.http.Headers;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;

import java.util.Map;

public class Cookies {

//	@Test(priority = 1)
	public void cook() {

		Response res = when().get("https://www.google.com/");

		String cookie = res.getCookie("AEC");
		System.out.println("Cookies for AEC" + cookie);

	}

//	@Test(priority = 2)
	public void allcook() {

		Response response = when().get("https://www.google.com/");
		Map<String, String> cookies = response.getCookies();

		for (String s : cookies.keySet()) {

			String cookie = response.getCookie(s);
			System.out.println(s + " " + cookie);

		}

	}

	@Test
	public void testHeader() {
		
		Response response = when().get("https://www.google.com/");
		
		Headers headers = response.getHeaders();
		
		System.out.println(headers);
		
		
		
		

	}

}
