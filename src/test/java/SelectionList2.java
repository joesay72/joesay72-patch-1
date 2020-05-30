import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SelectionList2 {


        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Drivers\\chromedriver_win32\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("http://www.google.com");

            driver.findElement(By.name("q")).sendKeys("bike");
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

            List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class= 'sbl1']"));
            //print the number of suggestion in the google list
            System.out.println("The number of search results is " +list.size());
            //Now get the text of the list
            for(int i=0; i<list.size(); i++)
            {
                System.out.println(list.get(i).getText());
                //Now select a specific one for the list
               if (list.get(i).getText().contains("bike"))
                {
                    list.get(i).click();
                }
            }
        }
    }

