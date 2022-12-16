package com.amazon.stepDefinitions;

import com.amazon.exceptions.ResultadoNoEsperado;
import com.amazon.questions.ValidacionRegistro;
import com.amazon.tasks.Registro;
import com.amazon.userInterfaces.InicioPage;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class RegistroStepDefinition {

    @Managed(driver="chrome")
    private WebDriver navegador;
    private Actor guillermo = Actor.named("guillermo");

    private InicioPage inicioPage = new InicioPage();

    @Before
    public void configuracion(){
        guillermo.can(BrowseTheWeb.with(navegador));
    }


    @Dado("^el usuario se encuentra en la amazon$")
    public void elUsuarioSeEncuentraEnLaAmazon() {
        guillermo.wasAbleTo(Open.browserOn(inicioPage));
    }


    @Cuando("^el usuario diligencia el formulario$")
    public void elUsuarioDiligenciaElFormulario() {
        guillermo.attemptsTo(
                Registro.informacion()

        );
    }

    @Entonces("^el usuario observara pagina de perfil$")
    public void elUsuarioObservaraPaginaDePerfil() {
        guillermo.should(seeThat(ValidacionRegistro.Validar(), Matchers.equalTo(true)).
                orComplainWith(ResultadoNoEsperado.class,ResultadoNoEsperado.FALLO_REGISTRO));
    }


}
