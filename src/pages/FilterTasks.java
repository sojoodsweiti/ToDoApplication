package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FilterTasks {
	// Declare a WebDriver object
    private WebDriver driver;
    
    // Create a constructor that takes a WebDriver object as an argument
    public FilterTasks(WebDriver driver) {
        this.driver = driver;
    }
    
    public void clickFilter () {
    	driver.findElement(By.className("filter")).click();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
    }
    
    public void filterAll () {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/table/thead/tr[1]/td[2]/div[3]/span[1]")).click();
    }
    
    public void filterCompleted () {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/table/thead/tr[1]/td[2]/div[3]/span[2]")).click();
    }
    public void filterNotCompleted () {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/table/thead/tr[1]/td[2]/div[3]/span[3]")).click();
    }
    

}
