package Definition;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import step.OpenApp;
import step.TaskAction;

public class Mydefinitions1 {

    @Steps
    OpenApp openApp;
    TaskAction taskAction;

    @Given("^Se ingresa a la pagina web de opencart$")
    public void Seingresaalapaginawebdeopencart(){
        openApp.appUrl();
    }

    @When("^Iniciar sesion luego entrar en el apartado de categorias$")
    public void Iniciarsesionluegoentrarenelapartadodecategorias(){
        taskAction.singIn();
    }

    @Then("^Se observa la modificacion de un catalog$")
    public void Seobservalamodificaciondeuncatalog(){
        taskAction.verificar();
    }
}