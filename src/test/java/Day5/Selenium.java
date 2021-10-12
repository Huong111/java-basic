package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.ArrayList;

public class Selenium {
    public static ChromeDriver driver = null;

    public static void main(String[] args) {
        /*
        TC 01#: User can login with valid credentials.

        Steps:
        1. Navigate to https://www.saucedemo.com/
        2. Enter 'standard_user' into username field
        3. Enter 'secret_sauce' into password field
        4. Click Login button

        Expected:
        1. User can login.
        2. The URL https://www.saucedemo.com/inventory.html is navigated.
        3. The 'PRODUCTS' label displays.
         */
        driver = new ChromeDriver();
        /*
        login("standard_user", "secret_sauce");
        login("locked_out_user", "secret_sauce");
        login("problem_user", "secret_sauce");
        login("performance_glitch_user", "secret_sauce");
        */

        /*
        String[] accounts = {"standard_user", "locked_out_user", "problem_user", "performance_glitch_user"};

        for (String account : accounts) {
            login(account, "secret_sauce");
        }

        for (int i = 0; i < accounts.length; i++) {
            login(accounts[i], "secret_sauce");
        }
         */

        ArrayList<String> accounts = new ArrayList<>();
        accounts.add("standard_user");
        accounts.add("locked_out_user");
        accounts.add("problem_user");
        accounts.add("performance_glitch_user");

        for (String account : accounts) {
            login(account, "secret_sauce");
        }

        for (int i = 0; i < accounts.size(); i++) {
            login(accounts.get(i), "secret_sauce");
        }

        driver.quit();
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
