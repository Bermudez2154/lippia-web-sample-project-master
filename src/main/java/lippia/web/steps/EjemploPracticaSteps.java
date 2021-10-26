package lippia.web.steps;

import com.crowdar.core.Injector;
import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.constants.EjemploPracticaConstants;
import lippia.web.services.EjemploPracticaService;
import lippia.web.services.EjemploPracticaService;

public class EjemploPracticaSteps extends PageSteps {

    @Given("el usuario navega a la web de Automation Practice")
    public void elUsuarioNavegaALaWebDeAutomationPractice() {
        EjemploPracticaService.navegarWeb();
    }

    @When("^Usuario busca (.*)")
    public void completarDatos(String datos) {
        EjemploPracticaService.completarDatos(datos);
        EjemploPracticaService.clickSearchButton();
    }
    

    @When("^el usuario pulsa el botón \"(.*)\"$")
    public void elUsuarioPulsaElBotón(String boton) {
        EjemploPracticaService.clickButton();
    }

    @Then("el usuario verifica que se enseña la pagina de Sign in")
    public void elUsuarioVerificaQueSeEnseñaLaPaginaDeSignIn() {
        EjemploPracticaService.verificarSignInPage();
    }


    @Then("Usuario verifica resultado correctamente")
    public void usuarioVerificaResultadoCorrectamente() {
        EjemploPracticaService.verificaResultado();
    }

    @And("el usuario ingresa datos (.*) y (.*)")
    public void ingresarUsuarioPass(String usuario, String pass){
        EjemploPracticaService.ingresarUsuario(usuario);
        EjemploPracticaService.ingresarPass(pass);
        EjemploPracticaService.clickSubmitButton();
        }

    @Then("el usuario verifica que se enseña la pagina My account")
    public void elUsuarioVerificaQueSeEnseñaLaPaginaDeMyAccount() {
        EjemploPracticaService.verificarMyAccountPage();
        }

    @And("usuario ordena productos")
    public void usuarioOrdenaProductos() {
        EjemploPracticaService.ordenarDeMenorAMayor();
    }
}
