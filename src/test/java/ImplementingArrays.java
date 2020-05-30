import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

import static java.lang.Thread.sleep;

public class ImplementingArrays {
    //private static Instant wait;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Automation\\Drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        int verifyProductIsComplete=0;
       /* String username = "sgyimah2002@yahoo.com(Opens in new tab)";
        String password = "luvyadee04";*/
//Step 5. What is the requirement add multiple product
//so declare the products list of by declaring an array of Strings
        String[] shoppingList = {"SIM Free Alcatel 1066G Mobile Phone - Black","SIM Free Samsung Galaxy S20 128GB 4G Mobile Phone-Grey"};
        driver.get("https://www.argos.co.uk/browse/technology/mobile-phones-and-accessories/sim-free-phones/c:30147/?clickOrigin=header:home:menu:sim+free+mobile+phones");
        sleep(3000);
//Step 1. find list of all WebElments with the CSS selector
//WebElement is a return type
        List<WebElement> groceries = driver.findElements(By.xpath("//a[@itemprop='name']"));
        driver.findElement(By.xpath("//*[@id=\"__tealiumGDPRecModal\"]/div/div/div[2]/a")).click();
//Last code for production - Accept Cookies

       // WebElement acceptCookiesBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='__tealiumGDPRecModal']/div/div/div[2]/a")));
        //acceptCookiesBtn.click();
//driver.get("https://www.waitrose.com/ecom/login");
/*WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#email")));
email.sendKeys(username);
WebElement passwordElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#password")));
passwordElement.sendKeys(password);
WebElement loginElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#loginSubmit")));
loginElement.click();*/
/*WebElement confirmButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button___3xqD7 secondary___f-yvb']")));
confirmButton.click();*/
//Step 2. Iterate through the products
// Iterate until the size of the product, so for example it can iterate through the product 30 times
        for (int i=0; i<groceries.size();i++)
        {
            //Step 9. format text by .split
            //Step 3. iterate through and get the text of the product and store into String. so write as follows ...
            //String productName = groceries.get(i).getText();
            String[] productName = groceries.get(i).getText().split("-");
            String formattedName = productName[0].trim();
            //driver.findElement(By.xpath("//button[@data-test='component-att-button']")).click();
            //driver.findElement(By.xpath("//a[@data-test='component-att-button-basket']")).click();

            //Step 6. Goal is to check product extracted is present in the array or not
            //so, we need to convert the array into a Array list to enable searching of the products
            List arrayList = Arrays.asList(shoppingList);//now change productName in Step 4 ==> arrayList
            //change Cauliflower ==> productName
            //Step 4. Now our goal is to get the Bananas into the Cart
            if (arrayList.contains(formattedName))// before...,productName was "Cauliflower"
            {
                //Continuation of Step 7
                verifyProductIsComplete++;
                //if it contains Cauliflower, then click and add to Basket
                driver.findElements(By.xpath("//button[@class='Buttonstyles__Button-q93iwm-2 bHuzsD btn-cta']")).get(i).click();
                //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                //driver.findElement(By.xpath("//button[@data-test='component-att-button-continue']")).click();
                //driver.findElement(By.xpath("//a[@data-test='trolley']")).click();
                //step 8
                if(verifyProductIsComplete==3)
                    break;//Stop the block or the iteration
            }
        }

        //driver.quit();



       /* //Step 7.Verify Product is complete
        int verifyProductIsComplete=0;
        //Step 5. Requirement is to add multiple product using Arrays
        //So we will declare the product list of arrays by declaring an array

        String[] shoppingList = {"SIM Free Nokia 216 Mobile Phone - Black","SIM Free Samsung Galaxy S20 128GB 4G Mobile Phone-Grey"};
        driver.get("https://www.argos.co.uk/browse/technology/mobile-phones-and-accessories/sim-free-phones/c:30147/?clickOrigin=header:home:menu:sim+free+mobile+phones");

        driver.manage().window().maximize();
        //Step1. find a list of WebElement
        List<WebElement> techno = driver.findElements(By.xpath("//a[@itempro='name']"));
        //Last code for production - Accept Cookie
        driver.findElement(By.xpath("//*[@id=\"__tealiumGDPRecModal\"]/div/div/div[2]/a")).click();

        {
            //Step2. iterate through the product
            //Iterate until the size of the product so for example 30 times iteration
            for (int i = 0; i < techno.size(); i++) {
                //Step 6. Goal is to check product extracted is present in the array or not
                //So we need to convert array into a list to enable searching of the product
                List arrayList = Arrays.asList(shoppingList);//now change productName in Step 4 ==> arrayList
                //change Cauliflower ==> productName
                //Step 9. Format text by split
                //Step3. Iterate through the product and get the text and store it into string
                String[] productName = techno.get(i).getText().split("-");
                String formattedName = productName[0].trim();
                driver.findElement(By.xpath("//a[@type='button']")).click();
                {
                    //Step 4. Now our goal is to get the type of phone into the cart
                    //if (arrayList.contains("SIM Free Nokia 216 Mobile Phone - Black"))
                    if (arrayList.contains(formattedName))
                        //Continuation of Step 7
                        verifyProductIsComplete++;
                    //if it contains productName, then click and add to Basket
                    driver.findElements(By.xpath("//button[@class='Buttonstyles__Button-q93iwm-2 bHuzsD btn-cta']")).get(i).click();
                    //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

                    {
                        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                        //driver.findElement(By.xpath("//button[@data-test='component-att-button-continue']")).click();
                        //driver.findElement(By.xpath("//a[@data-test='trolley']")).click();
                        //Step 8
                        if (verifyProductIsComplete==3)


                            //Stop the block or the iteration
                            break;*/


                    }
                }


