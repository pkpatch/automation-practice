package components;

import interfaces.AddressPage;
import interfaces.SignInPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class SignInPageImpl implements SignInPage {

    private final WebDriver driver;

    private final By emailInput = new By.ById("email");
    private final By passwordInput = new By.ById("passwd");
    private final By signInButton = new By.ById("SubmitLogin");

    private String login = null;
    private String password = null;


    public SignInPageImpl(WebDriver driver) {
        this.driver = driver;
        getCredentials();
    }

    @Override
    public void enterEmail() {
        driver.findElement(emailInput).sendKeys(login);
        //driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
    }

    @Override
    public void enterPassword() {
        driver.findElement(passwordInput).sendKeys(password);
        //driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
    }

    @Override
    public AddressPage clickSignIn() {
        driver.findElement(signInButton).click();
        return new AddressPageImpl(driver);
    }

    private void getCredentials() {
        try (InputStream input = new FileInputStream("src/test/resources/login.properties")) {
            Properties prop = new Properties();
            prop.load(input);
            password = prop.getProperty("password");
            login = prop.getProperty("login");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
