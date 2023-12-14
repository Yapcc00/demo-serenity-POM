package is.demo.serenity.stepDefinitions;

import io.cucumber.java.es.*;
import is.demo.serenity.steps.InicioSteps;
import is.demo.serenity.steps.ValidationSteps;
import net.thucydides.core.annotations.Steps;


public class inicioStepDefinitions {

    @Steps
    InicioSteps inicioSteps;
    @Steps
    ValidationSteps validationSteps;

    @Dado("que el usuario navega a la pagina de inicio de sesion")
    public void queElUsuarioNavegaALaPaginaDeInicioDeSesion() {
        inicioSteps.openLogin();
    }

    @Cuando("ingresa las credenciales de acceso correcta")
    public void ingresaLasCredencialesDeAccesoCorrecta() {
       inicioSteps.enterCredentials("admin", "serenity");
        inicioSteps.accesSystem();
    }

    @Entonces("deberia ver la pagina principal")
    public void deberiaVerLaPaginaPrincipal() {
    validationSteps.getTitle();
    }
}
