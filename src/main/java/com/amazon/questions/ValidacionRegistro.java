package com.amazon.questions;

import com.amazon.userInterfaces.MensajeRegistroPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


public class ValidacionRegistro implements Question {
    @Override
    public Boolean answeredBy(Actor actor) {
        return MensajeRegistroPage.MSJ_REGISTRO.resolveFor(actor).isVisible();
    }

    public static Question Validar() {
        return new ValidacionRegistro();
    }
}
