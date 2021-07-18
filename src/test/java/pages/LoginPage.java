package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class LoginPage extends BasePage {
    //public static final By USERNAME_INPUT = By.id("user-name");
    //public static final By PASSWORD_INPUT = By.id("password");
    public static final By LOGIN_BUTTON = By.linkText("Sign in");
    public static final By EMAILCRATION_BUTTON = By.id("email_create");
    public static final By CREATEACCAUNT_BUTTON = By.id("SubmitCreate");
    public static final By EMAILADRESSREGISTERED_BUTTON = By.id("email");
    public static final By PASSWORDREGISTERED_BUTTON = By.id("passwd");
    public static final By LOGINALREDYREGISTERED_BUTTON = By.id("SubmitLogin");
    public static final By LOGINGENDERMR_BUTTON = By.id("uniform-id_gender1");
    public static final By LOGINGENDERMRS_BUTTON = By.id("uniform-id_gender2");
    public static final By EROOR_MASSAGE = By.cssSelector("[data-test=error]");


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get("http://automationpractice.com/index.php");
    }

    public void sigiIn() {
        driver.findElement(LOGIN_BUTTON).click();
    }

    public void authentication() {
        driver.findElement(EMAILCRATION_BUTTON).sendKeys("qa10/1@mailinator.com");
        driver.findElement(CREATEACCAUNT_BUTTON).click();

    }

//    public void registration() {
//        driver.findElement(By)
//    }

    public void alredyregistered() {
        driver.findElement(EMAILADRESSREGISTERED_BUTTON).sendKeys("qa10@mailinator.com");
        driver.findElement(PASSWORDREGISTERED_BUTTON).sendKeys("1234567");
        driver.findElement(LOGINALREDYREGISTERED_BUTTON).click();
        String logInConfirmation = driver.findElement(By.linkText("Test Tests")).getText();
        assertEquals(logInConfirmation,"Test Tests", "Login Is Not Successful" );
    }

    public void createanaccauntform() {
        driver.findElement(LOGINGENDERMR_BUTTON).click();
        driver.findElement(LOGINGENDERMRS_BUTTON).click();

    }

//    public void login(String user, String pass) {
//       driver.findElement(USERNAME_INPUT).sendKeys(user);
//        driver.findElement(PASSWORD_INPUT).sendKeys(pass);
//        driver.findElement(LOGIN_BUTTON).click();
//    }

    public String getError() {
        return driver.findElement(EROOR_MASSAGE).getText();
    }
}
