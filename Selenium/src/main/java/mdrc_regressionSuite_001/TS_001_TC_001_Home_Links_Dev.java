package mdrc_regressionSuite_001;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TS_001_TC_001_Home_Links_Dev {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new ChromeDriver();
    System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
    baseUrl = "https://www.katalon.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testRS001TC001HomePageLinks() throws Exception {
    driver.get("https://mdrcdev.msde.maryland.gov/");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Welcome to the Maryland Public Schools Report Cards.'])[1]/following::a[1]")).click();
    assertEquals(driver.findElement(By.id("atAGlancePageTitle")).getText(), "2018 Maryland Schools At A Glance");
    driver.findElement(By.linkText("Home")).click();
    assertEquals(driver.getTitle(), "Maryland Report Card");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Select a County'])[1]/following::button[1]")).click();
    driver.findElement(By.id("01")).click();
    driver.findElement(By.linkText("Submit")).click();
    assertEquals(driver.findElement(By.id("atAGlancePageTitle")).getText(), "2018 Allegany County Schools At A Glance");
    driver.findElement(By.linkText("Home")).click();
    assertEquals(driver.getTitle(), "Maryland Report Card");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Select a County'])[1]/following::button[1]")).click();
    driver.findElement(By.id("18")).click();
    driver.findElement(By.linkText("Submit")).click();
    assertEquals(driver.findElement(By.id("atAGlancePageTitle")).getText(), "2018 Saint Mary's County Schools At A Glance");
    driver.findElement(By.linkText("Home")).click();
    assertEquals(driver.getTitle(), "Maryland Report Card");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Select a County'])[1]/following::button[1]")).click();
    driver.findElement(By.id("23")).click();
    driver.findElement(By.linkText("Submit")).click();
    assertEquals(driver.findElement(By.id("atAGlancePageTitle")).getText(), "2018 Worcester County Schools At A Glance");
    driver.findElement(By.linkText("Home")).click();
    assertEquals(driver.getTitle(), "Maryland Report Card");
    driver.findElement(By.linkText("View Schools List")).click();
    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='High School Calculations At A Glance'])[1]/following::div[7]")).getText(), "Search for school by name");
    driver.findElement(By.linkText("Home")).click();
    assertEquals(driver.getTitle(), "Maryland Report Card");
    driver.findElement(By.linkText("View Feedback Survey")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_1 | ]]
    assertTrue(driver.findElement(By.cssSelector("h1.page-title")).isDisplayed());
    driver.findElement(By.linkText("Home")).click();
    assertEquals(driver.getTitle(), "Maryland Report Card");
    driver.findElement(By.linkText("View Dr. Salmon's message")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_2 | ]]
    assertTrue(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=concat('', \"'\", '*', \"'\", '')])[2]/following::h3[1]")).isDisplayed());
    driver.findElement(By.linkText("Home")).click();
    assertEquals(driver.getTitle(), "Maryland Report Card");
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
     }

   }

