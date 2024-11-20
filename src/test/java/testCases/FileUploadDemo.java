package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/upload/");
		
		WebElement uploadFile = driver.findElement(By.id("uploadfile_0"));
		
		uploadFile.sendKeys("C:\\Users\\Notebook\\Desktop\\Capture.png");
		
		driver.findElement(By.id("terms")).click();
		
		WebElement btnSubmit = driver.findElement(By.id("submitbutton"));
		btnSubmit.click();
		
	}

}
