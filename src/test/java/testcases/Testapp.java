package testcases;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Testapp {
	public static AndroidDriver<MobileElement> driver;
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
	
	
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		
		//busca la ruta de las carpetas internas del app android
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.calculator2");
		//espera que encuentre la app
		cap.setCapability(AndroidMobileCapabilityType.APP_WAIT_ACTIVITY, "com.android.calculator2.Calculator");
		 //encuentra la app
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.android.calculator2.Calculator");
	
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		//pulsamos el numero 9
		WebElement btn9 = driver.findElement(By.id("com.android.calculator2:id/digit9"));
		btn9.click();
		//pulsamos el valor +
		WebElement btnMas = driver.findElement(By.id("com.android.calculator2:id/plus"));
		btnMas.click();
		//pulsamos el numero 5
		WebElement btn5 = driver.findElement(By.id("com.android.calculator2:id/digit5"));
		btn5.click();
		//mostramos el resultado
		WebElement resultado = driver.findElement(By.id("com.android.calculator2:id/equal"));
		resultado.click();
		//espera 3segundos
		 Thread.sleep(3000);
		
	
		driver.quit();
		
	} 
}
