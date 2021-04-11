// Generated by Selenium IDE
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;

public class BlazeDemoTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;

  @BeforeEach
  public void setUp() {
    driver = new FirefoxDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }

  @AfterEach
  public void tearDown() {
    driver.quit();
  }

  @Test
  public void blazedemotest() {
    // Test name: blazedemotest
    // Step # | name | target | value
    // 1 | open | / |
    driver.get("https://blazedemo.com/");
    // 2 | setWindowSize | 999x692 |
    driver.manage().window().setSize(new Dimension(999, 692));
    // 3 | click | name=toPort |
    driver.findElement(By.name("toPort")).click();
    // 4 | select | name=toPort | label=London
    {
      WebElement dropdown = driver.findElement(By.name("toPort"));
      dropdown.findElement(By.xpath("//option[. = 'London']")).click();
    }
    // 5 | click | css=.form-inline:nth-child(4) > option:nth-child(3) |
    driver.findElement(By.cssSelector(".form-inline:nth-child(4) > option:nth-child(3)")).click();
    // 6 | click | css=.btn-primary |
    driver.findElement(By.cssSelector(".btn-primary")).click();
    // 7 | assertText | css=h3 | Flights from Paris to London:
    assertEquals(driver.findElement(By.cssSelector("h3")).getText(),"Flights from Paris to London:");
    // 8 | click | css=tr:nth-child(1) .btn |
    driver.findElement(By.cssSelector("tr:nth-child(1) .btn")).click();
    // 9 | click | id=inputName |
    driver.findElement(By.id("inputName")).click();
    // 10 | type | id=inputName | Leandro
    driver.findElement(By.id("inputName")).sendKeys("Leandro");
    // 11 | type | id=address | 123
    driver.findElement(By.id("address")).sendKeys("123");
    // 12 | click | id=city |
    driver.findElement(By.id("city")).click();
    // 13 | type | id=city | town
    driver.findElement(By.id("city")).sendKeys("town");
    // 14 | click | id=state |
    driver.findElement(By.id("state")).click();
    // 15 | type | id=state | state
    driver.findElement(By.id("state")).sendKeys("state");
    // 16 | click | id=zipCode |
    driver.findElement(By.id("zipCode")).click();
    // 17 | type | id=zipCode | 12345
    driver.findElement(By.id("zipCode")).sendKeys("12345");
    // 18 | click | id=cardType |
    driver.findElement(By.id("cardType")).click();
    // 19 | click | css=option:nth-child(1) |
    driver.findElement(By.cssSelector("option:nth-child(1)")).click();
    // 20 | click | css=.btn-primary |
    driver.findElement(By.cssSelector(".btn-primary")).click();
    // 21 | click | css=h1 |
    driver.findElement(By.cssSelector("h1")).click();
    // 22 | assertText | css=h1 | Thank you for your purchase today!
    assertEquals(driver.findElement(By.cssSelector("h1")).getText(), "Thank you for your purchase today!");
  }
}