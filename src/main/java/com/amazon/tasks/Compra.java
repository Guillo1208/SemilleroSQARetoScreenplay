package com.amazon.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static com.amazon.userInterfaces.InicioPage.*;
import static com.amazon.userInterfaces.ProductoPilasPage.*;
import static com.amazon.userInterfaces.ProductoRamPage.*;
import static com.amazon.userInterfaces.CompraRamPage.*;
import static com.amazon.userInterfaces.ProductosPage.*;
import static com.amazon.userInterfaces.CarroComprasPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Compra implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {


            actor.attemptsTo(
                    Click.on(BTN_ELECTRONICO),
                    WaitUntil.the(BTN_PRODUCTO_PILAS, WebElementStateMatchers.isClickable()).forNoMoreThan(5).seconds(),
                    Click.on(BTN_PRODUCTO_PILAS),
                    //Esta espera es para seleccionar la cantidad del producto pila y dar clic en añadir al carro
                    WaitUntil.the(BTN_LISTAR, WebElementStateMatchers.isClickable()).forNoMoreThan(20).seconds(),
                    Click.on(BTN_LISTAR),
                    Click.on(BTN_OPCION_LISTA),
                    Click.on(BTN_SUBOPCION),
                    WaitUntil.the(BTN_PRODUCTO_RAM, WebElementStateMatchers.isClickable()).forNoMoreThan(5).seconds(),
                    Click.on(BTN_PRODUCTO_RAM),
                    Click.on(BTN_AGREGAR_RAM),
                    Click.on(BTN_CARRO),
                    Click.on(BTN_ELIMINAR),
                    Click.on(BTN_ELIMINAR)


            );


    }

    public static Compra carroCompra(){
        return instrumented (Compra.class);
    }
}
