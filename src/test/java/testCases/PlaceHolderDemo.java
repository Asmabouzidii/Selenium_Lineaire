package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class PlaceHolderDemo {

	public static void main(String[] args) {


		        WebDriver driver = new ChromeDriver();
		        
		        // Navigate to a webpage
		        driver.get("https://www.example.com");

		        // Locate the input field with placeholder attribute
		        WebElement inputField = driver.findElement(By.id("inputFieldId")); // Replace with the actual ID or locator

		        // Get the placeholder attribute value
		        String placeholderText = inputField.getAttribute("placeholder");

		        // Print the placeholder text
		        System.out.println("Placeholder text is: " + placeholderText);

		        // Close the browser
		        driver.quit();

	}

}
