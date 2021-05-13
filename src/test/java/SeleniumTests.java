import components.HomePageImpl;
import interfaces.*;
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
    @DisplayName("Check Order Status")
    void checkOrderStatus() {
        homePage.addItemToCart();
        summaryPage = homePage.goToCheckout();

        signInPage = summaryPage.proceedToCheckout();

        signInPage.enterEmail();
        signInPage.enterPassword();
        addressPage = signInPage.clickSignIn();

        shippingPage = addressPage.proceedToCheckout();

        shippingPage.agreeToTermsOfService();
        paymentPage = shippingPage.proceedToCheckout();

        finalPayment = paymentPage.payByBankWire();

        confirmationPage = finalPayment.confirmOrder();

        Assertions.assertTrue(confirmationPage.checkOrderStatus());
    }
}

