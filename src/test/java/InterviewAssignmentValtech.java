import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class InterviewAssignmentValtech {
    WebDriver driver;
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.valtech.co.uk");
        driver.manage().window().maximize();
        WebElement k =  driver.findElement(By.xpath("//*[@id='CybotCookiebotDialogBodyButtonAccept']"));
        k.click();
        //driver.findElement(By.xpath("//*[@id='CybotCookiebotDialogBodyButtonAccept']")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/html/body/nav/div[1]/a/div")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@aria-label='Search input']")).sendKeys("Recent Blogs");
        //Submit by clicking the search button
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        //Page displayed and click on the first recent blogs
        driver.findElement(By.xpath("//*[@id=\"valtech-wrapper\"]/div/main/vue/div/div/div/ul/li[1]/a/div[1]/img")).click();
        Set<String> handles = driver.getWindowHandles();
        //This code will navigate back to the previous page
        Iterator<String> it = handles.iterator();
            String child = it.next();
            driver.switchTo().window(child);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //Navigate to main page and click active button
        driver.findElement(By.xpath("/html/body/nav/div[1]/button[1]")).click();
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        // Navigate to about and click to display H1 tag
        driver.findElement(By.xpath("/html/body/nav/div[2]/div[1]/div[3]/div/ul[1]/li[8]/button")).click();
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        // Navigate to services and click to display H1 tag
        driver.findElement(By.xpath("/html/body/nav/div[2]/div[1]/div[3]/div/ul[1]/li[4]/button")).click();
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        // Navigate to work and click to display H1 tag
        driver.findElement(By.xpath("/html/body/nav/div[2]/div[1]/div[3]/div/ul[1]/li[2]/button")).click();
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        // Navigate to Contact-us and click to display H1 tag
        driver.findElement(By.xpath("/html/body/nav/div[2]/div[1]/div[3]/div/ul[1]/li[1]/button")).click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        // Navigate to display total offices and click to display H1 tag
        driver.findElement(By.xpath("/html/body/nav/div[2]/div[1]/div[2]/div/div[1]/div[3]/a/div/h4")).click();
        driver.findElement(By.xpath("/html/body/nav/div[2]/div[1]/div[2]/div/div[1]/div[2]")).getText();
        List<WebElement> list = driver.findElements(By.xpath("//*[@id=\"valtech-wrapper\"]/div/main/div[1]/div/div[2]/h3"));
        //Print out number of offices
        System.out.println(15);

        for (int i=0; i<list.size(); i++)
        {
            System.out.println(list.get(i).getText());

        }
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.quit();
    }

}