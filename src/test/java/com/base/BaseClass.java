package com.base;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import com.utilities.ReadConfig;



public class BaseClass 
{
	static ReadConfig  readconfig = new ReadConfig(); // Creating object
	// Integrating data from ReadConfig
	public static String baseURL=readconfig.getApplicationURL(); 
	public String username1=readconfig.getUsername1();
	public String password=readconfig.getPassword(); 
	public  String browser=readconfig.getbrowser();
	public  String Pending=readconfig.getPending();
	public  String Offmarket=readconfig.getOffmarket();
	public  String casa1=readconfig.getcasa1();
	public  String casa2=readconfig.getcasa2();
	public  String casa3=readconfig.getcasa3();
	public  String casa4=readconfig.getcasa4();
	public  String casa5=readconfig.getcasa5();
	public  String casa6=readconfig.getcasa6();
	public  String casa7=readconfig.getcasa7();
	public  String casa8=readconfig.getcasa8();
	public  String casa9=readconfig.getcasa9();
	public  String casa10=readconfig.getcasa10();
	public  String casa11=readconfig.getcasa11();
	public  String casa12=readconfig.getcasa12();
	public  String casa13=readconfig.getcasa13();
	public  String casa14=readconfig.getcasa14();
	public  String casa15=readconfig.getcasa15();
	public  String casa16=readconfig.getcasa16();
	public  String casa17=readconfig.getcasa17();
	public  String casa18=readconfig.getcasa18();
	public  String casa19=readconfig.getcasa19();
	public  String casa20=readconfig.getcasa20();
	public  String casa21=readconfig.getcasa21();
	public  String casa22=readconfig.getcasa22();
	public  String casa23=readconfig.getcasa23();
	public  String casa24=readconfig.getcasa24();
	public  String casa25=readconfig.getcasa25();
	public  String casa26=readconfig.getcasa26();
	public  String casa27=readconfig.getcasa27();
	public  String casa28=readconfig.getcasa28();
	public  String casa29=readconfig.getcasa29();
	public  String casa30=readconfig.getcasa30();
	public  String casa31=readconfig.getcasa31();
	public  String casa32=readconfig.getcasa32();
	public  String casa33=readconfig.getcasa33();
	public  String casa34=readconfig.getcasa34();
	public  String casa35=readconfig.getcasa35();
	public  String casa36=readconfig.getcasa36();
	public  String casa37=readconfig.getcasa37();
	public  String casa38=readconfig.getcasa38();
	public  String casa39=readconfig.getcasa39();
	public  String casa40=readconfig.getcasa40();
	public  String casa41=readconfig.getcasa41();
	public  String casa42=readconfig.getcasa42();
	public  String casa43=readconfig.getcasa43();
	public  String casa44=readconfig.getcasa44();
	public  String casa45=readconfig.getcasa45();
	public  String casa46=readconfig.getcasa46();
	public  String casa47=readconfig.getcasa47();
	public  String casa48=readconfig.getcasa48();
	public  String casa49=readconfig.getcasa49();
	public  String casa50=readconfig.getcasa50();
	public  String casa51=readconfig.getcasa51();
	public  String casa52=readconfig.getcasa52();
	public  String casa53=readconfig.getcasa53();
	public  String casa54=readconfig.getcasa54();
	public  String casa55=readconfig.getcasa55();
	public  String casa56=readconfig.getcasa56();
	public  String casa57=readconfig.getcasa57();
	public  String casa58=readconfig.getcasa58();
	public  String casa59=readconfig.getcasa59();
	public  String casa60=readconfig.getcasa60();
	public  String casa61=readconfig.getcasa61();
	public  String casa62=readconfig.getcasa62();
	public  String casa63=readconfig.getcasa63();
	public  String casa64=readconfig.getcasa64();
	public  String casa65=readconfig.getcasa65();
	public  String casa66=readconfig.getcasa66();
	public  String casa67=readconfig.getcasa67();
	public  String casa68=readconfig.getcasa68();
	public  String casa69=readconfig.getcasa69();
	public  String casa70=readconfig.getcasa70();
	public  String casa71=readconfig.getcasa71();
	public  String casa72=readconfig.getcasa72();
	public  String casa73=readconfig.getcasa73();
	public  String casa74=readconfig.getcasa74();
	public  String casa75=readconfig.getcasa75();
	public  String casa76=readconfig.getcasa76();
	public  String casa77=readconfig.getcasa77();
	public  String casa78=readconfig.getcasa78();
	public  String casa79=readconfig.getcasa79();
	public  String casa80=readconfig.getcasa80();
	public  String casa81=readconfig.getcasa81();
	public  String casa82=readconfig.getcasa82();
	public  String casa83=readconfig.getcasa83();
	public  String casa84=readconfig.getcasa84();
	public  String casa85=readconfig.getcasa85();
	public  String casa86=readconfig.getcasa86();
	public  String casa87=readconfig.getcasa87();
	public  String casa88=readconfig.getcasa88();
	public  String casa89=readconfig.getcasa89();
	public  String casa90=readconfig.getcasa90();
	public  String casa91=readconfig.getcasa91();
	public  String casa92=readconfig.getcasa92();
	public  String casa93=readconfig.getcasa93();
	public  String casa94=readconfig.getcasa94();
	public  String casa95=readconfig.getcasa95();
	public  String casa96=readconfig.getcasa96();
	public  String casa97=readconfig.getcasa97();
	public  String casa98=readconfig.getcasa98();
	public  String casa99=readconfig.getcasa99();
	public  String casa100=readconfig.getcasa100();
	public  String casa101=readconfig.getcasa101();
	public  String casa102=readconfig.getcasa102();
	public  String casa103=readconfig.getcasa103();
	public  String casa104=readconfig.getcasa104();
	public  String casa105=readconfig.getcasa105();
	public  String casa106=readconfig.getcasa106();
	public  String casa107=readconfig.getcasa107();
	public  String casa108=readconfig.getcasa108();
	public  String casa109=readconfig.getcasa109();
	public  String casa110=readconfig.getcasa110();
	public  String casa111=readconfig.getcasa111();
	public  String casa112=readconfig.getcasa112();
	public  String casa113=readconfig.getcasa113();
	public  String casa114=readconfig.getcasa114();
	public  String casa115=readconfig.getcasa115();
	public  String casa116=readconfig.getcasa116();
	public  String casa117=readconfig.getcasa117();
	public  String casa118=readconfig.getcasa118();
	public  String casa119=readconfig.getcasa119();
	public  String casa120=readconfig.getcasa120();
	public  String casa121=readconfig.getcasa121();
	public  String casa122=readconfig.getcasa122();
	public  String casa123=readconfig.getcasa123();
	public  String casa124=readconfig.getcasa124();
	public  String casa125=readconfig.getcasa125();
	public  String casa126=readconfig.getcasa126();
	public  String casa127=readconfig.getcasa127();
	public  String casa128=readconfig.getcasa128();
	public  String casa129=readconfig.getcasa129();
	public  String casa130=readconfig.getcasa130();
	public  String casa131=readconfig.getcasa131();
	public  String casa132=readconfig.getcasa132();
	public  String casa133=readconfig.getcasa133();
	public  String casa134=readconfig.getcasa134();
	public  String casa135=readconfig.getcasa135();
	public  String casa136=readconfig.getcasa136();
	public  String casa137=readconfig.getcasa137();
	public  String casa138=readconfig.getcasa138();
	public  String casa139=readconfig.getcasa139();
	public  String casa140=readconfig.getcasa140();
	public  String casa141=readconfig.getcasa141();
	public  String casa142=readconfig.getcasa142();
	public  String casa143=readconfig.getcasa143();
	public  String casa144=readconfig.getcasa144();
	public  String casa145=readconfig.getcasa145();
	public  String casa146=readconfig.getcasa146();
	public  String casa147=readconfig.getcasa147();
	public  String casa148=readconfig.getcasa148();
	public  String casa149=readconfig.getcasa149();
	public  String casa150=readconfig.getcasa150();
	public  String casa151=readconfig.getcasa151();
	public  String casa152=readconfig.getcasa152();
	public  String casa153=readconfig.getcasa153();
	public  String casa154=readconfig.getcasa154();
	public  String casa155=readconfig.getcasa155();
	public  String casa156=readconfig.getcasa156();
	public  String casa157=readconfig.getcasa157();
	public  String casa158=readconfig.getcasa158();
	public  String casa159=readconfig.getcasa159();
	public  String casa160=readconfig.getcasa160();
	public  String casa161=readconfig.getcasa161();
	public  String casa162=readconfig.getcasa162();
	public  String casa163=readconfig.getcasa163();
	public  String casa164=readconfig.getcasa164();
	public  String casa165=readconfig.getcasa165();
	public  String casa166=readconfig.getcasa166();
	public  String casa167=readconfig.getcasa167();
	public  String casa168=readconfig.getcasa168();
	public  String casa169=readconfig.getcasa169();
	public  String casa170=readconfig.getcasa170();
	public  String casa171=readconfig.getcasa171();
	public  String casa172=readconfig.getcasa172();
	public  String casa173=readconfig.getcasa173();
	public  String casa174=readconfig.getcasa174();
	public  String casa175=readconfig.getcasa175();
	public  String casa176=readconfig.getcasa176();
	public  String casa177=readconfig.getcasa177();
	public  String casa178=readconfig.getcasa178();
	public  String casa179=readconfig.getcasa179();
	public  String casa180=readconfig.getcasa180();
	public  String casa181=readconfig.getcasa181();
	public  String casa182=readconfig.getcasa182();
	public  String casa183=readconfig.getcasa183();
	public  String casa184=readconfig.getcasa184();
	public  String casa185=readconfig.getcasa185();
	public  String casa186=readconfig.getcasa186();
	public  String casa187=readconfig.getcasa187();
	public  String casa188=readconfig.getcasa188();
	public  String casa189=readconfig.getcasa189();
	public  String casa190=readconfig.getcasa190();
	public  String casa191=readconfig.getcasa191();
	public  String casa192=readconfig.getcasa192();
	public  String casa193=readconfig.getcasa193();
	public  String casa194=readconfig.getcasa194();
	public  String casa195=readconfig.getcasa195();
	public  String casa196=readconfig.getcasa196();
	public  String casa197=readconfig.getcasa197();
	public  String casa198=readconfig.getcasa198();
	public  String casa199=readconfig.getcasa199();
	public  String casa200=readconfig.getcasa200();
	public  String casa201=readconfig.getcasa201();
	public  String casa202=readconfig.getcasa202();
	public  String casa203=readconfig.getcasa203();
	public  String casa204=readconfig.getcasa204();
	public  String casa205=readconfig.getcasa205();
	public  String casa206=readconfig.getcasa206();
	public  String casa207=readconfig.getcasa207();
	public  String casa208=readconfig.getcasa208();
	public  String casa209=readconfig.getcasa209();
	public  String casa210=readconfig.getcasa210();
	public  String casa211=readconfig.getcasa211();
	public  String casa212=readconfig.getcasa212();
	public  String casa213=readconfig.getcasa213();
	public  String casa214=readconfig.getcasa214();
	public  String casa215=readconfig.getcasa215();
	public  String casa216=readconfig.getcasa216();
	public  String casa217=readconfig.getcasa217();
	public  String casa218=readconfig.getcasa218();
	public  String casa219=readconfig.getcasa219();
	public  String casa220=readconfig.getcasa220();
	public  String casa221=readconfig.getcasa221();
	public  String casa222=readconfig.getcasa222();
	public  String casa223=readconfig.getcasa223();
	public  String casa224=readconfig.getcasa224();
	public  String casa225=readconfig.getcasa225();
	public  String casa226=readconfig.getcasa226();
	public  String casa227=readconfig.getcasa227();
	public  String casa228=readconfig.getcasa228();
	public  String casa229=readconfig.getcasa229();
	public  String casa230=readconfig.getcasa230();
	public  String casa231=readconfig.getcasa231();
	public  String casa232=readconfig.getcasa232();
	public  String casa233=readconfig.getcasa233();
	public  String casa234=readconfig.getcasa234();
	public  String casa235=readconfig.getcasa235();
	public  String casa236=readconfig.getcasa236();
	public  String casa237=readconfig.getcasa237();
	public  String casa238=readconfig.getcasa238();
	public  String casa239=readconfig.getcasa239();
	public  String casa240=readconfig.getcasa240();
	public  String casa241=readconfig.getcasa241();
	public  String casa242=readconfig.getcasa242();
	public  String casa243=readconfig.getcasa243();
	public  String casa244=readconfig.getcasa244();
	public  String casa245=readconfig.getcasa245();
	public  String casa246=readconfig.getcasa246();
	public  String casa247=readconfig.getcasa247();
	public  String casa248=readconfig.getcasa248();
	public  String casa249=readconfig.getcasa249();
	public  String casa250=readconfig.getcasa250();
	public  String casa251=readconfig.getcasa251();
	public  String casa252=readconfig.getcasa252();
	public  String casa253=readconfig.getcasa253();
	public  String casa254=readconfig.getcasa254();
	public  String casa255=readconfig.getcasa255();
	public  String casa256=readconfig.getcasa256();
	public  String casa257=readconfig.getcasa257();
	public  String casa258=readconfig.getcasa258();
	public  String casa259=readconfig.getcasa259();
	public  String casa260=readconfig.getcasa260();
	public  String casa261=readconfig.getcasa261();
	public  String casa262=readconfig.getcasa262();
	public  String casa263=readconfig.getcasa263();
	public  String casa264=readconfig.getcasa264();
	public  String casa265=readconfig.getcasa265();
	public  String casa266=readconfig.getcasa266();
	public  String casa267=readconfig.getcasa267();
	public  String casa268=readconfig.getcasa268();
	public  String casa269=readconfig.getcasa269();
	public  String casa270=readconfig.getcasa270();
	public  String casa271=readconfig.getcasa271();
	public  String casa272=readconfig.getcasa272();
	public  String casa273=readconfig.getcasa273();
	public  String casa274=readconfig.getcasa274();
	public  String casa275=readconfig.getcasa275();
	public  String casa276=readconfig.getcasa276();
	public  String casa277=readconfig.getcasa277();
	public  String casa278=readconfig.getcasa278();
	public  String casa279=readconfig.getcasa279();
	public  String casa280=readconfig.getcasa280();



	public static ChromeOptions handlingSSL = new ChromeOptions();
	public static WebDriver driver;
	public static Logger logger;
	
	
	
	@BeforeTest
	public  void setup() throws InterruptedException
	{	
		if(browser.equalsIgnoreCase("chrome")) {
			 //Create instance of ChromeOptions Class
			
			//Using the accept insecure cert method with true as parameter to accept the untrusted certificate
			handlingSSL.setAcceptInsecureCerts(true);
			//Creating instance of Chrome driver by passing reference of ChromeOptions object
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver(handlingSSL);
		// Initialization // Logger initiated within the setup method
		logger=Logger.getLogger("Housing");// Project Name 
		PropertyConfigurator.configure("log4j.properties"); // Added Logger
		logger.setLevel(Level.DEBUG); // to get the debug log
		logger.debug("Debug logging has started ");
		
		
		}
		driver.get(baseURL);
        driver.manage().window().maximize();
        
      //Click on Login Button
  	  driver.findElement(By.className("wpLoginBtn")).click();
  	  	 		
  	  //Make Login
  	  Thread.sleep(1000);
  	  driver.findElement(By.id("login")).click();
  	  driver.findElement(By.name("ClientEmail")).sendKeys(username1);
  	  driver.findElement(By.name("submit")).click();
  	  Thread.sleep(2000);
  	  driver.findElement(By.name("step-two-input")).sendKeys(password);
  	  Thread.sleep(1000);
  	  driver.findElement(By.name("submit")).click(); 
  	  
  	
  	  
	}
	
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}

	
	public void captureScreen(WebDriver driver, String tname) throws IOException 
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}
	public static String randomestring() 
	{
		String generatedString1 = RandomStringUtils.randomAlphabetic(5); // generate random char string with the specified values passed 
		return (generatedString1);										 
	}

	public static String randomeNum() 
	{
		String generatedString2 = RandomStringUtils.randomNumeric(4);// generate random digits with the specified values passed
		return (generatedString2);
	}
	
	
}