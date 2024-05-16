package tests;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.AddTask;
import pages.FilterTasks;
import pages.Login;
import pages.Search;

@Listeners
public class testCases {
	// Declare a WebDriver object
    private WebDriver driver;
    
    // Declare the page objects
    private Login login;
    private AddTask addTask;
    private FilterTasks filterTasks;
    private Search search;
    
 // Declare the URL of the application
    private String url = "http://localhost:3000/login";
    
 // Create a method that runs before each test method
    @BeforeSuite
    public void setUp() {
  
   // Setup chromedriver using WebDriverManager
      WebDriverManager.chromedriver().setup();
      
      // Define Chrome options
      ChromeOptions options = new ChromeOptions();
      
      // Set browser zoom level to 80%
      options.addArguments("--force-device-scale-factor=0.9");

      // Initialize WebDriver with ChromeOptions
      WebDriver driver = new ChromeDriver(options);
      
      // Maximize the browser window
      driver.manage().window().maximize();
      // Navigate to the home page of the application
      driver.get(url);
   // Initialize the page objects
      login = new Login(driver);
      addTask = new AddTask(driver);
      filterTasks = new FilterTasks(driver);
      search = new Search(driver);

    }
 // Create a test method for the scenario
    @Test
    public void testCases() {
    	login.enterEmail();
    	login.enterPassword();
    	login.clickShowPassword();
    	login.clickLogin();
    	addTask.clickAddTask();
    	addTask.enterTitle();
    	addTask.enterDescription();
    	addTask.addTask();
    	filterTasks.clickFilter();
    	filterTasks.filterAll();
    	filterTasks.clickFilter();
    	filterTasks.filterCompleted();
    	filterTasks.clickFilter();
    	filterTasks.filterNotCompleted();
    	search.clickSearch();
    	search.enterKeyword();
    	
    
    }
    @AfterSuite
    public void tearDown() {
        // Close the browser
//    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
//      driver.quit();
    }
}
