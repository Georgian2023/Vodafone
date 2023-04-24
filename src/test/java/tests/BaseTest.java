package tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.BasePage;
import pages.HomePage.HomePage;
import pages.SignInPage.SignInPage;
import pages.SignUpPage.SignUpPage;
import tests.HomePageTest.HomePageTest;

public class BaseTest {
    public SignInPage signInPage = SignInPage.getInstance();
    public SignUpPage signUpPage = SignUpPage.getInstance();
    public HomePageTest homePageTest = HomePage.getInstance();


    @BeforeTest
    public void setUp() {
        BasePage.setUp();

    }

    @AfterTest
    public void tearDown() {
        BasePage.tearDown();
    }
}