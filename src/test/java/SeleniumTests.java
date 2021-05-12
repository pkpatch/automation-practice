import components.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTests {
    static WebDriver webDriver;
    private HomePageImpl homePage;
    private AddressPageImpl addressPage;
    private ConfirmationPageImpl confirmationPage;
    private FinalPaymentPageImpl finalPayment;
    private ShippingPageImpl shippingPage;
    private SignInPageImpl signInPage;


    @BeforeAll
    static void setupAll() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
    }

    @BeforeEach
    void setup() {
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        homePage = new HomePageImpl(webDriver);
    }
}

