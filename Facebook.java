package week3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://en-gb.facebook.com/");
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String sourceData=driver.getPageSource();
		System.out.println(sourceData);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(@data-testid,'open-registration')]")).click();	
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Susheel");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("lp");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8610103546");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("D14265789!4");
		WebElement dd1 = driver.findElement(By.xpath("//select[contains(@class,'_9407 _5dba _9hk6 _8esg')][1]"));
		Select drop1=new Select(dd1);
		drop1.selectByValue("28");
		WebElement dd2 = driver.findElement(By.xpath("//select[@id='month']"));
		Select drop2=new Select(dd2);
		drop2.selectByIndex(2);
		WebElement dd3  = driver.findElement(By.xpath("//select[@id='year']"));
		Select drop3=new Select(dd3);
		drop3.selectByVisibleText("2001");
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		driver.close();
	}

}
