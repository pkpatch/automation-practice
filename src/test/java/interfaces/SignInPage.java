package interfaces;

import org.openqa.selenium.WebDriver;

public interface SignInPage {

    void enterEmail();
    void enterPassword();
    void clickSignIn(WebDriver driver);

}
