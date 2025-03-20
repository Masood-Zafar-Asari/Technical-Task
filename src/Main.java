import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//This test logins into the URL below selects the highest priced item and then adds it to the cart

public class Main {

    WebDriver driver;

    public void launchChromeBrowser() {

        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

    }

    public void loginIntoAccount(){

        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id='login-button']")).click();

    }

    public void selectAndAddHighestPriceToCart()

    {
        driver.findElement(By.linkText("Sauce Labs Backpack")).click();
        driver.findElement(By.xpath("//*[@id='add-to-cart']")).click();
    }

    public static void main(String[] args) {

        Main object = new Main();
        object.launchChromeBrowser();
        object.loginIntoAccount();
        object.selectAndAddHighestPriceToCart();
    }
}