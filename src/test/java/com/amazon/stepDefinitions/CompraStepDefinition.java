package com.amazon.stepDefinitions;

import com.amazon.exceptions.ResultadoNoEsperado;
import com.amazon.questions.ValidacionCarroCompras;
import com.amazon.tasks.Compra;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class CompraStepDefinition {


    @Managed(driver="chrome")
    private WebDriver navegador;
    private Actor guillermo = Actor.named("guillermo");


    @Before
    public void configuracion(){
        guillermo.can(BrowseTheWeb.with(navegador));
    }


    @Cuando("^el usuario agrega productos al carro de compra luego elimina productos$")
    public void elUsuarioAgregaProductosAlCarroDeCompraLuegoEliminaProductos() {
        guillermo.attemptsTo(
                Compra.carroCompra()
        );

    }

    @Entonces("^el usuario observara su carro de compra vacio$")
    public void elUsuarioObservaraSuCarroDeCompraVacio() {
        guillermo.should(seeThat(ValidacionCarroCompras.Validar(), Matchers.equalTo(true)).
                orComplainWith(ResultadoNoEsperado.class,ResultadoNoEsperado.ERROR_COMPRA));
    }

}
