package is.demo.serenity.pageObject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ValidationPages extends PageObject {

    @FindBy(xpath = "//h1[text()='Tablero']")
    public WebElementFacade validation_title;
}
