package com.company;

import org.graphwalker.core.machine.ExecutionContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BucketTest extends ExecutionContext implements AddBucket{

    private static WebDriver driver;
    String baseUrl = "http://automationpractice.com/index.php";

    @Override
    public void v_StartState() {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Sarimsak\\Desktop\\pp\\geckodriver.exe");
        driver = new FirefoxDriver();
    }

    @Override
    public void e_GoMain() {
        driver.get(baseUrl);
    }

    @Override()
    public void e_Login() {
        driver.findElement(By.id("email")).sendKeys( "cmpe_test@mail.com");
        driver.findElement(By.id("passwd")).sendKeys( "password");
        driver.findElement(By.id("SubmitLogin")).click();
    }


    @Override
    public void v_ForMePage() {

    }

    @Override
    public void v_MainPage() {

    }



    @Override
    public void v_LoginPage() {

    }

    @Override
    public void e_GoLoginPage() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a"))).click();
    }

    @Override
    public void e_ClickAddtoCart() {
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[3]/div/p/button/span"))
                .click();
    }

    @Override
    public void v_PopUp() {

    }

    @Override
    public void e_ClickDresses() {
        driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/a"))
                .click();
    }


    @Override
    public void v_DressPage() {

    }


    @Override
    public void e_ClickDress() {
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[1]"))
                .click();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[1]/div/div[2]/div[2]/a[2]/span"))).click();



    }

    @Override
    public void v_SelectedDress() {

    }
}
