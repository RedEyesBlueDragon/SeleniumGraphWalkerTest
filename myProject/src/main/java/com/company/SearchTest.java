package com.company;

import org.graphwalker.core.machine.ExecutionContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchTest extends ExecutionContext implements SearchBar{

    private static WebDriver driver;
    String baseUrl = "http://automationpractice.com/index.php";

    @Override
    public void v_StartState() {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Sarimsak\\Desktop\\pp\\geckodriver.exe");
        driver = new FirefoxDriver();
    }


    @Override
    public void e_UseSearchBar() {
        driver.findElement(By.id("search_query_top")).sendKeys( "dress");
        driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[2]/form/button")).click();
    }


    @Override
    public void e_ClickSummerDresses() {
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/a[4]"))
                .click();
    }

    @Override
    public void e_ClickDress() {
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[1]/div/div[1]/div"))
                .click();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[1]/div/div[2]/div[2]/a[2]/span"))).click();

    }

    @Override
    public void e_GoMain() {
        driver.get(baseUrl);
    }

    @Override
    public void v_DressPage() {

    }

    @Override
    public void v_MainPage() {

    }

    @Override
    public void v_SearchResult() {

    }

    @Override
    public void v_SelectedDress() {

    }

}
