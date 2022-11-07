package housingTesting;		
		
import java.io.IOException;		
		
import org.openqa.selenium.By;		
import org.openqa.selenium.Keys;		
import org.testng.annotations.Listeners;		
import org.testng.annotations.Test;		
import org.testng.asserts.SoftAssert;		
		
import com.base.BaseClass;		
		
		
		
@Listeners		
public class JMB_DB_031 extends BaseClass {		
		
	//Get all prices of houses sold	
		
		
  @Test		
public void housingPrice21() throws IOException, InterruptedException{		
		
	    	
	SoftAssert softassert = new SoftAssert();	
		
	//Testing casa201 -----------------------------------------------------------------------------------------------------------------------	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(casa201);	
	Thread.sleep(1500);	
	driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);	
	Thread.sleep(1500);	
	//Test results	
	String actTitle201=driver.findElement(By.className("status-label")).getText();	
	if(actTitle201.equalsIgnoreCase(Pending)||actTitle201.equalsIgnoreCase("ACTIVE"))	
		{ softassert.assertTrue(true);
		logger.info("");}
	else{	
		softassert.assertTrue(false);
		String address201 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
		String price201 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
		logger.error(actTitle201+" + "+address201+" + "+price201);
		captureScreen(driver,address201);}
		
	//Testing casa202 -----------------------------------------------------------------------------------------------------------------------	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(casa202);	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);	
	Thread.sleep(1500);	
	//Test results	
	String actTitle202=driver.findElement(By.className("status-label")).getText();	
	if(actTitle202.equalsIgnoreCase(Pending)||actTitle202.equalsIgnoreCase("ACTIVE"))	
		{ softassert.assertTrue(true);
		logger.info("");}
	else{	
		softassert.assertTrue(false);
		String address202 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
		String price202 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
		logger.error(actTitle202+" + "+address202+" + "+price202);
		captureScreen(driver,address202);}
		
	//Testing casa203 -----------------------------------------------------------------------------------------------------------------------	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(casa203);	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);	
	Thread.sleep(1500);	
	//Test results	
	String actTitle203=driver.findElement(By.className("status-label")).getText();	
	if(actTitle203.equalsIgnoreCase(Pending)||actTitle203.equalsIgnoreCase("ACTIVE")||actTitle203.equalsIgnoreCase("PRICE REDUCED"))	
		{ softassert.assertTrue(true);
		logger.info("");}
	else{	
		softassert.assertTrue(false);
		String address203 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
		String price203 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
		logger.error(actTitle203+" + "+address203+" + "+price203);
		captureScreen(driver,address203);}
		
	//Testing casa204 -----------------------------------------------------------------------------------------------------------------------	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(casa204);	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);	
	Thread.sleep(1500);	
	//Test results	
	String actTitle204=driver.findElement(By.className("status-label")).getText();	
	if(actTitle204.equalsIgnoreCase(Pending)||actTitle204.equalsIgnoreCase("ACTIVE"))	
		{ softassert.assertTrue(true);
		logger.info("");}
	else{	
		softassert.assertTrue(false);
		String address204 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
		String price204 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
		logger.error(actTitle204+" + "+address204+" + "+price204);
		captureScreen(driver,address204);}
		
	//Testing casa205 -----------------------------------------------------------------------------------------------------------------------	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(casa205);	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);	
	Thread.sleep(1500);	
	//Test results	
	String actTitle205=driver.findElement(By.className("status-label")).getText();	
	if(actTitle205.equalsIgnoreCase(Pending)||actTitle205.equalsIgnoreCase("ACTIVE"))	
		{ softassert.assertTrue(true);
		logger.info("");}
	else{	
		softassert.assertTrue(false);
		String address205 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
		String price205 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
		logger.error(actTitle205+" + "+address205+" + "+price205);
		captureScreen(driver,address205);}
		
	//Testing casa206 -----------------------------------------------------------------------------------------------------------------------	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(casa206);	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);	
	Thread.sleep(1500);	
	//Test results	
	String actTitle206=driver.findElement(By.className("status-label")).getText();	
	if(actTitle206.equalsIgnoreCase(Pending)||actTitle206.equalsIgnoreCase("ACTIVE"))	
		{ softassert.assertTrue(true);
		logger.info("");}
	else{	
		softassert.assertTrue(false);
		String address206 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
		String price206 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
		logger.error(actTitle206+" + "+address206+" + "+price206);
		captureScreen(driver,address206);}
		
	//Testing casa207 -----------------------------------------------------------------------------------------------------------------------	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(casa207);	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);	
	Thread.sleep(1500);	
	//Test results	
	String actTitle207=driver.findElement(By.className("status-label")).getText();	
	if(actTitle207.equalsIgnoreCase(Pending)||actTitle207.equalsIgnoreCase("ACTIVE"))	
		{ softassert.assertTrue(true);
		logger.info("");}
	else{	
		softassert.assertTrue(false);
		String address207 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
		String price207 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
		logger.error(actTitle207+" + "+address207+" + "+price207);
		captureScreen(driver,address207);}
		
	//Testing casa208 -----------------------------------------------------------------------------------------------------------------------	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(casa208);	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);	
	Thread.sleep(1500);	
	//Test results	
	String actTitle208=driver.findElement(By.className("status-label")).getText();	
	if(actTitle208.equalsIgnoreCase(Pending)||actTitle208.equalsIgnoreCase("ACTIVE"))	
		{ softassert.assertTrue(true);
		logger.info("");}
	else{	
		softassert.assertTrue(false);
		String address208 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
		String price208 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
		logger.error(actTitle208+" + "+address208+" + "+price208);
		captureScreen(driver,address208);}
		
	//Testing casa209 -----------------------------------------------------------------------------------------------------------------------	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(casa209);	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);	
	Thread.sleep(1500);	
	//Test results	
	String actTitle209=driver.findElement(By.className("status-label")).getText();	
	if(actTitle209.equalsIgnoreCase(Pending)||actTitle209.equalsIgnoreCase("ACTIVE"))	
		{ softassert.assertTrue(true);
		logger.info("");}
	else{	
		softassert.assertTrue(false);
		String address209 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
		String price209 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
		logger.error(actTitle209+" + "+address209+" + "+price209);
		captureScreen(driver,address209);}
		
	//Testing casa210 -----------------------------------------------------------------------------------------------------------------------	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(casa210);	
	Thread.sleep(1000);	
	driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);	
	Thread.sleep(1500);	
	//Test results	
	String actTitle210=driver.findElement(By.className("status-label")).getText();	
	if(actTitle210.equalsIgnoreCase(Pending)||actTitle210.equalsIgnoreCase("ACTIVE")||actTitle210.equalsIgnoreCase("PRICE REDUCED"))	
		{ softassert.assertTrue(true);
		logger.info("");}
	else{	
		softassert.assertTrue(false);
		String address210 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
		String price210 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
		logger.error(actTitle210+" + "+address210+" + "+price210);
		
	softassert.assertAll();	
	logger.info("Completed Housing Test"); 	
}	  	
}		
}	 	
