package housingTesting;		
		
import java.io.IOException;		
		
import org.openqa.selenium.By;		
import org.openqa.selenium.Keys;		
import org.testng.annotations.Listeners;		
import org.testng.annotations.Test;		
import org.testng.asserts.SoftAssert;		
		
import com.base.BaseClass;		
		
		
		
@Listeners		
public class JMB_DB_033 extends BaseClass {		
		
	//Get all prices of houses sold	
		
		
  @Test		
public void housingPrice23() throws IOException, InterruptedException{		
		
	    	
	SoftAssert softassert = new SoftAssert();	
		
	//Testing casa221 -----------------------------------------------------------------------------------------------------------------------	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(casa221);	
	Thread.sleep(1500);	
	driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);	
	Thread.sleep(1500);	
	//Test results	
	String actTitle221=driver.findElement(By.className("status-label")).getText();	
	if(actTitle221.equalsIgnoreCase(Pending)||actTitle221.equalsIgnoreCase("ACTIVE")||actTitle221.equalsIgnoreCase("PRICE REDUCED"))	
		{ softassert.assertTrue(true);
		logger.info("");}
	else{	
		softassert.assertTrue(false);
		String address221 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
		String price221 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
		logger.error(actTitle221+" + "+address221+" + "+price221);
		captureScreen(driver,address221);}
		
	//Testing casa222 -----------------------------------------------------------------------------------------------------------------------	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(casa222);	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);	
	Thread.sleep(1500);	
	//Test results	
	String actTitle222=driver.findElement(By.className("status-label")).getText();	
	if(actTitle222.equalsIgnoreCase(Pending)||actTitle222.equalsIgnoreCase("ACTIVE"))	
		{ softassert.assertTrue(true);
		logger.info("");}
	else{	
		softassert.assertTrue(false);
		String address222 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
		String price222 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
		logger.error(actTitle222+" + "+address222+" + "+price222);
		captureScreen(driver,address222);}
		
	//Testing casa223 -----------------------------------------------------------------------------------------------------------------------	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(casa223);	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);	
	Thread.sleep(1500);	
	//Test results	
	String actTitle223=driver.findElement(By.className("status-label")).getText();	
	if(actTitle223.equalsIgnoreCase(Pending)||actTitle223.equalsIgnoreCase("ACTIVE"))	
		{ softassert.assertTrue(true);
		logger.info("");}
	else{	
		softassert.assertTrue(false);
		String address223 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
		String price223 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
		logger.error(actTitle223+" + "+address223+" + "+price223);
		captureScreen(driver,address223);}
		
	//Testing casa224 -----------------------------------------------------------------------------------------------------------------------	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(casa224);	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);	
	Thread.sleep(1500);	
	//Test results	
	String actTitle224=driver.findElement(By.className("status-label")).getText();	
	if(actTitle224.equalsIgnoreCase(Pending)||actTitle224.equalsIgnoreCase("ACTIVE")||actTitle224.equalsIgnoreCase("PRICE REDUCED"))	
		{ softassert.assertTrue(true);
		logger.info("");}
	else{	
		softassert.assertTrue(false);
		String address224 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
		String price224 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
		logger.error(actTitle224+" + "+address224+" + "+price224);
		captureScreen(driver,address224);}
		
	//Testing casa225 -----------------------------------------------------------------------------------------------------------------------	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(casa225);	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);	
	Thread.sleep(1500);	
	//Test results	
	String actTitle225=driver.findElement(By.className("status-label")).getText();	
	if(actTitle225.equalsIgnoreCase(Pending)||actTitle225.equalsIgnoreCase("ACTIVE"))	
		{ softassert.assertTrue(true);
		logger.info("");}
	else{	
		softassert.assertTrue(false);
		String address225 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
		String price225 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
		logger.error(actTitle225+" + "+address225+" + "+price225);
		captureScreen(driver,address225);}
		
	//Testing casa226 -----------------------------------------------------------------------------------------------------------------------	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(casa226);	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);	
	Thread.sleep(1500);	
	//Test results	
	String actTitle226=driver.findElement(By.className("status-label")).getText();	
	if(actTitle226.equalsIgnoreCase(Pending)||actTitle226.equalsIgnoreCase("ACTIVE"))	
		{ softassert.assertTrue(true);
		logger.info("");}
	else{	
		softassert.assertTrue(false);
		String address226 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
		String price226 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
		logger.error(actTitle226+" + "+address226+" + "+price226);
		captureScreen(driver,address226);}
		
	//Testing casa227 -----------------------------------------------------------------------------------------------------------------------	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(casa227);	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);	
	Thread.sleep(1500);	
	//Test results	
	String actTitle227=driver.findElement(By.className("status-label")).getText();	
	if(actTitle227.equalsIgnoreCase(Pending)||actTitle227.equalsIgnoreCase("ACTIVE"))	
		{ softassert.assertTrue(true);
		logger.info("");}
	else{	
		softassert.assertTrue(false);
		String address227 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
		String price227 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
		logger.error(actTitle227+" + "+address227+" + "+price227);
		captureScreen(driver,address227);}
		
	//Testing casa228 -----------------------------------------------------------------------------------------------------------------------	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(casa228);	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);	
	Thread.sleep(1500);	
	//Test results	
	String actTitle228=driver.findElement(By.className("status-label")).getText();	
	if(actTitle228.equalsIgnoreCase(Pending)||actTitle228.equalsIgnoreCase("ACTIVE"))	
		{ softassert.assertTrue(true);
		logger.info("");}
	else{	
		softassert.assertTrue(false);
		String address228 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
		String price228 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
		logger.error(actTitle228+" + "+address228+" + "+price228);
		captureScreen(driver,address228);}
		
	//Testing casa229 -----------------------------------------------------------------------------------------------------------------------	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(casa229);	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);	
	Thread.sleep(1500);	
	//Test results	
	String actTitle229=driver.findElement(By.className("status-label")).getText();	
	if(actTitle229.equalsIgnoreCase(Pending)||actTitle229.equalsIgnoreCase("ACTIVE")||actTitle229.equalsIgnoreCase("PRICE REDUCED"))	
		{ softassert.assertTrue(true);
		logger.info("");}
	else{	
		softassert.assertTrue(false);
		String address229 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
		String price229 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
		logger.error(actTitle229+" + "+address229+" + "+price229);
		captureScreen(driver,address229);}
		
	//Testing casa230 -----------------------------------------------------------------------------------------------------------------------	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(casa230);	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);	
	Thread.sleep(1500);	
	//Test results	
	String actTitle230=driver.findElement(By.className("status-label")).getText();	
	if(actTitle230.equalsIgnoreCase(Pending)||actTitle230.equalsIgnoreCase("ACTIVE"))	
		{ softassert.assertTrue(true);
		logger.info("");}
	else{	
		softassert.assertTrue(false);
		String address230 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
		String price230 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
		logger.error(actTitle230+" + "+address230+" + "+price230);
		
	softassert.assertAll();	
	logger.info("Completed Housing Test"); 	
}	  	
}		
}	 	
