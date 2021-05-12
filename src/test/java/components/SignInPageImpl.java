package components;

import interfaces.SignInPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class SignInPageImpl implements SignInPage {

    private WebDriver driver;

    private By emailInput = new By.ById("email");
    private By passwordInput = new By.ById("password");
    private By signInButton = new By.ById("SubmitLogin");

    private String login = null;
    private String password = null;


    public SignInPageImpl(WebDriver driver) {
        this.driver = driver;
        getCredentials();
    }

    @Override
    public void enterEmail() {
        driver.findElement(emailInput).sendKeys(login);
    }

    @Override
    public void enterPassword() {
        driver.findElement(passwordInput).sendKeys(password);
    }

    @Override
    public AddressPageImpl clickSignIn() {
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
