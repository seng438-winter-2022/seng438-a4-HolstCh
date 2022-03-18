// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
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
public class SearchandclickonTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void searchandclickon() {
    driver.get("https://www.bestbuy.ca/en-ca");
    driver.manage().window().setSize(new Dimension(1080, 871));
    driver.findElement(By.name("search")).click();
    driver.findElement(By.name("search")).sendKeys("jack reacher");
    driver.findElement(By.name("search")).sendKeys(Keys.ENTER);
    js.executeScript("window.scrollTo(0,122)");
    driver.findElement(By.cssSelector(".col-xs-12_198le:nth-child(3) .productItemName_3IZ3c")).click();
    assertThat(driver.getTitle(), is("Jack Reacher: Never Go Back (4K Ultra HD) (Blu-ray Combo) | Best Buy Canada"));
  }
}
