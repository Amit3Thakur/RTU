package depenedency;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.chrome.ChromeDriver;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Adddevice {
	static WebDriver driver;

	public Adddevice(WebDriver driver) {
		this.driver = driver;

	}

	public static void Adddevice() throws InterruptedException, IOException {

		driver.findElement(By.xpath("(//a[@href='#/device'])[2]")).click();
		Thread.sleep(2000);

//		driver.findElement(By.xpath("//a[@id='one-tab']")).click();
//		Thread.sleep(2000);

		WebElement devicename = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		devicename.sendKeys("Alarm Monitoring system");
		Thread.sleep(2000);

		WebElement deviceid = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		deviceid.sendKeys("Alarm");
		Thread.sleep(2000);

		Select Org = new Select(driver.findElement(By.xpath("//select[@id='companyId']")));
		Org.selectByValue("12");
		Thread.sleep(2000);



//--------------------------------------------------------------------------------------------------------
		// Set the base URI of the API
		RestAssured.baseURI = "http://nenosystems.in:9097/NCSDOCS";

		// Make a GET request to an endpoint
		Response response = RestAssured.given().when().get("/country/public");

		// Extract and print the response body
		String responseBody = response.getBody().asString();
		System.out.println("API Response: " + responseBody);

//----------------------------------------------------------------------------------------------------------------
		Select country = new Select(driver.findElement(By.xpath("//select[@id='countryId']")));
		country.selectByValue("1");
		
		Thread.sleep(3000);
		Select state = new Select(driver.findElement(By.xpath("//select[@id='stateId']")));
		state.selectByValue("8");
		Thread.sleep(2000);

		Select city = new Select(driver.findElement(By.xpath("//select[@id='cityId']")));
		city.selectByValue("31");
		Thread.sleep(2000);

		WebElement district = driver.findElement(By.xpath("//input[@id='districtName']"));
		district.sendKeys("kamrup");
		Thread.sleep(2000);

		Select connectiontype = new Select(driver.findElement(By.xpath("//select[@id='connectionType']")));
		connectiontype.selectByValue("LAN");
		Thread.sleep(2000);

		Select version = new Select(driver.findElement(By.xpath("//select[@id='connectionType']")));
		connectiontype.selectByValue("LAN");
		Thread.sleep(2000);

	}
}