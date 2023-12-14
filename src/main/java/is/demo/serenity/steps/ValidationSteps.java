package is.demo.serenity.steps;

import is.demo.serenity.pageObject.ValidationPages;
import net.serenitybdd.core.pages.PageObject;
import org.fluentlenium.core.annotation.Page;

public class ValidationSteps extends PageObject {

    @Page
    private ValidationPages validation;

    public String getTitle(){
        return validation.validation_title.waitUntilVisible().getText();
    }
}
