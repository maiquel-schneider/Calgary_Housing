package housingTesting;				
				
import java.io.IOException;				
import org.openqa.selenium.By;				
import org.openqa.selenium.Keys;				
import org.testng.annotations.Listeners;				
import org.testng.annotations.Test;				
import org.testng.asserts.SoftAssert;				
import com.base.BaseClass;				
				
				
@Listeners				
public class JMB_DB_028 extends BaseClass {				
				
	//Get all prices of houses sold			
				
				
  @Test				
public void housingPrice18() throws IOException, InterruptedException{				
				
	 // Creating Soft Assertions			
	SoftAssert softassert = new SoftAssert();  			
				
	//Testing casa171 -----------------------------------------------------------------------------------------------------------------------			
	if (casa171.isBlank())			
		System.out.println("Blank");		
	else{			
		driver.findElement(By.tagName("input")).sendKeys(casa171,Keys.ENTER);		
		Thread.sleep(2500);		
		//Check if House is still on Market		
		if (driver.getTitle().equalsIgnoreCase(Offmarket))		
			logger.error(casa171 + " is off market");	
		else {		
		//Test results		
			String actTitle171=driver.findElement(By.className("status-label")).getText();	
			if(actTitle171.equalsIgnoreCase(Pending)||actTitle171.equalsIgnoreCase("ACTIVE"))	
				{ softassert.assertTrue(true);
				logger.info("");}
			else{	
				softassert.assertTrue(false);
				String address171 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
				String price171 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
				logger.error(actTitle171+" + "+address171+" + "+price171);
				captureScreen(driver,address171);}}}
				
				
				
				
				
				
				
				
				
				
	//Testing casa172 -----------------------------------------------------------------------------------------------------------------------			
	if (casa172.isBlank())			
		System.out.println("Blank");		
	else{			
		driver.findElement(By.tagName("input")).sendKeys(casa172,Keys.ENTER);		
		Thread.sleep(2500);		
		//Check if House is still on Market		
		if (driver.getTitle().equalsIgnoreCase(Offmarket))		
			logger.error(casa172 + " is off market");	
		else {		
		//Test results		
			String actTitle172=driver.findElement(By.className("status-label")).getText();	
			if(actTitle172.equalsIgnoreCase(Pending)||actTitle172.equalsIgnoreCase("ACTIVE"))	
				{ softassert.assertTrue(true);
				logger.info("");}
			else{	
				softassert.assertTrue(false);
				String address172 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
				String price172 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
				logger.error(actTitle172+" + "+address172+" + "+price172);
				captureScreen(driver,address172);}}}
				
	//Testing casa173 -----------------------------------------------------------------------------------------------------------------------			
	if (casa173.isBlank())			
		System.out.println("Blank");		
	else{			
		driver.findElement(By.tagName("input")).sendKeys(casa173,Keys.ENTER);		
		Thread.sleep(2500);		
		//Check if House is still on Market		
		if (driver.getTitle().equalsIgnoreCase(Offmarket))		
			logger.error(casa173 + " is off market");	
		else {		
		//Test results		
			String actTitle173=driver.findElement(By.className("status-label")).getText();	
			if(actTitle173.equalsIgnoreCase(Pending)||actTitle173.equalsIgnoreCase("ACTIVE"))	
				{ softassert.assertTrue(true);
				logger.info("");}
			else{	
				softassert.assertTrue(false);
				String address173 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
				String price173 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
				logger.error(actTitle173+" + "+address173+" + "+price173);
				captureScreen(driver,address173);}}}
				
	//Testing casa174 -----------------------------------------------------------------------------------------------------------------------			
	if (casa174.isBlank())			
		System.out.println("Blank");		
	else{			
		driver.findElement(By.tagName("input")).sendKeys(casa174,Keys.ENTER);		
		Thread.sleep(2500);		
		//Check if House is still on Market		
		if (driver.getTitle().equalsIgnoreCase(Offmarket))		
			logger.error(casa174 + " is off market");	
		else {		
		//Test results		
			String actTitle174=driver.findElement(By.className("status-label")).getText();	
			if(actTitle174.equalsIgnoreCase(Pending)||actTitle174.equalsIgnoreCase("ACTIVE"))	
				{ softassert.assertTrue(true);
				logger.info("");}
			else{	
				softassert.assertTrue(false);
				String address174 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
				String price174 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
				logger.error(actTitle174+" + "+address174+" + "+price174);
				captureScreen(driver,address174);}}}
				
	//Testing casa175 -----------------------------------------------------------------------------------------------------------------------			
	if (casa175.isBlank())			
		System.out.println("Blank");		
	else{			
		driver.findElement(By.tagName("input")).sendKeys(casa175,Keys.ENTER);		
		Thread.sleep(2500);		
		//Check if House is still on Market		
		if (driver.getTitle().equalsIgnoreCase(Offmarket))		
			logger.error(casa175 + " is off market");	
		else {		
		//Test results		
			String actTitle175=driver.findElement(By.className("status-label")).getText();	
			if(actTitle175.equalsIgnoreCase(Pending)||actTitle175.equalsIgnoreCase("ACTIVE"))	
				{ softassert.assertTrue(true);
				logger.info("");}
			else{	
				softassert.assertTrue(false);
				String address175 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
				String price175 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
				logger.error(actTitle175+" + "+address175+" + "+price175);
				captureScreen(driver,address175);}}}
				
	//Testing casa176 -----------------------------------------------------------------------------------------------------------------------			
	if (casa176.isBlank())			
		System.out.println("Blank");		
	else{			
		driver.findElement(By.tagName("input")).sendKeys(casa176,Keys.ENTER);		
		Thread.sleep(2500);		
		//Check if House is still on Market		
		if (driver.getTitle().equalsIgnoreCase(Offmarket))		
			logger.error(casa176 + " is off market");	
		else {		
		//Test results		
			String actTitle176=driver.findElement(By.className("status-label")).getText();	
			if(actTitle176.equalsIgnoreCase(Pending)||actTitle176.equalsIgnoreCase("ACTIVE"))	
				{ softassert.assertTrue(true);
				logger.info("");}
			else{	
				softassert.assertTrue(false);
				String address176 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
				String price176 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
				logger.error(actTitle176+" + "+address176+" + "+price176);
				captureScreen(driver,address176);}}}
				
	//Testing casa177 -----------------------------------------------------------------------------------------------------------------------			
	if (casa177.isBlank())			
		System.out.println("Blank");		
	else{			
		driver.findElement(By.tagName("input")).sendKeys(casa177,Keys.ENTER);		
		Thread.sleep(2500);		
		//Check if House is still on Market		
		if (driver.getTitle().equalsIgnoreCase(Offmarket))		
			logger.error(casa177 + " is off market");	
		else {		
		//Test results		
			String actTitle177=driver.findElement(By.className("status-label")).getText();	
			if(actTitle177.equalsIgnoreCase(Pending)||actTitle177.equalsIgnoreCase("ACTIVE"))	
				{ softassert.assertTrue(true);
				logger.info("");}
			else{	
				softassert.assertTrue(false);
				String address177 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
				String price177 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
				logger.error(actTitle177+" + "+address177+" + "+price177);
				captureScreen(driver,address177);}}}
				
	//Testing casa178 -----------------------------------------------------------------------------------------------------------------------			
	if (casa178.isBlank())			
		System.out.println("Blank");		
	else{			
		driver.findElement(By.tagName("input")).sendKeys(casa178,Keys.ENTER);		
		Thread.sleep(2500);		
		//Check if House is still on Market		
		if (driver.getTitle().equalsIgnoreCase(Offmarket))		
			logger.error(casa178 + " is off market");	
		else {		
		//Test results		
			String actTitle178=driver.findElement(By.className("status-label")).getText();	
			if(actTitle178.equalsIgnoreCase(Pending)||actTitle178.equalsIgnoreCase("ACTIVE"))	
				{ softassert.assertTrue(true);
				logger.info("");}
			else{	
				softassert.assertTrue(false);
				String address178 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
				String price178 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
				logger.error(actTitle178+" + "+address178+" + "+price178);
				captureScreen(driver,address178);}}}
				
	//Testing casa179 -----------------------------------------------------------------------------------------------------------------------			
	if (casa179.isBlank())			
		System.out.println("Blank");		
	else{			
		driver.findElement(By.tagName("input")).sendKeys(casa179,Keys.ENTER);		
		Thread.sleep(2500);		
		//Check if House is still on Market		
		if (driver.getTitle().equalsIgnoreCase(Offmarket))		
			logger.error(casa179 + " is off market");	
		else {		
		//Test results		
			String actTitle179=driver.findElement(By.className("status-label")).getText();	
			if(actTitle179.equalsIgnoreCase(Pending)||actTitle179.equalsIgnoreCase("ACTIVE"))	
				{ softassert.assertTrue(true);
				logger.info("");}
			else{	
				softassert.assertTrue(false);
				String address179 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
				String price179 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
				logger.error(actTitle179+" + "+address179+" + "+price179);
				captureScreen(driver,address179);}}}
				
	//Testing casa180 -----------------------------------------------------------------------------------------------------------------------			
	if (casa180.isBlank())			
		System.out.println("Blank");		
	else{			
		driver.findElement(By.tagName("input")).sendKeys(casa180,Keys.ENTER);		
		Thread.sleep(2500);		
		//Check if House is still on Market		
		if (driver.getTitle().equalsIgnoreCase(Offmarket))		
			logger.error(casa180 + " is off market");	
		else {		
		//Test results		
			String actTitle180=driver.findElement(By.className("status-label")).getText();	
			if(actTitle180.equalsIgnoreCase(Pending)||actTitle180.equalsIgnoreCase("ACTIVE"))	
				{ softassert.assertTrue(true);
				logger.info("");}
			else{	
				softassert.assertTrue(false);
				String address180 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
				String price180 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
				logger.error(actTitle180+" + "+address180+" + "+price180);
				captureScreen(driver,address180);}}}
				
	softassert.assertAll();			
	logger.info("Completed Housing Test 18"); 			
	}			
	}			
