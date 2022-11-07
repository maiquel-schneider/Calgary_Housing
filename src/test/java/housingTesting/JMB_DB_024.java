package housingTesting;				
				
import java.io.IOException;				
import org.openqa.selenium.By;				
import org.openqa.selenium.Keys;				
import org.testng.annotations.Listeners;				
import org.testng.annotations.Test;				
import org.testng.asserts.SoftAssert;				
import com.base.BaseClass;				
				
				
@Listeners				
public class JMB_DB_024 extends BaseClass {				
				
	//Get all prices of houses sold			
				
				
  @Test				
public void housingPrice14() throws IOException, InterruptedException{				
				
	 // Creating Soft Assertions			
	SoftAssert softassert = new SoftAssert();  			
				
	//Testing casa131 -----------------------------------------------------------------------------------------------------------------------			
	if (casa131.isBlank())			
		System.out.println("Blank");		
	else{			
		driver.findElement(By.tagName("input")).sendKeys(casa131,Keys.ENTER);		
		Thread.sleep(2500);		
		//Check if House is still on Market		
		if (driver.getTitle().equalsIgnoreCase(Offmarket))		
			logger.error(casa131 + " is off market");	
		else {		
		//Test results		
			String actTitle131=driver.findElement(By.className("status-label")).getText();	
			if(actTitle131.equalsIgnoreCase(Pending)||actTitle131.equalsIgnoreCase("ACTIVE"))	
				{ softassert.assertTrue(true);
				logger.info("");}
			else{	
				softassert.assertTrue(false);
				String address131 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
				String price131 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
				logger.error(actTitle131+" + "+address131+" + "+price131);
				captureScreen(driver,address131);}}}
				
				
				
				
				
				
				
				
				
				
	//Testing casa132 -----------------------------------------------------------------------------------------------------------------------			
	if (casa132.isBlank())			
		System.out.println("Blank");		
	else{			
		driver.findElement(By.tagName("input")).sendKeys(casa132,Keys.ENTER);		
		Thread.sleep(2500);		
		//Check if House is still on Market		
		if (driver.getTitle().equalsIgnoreCase(Offmarket))		
			logger.error(casa132 + " is off market");	
		else {		
		//Test results		
			String actTitle132=driver.findElement(By.className("status-label")).getText();	
			if(actTitle132.equalsIgnoreCase(Pending)||actTitle132.equalsIgnoreCase("ACTIVE"))	
				{ softassert.assertTrue(true);
				logger.info("");}
			else{	
				softassert.assertTrue(false);
				String address132 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
				String price132 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
				logger.error(actTitle132+" + "+address132+" + "+price132);
				captureScreen(driver,address132);}}}
				
	//Testing casa133 -----------------------------------------------------------------------------------------------------------------------			
	if (casa133.isBlank())			
		System.out.println("Blank");		
	else{			
		driver.findElement(By.tagName("input")).sendKeys(casa133,Keys.ENTER);		
		Thread.sleep(2500);		
		//Check if House is still on Market		
		if (driver.getTitle().equalsIgnoreCase(Offmarket))		
			logger.error(casa133 + " is off market");	
		else {		
		//Test results		
			String actTitle133=driver.findElement(By.className("status-label")).getText();	
			if(actTitle133.equalsIgnoreCase(Pending)||actTitle133.equalsIgnoreCase("ACTIVE"))	
				{ softassert.assertTrue(true);
				logger.info("");}
			else{	
				softassert.assertTrue(false);
				String address133 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
				String price133 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
				logger.error(actTitle133+" + "+address133+" + "+price133);
				captureScreen(driver,address133);}}}
				
	//Testing casa134 -----------------------------------------------------------------------------------------------------------------------			
	if (casa134.isBlank())			
		System.out.println("Blank");		
	else{			
		driver.findElement(By.tagName("input")).sendKeys(casa134,Keys.ENTER);		
		Thread.sleep(2500);		
		//Check if House is still on Market		
		if (driver.getTitle().equalsIgnoreCase(Offmarket))		
			logger.error(casa134 + " is off market");	
		else {		
		//Test results		
			String actTitle134=driver.findElement(By.className("status-label")).getText();	
			if(actTitle134.equalsIgnoreCase(Pending)||actTitle134.equalsIgnoreCase("ACTIVE"))	
				{ softassert.assertTrue(true);
				logger.info("");}
			else{	
				softassert.assertTrue(false);
				String address134 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
				String price134 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
				logger.error(actTitle134+" + "+address134+" + "+price134);
				captureScreen(driver,address134);}}}
				
	//Testing casa135 -----------------------------------------------------------------------------------------------------------------------			
	if (casa135.isBlank())			
		System.out.println("Blank");		
	else{			
		driver.findElement(By.tagName("input")).sendKeys(casa135,Keys.ENTER);		
		Thread.sleep(2500);		
		//Check if House is still on Market		
		if (driver.getTitle().equalsIgnoreCase(Offmarket))		
			logger.error(casa135 + " is off market");	
		else {		
		//Test results		
			String actTitle135=driver.findElement(By.className("status-label")).getText();	
			if(actTitle135.equalsIgnoreCase(Pending)||actTitle135.equalsIgnoreCase("ACTIVE"))	
				{ softassert.assertTrue(true);
				logger.info("");}
			else{	
				softassert.assertTrue(false);
				String address135 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
				String price135 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
				logger.error(actTitle135+" + "+address135+" + "+price135);
				captureScreen(driver,address135);}}}
				
	//Testing casa136 -----------------------------------------------------------------------------------------------------------------------			
	if (casa136.isBlank())			
		System.out.println("Blank");		
	else{			
		driver.findElement(By.tagName("input")).sendKeys(casa136,Keys.ENTER);		
		Thread.sleep(2500);		
		//Check if House is still on Market		
		if (driver.getTitle().equalsIgnoreCase(Offmarket))		
			logger.error(casa136 + " is off market");	
		else {		
		//Test results		
			String actTitle136=driver.findElement(By.className("status-label")).getText();	
			if(actTitle136.equalsIgnoreCase(Pending)||actTitle136.equalsIgnoreCase("ACTIVE"))	
				{ softassert.assertTrue(true);
				logger.info("");}
			else{	
				softassert.assertTrue(false);
				String address136 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
				String price136 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
				logger.error(actTitle136+" + "+address136+" + "+price136);
				captureScreen(driver,address136);}}}
				
	//Testing casa137 -----------------------------------------------------------------------------------------------------------------------			
	if (casa137.isBlank())			
		System.out.println("Blank");		
	else{			
		driver.findElement(By.tagName("input")).sendKeys(casa137,Keys.ENTER);		
		Thread.sleep(2500);		
		//Check if House is still on Market		
		if (driver.getTitle().equalsIgnoreCase(Offmarket))		
			logger.error(casa137 + " is off market");	
		else {		
		//Test results		
			String actTitle137=driver.findElement(By.className("status-label")).getText();	
			if(actTitle137.equalsIgnoreCase(Pending)||actTitle137.equalsIgnoreCase("ACTIVE"))	
				{ softassert.assertTrue(true);
				logger.info("");}
			else{	
				softassert.assertTrue(false);
				String address137 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
				String price137 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
				logger.error(actTitle137+" + "+address137+" + "+price137);
				captureScreen(driver,address137);}}}
				
	//Testing casa138 -----------------------------------------------------------------------------------------------------------------------			
	if (casa138.isBlank())			
		System.out.println("Blank");		
	else{			
		driver.findElement(By.tagName("input")).sendKeys(casa138,Keys.ENTER);		
		Thread.sleep(2500);		
		//Check if House is still on Market		
		if (driver.getTitle().equalsIgnoreCase(Offmarket))		
			logger.error(casa138 + " is off market");	
		else {		
		//Test results		
			String actTitle138=driver.findElement(By.className("status-label")).getText();	
			if(actTitle138.equalsIgnoreCase(Pending)||actTitle138.equalsIgnoreCase("ACTIVE"))	
				{ softassert.assertTrue(true);
				logger.info("");}
			else{	
				softassert.assertTrue(false);
				String address138 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
				String price138 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
				logger.error(actTitle138+" + "+address138+" + "+price138);
				captureScreen(driver,address138);}}}
				
	//Testing casa139 -----------------------------------------------------------------------------------------------------------------------			
	if (casa139.isBlank())			
		System.out.println("Blank");		
	else{			
		driver.findElement(By.tagName("input")).sendKeys(casa139,Keys.ENTER);		
		Thread.sleep(2500);		
		//Check if House is still on Market		
		if (driver.getTitle().equalsIgnoreCase(Offmarket))		
			logger.error(casa139 + " is off market");	
		else {		
		//Test results		
			String actTitle139=driver.findElement(By.className("status-label")).getText();	
			if(actTitle139.equalsIgnoreCase(Pending)||actTitle139.equalsIgnoreCase("ACTIVE"))	
				{ softassert.assertTrue(true);
				logger.info("");}
			else{	
				softassert.assertTrue(false);
				String address139 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
				String price139 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
				logger.error(actTitle139+" + "+address139+" + "+price139);
				captureScreen(driver,address139);}}}
				
	//Testing casa140 -----------------------------------------------------------------------------------------------------------------------			
	if (casa140.isBlank())			
		System.out.println("Blank");		
	else{			
		driver.findElement(By.tagName("input")).sendKeys(casa140,Keys.ENTER);		
		Thread.sleep(2500);		
		//Check if House is still on Market		
		if (driver.getTitle().equalsIgnoreCase(Offmarket))		
			logger.error(casa140 + " is off market");	
		else {		
		//Test results		
			String actTitle140=driver.findElement(By.className("status-label")).getText();	
			if(actTitle140.equalsIgnoreCase(Pending)||actTitle140.equalsIgnoreCase("ACTIVE"))	
				{ softassert.assertTrue(true);
				logger.info("");}
			else{	
				softassert.assertTrue(false);
				String address140 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
				String price140 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
				logger.error(actTitle140+" + "+address140+" + "+price140);
				captureScreen(driver,address140);}}}
				
	softassert.assertAll();			
	logger.info("Completed Housing Test 14"); 			
	}			
	}			
