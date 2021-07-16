package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private AndroidDriver<AndroidElement> driver;

    public LoginPage(AndroidDriver<AndroidElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "login")
    private AndroidElement loginElement;

    @AndroidFindBy(id = "password")
    private AndroidElement passwordElement;

    @AndroidFindBy(id= "companyLogo")
    private AndroidElement companyLogoElement;

    public boolean logoIsDisplayed() {
        return companyLogoElement.isDisplayed();
    }

    @AndroidFindBy(id="OFFICE ASSISTANT text")
    private AndroidElement officeAssistantText;

    // в тесты впихнуть
    public boolean appNameIsDisplayed() {
        return officeAssistantText.getText().equals("Office Assistant");
    }

    @AndroidFindBy(id="hide passwd button")
    private AndroidElement hidePasswdButton;

    public void clickHidePasswdButton() {
        hidePasswdButton.click();
    }

    public boolean isDisplayed() {
        return loginElement.isDisplayed();
    }

    public void clickLogin() {
        loginElement.click();
    }

    public void typeLogin() {
        loginElement.sendKeys("No.Name@andersenlab.com");
    }

    public void typePassword(String password) {
        passwordElement.sendKeys("p@aFsX3sword");
    }
}