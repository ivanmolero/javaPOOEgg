package utils;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Driver {
    private AndroidDriver driver;

    public Driver() {
        try {
            this.driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), this.getCapabilities());
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }
    }

    public AndroidDriver getDriver() {
        return driver;
    }

    private DesiredCapabilities getCapabilities() {
//        "appium:deviceName": "emulator-5554",
//        "appium:appPackage": "com.wdiodemoapp",
//        "appium:appActivity": ".MainActivity",
//        "platformName": "Android",
//        "appium:app": "/home/imolero/Descargas/Android-NativeDemoApp-0.4.0.apk",
//        "appium:appVersion": "12",
//        "appium:automationName": "UiAutomator2"
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("appium:deviceName", "emulator-5554");
        desiredCapabilities.setCapability("appium:appPackage", "com.wdiodemoapp");
        desiredCapabilities.setCapability("appium:appActivity", ".MainActivity");
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("appium:app", "/home/imolero/Descargas/Android-NativeDemoApp-0.4.0.apk");
        desiredCapabilities.setCapability("appium:appVersion", "12");
        desiredCapabilities.setCapability("appium:automationName", "UiAutomator2");
        return desiredCapabilities;
    }
}
