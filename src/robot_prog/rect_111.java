package robot_prog;
import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class rect_111 {
	
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		System.setProperty("webdriver.ie.driver","./driver/IEDriverServer.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");

		WebElement ele1 = driver.findElement(By.name("username"));
		WebElement ele2 = driver.findElement(By.name("pwd"));

		Rectangle rect1 = ele1.getRect();
		Rectangle rect2 = ele2.getRect();

		System.out.println("Dimensions of h1 element are :");
		System.out.println("size : (" + rect1.getWidth() + "," + rect1.getHeight() +")");
		System.out.println("Dimension : (" + rect1.getX() + "," + rect1.getY() +")");

		System.out.println("\nDimensions of p element are :");
		System.out.println("size : (" + rect2.getWidth() + "," + rect2.getHeight() +")");
		System.out.println("Dimension : (" + rect2.getX() + "," + rect2.getY() +")");

		driver.close();
	}
}

