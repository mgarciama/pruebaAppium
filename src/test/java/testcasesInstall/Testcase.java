package testcasesInstall;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;



import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Testcase {

	public static AndroidDriver<MobileElement> driver;
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		File app = new File (projectPath + "\\app\\selendroid-test-app-0.17.0.apk");
		System.out.println(app);
		//browser + Devices
		//DesiredCapabilities cap = new DesiredCapabilities();
	
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		
		//este codigo sirve para instalar la app con .apk
		//cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		
		//estos codigos sirve para entrar en el
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "io.selendroid.testapp");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".HomeScreenActivity");
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
	
	
		 Thread.sleep(3000);
		
	
		driver.quit();
		
		
	} 
	
}
