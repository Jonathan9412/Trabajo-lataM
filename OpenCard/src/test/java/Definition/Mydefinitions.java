package Definition;



import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import step.OpenApp;
import step.TaskAction;

public class Mydefinitions {

    @Steps
    OpenApp openApp;
    TaskAction taskAction;

    @Given("^se desea ingresar a Opencart$")
    public void sedeseaingresaraOpencart(){
        openApp.appUrl();
}

    @When("^cuando se ingresa el usuario y contrasena$")
    public void cuandoseingresaelusuarioycontrasena(){
        taskAction.singIn();
    }

    @Then("^se validad el usuario y contrasena$")
    public void sevalidadelusuarioycontrasena(){
        taskAction.verificar();
    }
}