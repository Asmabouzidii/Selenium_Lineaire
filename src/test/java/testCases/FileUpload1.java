package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://blueimp.github.io/jQuery-File-Upload/");
		
		WebElement uploadFile = driver.findElement(By.cssSelector("input[name='files[]']")); //By.cssSelector(".btn.btn-success.fileinput-button"
		
		uploadFile.sendKeys("C:\\Users\\Notebook\\Desktop\\Capture.png");
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click(); 
		
		WebElement btnSubmit = driver.findElement(By.xpath("//span[normalize-space()='Start']"));
		btnSubmit.click();
	}

}
