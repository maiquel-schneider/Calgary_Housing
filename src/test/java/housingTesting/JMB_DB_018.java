package housingTesting;				
				
import java.io.IOException;				
import org.openqa.selenium.By;				
import org.openqa.selenium.Keys;				
import org.testng.annotations.Listeners;				
import org.testng.annotations.Test;				
import org.testng.asserts.SoftAssert;				
import com.base.BaseClass;				
				
				
@Listeners				
public class JMB_DB_018 extends BaseClass {				
				
	//Get all prices of houses sold			
				
				
  @Test				
public void housingPrice8() throws IOException, InterruptedException{				
				
	 // Creating Soft Assertions			
	SoftAssert softassert = new SoftAssert();  			
				
	//Testing casa71 -----------------------------------------------------------------------------------------------------------------------			
	if (casa71.isBlank())			
		System.out.println("Blank");		
	else{			
		driver.findElement(By.tagName("input")).sendKeys(casa71,Keys.ENTER);		
		Thread.sleep(2500);		
		//Check if House is still on Market		
		if (driver.getTitle().equalsIgnoreCase(Offmarket))		
			logger.error(casa71 + " is off market");	
		else {		
		//Test results		
			String actTitle71=driver.findElement(By.className("status-label")).getText();	
			if(actTitle71.equalsIgnoreCase(Pending)||actTitle71.equalsIgnoreCase("ACTIVE"))	
				{ softassert.assertTrue(true);
				logger.info("");}
			else{	
				softassert.assertTrue(false);
				String address71 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
				String price71 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
				logger.error(actTitle71+" + "+address71+" + "+price71);
				captureScreen(driver,address71);}}}
				
				
				
				
				
				
				
				
				
				
	//Testing casa72 -----------------------------------------------------------------------------------------------------------------------			
	if (casa72.isBlank())			
		System.out.println("Blank");		
	else{			
		driver.findElement(By.tagName("input")).sendKeys(casa72,Keys.ENTER);		
		Thread.sleep(2500);		
		//Check if House is still on Market		
		if (driver.getTitle().equalsIgnoreCase(Offmarket))		
			logger.error(casa72 + " is off market");	
		else {		
		//Test results		
			String actTitle72=driver.findElement(By.className("status-label")).getText();	
			if(actTitle72.equalsIgnoreCase(Pending)||actTitle72.equalsIgnoreCase("ACTIVE"))	
				{ softassert.assertTrue(true);
				logger.info("");}
			else{	
				softassert.assertTrue(false);
				String address72 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
				String price72 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
				logger.error(actTitle72+" + "+address72+" + "+price72);
				captureScreen(driver,address72);}}}
				
	//Testing casa73 -----------------------------------------------------------------------------------------------------------------------			
	if (casa73.isBlank())			
		System.out.println("Blank");		
	else{			
		driver.findElement(By.tagName("input")).sendKeys(casa73,Keys.ENTER);		
		Thread.sleep(2500);		
		//Check if House is still on Market		
		if (driver.getTitle().equalsIgnoreCase(Offmarket))		
			logger.error(casa73 + " is off market");	
		else {		
		//Test results		
			String actTitle73=driver.findElement(By.className("status-label")).getText();	
			if(actTitle73.equalsIgnoreCase(Pending)||actTitle73.equalsIgnoreCase("ACTIVE"))	
				{ softassert.assertTrue(true);
				logger.info("");}
			else{	
				softassert.assertTrue(false);
				String address73 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
				String price73 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
				logger.error(actTitle73+" + "+address73+" + "+price73);
				captureScreen(driver,address73);}}}
				
	//Testing casa74 -----------------------------------------------------------------------------------------------------------------------			
	if (casa74.isBlank())			
		System.out.println("Blank");		
	else{			
		driver.findElement(By.tagName("input")).sendKeys(casa74,Keys.ENTER);		
		Thread.sleep(2500);		
		//Check if House is still on Market		
		if (driver.getTitle().equalsIgnoreCase(Offmarket))		
			logger.error(casa74 + " is off market");	
		else {		
		//Test results		
			String actTitle74=driver.findElement(By.className("status-label")).getText();	
			if(actTitle74.equalsIgnoreCase(Pending)||actTitle74.equalsIgnoreCase("ACTIVE"))	
				{ softassert.assertTrue(true);
				logger.info("");}
			else{	
				softassert.assertTrue(false);
				String address74 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
				String price74 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
				logger.error(actTitle74+" + "+address74+" + "+price74);
				captureScreen(driver,address74);}}}
				
	//Testing casa75 -----------------------------------------------------------------------------------------------------------------------			
	if (casa75.isBlank())			
		System.out.println("Blank");		
	else{			
		driver.findElement(By.tagName("input")).sendKeys(casa75,Keys.ENTER);		
		Thread.sleep(2500);		
		//Check if House is still on Market		
		if (driver.getTitle().equalsIgnoreCase(Offmarket))		
			logger.error(casa75 + " is off market");	
		else {		
		//Test results		
			String actTitle75=driver.findElement(By.className("status-label")).getText();	
			if(actTitle75.equalsIgnoreCase(Pending)||actTitle75.equalsIgnoreCase("ACTIVE"))	
				{ softassert.assertTrue(true);
				logger.info("");}
			else{	
				softassert.assertTrue(false);
				String address75 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
				String price75 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
				logger.error(actTitle75+" + "+address75+" + "+price75);
				captureScreen(driver,address75);}}}
				
	//Testing casa76 -----------------------------------------------------------------------------------------------------------------------			
	if (casa76.isBlank())			
		System.out.println("Blank");		
	else{			
		driver.findElement(By.tagName("input")).sendKeys(casa76,Keys.ENTER);		
		Thread.sleep(2500);		
		//Check if House is still on Market		
		if (driver.getTitle().equalsIgnoreCase(Offmarket))		
			logger.error(casa76 + " is off market");	
		else {		
		//Test results		
			String actTitle76=driver.findElement(By.className("status-label")).getText();	
			if(actTitle76.equalsIgnoreCase(Pending)||actTitle76.equalsIgnoreCase("ACTIVE"))	
				{ softassert.assertTrue(true);
				logger.info("");}
			else{	
				softassert.assertTrue(false);
				String address76 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
				String price76 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
				logger.error(actTitle76+" + "+address76+" + "+price76);
				captureScreen(driver,address76);}}}
				
	//Testing casa77 -----------------------------------------------------------------------------------------------------------------------			
	if (casa77.isBlank())			
		System.out.println("Blank");		
	else{			
		driver.findElement(By.tagName("input")).sendKeys(casa77,Keys.ENTER);		
		Thread.sleep(2500);		
		//Check if House is still on Market		
		if (driver.getTitle().equalsIgnoreCase(Offmarket))		
			logger.error(casa77 + " is off market");	
		else {		
		//Test results		
			String actTitle77=driver.findElement(By.className("status-label")).getText();	
			if(actTitle77.equalsIgnoreCase(Pending)||actTitle77.equalsIgnoreCase("ACTIVE"))	
				{ softassert.assertTrue(true);
				logger.info("");}
			else{	
				softassert.assertTrue(false);
				String address77 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
				String price77 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
				logger.error(actTitle77+" + "+address77+" + "+price77);
				captureScreen(driver,address77);}}}
				
	//Testing casa78 -----------------------------------------------------------------------------------------------------------------------			
	if (casa78.isBlank())			
		System.out.println("Blank");		
	else{			
		driver.findElement(By.tagName("input")).sendKeys(casa78,Keys.ENTER);		
		Thread.sleep(2500);		
		//Check if House is still on Market		
		if (driver.getTitle().equalsIgnoreCase(Offmarket))		
			logger.error(casa78 + " is off market");	
		else {		
		//Test results		
			String actTitle78=driver.findElement(By.className("status-label")).getText();	
			if(actTitle78.equalsIgnoreCase(Pending)||actTitle78.equalsIgnoreCase("ACTIVE"))	
				{ softassert.assertTrue(true);
				logger.info("");}
			else{	
				softassert.assertTrue(false);
				String address78 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
				String price78 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
				logger.error(actTitle78+" + "+address78+" + "+price78);
				captureScreen(driver,address78);}}}
				
	//Testing casa79 -----------------------------------------------------------------------------------------------------------------------			
	if (casa79.isBlank())			
		System.out.println("Blank");		
	else{			
		driver.findElement(By.tagName("input")).sendKeys(casa79,Keys.ENTER);		
		Thread.sleep(2500);		
		//Check if House is still on Market		
		if (driver.getTitle().equalsIgnoreCase(Offmarket))		
			logger.error(casa79 + " is off market");	
		else {		
		//Test results		
			String actTitle79=driver.findElement(By.className("status-label")).getText();	
			if(actTitle79.equalsIgnoreCase(Pending)||actTitle79.equalsIgnoreCase("ACTIVE"))	
				{ softassert.assertTrue(true);
				logger.info("");}
			else{	
				softassert.assertTrue(false);
				String address79 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
				String price79 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
				logger.error(actTitle79+" + "+address79+" + "+price79);
				captureScreen(driver,address79);}}}
				
	//Testing casa80 -----------------------------------------------------------------------------------------------------------------------			
	if (casa80.isBlank())			
		System.out.println("Blank");		
	else{			
		driver.findElement(By.tagName("input")).sendKeys(casa80,Keys.ENTER);		
		Thread.sleep(2500);		
		//Check if House is still on Market		
		if (driver.getTitle().equalsIgnoreCase(Offmarket))		
			logger.error(casa80 + " is off market");	
		else {		
		//Test results		
			String actTitle80=driver.findElement(By.className("status-label")).getText();	
			if(actTitle80.equalsIgnoreCase(Pending)||actTitle80.equalsIgnoreCase("ACTIVE"))	
				{ softassert.assertTrue(true);
				logger.info("");}
			else{	
				softassert.assertTrue(false);
				String address80 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/h1[1]/span[1]")).getText();
				String price80 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).getText();
				logger.error(actTitle80+" + "+address80+" + "+price80);
				captureScreen(driver,address80);}}}
				
	softassert.assertAll();			
	logger.info("Completed Housing Test 8"); 			
	}			
	}			
