package housingTesting;				
				
import java.io.IOException;				
import org.openqa.selenium.By;				
import org.openqa.selenium.Keys;				
import org.testng.annotations.Listeners;				
import org.testng.annotations.Test;				
import org.testng.asserts.SoftAssert;				
import com.base.BaseClass;				
				
				
@Listeners				
public class JMB_DB_029 extends BaseClass {				
				
	//Get all prices of houses sold			
				
				
  @Test				
public void housingPrice19() throws IOException, InterruptedException{				
				
	 // Creating Soft Assertions			
	SoftAssert softassert = new SoftAssert();  			
				
	//Testing casa181 -----------------------------------------------------------------------------------------------------------------------			
	if (casa181.isBlank())			
		System.out.println("Blank");		
	else{			
		driver.findElement(By.tagName("input")).sendKeys(casa181,Keys.ENTER);		
		Thread.sleep(2500);		
		//Check if House is still on Market		
		if (driver.getTitle().equalsIgnoreCase(Offmarket))		
			logger.error(casa181 + " is off market");	
		else {		
		//Test results		
			String actTitle181=driver.findElement(By.className("status-label")).getText();	
			if(actTitle181.equalsIgnoreCase(Pending)||actTitle181.equalsIgnoreCase("ACTIVE"))	
				{ softassert.assertTrue(true);
				logger.info("");}
			else{	
				softassert.assertTrue(false);
				String address181 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
				String price181 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
				logger.error(actTitle181+" + "+address181+" + "+price181);
				captureScreen(driver,address181);}}}
				
				
				
				
				
				
				
				
				
				
	//Testing casa182 -----------------------------------------------------------------------------------------------------------------------			
	if (casa182.isBlank())			
		System.out.println("Blank");		
	else{			
		driver.findElement(By.tagName("input")).sendKeys(casa182,Keys.ENTER);		
		Thread.sleep(2500);		
		//Check if House is still on Market		
		if (driver.getTitle().equalsIgnoreCase(Offmarket))		
			logger.error(casa182 + " is off market");	
		else {		
		//Test results		
			String actTitle182=driver.findElement(By.className("status-label")).getText();	
			if(actTitle182.equalsIgnoreCase(Pending)||actTitle182.equalsIgnoreCase("ACTIVE"))	
				{ softassert.assertTrue(true);
				logger.info("");}
			else{	
				softassert.assertTrue(false);
				String address182 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
				String price182 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
				logger.error(actTitle182+" + "+address182+" + "+price182);
				captureScreen(driver,address182);}}}
				
	//Testing casa183 -----------------------------------------------------------------------------------------------------------------------			
	if (casa183.isBlank())			
		System.out.println("Blank");		
	else{			
		driver.findElement(By.tagName("input")).sendKeys(casa183,Keys.ENTER);		
		Thread.sleep(2500);		
		//Check if House is still on Market		
		if (driver.getTitle().equalsIgnoreCase(Offmarket))		
			logger.error(casa183 + " is off market");	
		else {		
		//Test results		
			String actTitle183=driver.findElement(By.className("status-label")).getText();	
			if(actTitle183.equalsIgnoreCase(Pending)||actTitle183.equalsIgnoreCase("ACTIVE"))	
				{ softassert.assertTrue(true);
				logger.info("");}
			else{	
				softassert.assertTrue(false);
				String address183 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
				String price183 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
				logger.error(actTitle183+" + "+address183+" + "+price183);
				captureScreen(driver,address183);}}}
				
	//Testing casa184 -----------------------------------------------------------------------------------------------------------------------			
	if (casa184.isBlank())			
		System.out.println("Blank");		
	else{			
		driver.findElement(By.tagName("input")).sendKeys(casa184,Keys.ENTER);		
		Thread.sleep(2500);		
		//Check if House is still on Market		
		if (driver.getTitle().equalsIgnoreCase(Offmarket))		
			logger.error(casa184 + " is off market");	
		else {		
		//Test results		
			String actTitle184=driver.findElement(By.className("status-label")).getText();	
			if(actTitle184.equalsIgnoreCase(Pending)||actTitle184.equalsIgnoreCase("ACTIVE"))	
				{ softassert.assertTrue(true);
				logger.info("");}
			else{	
				softassert.assertTrue(false);
				String address184 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
				String price184 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
				logger.error(actTitle184+" + "+address184+" + "+price184);
				captureScreen(driver,address184);}}}
				
	//Testing casa185 -----------------------------------------------------------------------------------------------------------------------			
	if (casa185.isBlank())			
		System.out.println("Blank");		
	else{			
		driver.findElement(By.tagName("input")).sendKeys(casa185,Keys.ENTER);		
		Thread.sleep(2500);		
		//Check if House is still on Market		
		if (driver.getTitle().equalsIgnoreCase(Offmarket))		
			logger.error(casa185 + " is off market");	
		else {		
		//Test results		
			String actTitle185=driver.findElement(By.className("status-label")).getText();	
			if(actTitle185.equalsIgnoreCase(Pending)||actTitle185.equalsIgnoreCase("ACTIVE"))	
				{ softassert.assertTrue(true);
				logger.info("");}
			else{	
				softassert.assertTrue(false);
				String address185 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
				String price185 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
				logger.error(actTitle185+" + "+address185+" + "+price185);
				captureScreen(driver,address185);}}}
				
	//Testing casa186 -----------------------------------------------------------------------------------------------------------------------			
	if (casa186.isBlank())			
		System.out.println("Blank");		
	else{			
		driver.findElement(By.tagName("input")).sendKeys(casa186,Keys.ENTER);		
		Thread.sleep(2500);		
		//Check if House is still on Market		
		if (driver.getTitle().equalsIgnoreCase(Offmarket))		
			logger.error(casa186 + " is off market");	
		else {		
		//Test results		
			String actTitle186=driver.findElement(By.className("status-label")).getText();	
			if(actTitle186.equalsIgnoreCase(Pending)||actTitle186.equalsIgnoreCase("ACTIVE"))	
				{ softassert.assertTrue(true);
				logger.info("");}
			else{	
				softassert.assertTrue(false);
				String address186 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
				String price186 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
				logger.error(actTitle186+" + "+address186+" + "+price186);
				captureScreen(driver,address186);}}}
				
	//Testing casa187 -----------------------------------------------------------------------------------------------------------------------			
	if (casa187.isBlank())			
		System.out.println("Blank");		
	else{			
		driver.findElement(By.tagName("input")).sendKeys(casa187,Keys.ENTER);		
		Thread.sleep(2500);		
		//Check if House is still on Market		
		if (driver.getTitle().equalsIgnoreCase(Offmarket))		
			logger.error(casa187 + " is off market");	
		else {		
		//Test results		
			String actTitle187=driver.findElement(By.className("status-label")).getText();	
			if(actTitle187.equalsIgnoreCase(Pending)||actTitle187.equalsIgnoreCase("ACTIVE"))	
				{ softassert.assertTrue(true);
				logger.info("");}
			else{	
				softassert.assertTrue(false);
				String address187 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
				String price187 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
				logger.error(actTitle187+" + "+address187+" + "+price187);
				captureScreen(driver,address187);}}}
				
	//Testing casa188 -----------------------------------------------------------------------------------------------------------------------			
	if (casa188.isBlank())			
		System.out.println("Blank");		
	else{			
		driver.findElement(By.tagName("input")).sendKeys(casa188,Keys.ENTER);		
		Thread.sleep(2500);		
		//Check if House is still on Market		
		if (driver.getTitle().equalsIgnoreCase(Offmarket))		
			logger.error(casa188 + " is off market");	
		else {		
		//Test results		
			String actTitle188=driver.findElement(By.className("status-label")).getText();	
			if(actTitle188.equalsIgnoreCase(Pending)||actTitle188.equalsIgnoreCase("ACTIVE"))	
				{ softassert.assertTrue(true);
				logger.info("");}
			else{	
				softassert.assertTrue(false);
				String address188 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
				String price188 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
				logger.error(actTitle188+" + "+address188+" + "+price188);
				captureScreen(driver,address188);}}}
				
	//Testing casa189 -----------------------------------------------------------------------------------------------------------------------			
	if (casa189.isBlank())			
		System.out.println("Blank");		
	else{			
		driver.findElement(By.tagName("input")).sendKeys(casa189,Keys.ENTER);		
		Thread.sleep(2500);		
		//Check if House is still on Market		
		if (driver.getTitle().equalsIgnoreCase(Offmarket))		
			logger.error(casa189 + " is off market");	
		else {		
		//Test results		
			String actTitle189=driver.findElement(By.className("status-label")).getText();	
			if(actTitle189.equalsIgnoreCase(Pending)||actTitle189.equalsIgnoreCase("ACTIVE"))	
				{ softassert.assertTrue(true);
				logger.info("");}
			else{	
				softassert.assertTrue(false);
				String address189 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
				String price189 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
				logger.error(actTitle189+" + "+address189+" + "+price189);
				captureScreen(driver,address189);}}}
				
	//Testing casa190 -----------------------------------------------------------------------------------------------------------------------			
	if (casa190.isBlank())			
		System.out.println("Blank");		
	else{			
		driver.findElement(By.tagName("input")).sendKeys(casa190,Keys.ENTER);		
		Thread.sleep(2500);		
		//Check if House is still on Market		
		if (driver.getTitle().equalsIgnoreCase(Offmarket))		
			logger.error(casa190 + " is off market");	
		else {		
		//Test results		
			String actTitle190=driver.findElement(By.className("status-label")).getText();	
			if(actTitle190.equalsIgnoreCase(Pending)||actTitle190.equalsIgnoreCase("ACTIVE"))	
				{ softassert.assertTrue(true);
				logger.info("");}
			else{	
				softassert.assertTrue(false);
				String address190 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
				String price190 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
				logger.error(actTitle190+" + "+address190+" + "+price190);
				captureScreen(driver,address190);}}}
				
	softassert.assertAll();			
	logger.info("Completed Housing Test 19"); 			
	}			
	}			
