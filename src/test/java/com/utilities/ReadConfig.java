package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig 
{
	// Properties Class
	Properties pro; 
	
	// Constructor
	public ReadConfig()
	{
		File src = new File(System.getProperty("user.dir") + "\\Configuration\\config.properties");// Creating File object
			
		try 
		{
			// Open FileInputStream and Read data 
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis); // Load config.properties file
		} 
		catch (Exception e) 
		{	
			// If config.properties file is not available it will throw an exception
			System.out.println("Exception is " + e.getMessage());
		}
	}
	
	// Methods to read data from config.properties 
	public String getApplicationURL()                            // ok - add new url in config.properties
	{
		String url=pro.getProperty("baseURL"); // Value from config.properties stored in url variable
		return url;
	}
	public String getUsername1() // new 
	{
		String username1=pro.getProperty("username1");
		return username1;
	}
	
	public String getPassword() 
	{
	String password=pro.getProperty("password");
	return password;
	}
	
	public String getChromePath() 
	{
	String chromepath=pro.getProperty("chromepath");
	return chromepath;
	}

	public String getbrowser() 
	{
	String browser=pro.getProperty("browser");
	return browser;
	}
	
	public String getPending() 
	{
	String Pending=pro.getProperty("Pending");
	return Pending;
	}
	
	public String getOffmarket() 
	{
	String Offmarket=pro.getProperty("Offmarket");
	return Offmarket;
	}

	public String getcasa1() {
		String casa1=pro.getProperty("casa1");
		return casa1;
	}
	public String getcasa2() {
		String casa2=pro.getProperty("casa2");
		return casa2;
	}
	public String getcasa3() {
		String casa3=pro.getProperty("casa3");
		return casa3;
	}
	public String getcasa4() {
		String casa4=pro.getProperty("casa4");
		return casa4;
	}
	public String getcasa5() {
		String casa5=pro.getProperty("casa5");
		return casa5;
	}
	public String getcasa6() {
		String casa6=pro.getProperty("casa6");
		return casa6;
	}
	public String getcasa7() {
		String casa7=pro.getProperty("casa7");
		return casa7;
	}
	public String getcasa8() {
		String casa8=pro.getProperty("casa8");
		return casa8;
	}
	public String getcasa9() {
		String casa9=pro.getProperty("casa9");
		return casa9;
	}
	public String getcasa10() {
		String casa10=pro.getProperty("casa10");
		return casa10;
	}
	public String getcasa11() {	
		String casa11=pro.getProperty("casa11");
		return casa11;
	}	
	public String getcasa12() {	
		String casa12=pro.getProperty("casa12");
		return casa12;
	}	
	public String getcasa13() {	
		String casa13=pro.getProperty("casa13");
		return casa13;
	}	
	public String getcasa14() {	
		String casa14=pro.getProperty("casa14");
		return casa14;
	}	
	public String getcasa15() {	
		String casa15=pro.getProperty("casa15");
		return casa15;
	}	
	public String getcasa16() {	
		String casa16=pro.getProperty("casa16");
		return casa16;
	}	
	public String getcasa17() {	
		String casa17=pro.getProperty("casa17");
		return casa17;
	}	
	public String getcasa18() {	
		String casa18=pro.getProperty("casa18");
		return casa18;
	}	
	public String getcasa19() {	
		String casa19=pro.getProperty("casa19");
		return casa19;
	}	
	public String getcasa20() {	
		String casa20=pro.getProperty("casa20");
		return casa20;
	}	
	public String getcasa21() {	
		String casa21=pro.getProperty("casa21");
		return casa21;
	}	
	public String getcasa22() {	
		String casa22=pro.getProperty("casa22");
		return casa22;
	}	
	public String getcasa23() {	
		String casa23=pro.getProperty("casa23");
		return casa23;
	}	
	public String getcasa24() {	
		String casa24=pro.getProperty("casa24");
		return casa24;
	}	
	public String getcasa25() {	
		String casa25=pro.getProperty("casa25");
		return casa25;
	}	
	public String getcasa26() {	
		String casa26=pro.getProperty("casa26");
		return casa26;
	}	
	public String getcasa27() {	
		String casa27=pro.getProperty("casa27");
		return casa27;
	}	
	public String getcasa28() {	
		String casa28=pro.getProperty("casa28");
		return casa28;
	}	
	public String getcasa29() {	
		String casa29=pro.getProperty("casa29");
		return casa29;
	}	
	public String getcasa30() {	
		String casa30=pro.getProperty("casa30");
		return casa30;
	}	
	public String getcasa31() {	
		String casa31=pro.getProperty("casa31");
		return casa31;
	}	
	public String getcasa32() {	
		String casa32=pro.getProperty("casa32");
		return casa32;
	}	
	public String getcasa33() {	
		String casa33=pro.getProperty("casa33");
		return casa33;
	}	
	public String getcasa34() {	
		String casa34=pro.getProperty("casa34");
		return casa34;
	}	
	public String getcasa35() {	
		String casa35=pro.getProperty("casa35");
		return casa35;
	}	
	public String getcasa36() {	
		String casa36=pro.getProperty("casa36");
		return casa36;
	}	
	public String getcasa37() {	
		String casa37=pro.getProperty("casa37");
		return casa37;
	}	
	public String getcasa38() {	
		String casa38=pro.getProperty("casa38");
		return casa38;
	}	
	public String getcasa39() {	
		String casa39=pro.getProperty("casa39");
		return casa39;
	}	
	public String getcasa40() {	
		String casa40=pro.getProperty("casa40");
		return casa40;
	}	
	public String getcasa41() {	
		String casa41=pro.getProperty("casa41");
		return casa41;
	}	
	public String getcasa42() {	
		String casa42=pro.getProperty("casa42");
		return casa42;
	}	
	public String getcasa43() {	
		String casa43=pro.getProperty("casa43");
		return casa43;
	}	
	public String getcasa44() {	
		String casa44=pro.getProperty("casa44");
		return casa44;
	}	
	public String getcasa45() {	
		String casa45=pro.getProperty("casa45");
		return casa45;
	}	
	public String getcasa46() {	
		String casa46=pro.getProperty("casa46");
		return casa46;
	}	
	public String getcasa47() {	
		String casa47=pro.getProperty("casa47");
		return casa47;
	}	
	public String getcasa48() {	
		String casa48=pro.getProperty("casa48");
		return casa48;
	}	
	public String getcasa49() {	
		String casa49=pro.getProperty("casa49");
		return casa49;
	}	
	public String getcasa50() {	
		String casa50=pro.getProperty("casa50");
		return casa50;
	}	
	public String getcasa51() {	
		String casa51=pro.getProperty("casa51");
		return casa51;
	}	
	public String getcasa52() {	
		String casa52=pro.getProperty("casa52");
		return casa52;
	}	
	public String getcasa53() {	
		String casa53=pro.getProperty("casa53");
		return casa53;
	}	
	public String getcasa54() {	
		String casa54=pro.getProperty("casa54");
		return casa54;
	}	
	public String getcasa55() {	
		String casa55=pro.getProperty("casa55");
		return casa55;
	}	
	public String getcasa56() {	
		String casa56=pro.getProperty("casa56");
		return casa56;
	}	
	public String getcasa57() {	
		String casa57=pro.getProperty("casa57");
		return casa57;
	}	
	public String getcasa58() {	
		String casa58=pro.getProperty("casa58");
		return casa58;
	}	
	public String getcasa59() {	
		String casa59=pro.getProperty("casa59");
		return casa59;
	}	
	public String getcasa60() {	
		String casa60=pro.getProperty("casa60");
		return casa60;
	}	
	public String getcasa61() {	
		String casa61=pro.getProperty("casa61");
		return casa61;
	}	
	public String getcasa62() {	
		String casa62=pro.getProperty("casa62");
		return casa62;
	}	
	public String getcasa63() {	
		String casa63=pro.getProperty("casa63");
		return casa63;
	}	
	public String getcasa64() {	
		String casa64=pro.getProperty("casa64");
		return casa64;
	}	
	public String getcasa65() {	
		String casa65=pro.getProperty("casa65");
		return casa65;
	}	
	public String getcasa66() {	
		String casa66=pro.getProperty("casa66");
		return casa66;
	}	
	public String getcasa67() {	
		String casa67=pro.getProperty("casa67");
		return casa67;
	}	
	public String getcasa68() {	
		String casa68=pro.getProperty("casa68");
		return casa68;
	}	
	public String getcasa69() {	
		String casa69=pro.getProperty("casa69");
		return casa69;
	}	
	public String getcasa70() {	
		String casa70=pro.getProperty("casa70");
		return casa70;
	}	
	public String getcasa71() {	
		String casa71=pro.getProperty("casa71");
		return casa71;
	}	
	public String getcasa72() {	
		String casa72=pro.getProperty("casa72");
		return casa72;
	}	
	public String getcasa73() {	
		String casa73=pro.getProperty("casa73");
		return casa73;
	}	
	public String getcasa74() {	
		String casa74=pro.getProperty("casa74");
		return casa74;
	}	
	public String getcasa75() {	
		String casa75=pro.getProperty("casa75");
		return casa75;
	}	
	public String getcasa76() {	
		String casa76=pro.getProperty("casa76");
		return casa76;
	}	
	public String getcasa77() {	
		String casa77=pro.getProperty("casa77");
		return casa77;
	}	
	public String getcasa78() {	
		String casa78=pro.getProperty("casa78");
		return casa78;
	}	
	public String getcasa79() {	
		String casa79=pro.getProperty("casa79");
		return casa79;
	}	
	public String getcasa80() {	
		String casa80=pro.getProperty("casa80");
		return casa80;
	}	
	public String getcasa81() {	
		String casa81=pro.getProperty("casa81");
		return casa81;
	}	
	public String getcasa82() {	
		String casa82=pro.getProperty("casa82");
		return casa82;
	}	
	public String getcasa83() {	
		String casa83=pro.getProperty("casa83");
		return casa83;
	}	
	public String getcasa84() {	
		String casa84=pro.getProperty("casa84");
		return casa84;
	}	
	public String getcasa85() {	
		String casa85=pro.getProperty("casa85");
		return casa85;
	}	
	public String getcasa86() {	
		String casa86=pro.getProperty("casa86");
		return casa86;
	}	
	public String getcasa87() {	
		String casa87=pro.getProperty("casa87");
		return casa87;
	}	
	public String getcasa88() {	
		String casa88=pro.getProperty("casa88");
		return casa88;
	}	
	public String getcasa89() {	
		String casa89=pro.getProperty("casa89");
		return casa89;
	}	
	public String getcasa90() {	
		String casa90=pro.getProperty("casa90");
		return casa90;
	}	
	public String getcasa91() {	
		String casa91=pro.getProperty("casa91");
		return casa91;
	}	
	public String getcasa92() {	
		String casa92=pro.getProperty("casa92");
		return casa92;
	}	
	public String getcasa93() {	
		String casa93=pro.getProperty("casa93");
		return casa93;
	}	
	public String getcasa94() {	
		String casa94=pro.getProperty("casa94");
		return casa94;
	}	
	public String getcasa95() {	
		String casa95=pro.getProperty("casa95");
		return casa95;
	}	
	public String getcasa96() {	
		String casa96=pro.getProperty("casa96");
		return casa96;
	}	
	public String getcasa97() {	
		String casa97=pro.getProperty("casa97");
		return casa97;
	}	
	public String getcasa98() {	
		String casa98=pro.getProperty("casa98");
		return casa98;
	}	
	public String getcasa99() {	
		String casa99=pro.getProperty("casa99");
		return casa99;
	}	
	public String getcasa100() {	
		String casa100=pro.getProperty("casa100");
		return casa100;
	}	
	public String getcasa101() {	
		String casa101=pro.getProperty("casa101");
		return casa101;
	}	
	public String getcasa102() {	
		String casa102=pro.getProperty("casa102");
		return casa102;
	}	
	public String getcasa103() {	
		String casa103=pro.getProperty("casa103");
		return casa103;
	}	
	public String getcasa104() {	
		String casa104=pro.getProperty("casa104");
		return casa104;
	}	
	public String getcasa105() {	
		String casa105=pro.getProperty("casa105");
		return casa105;
	}	
	public String getcasa106() {	
		String casa106=pro.getProperty("casa106");
		return casa106;
	}	
	public String getcasa107() {	
		String casa107=pro.getProperty("casa107");
		return casa107;
	}	
	public String getcasa108() {	
		String casa108=pro.getProperty("casa108");
		return casa108;
	}	
	public String getcasa109() {	
		String casa109=pro.getProperty("casa109");
		return casa109;
	}	
	public String getcasa110() {	
		String casa110=pro.getProperty("casa110");
		return casa110;
	}	
	public String getcasa111() {	
		String casa111=pro.getProperty("casa111");
		return casa111;
	}	
	public String getcasa112() {	
		String casa112=pro.getProperty("casa112");
		return casa112;
	}	
	public String getcasa113() {	
		String casa113=pro.getProperty("casa113");
		return casa113;
	}	
	public String getcasa114() {	
		String casa114=pro.getProperty("casa114");
		return casa114;
	}	
	public String getcasa115() {	
		String casa115=pro.getProperty("casa115");
		return casa115;
	}	
	public String getcasa116() {	
		String casa116=pro.getProperty("casa116");
		return casa116;
	}	
	public String getcasa117() {	
		String casa117=pro.getProperty("casa117");
		return casa117;
	}	
	public String getcasa118() {	
		String casa118=pro.getProperty("casa118");
		return casa118;
	}	
	public String getcasa119() {	
		String casa119=pro.getProperty("casa119");
		return casa119;
	}	
	public String getcasa120() {	
		String casa120=pro.getProperty("casa120");
		return casa120;
	}	
	public String getcasa121() {	
		String casa121=pro.getProperty("casa121");
		return casa121;
	}	
	public String getcasa122() {	
		String casa122=pro.getProperty("casa122");
		return casa122;
	}	
	public String getcasa123() {	
		String casa123=pro.getProperty("casa123");
		return casa123;
	}	
	public String getcasa124() {	
		String casa124=pro.getProperty("casa124");
		return casa124;
	}	
	public String getcasa125() {	
		String casa125=pro.getProperty("casa125");
		return casa125;
	}	
	public String getcasa126() {	
		String casa126=pro.getProperty("casa126");
		return casa126;
	}	
	public String getcasa127() {	
		String casa127=pro.getProperty("casa127");
		return casa127;
	}	
	public String getcasa128() {	
		String casa128=pro.getProperty("casa128");
		return casa128;
	}	
	public String getcasa129() {	
		String casa129=pro.getProperty("casa129");
		return casa129;
	}	
	public String getcasa130() {	
		String casa130=pro.getProperty("casa130");
		return casa130;
	}	
	public String getcasa131() {	
		String casa131=pro.getProperty("casa131");
		return casa131;
	}	
	public String getcasa132() {	
		String casa132=pro.getProperty("casa132");
		return casa132;
	}	
	public String getcasa133() {	
		String casa133=pro.getProperty("casa133");
		return casa133;
	}	
	public String getcasa134() {	
		String casa134=pro.getProperty("casa134");
		return casa134;
	}	
	public String getcasa135() {	
		String casa135=pro.getProperty("casa135");
		return casa135;
	}	
	public String getcasa136() {	
		String casa136=pro.getProperty("casa136");
		return casa136;
	}	
	public String getcasa137() {	
		String casa137=pro.getProperty("casa137");
		return casa137;
	}	
	public String getcasa138() {	
		String casa138=pro.getProperty("casa138");
		return casa138;
	}	
	public String getcasa139() {	
		String casa139=pro.getProperty("casa139");
		return casa139;
	}	
	public String getcasa140() {	
		String casa140=pro.getProperty("casa140");
		return casa140;
	}	
	public String getcasa141() {	
		String casa141=pro.getProperty("casa141");
		return casa141;
	}	
	public String getcasa142() {	
		String casa142=pro.getProperty("casa142");
		return casa142;
	}	
	public String getcasa143() {	
		String casa143=pro.getProperty("casa143");
		return casa143;
	}	
	public String getcasa144() {	
		String casa144=pro.getProperty("casa144");
		return casa144;
	}	
	public String getcasa145() {	
		String casa145=pro.getProperty("casa145");
		return casa145;
	}	
	public String getcasa146() {	
		String casa146=pro.getProperty("casa146");
		return casa146;
	}	
	public String getcasa147() {	
		String casa147=pro.getProperty("casa147");
		return casa147;
	}	
	public String getcasa148() {	
		String casa148=pro.getProperty("casa148");
		return casa148;
	}	
	public String getcasa149() {	
		String casa149=pro.getProperty("casa149");
		return casa149;
	}	
	public String getcasa150() {	
		String casa150=pro.getProperty("casa150");
		return casa150;
	}	
	public String getcasa151() {	
		String casa151=pro.getProperty("casa151");
		return casa151;
	}	
	public String getcasa152() {	
		String casa152=pro.getProperty("casa152");
		return casa152;
	}	
	public String getcasa153() {	
		String casa153=pro.getProperty("casa153");
		return casa153;
	}	
	public String getcasa154() {	
		String casa154=pro.getProperty("casa154");
		return casa154;
	}	
	public String getcasa155() {	
		String casa155=pro.getProperty("casa155");
		return casa155;
	}	
	public String getcasa156() {	
		String casa156=pro.getProperty("casa156");
		return casa156;
	}	
	public String getcasa157() {	
		String casa157=pro.getProperty("casa157");
		return casa157;
	}	
	public String getcasa158() {	
		String casa158=pro.getProperty("casa158");
		return casa158;
	}	
	public String getcasa159() {	
		String casa159=pro.getProperty("casa159");
		return casa159;
	}	
	public String getcasa160() {	
		String casa160=pro.getProperty("casa160");
		return casa160;
	}	
	public String getcasa161() {	
		String casa161=pro.getProperty("casa161");
		return casa161;
	}	
	public String getcasa162() {	
		String casa162=pro.getProperty("casa162");
		return casa162;
	}	
	public String getcasa163() {	
		String casa163=pro.getProperty("casa163");
		return casa163;
	}	
	public String getcasa164() {	
		String casa164=pro.getProperty("casa164");
		return casa164;
	}	
	public String getcasa165() {	
		String casa165=pro.getProperty("casa165");
		return casa165;
	}	
	public String getcasa166() {	
		String casa166=pro.getProperty("casa166");
		return casa166;
	}	
	public String getcasa167() {	
		String casa167=pro.getProperty("casa167");
		return casa167;
	}	
	public String getcasa168() {	
		String casa168=pro.getProperty("casa168");
		return casa168;
	}	
	public String getcasa169() {	
		String casa169=pro.getProperty("casa169");
		return casa169;
	}	
	public String getcasa170() {	
		String casa170=pro.getProperty("casa170");
		return casa170;
	}	
	public String getcasa171() {	
		String casa171=pro.getProperty("casa171");
		return casa171;
	}	
	public String getcasa172() {	
		String casa172=pro.getProperty("casa172");
		return casa172;
	}	
	public String getcasa173() {	
		String casa173=pro.getProperty("casa173");
		return casa173;
	}	
	public String getcasa174() {	
		String casa174=pro.getProperty("casa174");
		return casa174;
	}	
	public String getcasa175() {	
		String casa175=pro.getProperty("casa175");
		return casa175;
	}	
	public String getcasa176() {	
		String casa176=pro.getProperty("casa176");
		return casa176;
	}	
	public String getcasa177() {	
		String casa177=pro.getProperty("casa177");
		return casa177;
	}	
	public String getcasa178() {	
		String casa178=pro.getProperty("casa178");
		return casa178;
	}	
	public String getcasa179() {	
		String casa179=pro.getProperty("casa179");
		return casa179;
	}	
	public String getcasa180() {	
		String casa180=pro.getProperty("casa180");
		return casa180;
	}	
	public String getcasa181() {	
		String casa181=pro.getProperty("casa181");
		return casa181;
	}	
	public String getcasa182() {	
		String casa182=pro.getProperty("casa182");
		return casa182;
	}	
	public String getcasa183() {	
		String casa183=pro.getProperty("casa183");
		return casa183;
	}	
	public String getcasa184() {	
		String casa184=pro.getProperty("casa184");
		return casa184;
	}	
	public String getcasa185() {	
		String casa185=pro.getProperty("casa185");
		return casa185;
	}	
	public String getcasa186() {	
		String casa186=pro.getProperty("casa186");
		return casa186;
	}	
	public String getcasa187() {	
		String casa187=pro.getProperty("casa187");
		return casa187;
	}	
	public String getcasa188() {	
		String casa188=pro.getProperty("casa188");
		return casa188;
	}	
	public String getcasa189() {	
		String casa189=pro.getProperty("casa189");
		return casa189;
	}	
	public String getcasa190() {	
		String casa190=pro.getProperty("casa190");
		return casa190;
	}	
	public String getcasa191() {	
		String casa191=pro.getProperty("casa191");
		return casa191;
	}	
	public String getcasa192() {	
		String casa192=pro.getProperty("casa192");
		return casa192;
	}	
	public String getcasa193() {	
		String casa193=pro.getProperty("casa193");
		return casa193;
	}	
	public String getcasa194() {	
		String casa194=pro.getProperty("casa194");
		return casa194;
	}	
	public String getcasa195() {	
		String casa195=pro.getProperty("casa195");
		return casa195;
	}	
	public String getcasa196() {	
		String casa196=pro.getProperty("casa196");
		return casa196;
	}	
	public String getcasa197() {	
		String casa197=pro.getProperty("casa197");
		return casa197;
	}	
	public String getcasa198() {	
		String casa198=pro.getProperty("casa198");
		return casa198;
	}	
	public String getcasa199() {	
		String casa199=pro.getProperty("casa199");
		return casa199;
	}	
	public String getcasa200() {	
		String casa200=pro.getProperty("casa200");
		return casa200;
	}	
	public String getcasa201() {	
		String casa201=pro.getProperty("casa201");
		return casa201;
	}	
	public String getcasa202() {	
		String casa202=pro.getProperty("casa202");
		return casa202;
	}	
	public String getcasa203() {	
		String casa203=pro.getProperty("casa203");
		return casa203;
	}	
	public String getcasa204() {	
		String casa204=pro.getProperty("casa204");
		return casa204;
	}	
	public String getcasa205() {	
		String casa205=pro.getProperty("casa205");
		return casa205;
	}	
	public String getcasa206() {	
		String casa206=pro.getProperty("casa206");
		return casa206;
	}	
	public String getcasa207() {	
		String casa207=pro.getProperty("casa207");
		return casa207;
	}	
	public String getcasa208() {	
		String casa208=pro.getProperty("casa208");
		return casa208;
	}	
	public String getcasa209() {	
		String casa209=pro.getProperty("casa209");
		return casa209;
	}	
	public String getcasa210() {	
		String casa210=pro.getProperty("casa210");
		return casa210;
	}	
	public String getcasa211() {	
		String casa211=pro.getProperty("casa211");
		return casa211;
	}	
	public String getcasa212() {	
		String casa212=pro.getProperty("casa212");
		return casa212;
	}	
	public String getcasa213() {	
		String casa213=pro.getProperty("casa213");
		return casa213;
	}	
	public String getcasa214() {	
		String casa214=pro.getProperty("casa214");
		return casa214;
	}	
	public String getcasa215() {	
		String casa215=pro.getProperty("casa215");
		return casa215;
	}	
	public String getcasa216() {	
		String casa216=pro.getProperty("casa216");
		return casa216;
	}	
	public String getcasa217() {	
		String casa217=pro.getProperty("casa217");
		return casa217;
	}	
	public String getcasa218() {	
		String casa218=pro.getProperty("casa218");
		return casa218;
	}	
	public String getcasa219() {	
		String casa219=pro.getProperty("casa219");
		return casa219;
	}	
	public String getcasa220() {	
		String casa220=pro.getProperty("casa220");
		return casa220;
	}	
	public String getcasa221() {	
		String casa221=pro.getProperty("casa221");
		return casa221;
	}	
	public String getcasa222() {	
		String casa222=pro.getProperty("casa222");
		return casa222;
	}	
	public String getcasa223() {	
		String casa223=pro.getProperty("casa223");
		return casa223;
	}	
	public String getcasa224() {	
		String casa224=pro.getProperty("casa224");
		return casa224;
	}	
	public String getcasa225() {	
		String casa225=pro.getProperty("casa225");
		return casa225;
	}	
	public String getcasa226() {	
		String casa226=pro.getProperty("casa226");
		return casa226;
	}	
	public String getcasa227() {	
		String casa227=pro.getProperty("casa227");
		return casa227;
	}	
	public String getcasa228() {	
		String casa228=pro.getProperty("casa228");
		return casa228;
	}	
	public String getcasa229() {	
		String casa229=pro.getProperty("casa229");
		return casa229;
	}	
	public String getcasa230() {	
		String casa230=pro.getProperty("casa230");
		return casa230;
	}	
	public String getcasa231() {	
		String casa231=pro.getProperty("casa231");
		return casa231;
	}	
	public String getcasa232() {	
		String casa232=pro.getProperty("casa232");
		return casa232;
	}	
	public String getcasa233() {	
		String casa233=pro.getProperty("casa233");
		return casa233;
	}	
	public String getcasa234() {	
		String casa234=pro.getProperty("casa234");
		return casa234;
	}	
	public String getcasa235() {	
		String casa235=pro.getProperty("casa235");
		return casa235;
	}	
	public String getcasa236() {	
		String casa236=pro.getProperty("casa236");
		return casa236;
	}	
	public String getcasa237() {	
		String casa237=pro.getProperty("casa237");
		return casa237;
	}	
	public String getcasa238() {	
		String casa238=pro.getProperty("casa238");
		return casa238;
	}	
	public String getcasa239() {	
		String casa239=pro.getProperty("casa239");
		return casa239;
	}	
	public String getcasa240() {	
		String casa240=pro.getProperty("casa240");
		return casa240;
	}	
	public String getcasa241() {	
		String casa241=pro.getProperty("casa241");
		return casa241;
	}	
	public String getcasa242() {	
		String casa242=pro.getProperty("casa242");
		return casa242;
	}	
	public String getcasa243() {	
		String casa243=pro.getProperty("casa243");
		return casa243;
	}	
	public String getcasa244() {	
		String casa244=pro.getProperty("casa244");
		return casa244;
	}	
	public String getcasa245() {	
		String casa245=pro.getProperty("casa245");
		return casa245;
	}	
	public String getcasa246() {	
		String casa246=pro.getProperty("casa246");
		return casa246;
	}	
	public String getcasa247() {	
		String casa247=pro.getProperty("casa247");
		return casa247;
	}	
	public String getcasa248() {	
		String casa248=pro.getProperty("casa248");
		return casa248;
	}	
	public String getcasa249() {	
		String casa249=pro.getProperty("casa249");
		return casa249;
	}	
	public String getcasa250() {	
		String casa250=pro.getProperty("casa250");
		return casa250;
	}	
	public String getcasa251() {	
		String casa251=pro.getProperty("casa251");
		return casa251;
	}	
	public String getcasa252() {	
		String casa252=pro.getProperty("casa252");
		return casa252;
	}	
	public String getcasa253() {	
		String casa253=pro.getProperty("casa253");
		return casa253;
	}	
	public String getcasa254() {	
		String casa254=pro.getProperty("casa254");
		return casa254;
	}	
	public String getcasa255() {	
		String casa255=pro.getProperty("casa255");
		return casa255;
	}	
	public String getcasa256() {	
		String casa256=pro.getProperty("casa256");
		return casa256;
	}	
	public String getcasa257() {	
		String casa257=pro.getProperty("casa257");
		return casa257;
	}	
	public String getcasa258() {	
		String casa258=pro.getProperty("casa258");
		return casa258;
	}	
	public String getcasa259() {	
		String casa259=pro.getProperty("casa259");
		return casa259;
	}	
	public String getcasa260() {	
		String casa260=pro.getProperty("casa260");
		return casa260;
	}	
	public String getcasa261() {	
		String casa261=pro.getProperty("casa261");
		return casa261;
	}	
	public String getcasa262() {	
		String casa262=pro.getProperty("casa262");
		return casa262;
	}	
	public String getcasa263() {	
		String casa263=pro.getProperty("casa263");
		return casa263;
	}	
	public String getcasa264() {	
		String casa264=pro.getProperty("casa264");
		return casa264;
	}	
	public String getcasa265() {	
		String casa265=pro.getProperty("casa265");
		return casa265;
	}	
	public String getcasa266() {	
		String casa266=pro.getProperty("casa266");
		return casa266;
	}	
	public String getcasa267() {	
		String casa267=pro.getProperty("casa267");
		return casa267;
	}	
	public String getcasa268() {	
		String casa268=pro.getProperty("casa268");
		return casa268;
	}	
	public String getcasa269() {	
		String casa269=pro.getProperty("casa269");
		return casa269;
	}	
	public String getcasa270() {	
		String casa270=pro.getProperty("casa270");
		return casa270;
	}	
	public String getcasa271() {	
		String casa271=pro.getProperty("casa271");
		return casa271;
	}	
	public String getcasa272() {	
		String casa272=pro.getProperty("casa272");
		return casa272;
	}	
	public String getcasa273() {	
		String casa273=pro.getProperty("casa273");
		return casa273;
	}	
	public String getcasa274() {	
		String casa274=pro.getProperty("casa274");
		return casa274;
	}	
	public String getcasa275() {	
		String casa275=pro.getProperty("casa275");
		return casa275;
	}	
	public String getcasa276() {	
		String casa276=pro.getProperty("casa276");
		return casa276;
	}	
	public String getcasa277() {	
		String casa277=pro.getProperty("casa277");
		return casa277;
	}	
	public String getcasa278() {	
		String casa278=pro.getProperty("casa278");
		return casa278;
	}	
	public String getcasa279() {	
		String casa279=pro.getProperty("casa279");
		return casa279;
	}	
	public String getcasa280() {	
		String casa280=pro.getProperty("casa280");
		return casa280;
	}	


}
