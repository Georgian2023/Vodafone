package tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.BasePage;
import pages.HomePage.HomePage;
import pages.ReincarcaCartelaPage.ReincarcaCartelaPage;
import pages.SignInPage.SignInPage;
import pages.SignUpPage.SignUpPage;
import tests.HomePageTest.HomePageTest;

public class BaseTest {
    public SignInPage signInPage = SignInPage.getInstance();
    public SignUpPage signUpPage = SignUpPage.getInstance();
    public HomePageTest homePage = HomePage.getInstance();
    public ReincarcaCartelaPage  reincarcaCartelaPage= ReincarcaCartelaPage.getInstance();


    @BeforeTest
    public void setUp() {
        BasePage.setUp();

    }

    @AfterTest
    public void tearDown() {
        BasePage.tearDown();
    }
}