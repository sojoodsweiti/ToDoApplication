package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Search {
	// Declare a WebDriver object
    private WebDriver driver;
    
    // Create a constructor that takes a WebDriver object as an argument
    public Search(WebDriver driver) {
        this.driver = driver;
    }
    public void clickSearch() {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
    	driver.findElement(By.className("search")).click();

    }
    public void enterKeyword() {
    	driver.findElement(By.className("label-search")).sendKeys("usability");
    }
}
