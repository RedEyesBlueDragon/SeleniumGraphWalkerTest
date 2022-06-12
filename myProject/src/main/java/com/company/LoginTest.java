package com.company;


import org.graphwalker.core.machine.ExecutionContext;
import org.graphwalker.java.annotation.BeforeExecution;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class LoginTest extends ExecutionContext implements Login {

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

    @Override()
    public void v_MainPage() {
        //assertEquals(baseUrl, driver.getCurrentUrl());
        System.out.println("---Main---" + driver.getCurrentUrl());

    }

    @Override()
    public void v_ForMePage() {
        System.out.println("Running: v_ForMePage");
    }


    @Override()
    public void v_AccountInfoPage() {
        System.out.println("Running: v_AccountInfoPage");
    }


    @Override()
    public void v_LoginPage() {
        System.out.println("Running: v_LoginPage");
    }


    @Override()
    public void v_ChangeUserName() {
        System.out.println("Running: v_ChangeUserName");
    }

    @Override
    public void e_GoLoginPage() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a"))).click();
    }


    @Override()
    public void e_ClickChangeUserName() {
        driver.findElement(By.id("firstname")).sendKeys( "testname");
        driver.findElement(By.id("old_passwd")).sendKeys( "password");
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/fieldset/div[11]/button/span"))
                .click();
    }


    @Override()
    public void e_ClickAccount() {
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[1]/ul/li[4]/a/span"))
                .click();
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
    public void e_GoBackAccountPage() {
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/ul/li[1]/a/span")).click();
    }

}