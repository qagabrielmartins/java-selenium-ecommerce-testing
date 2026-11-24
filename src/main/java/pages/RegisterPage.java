package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.ConfigReader;

import java.time.Duration;

public class RegisterPage {

    private final WebDriver driver;
    private final WebDriverWait wait;

    private final By registerTitle = By.cssSelector(".page-title");


    public RegisterPage(WebDriver driver){
        this.driver = driver;
        this.wait =new WebDriverWait(driver, Duration.ofSeconds(0));
    }

    private final By loginLink = By.cssSelector("a[href='/login']");

    public void abrirPaginaCadastro(){

        String baseUrl = ConfigReader.get("url");
        driver.get(baseUrl + "register");

        wait.until(
                ExpectedConditions.visibilityOfElementLocated(registerTitle)
        );
    }

}

