package stepDefinitions;

import drivers.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.RegisterPage;

public class RegisterSteps {

    private RegisterPage registerPage;

    @Given("que estou na página de cadastro")
    public void que_estou_na_página_de_cadastro() {
        registerPage =new RegisterPage(
                DriverManager.getDriver()
        );
        registerPage.abrirPaginaCadastro();
    }

    @When("preencho todos os campos obrigatórios")
    public void preencho_todos_os_campos_obrigatórios() {
        System.out.println("Hello 2");

    }

    @When("clico no botão Registrar")
    public void clico_no_botão_registrar() {
        System.out.println("Hello 3");

    }

    @Then("o cadastro deve ser realizado com sucesso")
    public void o_cadastro_deve_ser_realizado_com_sucesso() {
        System.out.println("Hello 4");

    }

}
