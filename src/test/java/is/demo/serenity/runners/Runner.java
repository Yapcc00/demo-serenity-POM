package is.demo.serenity.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "C:\\Users\\Andres\\IdeaProjects\\proyecto-base\\src\\test\\resources\\features\\login\\inicioSesion.feature",
        glue = "is.demo.serenity.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = "pretty",
        tags = "@InicioExitoso"
)
public class Runner {
}
