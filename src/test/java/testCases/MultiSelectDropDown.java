package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultiSelectDropDown {

	public static void main(String[] args) {

		        WebDriver driver = new ChromeDriver();
		        
		        driver.get("https://demoqa.com/select-menu");

		        // Locate the multi-select drop-down
		        WebElement multiSelect = driver.findElement(By.id("cars"));
		        
		        // Create a Select object to interact with the multi-select dropdown
		        Select select = new Select(multiSelect);
		        
		        // Select multiple options by visible text
		        select.selectByVisibleText("Volvo");
		        select.selectByVisibleText("Audi");

		        // Select an option by value
		        select.selectByValue("saab");

		        // Select an option by index
		        select.selectByIndex(2);  // Selects Mercedes (index starts from 0)
		        
		        // Deselect an option by visible text
		        select.deselectByVisibleText("Volvo");
		        
		        // Deselect an option by index
		        select.deselectByIndex(1);  // Deselects Saab
		        
		        // Deselect all options
		        select.deselectAll();
		        
		        // driver.quit();
	}

}
