package com.IT.RegisterStepDEF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {
	WebDriver driver;
	
	@When("^New user register all details$")
	public void new_user_register_all_details() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Creo\\chromedriver_win32 (6)\\chromedriver.exe");
		 driver= new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com");
		driver.findElement(By.xpath("//*[text()='REGISTER']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='firstName']")).sendKeys("komal");
		driver.findElement(By.xpath("//*[@name='lastName']")).sendKeys("kadam");
		driver.findElement(By.xpath("//*[@name='phone']")).sendKeys("9402596210");
		driver.findElement(By.xpath("//*[@id='userName']")).sendKeys("komal.sk231992@gmail.com");
		driver.findElement(By.xpath("//*[@name='address1']")).sendKeys("poorva residancy,pimpri");
		driver.findElement(By.xpath("//*[@name='city']")).sendKeys("pune");
		driver.findElement(By.xpath("//*[@name='state']")).sendKeys("Maharashtra");
		driver.findElement(By.xpath("//*[@name='postalCode']")).sendKeys("411027");
		driver.findElement(By.xpath("//*[@name='address1']")).sendKeys("poorva residancy,pimpri");
		WebElement Country=driver.findElement(By.xpath("//*[@name='country']"));
		Select select= new Select(Country);
	WebElement selvalue=	select.getFirstSelectedOption();
String text=	selvalue.getText();
System.out.println("By default value"+text);

select.selectByVisibleText("INDIA");
String text1=selvalue.getText();
System.out.println("Now the seetced text"+text1);
driver.findElement(By.xpath("//*[@id='email']")).sendKeys("komal.sk231992@gmail.com");
driver.findElement(By.xpath("//*[@name='password']")).sendKeys("komal@8");
driver.findElement(By.xpath("//*[@name='confirmPassword']")).sendKeys("komal@8");

	  
	}

	@When("^submit the form$")
	public void submit_the_form() throws Throwable {
		driver.findElement(By.xpath("//*[@type='image']")).click();   
	
	}

	@Then("^user on Home page$")
	public void user_on_Home_page() throws Throwable {
String ActualTitle=	  driver.getTitle();
System.out.println("title of the page"+ActualTitle);
String ExpectedTitle="Register: Mercury Tours";
if(ActualTitle.equals(ExpectedTitle)) {
	System.out.println("we are on correct page");
}
else {
	System.out.println("we are on wrong page");
}
	  
	}



}
