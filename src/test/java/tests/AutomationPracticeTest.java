package tests;

import org.testng.annotations.Test;

public class AutomationPracticeTest extends BaseTest{
    @Test
    void signUp() {
        loginPage.open();
        loginPage.sigiIn();
        loginPage.authentication();
        //loginPage.registration();

    }

    @Test
    void logInAlredyRegistered() {
        loginPage.open();
        loginPage.sigiIn();
        loginPage.alredyregistered();

    }

    @Test
    void logInRegisterForm() {
        loginPage.open();
        loginPage.sigiIn();
        loginPage.authentication();
        loginPage.createanaccauntform();
    }
}
