package org.baseclass;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
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

public class BaseClass {

	public static WebDriver driver;

	public static void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public static void browserLaunch(String url) {
		driver.get(url);
	}

	public static WebElement locator(String attributeName, String attributeValue)

	{
		if (attributeName.equalsIgnoreCase("id")) {
			WebElement findElement = driver.findElement(By.id(attributeValue));
			return findElement;
		} else if (attributeName.equalsIgnoreCase("name")) {
			WebElement findElement = driver.findElement(By.name(attributeValue));
			return findElement;
		} else if (attributeName.equalsIgnoreCase("xpath")) {
			WebElement findElement = driver.findElement(By.xpath(attributeName));
			return findElement;
		} else {
			System.out.println("None");
			return null;
		}
	}

	public static List<WebElement> tagName(String tagName) {
		List<WebElement> findElements = driver.findElements(By.tagName(tagName));
		return findElements;
	}

	public static void elementTextSend(WebElement findElement, String keysToSend) {
		findElement.sendKeys(keysToSend);
	}

	public static void elementClick(WebElement findElement) {
		findElement.click();
	}

	public static void select(WebElement element, String name) {
		Select s = new Select(element);
		s.selectByVisibleText(name);
	}

	public static void screenShot(String name) {
		try {
			TakesScreenshot tk = (TakesScreenshot) driver;
			File sourceFile = tk.getScreenshotAs(OutputType.FILE);
			File targetFile = new File("Documents" + name + ".png");
			FileUtils.copyFile(sourceFile, targetFile);

		} catch (Exception e) {

		}
	}

	public static void elementSendBasedOnScript(String value, WebElement refName) {
		JavascriptExecutor tk = (JavascriptExecutor) driver;
		tk.executeScript("arguments[0].setAttribute('value','" + value + "')", refName);

	}

	public static void dragAndDrop(WebElement source, WebElement target) {
		Actions ac = new Actions(driver);
		ac.dragAndDrop(source, target).perform();
	}

	public void refresh() {
		driver.navigate().refresh();

	}

	public void quit() {
		driver.close();
	}
}
