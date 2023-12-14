package is.demo.serenity.pageObject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://demo.serenity.is/Account/Login/?ReturnUrl=%2F")
public class InicioPages extends PageObject {

    @FindBy(xpath = "//input[@name='Username']")
    public WebElementFacade txt_username;

    @FindBy(xpath = "//input[@name='Password']")
    public WebElementFacade txt_password;

    @FindBy(xpath = "//button[@id='LoginPanel0_LoginButton']")
    public WebElementFacade btn_login;



}
