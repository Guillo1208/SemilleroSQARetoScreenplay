package com.amazon.tasks;

import com.amazon.utils.Datos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.io.IOException;

import static com.amazon.userInterfaces.InicioPage.*;
import static com.amazon.userInterfaces.CrearCuentaPage.*;
import static com.amazon.userInterfaces.RegistroPage.*;
import static com.amazon.userInterfaces.MensajeRegistroPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Registro implements Task {

    Datos datos = new Datos();

    @Override
    public <T extends Actor> void performAs(T actor) {

        WaitUntil.the(BTN_IDENTIFICATE, WebElementStateMatchers.isClickable()).forNoMoreThan(10).seconds();
        try {
            actor.attemptsTo(
                    Click.on(BTN_IDENTIFICATE),
                    Click.on(BTN_CREAR_CUENTA),
                    Enter.theValue(datos.leerDatosExcel("Data.xlsx","Registro",1,0)).into(TXT_NOMBRE),
                    Enter.theValue(datos.leerDatosExcel("Data.xlsx","Registro",1,1)).into(TXT_CORREO),
                    Enter.theValue(datos.leerDatosExcel("Data.xlsx","Registro",1,2)).into(TXT_CLAVE),
                    Enter.theValue(datos.leerDatosExcel("Data.xlsx","Registro",1,2)).into(TXT_CONFIRMAR_CLAVE),
                    Click.on(BTN_CONTINUAR),
                    //Esta espera es para que ingrese el codigo de verificacion y clic en confirmar
                    WaitUntil.the(MSJ_REGISTRO, WebElementStateMatchers.isVisible()).forNoMoreThan(120).seconds()
            );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static Registro informacion(){
        return instrumented (Registro.class);
    }

}
