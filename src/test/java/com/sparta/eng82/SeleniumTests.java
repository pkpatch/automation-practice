package com.sparta.eng82;

import com.sparta.eng82.components.HomePageImpl;
import com.sparta.eng82.interfaces.*;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTests {
    static WebDriver webDriver;
    private HomePage homePage;
    private AddressPage addressPage;
    private ConfirmationPage confirmationPage;
    private FinalPaymentPage finalPayment;
    private ShippingPage shippingPage;
    private SignInPage signInPage;
    private SummaryPage summaryPage;
    private PaymentPage paymentPage;


    @BeforeAll
    static void setupAll() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
    }

    @AfterAll
    static void tearDown() {
        webDriver.close();
    }

    @BeforeEach
    void setup() {
        webDriver = new ChromeDriver();
        homePage = new HomePageImpl(webDriver);
    }

    @Test
    @DisplayName("Complete happy path of purchasing an item from home page")
    void completeHappyPathOfPurchasingAnItemFromHomePageMyWay() {
        confirmationPage = homePage.addItemToCart()
                .goToCheckout()
                .proceedToSignIn()
                .enterEmail()
                .enterPassword()
                .clickSignIn()
                .proceedToShippingPage()
                .agreeToTermsOfService()
                .proceedToPaymentPage()
                .payByBankWire()
                .confirmOrder();
        Assertions.assertTrue(confirmationPage.checkOrderStatus());

    }
}

