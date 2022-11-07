package housingTesting;		
		
import java.io.IOException;		
		
import org.openqa.selenium.By;		
import org.openqa.selenium.Keys;		
import org.testng.annotations.Listeners;		
import org.testng.annotations.Test;		
import org.testng.asserts.SoftAssert;		
		
import com.base.BaseClass;		
		
		
		
@Listeners		
public class JMB_DB_035 extends BaseClass {		
		
	//Get all prices of houses sold	
		
		
  @Test		
public void housingPrice25() throws IOException, InterruptedException{		
		
	    	
	SoftAssert softassert = new SoftAssert();	
		
	//Testing casa241 -----------------------------------------------------------------------------------------------------------------------	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(casa241);	
	Thread.sleep(1500);	
	driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);	
	Thread.sleep(1500);	
	//Test results	
	String actTitle241=driver.findElement(By.className("status-label")).getText();	
	if(actTitle241.equalsIgnoreCase(Pending)||actTitle241.equalsIgnoreCase("ACTIVE")||actTitle241.equalsIgnoreCase("PRICE REDUCED"))	
		{ softassert.assertTrue(true);
		logger.info("");}
	else{	
		softassert.assertTrue(false);
		String address241 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
		String price241 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
		logger.error(actTitle241+" + "+address241+" + "+price241);
		captureScreen(driver,address241);}
		
	//Testing casa242 -----------------------------------------------------------------------------------------------------------------------	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(casa242);	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);	
	Thread.sleep(1500);	
	//Test results	
	String actTitle242=driver.findElement(By.className("status-label")).getText();	
	if(actTitle242.equalsIgnoreCase(Pending)||actTitle242.equalsIgnoreCase("ACTIVE")||actTitle242.equalsIgnoreCase("PRICE REDUCED"))	
		{ softassert.assertTrue(true);
		logger.info("");}
	else{	
		softassert.assertTrue(false);
		String address242 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
		String price242 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
		logger.error(actTitle242+" + "+address242+" + "+price242);
		captureScreen(driver,address242);}
		
	//Testing casa243 -----------------------------------------------------------------------------------------------------------------------	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(casa243);	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);	
	Thread.sleep(1500);	
	//Test results	
	String actTitle243=driver.findElement(By.className("status-label")).getText();	
	if(actTitle243.equalsIgnoreCase(Pending)||actTitle243.equalsIgnoreCase("ACTIVE")||actTitle243.equalsIgnoreCase("PRICE REDUCED"))	
		{ softassert.assertTrue(true);
		logger.info("");}
	else{	
		softassert.assertTrue(false);
		String address243 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
		String price243 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
		logger.error(actTitle243+" + "+address243+" + "+price243);
		captureScreen(driver,address243);}
		
	//Testing casa244 -----------------------------------------------------------------------------------------------------------------------	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(casa244);	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);	
	Thread.sleep(1500);	
	//Test results	
	String actTitle244=driver.findElement(By.className("status-label")).getText();	
	if(actTitle244.equalsIgnoreCase(Pending)||actTitle244.equalsIgnoreCase("ACTIVE")||actTitle244.equalsIgnoreCase("PRICE REDUCED"))	
		{ softassert.assertTrue(true);
		logger.info("");}
	else{	
		softassert.assertTrue(false);
		String address244 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
		String price244 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
		logger.error(actTitle244+" + "+address244+" + "+price244);
		captureScreen(driver,address244);}
		
	//Testing casa245 -----------------------------------------------------------------------------------------------------------------------	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(casa245);	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);	
	Thread.sleep(1500);	
	//Test results	
	String actTitle245=driver.findElement(By.className("status-label")).getText();	
	if(actTitle245.equalsIgnoreCase(Pending)||actTitle245.equalsIgnoreCase("ACTIVE")||actTitle245.equalsIgnoreCase("PRICE REDUCED"))	
		{ softassert.assertTrue(true);
		logger.info("");}
	else{	
		softassert.assertTrue(false);
		String address245 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
		String price245 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
		logger.error(actTitle245+" + "+address245+" + "+price245);
		captureScreen(driver,address245);}
		
	//Testing casa246 -----------------------------------------------------------------------------------------------------------------------	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(casa246);	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);	
	Thread.sleep(1500);	
	//Test results	
	String actTitle246=driver.findElement(By.className("status-label")).getText();	
	if(actTitle246.equalsIgnoreCase(Pending)||actTitle246.equalsIgnoreCase("ACTIVE")||actTitle246.equalsIgnoreCase("PRICE REDUCED"))	
		{ softassert.assertTrue(true);
		logger.info("");}
	else{	
		softassert.assertTrue(false);
		String address246 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
		String price246 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
		logger.error(actTitle246+" + "+address246+" + "+price246);
		captureScreen(driver,address246);}
		
	//Testing casa247 -----------------------------------------------------------------------------------------------------------------------	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(casa247);	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);	
	Thread.sleep(1500);	
	//Test results	
	String actTitle247=driver.findElement(By.className("status-label")).getText();	
	if(actTitle247.equalsIgnoreCase(Pending)||actTitle247.equalsIgnoreCase("ACTIVE")||actTitle247.equalsIgnoreCase("PRICE REDUCED"))	
		{ softassert.assertTrue(true);
		logger.info("");}
	else{	
		softassert.assertTrue(false);
		String address247 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
		String price247 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
		logger.error(actTitle247+" + "+address247+" + "+price247);
		captureScreen(driver,address247);}
		
	//Testing casa248 -----------------------------------------------------------------------------------------------------------------------	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(casa248);	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);	
	Thread.sleep(1500);	
	//Test results	
	String actTitle248=driver.findElement(By.className("status-label")).getText();	
	if(actTitle248.equalsIgnoreCase(Pending)||actTitle248.equalsIgnoreCase("ACTIVE")||actTitle248.equalsIgnoreCase("PRICE REDUCED"))	
		{ softassert.assertTrue(true);
		logger.info("");}
	else{	
		softassert.assertTrue(false);
		String address248 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
		String price248 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
		logger.error(actTitle248+" + "+address248+" + "+price248);
		captureScreen(driver,address248);}
		
	//Testing casa249 -----------------------------------------------------------------------------------------------------------------------	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(casa249);	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);	
	Thread.sleep(1500);	
	//Test results	
	String actTitle249=driver.findElement(By.className("status-label")).getText();	
	if(actTitle249.equalsIgnoreCase(Pending)||actTitle249.equalsIgnoreCase("ACTIVE")||actTitle249.equalsIgnoreCase("PRICE REDUCED"))	
		{ softassert.assertTrue(true);
		logger.info("");}
	else{	
		softassert.assertTrue(false);
		String address249 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
		String price249 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
		logger.error(actTitle249+" + "+address249+" + "+price249);
		captureScreen(driver,address249);}
		
	//Testing casa250 -----------------------------------------------------------------------------------------------------------------------	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(casa250);	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);	
	Thread.sleep(1500);	
	//Test results	
	String actTitle250=driver.findElement(By.className("status-label")).getText();	
	if(actTitle250.equalsIgnoreCase(Pending)||actTitle250.equalsIgnoreCase("ACTIVE")||actTitle250.equalsIgnoreCase("PRICE REDUCED"))	
		{ softassert.assertTrue(true);
		logger.info("");}
	else{	
		softassert.assertTrue(false);
		String address250 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
		String price250 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
		logger.error(actTitle250+" + "+address250+" + "+price250);
		
	softassert.assertAll();	
	logger.info("Completed Housing Test25"); 	
}	  	
}		
}	 	
