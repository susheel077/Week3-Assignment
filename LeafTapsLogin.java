package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafTapsLogin {
	public static void main(String[] args) {
		//download the driver and set the path
		WebDriverManager.chromedriver().setup();
		//launch chrome browser
		ChromeDriver driver=new ChromeDriver();
		//load application url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//maximize the browser
		driver.manage().window().maximize();
		//enter the user name as demosalesmanager
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		//enter the password as crmsfa
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//click login button
		driver.findElement(By.className("decorativeSubmit")).click();
		//check the text
	    driver.findElement(By.tagName("a")).click();
	    driver.findElement(By.linkText("Create Lead")).click();
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
	    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Susheel narayanan");
	    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("k");
	    WebElement dd1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
	    Select rt=new Select(dd1);
	    rt.selectByValue("LEAD_EMPLOYEE");
	    WebElement dd2=driver.findElement(By.id("createLeadForm_industryEnumId"));
	    Select rt1=new Select(dd2);
	    rt1.selectByValue("IND_MEDIA");
	    WebElement dd3=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	    Select rt2=new Select(dd3);
	    rt2.selectByValue("CATRQ_CARNDRIVER");
	    driver.findElement(By.id("createLeadForm_description")).sendKeys("All is well");
	    driver.findElement(By.className("smallSubmit")).click();
	    //string title="View Lead | opentaps CRM";
	    String title="View Lead | opentaps CRM";
	    String title2=driver.getTitle();
	    System.out.println(title2);
	    if(title.equals(title2)) {
	    	System.out.println("company name is changed");
	}
	    else {
	    	
	    	
	    	System.out.println("company name is not changed");
	    }
	    
	    
	    
	    
	
	
	}

}
