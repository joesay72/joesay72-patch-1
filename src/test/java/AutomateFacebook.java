import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class AutomateFacebook {
    public static void main(String[] args)
    {
     System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Drivers\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://en-gb.facebook.com/");
        driver.manage().window().maximize();
        //Create an account in facebook page for sign up

        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Eric");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Dodoo");
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("ericdodoo72@gmail.com");
        driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("ericdodoo72@gmail.com");
        driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Corona123");
        Select s = new Select(driver.findElement(By.xpath("//select[@name='birthday_day']")));
        s.selectByIndex(5);

        Select t = new Select(driver.findElement(By.xpath("//select[@name='birthday_month']")));
        t.selectByValue("9");
        Select a = new Select(driver.findElement(By.xpath("//select[@name='birthday_year']")));
        a.selectByValue("1972");
        driver.findElement(By.xpath("//input[@type='radio']")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.id("checkpointSubmitButton")).click();

        }


    }

