package com.durgasoft.ecommerce.basepage;

import java.net.URL;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumHUB {

	public static void main(String[] args) throws Exception {
		DesiredCapabilities ds = new DesiredCapabilities();
		ds.setBrowserName("chrome");
		ds.setPlatform(Platform.WINDOWS);
		ChromeOptions co = new ChromeOptions();
		//co.merge(ds);
		String hubURL = " http://192.168.0.151:3333/wd/hub";
		WebDriver driver = new RemoteWebDriver(new URL(hubURL), ds);
		driver.get("http://spicejet.com");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
	}

}
