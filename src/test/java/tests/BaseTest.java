package tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.RegisterPage.RegisterPage;
import pages.SignInPage.SignInPage;
import pages.BasePage;
import pages.SignUpPage.SignUpPage;


public class BaseTest {
    public SignInPage signInPage= SignInPage.getInstance();
    public RegisterPage registerPage = RegisterPage.getInstance();
    public SignUpPage signUpPage= SignUpPage.getInstance();


    @BeforeSuite
    public void init(){
        BasePage.setUp();
    }

    @AfterSuite
    public void tearDown() {
        BasePage.tearDown();
    }
}
