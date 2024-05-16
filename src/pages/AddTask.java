package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddTask {

	// Declare a WebDriver object
    private WebDriver driver;
    
    // Create a constructor that takes a WebDriver object as an argument
    public AddTask(WebDriver driver) {
        this.driver = driver;
    }
   public void clickAddTask() {
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   driver.findElement(By.className("mini-add-button")).click();
   }
   public void enterTitle() {
	   driver.findElement(By.cssSelector(".title-input .title-input-span")).sendKeys("automation testing");
   }
   
   public void enterDescription() {
	   driver.findElement(By.cssSelector(".describe-input .title-input-span")).sendKeys("test the application automatecally");
   }
   
   public void addTask() {
	   driver.findElement(By.className("add-button")).click();
   }
}
