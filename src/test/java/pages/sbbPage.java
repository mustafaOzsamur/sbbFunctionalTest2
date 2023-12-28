package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class sbbPage {

    public sbbPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(id = "onetrust-accept-btn-handler")
    public WebElement cokiesAkzeptieren;

    @FindBy(xpath = "//sbb-header-action[@data-testid='login']")
    public WebElement homePageAnmeldenButton;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailBox;

    @FindBy(xpath = "//input[@id='pwd']")
    public WebElement passwordBox;

    @FindBy(xpath = "(//button[@name='LOGIN'])[1]")
    public WebElement anmeldungPageAnmeldenButton;

    @FindBy(xpath = "//span[contains(text(),'Sie konnten nicht eingeloggt werden, bitte überprü')]")
    public WebElement warnungTextElement;
}
