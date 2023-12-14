package is.demo.serenity.steps;

import is.demo.serenity.pageObject.InicioPages;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class InicioSteps {

    @Page
    private InicioPages inicio;

    @Step("Abir Navegador")
    public void openLogin(){
        inicio.open();
        inicio.txt_username.type("");
        inicio.txt_password.type("");
    }

    @Step("Ingresar credenciales")
    public void enterCredentials(String username, String password){
        inicio.txt_username.type(username);
        inicio.txt_password.type(password);
    }

    @Step("click en login")
    public void accesSystem(){
        inicio.btn_login.waitUntilClickable().click();
    }



}
