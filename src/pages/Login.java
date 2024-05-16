package pages;

import org.openqa.selenium.WebDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Login {
	// Declare a WebDriver object
    private WebDriver driver;
    
    // Create a constructor that takes a WebDriver object as an argument
    public Login(WebDriver driver) {
        this.driver = driver;
    }
    
 
    public void enterEmail() {
		driver.findElement(By.className("input-input-text")).sendKeys("sojoodsweiti1@gmail.com");
	}
    
    public void enterPassword() {
		driver.findElement(By.className("pass-input")).sendKeys("2961998@");
	}
    
    public void clickShowPassword() {
		driver.findElement(By.className("eye-button")).click();
	}
    
    public void clickLogin() {
		driver.findElement(By.className("login-button")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
    
    
}
