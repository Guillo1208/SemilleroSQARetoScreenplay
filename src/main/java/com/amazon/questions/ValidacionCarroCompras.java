package com.amazon.questions;
import com.amazon.userInterfaces.CarroComprasPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidacionCarroCompras implements Question {
    @Override
    public Boolean answeredBy(Actor actor) {
        return CarroComprasPage.TXT_VALIDACION.resolveFor(actor).isVisible();
    }

    public static Question Validar() {
        return new ValidacionCarroCompras();
    }
}
