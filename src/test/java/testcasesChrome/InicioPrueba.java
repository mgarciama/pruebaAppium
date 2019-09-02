package testcasesChrome;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class InicioPrueba {

	public static AndroidDriver<MobileElement> driver;
	//public static AndroidDriver driver;
	
	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		//driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
	driver.get("http://www.google.com/");
		   System.out.println(driver.getTitle());
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//esta es la identificacion que busca el buscador y ponemos algún nombre para que busque
		driver.findElement(By.name("q")).sendKeys("marca");
		//identifica una class y pulsa el botón de enviar
	driver.findElement(By.className("Tg7LZd")).click();
		   System.out.println(driver.getTitle());
		driver.quit();
		
		
	} 
}
