package libGlobal;



	import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.event.KeyEvent;
	import java.io.File;
	import java.io.IOException;
	import java.util.List;
	import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;

	import io.github.bonigarcia.wdm.WebDriverManager;



	public  class BaseClass {
		
		public static  WebDriver driver;
		//1
		public  static void getdriver() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	    }
		public static void implici(int time) {
driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
		}
		public static void doublec(WebElement element) {
Actions actions=new Actions(driver);
actions.doubleClick(element).perform();
		}
		//2
		public static void geturl(String url) {
			driver.get(url);
		}
		//3
		public String  getcurrenturl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
		}
		//4
		public String getitle() {
			String title = driver.getTitle();
			return title;
		}
		//5
		public WebElement findelementbyid(String attributevalue) {
			WebElement element = driver.findElement(By.id(attributevalue));
			return element;
		}
		//6
		public WebElement findelementbyname(String attributevalue) {
			WebElement element = driver.findElement(By.name(attributevalue));
			return element;
		}
		//7
		public WebElement findelementbyclassname(String attributevalue) {
			WebElement element = driver.findElement(By.className(attributevalue));
			return element;
		}
		//8
		public  WebElement findElementByXpath(String attributevalue) {
			WebElement element = driver.findElement(By.xpath(attributevalue));
			return element;
		}
		//9
		public void click(WebElement element) {
		element.click();
		}
		//10
		public void type(WebElement element,String data) {
			element.sendKeys(data);
		}
		//11
		public String getAttribute1(WebElement element) {
			String attribute = element.getAttribute("value");
			return attribute;
			
			

		}
		//12
		public String getAttribute(WebElement element,String attributename) {
			String data=element.getAttribute(attributename);
			return data;
		}
		//13
		public void selectByText(WebElement element,String text) {
			Select select=new Select(element);
			select.selectByVisibleText(text);
		}
		//14
		public void selectByAttribute(WebElement element,String value) {
			Select select=new Select(element);
			select.selectByValue(value);
		}
		//15
		public void selectByIndex(WebElement element,int index) {
			Select select=new Select(element);
			select.selectByIndex(index);
		}
		//16
		public void Javascript(WebElement element,String data) {
			JavascriptExecutor executor=(JavascriptExecutor)driver;
			executor.executeScript("arguments[0].setAttribute('value'," +data+ ")", element);
			
		}
		//17
		public static  void maximise() {
		driver.manage().window().maximize();
		}
		//18
		public void navigateBack() {
			driver.navigate().back();
		}

		//19
		public static void quit() {
			driver.quit();
		}
		//20
		public void close() {
			driver.close();
		}
		//21
		public void navigate() {
			driver.navigate();
		}
		//22
		public void moveToElement(WebElement element) {
			Actions actions=new Actions(driver);
			actions.moveToElement(element).perform();
		}
		//23
		public void dragAndDrop(WebElement source,WebElement target) {
			Actions actions=new Actions(driver);
			actions.dragAndDrop(source,target).perform();
		}
		//24
		public void rightClick(WebElement element) {
			Actions actions=new Actions(driver);
			actions.contextClick(element).perform();
		}
		//25
		public void navigateForward() {
			driver.navigate().forward();
		}
		//26
		public void navigateRefresh() {
			driver.navigate().refresh();
		}
		//27
		public void alertSendkeys(String data) {
			Alert alert=driver.switchTo().alert();
			alert.sendKeys("data");
			
			
		}
		
		
		//28
		public void alertSendkeys1() {
			Alert alert=driver.switchTo().alert();
			alert.sendKeys("data");
			alert.dismiss();
		}
		public void alertacc() {
			Alert alert = driver.switchTo().alert();
			alert.accept();
		}
		//29
		public String alertGetText() {
			Alert alert=driver.switchTo().alert();
		    String text=alert.getText();
		    return text;
		}
		public void alertaccept() {
			
			
		}

			
		
		//31
		public void robotClass() throws AWTException{
			Robot robot=new Robot();
			robot.keyPress(KeyEvent.VK_0);
			robot.keyRelease(KeyEvent.VK_0);
		}
		//32
		public File screenShot(String pathname)throws IOException{
			WebElement txt =driver.findElement(By.className(""));
			txt.getScreenshotAs(OutputType.BYTES);
			
			TakesScreenshot ts=(TakesScreenshot)driver;
			File srcfile = ts.getScreenshotAs(OutputType.FILE);
			File dstfile = new File(pathname);
			FileUtils.copyFile(srcfile, dstfile);
			return dstfile;	
			
		}
		//33
		public void doubleClick(WebElement element) {
			Actions actions =new Actions(driver);
			actions.contextClick(element).perform();
		}
		//34
		public Boolean Multipleselect(WebElement element) {
			Select s=new Select(element);
			Boolean b=s.isMultiple();
			return b;
			
		}
		//35
		public List<WebElement>getOptions(WebElement element){
			Select s=new Select(element);
			List<WebElement>li=s.getOptions();
			return li;
			
		}
		

		//36
		public WebElement getFirstSelectedOptions(WebElement element) {
			Select s=new Select(element);
			WebElement webelement=s.getFirstSelectedOption();
			return webelement;
		}
		//37
		public List<WebElement> getAllSelectedOptions(WebElement element){
			Select s=new Select(element);
			List<WebElement> li=s.getAllSelectedOptions();
			return li;
			}
		//38
		public void deSelectByIndex(WebElement element,int index) {
			Select s=new Select(element);
			s.deselectByIndex(index);
		}
		//39
		public void deSelectByValue(WebElement element,String data) {
			Select s=new Select(element);
			s.deselectByValue("data");
		}
		//40
		public void deSelectByText(WebElement element,String data) {
			Select s=new Select(element);
			s.deselectByVisibleText(data);
		}
		//41
		public void deSelelectAll(WebElement element) {
			Select s=new Select(element);
			s.deselectAll();
		}
		//42
		public void frameByIndex(int index) {
			driver.switchTo().frame(index);
		}
		//43
		public void frameByName(String data) {
			driver.switchTo().frame(data);
		}
		//44
		public void frameById(String id) {
			driver.switchTo().frame("data");
		}
		//45
		public void frameByWebElement(WebElement element) {
			driver.switchTo().frame(element);
		}
		
		
	
		
		
	}


