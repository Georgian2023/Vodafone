package tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.RegisterPage.RegisterPage;
import pages.SignInPage.SignInPage;
import pages.BasePage;
import pages.SignUpPage.SignUpPage;


public class BaseTest {
    public SignInPage SignInPage= pages.SignInPage.SignInPage.getInstance();
    public RegisterPage RegisterPage = pages.RegisterPage.RegisterPage.getInstance();
    public SignUpPage SignUpPage= pages.SignUpPage.SignUpPage.getInstance();


    @BeforeSuite
    public void init(){
        BasePage.setUp();
    }

    @AfterSuite
    public void tearDown() {
        BasePage.tearDown();
    }
}
