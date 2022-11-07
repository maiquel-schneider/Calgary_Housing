package housingTesting;		
		
import java.io.IOException;		
		
import org.openqa.selenium.By;		
import org.openqa.selenium.Keys;		
import org.testng.annotations.Listeners;		
import org.testng.annotations.Test;		
import org.testng.asserts.SoftAssert;		
		
import com.base.BaseClass;		
		
		
		
@Listeners		
public class JMB_DB_034 extends BaseClass {		
		
	//Get all prices of houses sold	
		
		
  @Test		
public void housingPrice24() throws IOException, InterruptedException{		
		
	    	
	SoftAssert softassert = new SoftAssert();	
		
	//Testing casa231 -----------------------------------------------------------------------------------------------------------------------	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(casa231);	
	Thread.sleep(1500);	
	driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);	
	Thread.sleep(1500);	
	//Test results	
	String actTitle231=driver.findElement(By.className("status-label")).getText();	
	if(actTitle231.equalsIgnoreCase(Pending)||actTitle231.equalsIgnoreCase("ACTIVE"))	
		{ softassert.assertTrue(true);
		logger.info("");}
	else{	
		softassert.assertTrue(false);
		String address231 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
		String price231 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
		logger.error(actTitle231+" + "+address231+" + "+price231);
		captureScreen(driver,address231);}
		
	//Testing casa232 -----------------------------------------------------------------------------------------------------------------------	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(casa232);	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);	
	Thread.sleep(1500);	
	//Test results	
	String actTitle232=driver.findElement(By.className("status-label")).getText();	
	if(actTitle232.equalsIgnoreCase(Pending)||actTitle232.equalsIgnoreCase("ACTIVE"))	
		{ softassert.assertTrue(true);
		logger.info("");}
	else{	
		softassert.assertTrue(false);
		String address232 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
		String price232 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
		logger.error(actTitle232+" + "+address232+" + "+price232);
		captureScreen(driver,address232);}
		
	//Testing casa233 -----------------------------------------------------------------------------------------------------------------------	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(casa233);	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);	
	Thread.sleep(1500);	
	//Test results	
	String actTitle233=driver.findElement(By.className("status-label")).getText();	
	if(actTitle233.equalsIgnoreCase(Pending)||actTitle233.equalsIgnoreCase("ACTIVE"))	
		{ softassert.assertTrue(true);
		logger.info("");}
	else{	
		softassert.assertTrue(false);
		String address233 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
		String price233 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
		logger.error(actTitle233+" + "+address233+" + "+price233);
		captureScreen(driver,address233);}
		
	//Testing casa234 -----------------------------------------------------------------------------------------------------------------------	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(casa234);	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);	
	Thread.sleep(1500);	
	//Test results	
	String actTitle234=driver.findElement(By.className("status-label")).getText();	
	if(actTitle234.equalsIgnoreCase(Pending)||actTitle234.equalsIgnoreCase("ACTIVE"))	
		{ softassert.assertTrue(true);
		logger.info("");}
	else{	
		softassert.assertTrue(false);
		String address234 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
		String price234 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
		logger.error(actTitle234+" + "+address234+" + "+price234);
		captureScreen(driver,address234);}
		
	//Testing casa235 -----------------------------------------------------------------------------------------------------------------------	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(casa235);	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);	
	Thread.sleep(1500);	
	//Test results	
	String actTitle235=driver.findElement(By.className("status-label")).getText();	
	if(actTitle235.equalsIgnoreCase(Pending)||actTitle235.equalsIgnoreCase("ACTIVE"))	
		{ softassert.assertTrue(true);
		logger.info("");}
	else{	
		softassert.assertTrue(false);
		String address235 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
		String price235 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
		logger.error(actTitle235+" + "+address235+" + "+price235);
		captureScreen(driver,address235);}
		
	//Testing casa236 -----------------------------------------------------------------------------------------------------------------------	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(casa236);	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);	
	Thread.sleep(1500);	
	//Test results	
	String actTitle236=driver.findElement(By.className("status-label")).getText();	
	if(actTitle236.equalsIgnoreCase(Pending)||actTitle236.equalsIgnoreCase("ACTIVE"))	
		{ softassert.assertTrue(true);
		logger.info("");}
	else{	
		softassert.assertTrue(false);
		String address236 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
		String price236 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
		logger.error(actTitle236+" + "+address236+" + "+price236);
		captureScreen(driver,address236);}
		
	//Testing casa237 -----------------------------------------------------------------------------------------------------------------------	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(casa237);	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);	
	Thread.sleep(1500);	
	//Test results	
	String actTitle237=driver.findElement(By.className("status-label")).getText();	
	if(actTitle237.equalsIgnoreCase(Pending)||actTitle237.equalsIgnoreCase("ACTIVE"))	
		{ softassert.assertTrue(true);
		logger.info("");}
	else{	
		softassert.assertTrue(false);
		String address237 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
		String price237 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
		logger.error(actTitle237+" + "+address237+" + "+price237);
		captureScreen(driver,address237);}
		
	//Testing casa238 -----------------------------------------------------------------------------------------------------------------------	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(casa238);	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);	
	Thread.sleep(1500);	
	//Test results	
	String actTitle238=driver.findElement(By.className("status-label")).getText();	
	if(actTitle238.equalsIgnoreCase(Pending)||actTitle238.equalsIgnoreCase("ACTIVE"))	
		{ softassert.assertTrue(true);
		logger.info("");}
	else{	
		softassert.assertTrue(false);
		String address238 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
		String price238 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
		logger.error(actTitle238+" + "+address238+" + "+price238);
		captureScreen(driver,address238);}
		
	//Testing casa239 -----------------------------------------------------------------------------------------------------------------------	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(casa239);	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);	
	Thread.sleep(1500);	
	//Test results	
	String actTitle239=driver.findElement(By.className("status-label")).getText();	
	if(actTitle239.equalsIgnoreCase(Pending)||actTitle239.equalsIgnoreCase("ACTIVE"))	
		{ softassert.assertTrue(true);
		logger.info("");}
	else{	
		softassert.assertTrue(false);
		String address239 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
		String price239 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
		logger.error(actTitle239+" + "+address239+" + "+price239);
		captureScreen(driver,address239);}
		
	//Testing casa240 -----------------------------------------------------------------------------------------------------------------------	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(casa240);	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);	
	Thread.sleep(1500);	
	//Test results	
	String actTitle240=driver.findElement(By.className("status-label")).getText();	
	if(actTitle240.equalsIgnoreCase(Pending)||actTitle240.equalsIgnoreCase("ACTIVE"))	
		{ softassert.assertTrue(true);
		logger.info("");}
	else{	
		softassert.assertTrue(false);
		String address240 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
		String price240 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
		logger.error(actTitle240+" + "+address240+" + "+price240);
		
	softassert.assertAll();	
	logger.info("Completed Housing Test"); 	
}	  	
}		
}	 	
