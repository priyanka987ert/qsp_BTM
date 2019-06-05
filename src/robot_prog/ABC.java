package robot_prog;

import java.awt.AWTException;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ABC {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		System.setProperty("webdriver.ie.driver","./driver/IEDriverServer.exe");
	}
public static void main(String[] args) throws AWTException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	WebElement wb = driver.findElement(By.className("gLFyf gsfi"));
	wb.
	java.awt.Robot robot = new java.awt.Robot();
	robot.keyPress(KeyEvent.VK_CAPS_LOCK);
	robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
	robot.keyPress(KeyEvent.VK_H);
	robot.keyRelease(KeyEvent.VK_H);
	robot.keyPress(KeyEvent.VK_E);
	robot.keyRelease(KeyEvent.VK_E);
}

}
