import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.KeyInput;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class AutomateTrainlineMain {
    WebDriver driver;

    public void TrainTicket() {
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.thetrainline.com/");
        driver.manage().window().maximize();
        //Enter the departure and destination

        WebElement k =  driver.findElement(By.id("from.text"));
        k.clear();
        k.sendKeys("Manchester Airport");
        //driver.findElement(By.id("to.text"))
        k.clear();
        //driver.findElement(By.id("to.text"))
        k.sendKeys("London Bridge");

        driver.findElement(By.id("return")).click();
        //Select the option of Return
        driver.findElement(By.xpath("//input[@name='page.journeySearchForm.outbound.title']")).click();
        //Step 1
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        while(!driver.findElement(By.xpath("//*[@id='journey-search-form-date-picker']/div/div[2]/div/div[3]/h3")).getText().contains("November"))
        {
          driver.findElement(By.xpath("//button[@class='_x36yy1']")).click();
        }
        List<WebElement> date = driver.findElements(By.xpath("//a[@class='_1cylt0zNoN']"));
        int count = driver.findElements(By.xpath("//a[@class='_1cylt0zNaN']")).size();

        for (int i=0; i<count; i++)
        {
            String text = driver.findElements(By.xpath("//a[@class='_1cylt0zNaN']")).get(i).getText();
            if (text.equalsIgnoreCase("5"))
            {
               driver.findElements(By.xpath("//a[@class='_1cylt0zNaN']")).get(i).click();
               break;
            }
        }

       /* driver.findElement(By.xpath("//input[@aria-label='Date use format: 10-May-20']")).sendKeys("10/05/20");
        driver.findElement(By.id("page.journeySearchForm.outbound.title")).sendKeys(Keys.ENTER);
        driver.findElement(By.id("page.journeySearchForm.inbound.title")).sendKeys("13/05/20");
        driver.findElement(By.id("page.journeySearchForm.inbound.title")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=\"ll-home\"]/div/main/div[1]/div/div/div/div[1]/section/form/div[3]/fieldset[1]/div[3]/div/select")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.xpath("//option[@value='arriveBefore']")).click();
        driver.findElement(By.xpath("//*[@id=\"ll-home\"]/div/main/div[1]/div/div/div/div[1]/section/form/div[3]/fieldset[2]/div[3]/div/select")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.xpath("//option[@value='departAfter']")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //Select the time for departure and Arrival
        driver.findElement(By.xpath("//select[@aria-label='hour']")).click();
        driver.findElement(By.xpath("//select[@aria-label='hour']")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.xpath("//*[@id=\"passenger-summary-btn\"]/div[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"ll-home\"]/div/main/div[1]/div/div/div/div[1]/section/form/div[4]/div/div/ul/li/button/span[2]")).click();
        driver.findElement(By.id("railcardRow0")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.id("railcardRow0")).sendKeys("HM Forces Railcard");
        driver.findElement(By.xpath("//button[@type='button']")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
*/
    }
}

















