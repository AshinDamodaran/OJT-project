package select;

public class ojt {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		 WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
		  Actions actions=new Actions(driver);

		  
		//Home page (Link)
		  driver.get("https://demo.wpeverest.com/user-registration/");
		  driver.manage().window().maximize();
		  
		// User Email
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//*[@id=\"user_email\"]")).sendKeys("experionglobal1234@gmail.com");
		  
		  
		  
	      //User Password
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("1098765@ashin");
		  
		  
		  
		//Company name
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//*[contains(@name,'input_box_1569481765')]")).sendKeys("ExperionTechnologies");
		 
		  
		  //phone
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//*[@id=\"phone_1569482700\"]")).sendKeys("04985203084");
		  
		  
		  
		//Submit Button or Register Now
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@id=\"user-registration-form-116\"]/form/div[5]/button")).click();
		  
	} 

}
