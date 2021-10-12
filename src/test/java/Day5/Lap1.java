package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lap1 {
    public static ChromeDriver driver = null;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        login("standard_user", "secret_sauce");

    }

    public static void login(String username, String password) {
        driver.get("https://www.saucedemo.com/");
        WebElement input_username = driver.findElement(By.id("user-name"));
        input_username.sendKeys(username);

        WebElement input_password = driver.findElement(By.id("password"));
        input_password.sendKeys(password);

        WebElement button_login = driver.findElement(By.id("login-button"));
        button_login.click();

        WebElement btn_add_to_cart1 = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        btn_add_to_cart1.click();

        WebElement btn_add_to_cart2 = driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
        btn_add_to_cart2.click();

        WebElement btn_add_to_cart3 = driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
        btn_add_to_cart3.click();

        WebElement btn_add_to_cart4 = driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket"));
        btn_add_to_cart4.click();

        WebElement btn_add_to_cart5 = driver.findElement(By.id("add-to-cart-sauce-labs-onesie"));
        btn_add_to_cart5.click();

        WebElement btn_add_to_cart6 = driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)"));
        btn_add_to_cart6.click();
    }
}
