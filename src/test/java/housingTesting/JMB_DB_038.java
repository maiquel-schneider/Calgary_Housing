package housingTesting;		
		
import java.io.IOException;		
		
import org.openqa.selenium.By;		
import org.openqa.selenium.Keys;		
import org.testng.annotations.Listeners;		
import org.testng.annotations.Test;		
import org.testng.asserts.SoftAssert;		
		
import com.base.BaseClass;		
		
		
		
@Listeners		
public class JMB_DB_038 extends BaseClass {		
		
	//Get all prices of houses sold	
		
		
  @Test		
public void housingPrice28() throws IOException, InterruptedException{		
		
	    	
	SoftAssert softassert = new SoftAssert();	
		
	//Testing casa271 -----------------------------------------------------------------------------------------------------------------------	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(casa271);	
	Thread.sleep(1500);	
	driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);	
	Thread.sleep(1500);	
	//Test results	
	String actTitle271=driver.findElement(By.className("status-label")).getText();	
	if(actTitle271.equalsIgnoreCase(Pending)||actTitle271.equalsIgnoreCase("ACTIVE")||actTitle271.equalsIgnoreCase("PRICE REDUCED"))	
		{ softassert.assertTrue(true);
		logger.info("");}
	else{	
		softassert.assertTrue(false);
		String address271 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
		String price271 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
		logger.error(actTitle271+" + "+address271+" + "+price271);
		captureScreen(driver,address271);}
		
	//Testing casa272 -----------------------------------------------------------------------------------------------------------------------	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(casa272);	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);	
	Thread.sleep(1500);	
	//Test results	
	String actTitle272=driver.findElement(By.className("status-label")).getText();	
	if(actTitle272.equalsIgnoreCase(Pending)||actTitle272.equalsIgnoreCase("ACTIVE")||actTitle272.equalsIgnoreCase("PRICE REDUCED"))	
		{ softassert.assertTrue(true);
		logger.info("");}
	else{	
		softassert.assertTrue(false);
		String address272 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
		String price272 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
		logger.error(actTitle272+" + "+address272+" + "+price272);
		captureScreen(driver,address272);}
		
	//Testing casa273 -----------------------------------------------------------------------------------------------------------------------	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(casa273);	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);	
	Thread.sleep(1500);	
	//Test results	
	String actTitle273=driver.findElement(By.className("status-label")).getText();	
	if(actTitle273.equalsIgnoreCase(Pending)||actTitle273.equalsIgnoreCase("ACTIVE")||actTitle273.equalsIgnoreCase("PRICE REDUCED"))	
		{ softassert.assertTrue(true);
		logger.info("");}
	else{	
		softassert.assertTrue(false);
		String address273 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
		String price273 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
		logger.error(actTitle273+" + "+address273+" + "+price273);
		captureScreen(driver,address273);}
		
	//Testing casa274 -----------------------------------------------------------------------------------------------------------------------	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(casa274);	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);	
	Thread.sleep(1500);	
	//Test results	
	String actTitle274=driver.findElement(By.className("status-label")).getText();	
	if(actTitle274.equalsIgnoreCase(Pending)||actTitle274.equalsIgnoreCase("ACTIVE")||actTitle274.equalsIgnoreCase("PRICE REDUCED"))	
		{ softassert.assertTrue(true);
		logger.info("");}
	else{	
		softassert.assertTrue(false);
		String address274 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
		String price274 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
		logger.error(actTitle274+" + "+address274+" + "+price274);
		captureScreen(driver,address274);}
		
	//Testing casa275 -----------------------------------------------------------------------------------------------------------------------	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(casa275);	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);	
	Thread.sleep(1500);	
	//Test results	
	String actTitle275=driver.findElement(By.className("status-label")).getText();	
	if(actTitle275.equalsIgnoreCase(Pending)||actTitle275.equalsIgnoreCase("ACTIVE")||actTitle275.equalsIgnoreCase("PRICE REDUCED"))	
		{ softassert.assertTrue(true);
		logger.info("");}
	else{	
		softassert.assertTrue(false);
		String address275 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
		String price275 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
		logger.error(actTitle275+" + "+address275+" + "+price275);
		captureScreen(driver,address275);}
		
	//Testing casa276 -----------------------------------------------------------------------------------------------------------------------	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(casa276);	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);	
	Thread.sleep(1500);	
	//Test results	
	String actTitle276=driver.findElement(By.className("status-label")).getText();	
	if(actTitle276.equalsIgnoreCase(Pending)||actTitle276.equalsIgnoreCase("ACTIVE")||actTitle276.equalsIgnoreCase("PRICE REDUCED"))	
		{ softassert.assertTrue(true);
		logger.info("");}
	else{	
		softassert.assertTrue(false);
		String address276 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
		String price276 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
		logger.error(actTitle276+" + "+address276+" + "+price276);
		captureScreen(driver,address276);}
		
	//Testing casa277 -----------------------------------------------------------------------------------------------------------------------	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(casa277);	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);	
	Thread.sleep(1500);	
	//Test results	
	String actTitle277=driver.findElement(By.className("status-label")).getText();	
	if(actTitle277.equalsIgnoreCase(Pending)||actTitle277.equalsIgnoreCase("ACTIVE")||actTitle277.equalsIgnoreCase("PRICE REDUCED"))	
		{ softassert.assertTrue(true);
		logger.info("");}
	else{	
		softassert.assertTrue(false);
		String address277 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
		String price277 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
		logger.error(actTitle277+" + "+address277+" + "+price277);
		captureScreen(driver,address277);}
		
	//Testing casa278 -----------------------------------------------------------------------------------------------------------------------	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(casa278);	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);	
	Thread.sleep(1500);	
	//Test results	
	String actTitle278=driver.findElement(By.className("status-label")).getText();	
	if(actTitle278.equalsIgnoreCase(Pending)||actTitle278.equalsIgnoreCase("ACTIVE")||actTitle278.equalsIgnoreCase("PRICE REDUCED"))	
		{ softassert.assertTrue(true);
		logger.info("");}
	else{	
		softassert.assertTrue(false);
		String address278 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
		String price278 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
		logger.error(actTitle278+" + "+address278+" + "+price278);
		captureScreen(driver,address278);}
		
	//Testing casa279 -----------------------------------------------------------------------------------------------------------------------	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(casa279);	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);	
	Thread.sleep(1500);	
	//Test results	
	String actTitle279=driver.findElement(By.className("status-label")).getText();	
	if(actTitle279.equalsIgnoreCase(Pending)||actTitle279.equalsIgnoreCase("ACTIVE")||actTitle279.equalsIgnoreCase("PRICE REDUCED"))	
		{ softassert.assertTrue(true);
		logger.info("");}
	else{	
		softassert.assertTrue(false);
		String address279 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
		String price279 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
		logger.error(actTitle279+" + "+address279+" + "+price279);
		captureScreen(driver,address279);}
		
	//Testing casa280 -----------------------------------------------------------------------------------------------------------------------	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(casa280);	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);	
	Thread.sleep(1500);	
	//Test results	
	String actTitle280=driver.findElement(By.className("status-label")).getText();	
	if(actTitle280.equalsIgnoreCase(Pending)||actTitle280.equalsIgnoreCase("ACTIVE")||actTitle280.equalsIgnoreCase("PRICE REDUCED"))	
		{ softassert.assertTrue(true);
		logger.info("");}
	else{	
		softassert.assertTrue(false);
		String address280 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
		String price280 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
		logger.error(actTitle280+" + "+address280+" + "+price280);
		
	softassert.assertAll();	
	logger.info("Completed Housing Test"); 	
}	  	
}		
}	 	
