import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AutomationHomework {
    WebDriver driver;

    public void SearchResults()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Drivers\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("http://www.apple.com");
        driver.findElement(By.xpath("//*[@id=\"ac-gn-link-search\"]")).click();

        driver.findElement(By.id("ac-gn-searchform-input")).sendKeys("iPhone SE");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        List<WebElement> list = driver.findElements(By.xpath("//ul[@class='ac-gn-searchresults-list']//li[@class='ac-gn-searchresults-item']"));

        System.out.println("The number of search results is " +list.size());

        //driver.quit();
    }

    public void GetText() {


        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Drivers\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.apple.com");
        driver.findElement(By.xpath("/html/body/nav[1]/div/ul[2]/li[9]/a")).click();
        driver.findElement(By.id("ac-gn-searchform-input")).sendKeys("iPhone Case");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        List<WebElement> list = driver.findElements(By.xpath("//ul[@class='ac-gn-searchresults-list']//li[@class='ac-gn-searchresults-item']"));

        //System.out.println("The number of search results is " + list.size());

        for (int i=0; i<list.size(); i++)
        {
            System.out.println(list.get(i).getText());

            //Now select a specific one for the list
            if (list.get(i).getText().contains("iphone Case"))
            {
                list.get(i).click();
                list.get(i).clear();
            }
        }
        //driver.quit();


    }
}



