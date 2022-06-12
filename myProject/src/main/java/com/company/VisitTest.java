package com.company;

import org.graphwalker.core.machine.ExecutionContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VisitTest extends ExecutionContext implements VisitPages{

    private static WebDriver driver;
    String baseUrl = "http://automationpractice.com/index.php";

    @Override
    public void v_StartState() {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Sarimsak\\Desktop\\pp\\geckodriver.exe");
        driver = new FirefoxDriver();
    }

    @Override
    public void e_ClickCreditSlip() {
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[1]/ul/li[2]/a/span")).click();
    }

    @Override
    public void v_CardSlipPage() {

    }

    @Override
    public void e_BackToAccountFromCard() {
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/ul/li[1]/a/span")).click();

    }

    @Override
    public void e_BackToAccountFromWish() {
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/div/ul/li[1]/a/span")).click();

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

    @Override()
    public void v_MainPage() {
        //assertEquals(baseUrl, driver.getCurrentUrl());
        System.out.println("---Main---" + driver.getCurrentUrl());

    }

    @Override()
    public void v_ForMePage() {
        System.out.println("Running: v_ForMePage");
    }


    @Override
    public void e_GoWishlists() {
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/ul/li/a/span")).click();
    }


    @Override
    public void e_WrongDataLogin() {
        driver.findElement(By.id("email")).sendKeys( "cmpe_test@mail.com");
        driver.findElement(By.id("passwd")).sendKeys( "passwordwrong");
        driver.findElement(By.id("SubmitLogin")).click();
    }


    @Override()
    public void e_Logout() {
        driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[2]/a")).click();
    }


    @Override
    public void v_LoginPage() {

    }

    @Override
    public void v_WishlistsPage() {

    }

    @Override
    public void e_GoLoginPage() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a"))).click();
    }

}
