package housingTesting;				
				
import java.io.IOException;				
import org.openqa.selenium.By;				
import org.openqa.selenium.Keys;				
import org.testng.annotations.Listeners;				
import org.testng.annotations.Test;				
import org.testng.asserts.SoftAssert;				
import com.base.BaseClass;				
				
				
@Listeners				
public class JMB_DB_030 extends BaseClass {				
				
	//Get all prices of houses sold			
				
				
  @Test				
public void housingPrice20() throws IOException, InterruptedException{				
				
	 // Creating Soft Assertions			
	SoftAssert softassert = new SoftAssert();  			
				
	//Testing casa191 -----------------------------------------------------------------------------------------------------------------------			
	if (casa191.isBlank())			
		System.out.println("Blank");		
	else{			
		driver.findElement(By.tagName("input")).sendKeys(casa191,Keys.ENTER);		
		Thread.sleep(2500);		
		//Check if House is still on Market		
		if (driver.getTitle().equalsIgnoreCase(Offmarket))		
			logger.error(casa191 + " is off market");	
		else {		
		//Test results		
			String actTitle191=driver.findElement(By.className("status-label")).getText();	
			if(actTitle191.equalsIgnoreCase(Pending)||actTitle191.equalsIgnoreCase("ACTIVE"))	
				{ softassert.assertTrue(true);
				logger.info("");}
			else{	
				softassert.assertTrue(false);
				String address191 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
				String price191 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
				logger.error(actTitle191+" + "+address191+" + "+price191);
				captureScreen(driver,address191);}}}
				
				
				
				
				
				
				
				
				
				
	//Testing casa192 -----------------------------------------------------------------------------------------------------------------------			
	if (casa192.isBlank())			
		System.out.println("Blank");		
	else{			
		driver.findElement(By.tagName("input")).sendKeys(casa192,Keys.ENTER);		
		Thread.sleep(2500);		
		//Check if House is still on Market		
		if (driver.getTitle().equalsIgnoreCase(Offmarket))		
			logger.error(casa192 + " is off market");	
		else {		
		//Test results		
			String actTitle192=driver.findElement(By.className("status-label")).getText();	
			if(actTitle192.equalsIgnoreCase(Pending)||actTitle192.equalsIgnoreCase("ACTIVE"))	
				{ softassert.assertTrue(true);
				logger.info("");}
			else{	
				softassert.assertTrue(false);
				String address192 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
				String price192 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
				logger.error(actTitle192+" + "+address192+" + "+price192);
				captureScreen(driver,address192);}}}
				
	//Testing casa193 -----------------------------------------------------------------------------------------------------------------------			
	if (casa193.isBlank())			
		System.out.println("Blank");		
	else{			
		driver.findElement(By.tagName("input")).sendKeys(casa193,Keys.ENTER);		
		Thread.sleep(2500);		
		//Check if House is still on Market		
		if (driver.getTitle().equalsIgnoreCase(Offmarket))		
			logger.error(casa193 + " is off market");	
		else {		
		//Test results		
			String actTitle193=driver.findElement(By.className("status-label")).getText();	
			if(actTitle193.equalsIgnoreCase(Pending)||actTitle193.equalsIgnoreCase("ACTIVE"))	
				{ softassert.assertTrue(true);
				logger.info("");}
			else{	
				softassert.assertTrue(false);
				String address193 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
				String price193 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
				logger.error(actTitle193+" + "+address193+" + "+price193);
				captureScreen(driver,address193);}}}
				
	//Testing casa194 -----------------------------------------------------------------------------------------------------------------------			
	if (casa194.isBlank())			
		System.out.println("Blank");		
	else{			
		driver.findElement(By.tagName("input")).sendKeys(casa194,Keys.ENTER);		
		Thread.sleep(2500);		
		//Check if House is still on Market		
		if (driver.getTitle().equalsIgnoreCase(Offmarket))		
			logger.error(casa194 + " is off market");	
		else {		
		//Test results		
			String actTitle194=driver.findElement(By.className("status-label")).getText();	
			if(actTitle194.equalsIgnoreCase(Pending)||actTitle194.equalsIgnoreCase("ACTIVE"))	
				{ softassert.assertTrue(true);
				logger.info("");}
			else{	
				softassert.assertTrue(false);
				String address194 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
				String price194 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
				logger.error(actTitle194+" + "+address194+" + "+price194);
				captureScreen(driver,address194);}}}
				
	//Testing casa195 -----------------------------------------------------------------------------------------------------------------------			
	if (casa195.isBlank())			
		System.out.println("Blank");		
	else{			
		driver.findElement(By.tagName("input")).sendKeys(casa195,Keys.ENTER);		
		Thread.sleep(2500);		
		//Check if House is still on Market		
		if (driver.getTitle().equalsIgnoreCase(Offmarket))		
			logger.error(casa195 + " is off market");	
		else {		
		//Test results		
			String actTitle195=driver.findElement(By.className("status-label")).getText();	
			if(actTitle195.equalsIgnoreCase(Pending)||actTitle195.equalsIgnoreCase("ACTIVE"))	
				{ softassert.assertTrue(true);
				logger.info("");}
			else{	
				softassert.assertTrue(false);
				String address195 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
				String price195 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
				logger.error(actTitle195+" + "+address195+" + "+price195);
				captureScreen(driver,address195);}}}
				
	//Testing casa196 -----------------------------------------------------------------------------------------------------------------------			
	if (casa196.isBlank())			
		System.out.println("Blank");		
	else{			
		driver.findElement(By.tagName("input")).sendKeys(casa196,Keys.ENTER);		
		Thread.sleep(2500);		
		//Check if House is still on Market		
		if (driver.getTitle().equalsIgnoreCase(Offmarket))		
			logger.error(casa196 + " is off market");	
		else {		
		//Test results		
			String actTitle196=driver.findElement(By.className("status-label")).getText();	
			if(actTitle196.equalsIgnoreCase(Pending)||actTitle196.equalsIgnoreCase("ACTIVE"))	
				{ softassert.assertTrue(true);
				logger.info("");}
			else{	
				softassert.assertTrue(false);
				String address196 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
				String price196 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
				logger.error(actTitle196+" + "+address196+" + "+price196);
				captureScreen(driver,address196);}}}
				
	//Testing casa197 -----------------------------------------------------------------------------------------------------------------------			
	if (casa197.isBlank())			
		System.out.println("Blank");		
	else{			
		driver.findElement(By.tagName("input")).sendKeys(casa197,Keys.ENTER);		
		Thread.sleep(2500);		
		//Check if House is still on Market		
		if (driver.getTitle().equalsIgnoreCase(Offmarket))		
			logger.error(casa197 + " is off market");	
		else {		
		//Test results		
			String actTitle197=driver.findElement(By.className("status-label")).getText();	
			if(actTitle197.equalsIgnoreCase(Pending)||actTitle197.equalsIgnoreCase("ACTIVE"))	
				{ softassert.assertTrue(true);
				logger.info("");}
			else{	
				softassert.assertTrue(false);
				String address197 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
				String price197 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
				logger.error(actTitle197+" + "+address197+" + "+price197);
				captureScreen(driver,address197);}}}
				
	//Testing casa198 -----------------------------------------------------------------------------------------------------------------------			
	if (casa198.isBlank())			
		System.out.println("Blank");		
	else{			
		driver.findElement(By.tagName("input")).sendKeys(casa198,Keys.ENTER);		
		Thread.sleep(2500);		
		//Check if House is still on Market		
		if (driver.getTitle().equalsIgnoreCase(Offmarket))		
			logger.error(casa198 + " is off market");	
		else {		
		//Test results		
			String actTitle198=driver.findElement(By.className("status-label")).getText();	
			if(actTitle198.equalsIgnoreCase(Pending)||actTitle198.equalsIgnoreCase("ACTIVE"))	
				{ softassert.assertTrue(true);
				logger.info("");}
			else{	
				softassert.assertTrue(false);
				String address198 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
				String price198 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
				logger.error(actTitle198+" + "+address198+" + "+price198);
				captureScreen(driver,address198);}}}
				
	//Testing casa199 -----------------------------------------------------------------------------------------------------------------------			
	if (casa199.isBlank())			
		System.out.println("Blank");		
	else{			
		driver.findElement(By.tagName("input")).sendKeys(casa199,Keys.ENTER);		
		Thread.sleep(2500);		
		//Check if House is still on Market		
		if (driver.getTitle().equalsIgnoreCase(Offmarket))		
			logger.error(casa199 + " is off market");	
		else {		
		//Test results		
			String actTitle199=driver.findElement(By.className("status-label")).getText();	
			if(actTitle199.equalsIgnoreCase(Pending)||actTitle199.equalsIgnoreCase("ACTIVE"))	
				{ softassert.assertTrue(true);
				logger.info("");}
			else{	
				softassert.assertTrue(false);
				String address199 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
				String price199 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
				logger.error(actTitle199+" + "+address199+" + "+price199);
				captureScreen(driver,address199);}}}
				
	//Testing casa200 -----------------------------------------------------------------------------------------------------------------------			
	if (casa200.isBlank())			
		System.out.println("Blank");		
	else{			
		driver.findElement(By.tagName("input")).sendKeys(casa200,Keys.ENTER);		
		Thread.sleep(2500);		
		//Check if House is still on Market		
		if (driver.getTitle().equalsIgnoreCase(Offmarket))		
			logger.error(casa200 + " is off market");	
		else {		
		//Test results		
			String actTitle200=driver.findElement(By.className("status-label")).getText();	
			if(actTitle200.equalsIgnoreCase(Pending)||actTitle200.equalsIgnoreCase("ACTIVE"))	
				{ softassert.assertTrue(true);
				logger.info("");}
			else{	
				softassert.assertTrue(false);
				String address200 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
				String price200 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
				logger.error(actTitle200+" + "+address200+" + "+price200);
				captureScreen(driver,address200);}}}
				
	softassert.assertAll();			
	logger.info("Completed Housing Test 20"); 			
	}			
	}			
