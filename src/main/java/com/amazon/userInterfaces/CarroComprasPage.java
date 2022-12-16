package com.amazon.userInterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class CarroComprasPage extends PageObject {

    public static final Target BTN_ELIMINAR = Target.the("clic para eliminar los prodcutos").located(By.xpath("//input[@value='Eliminar']"));
    public static final Target TXT_VALIDACION = Target.the("Mensaje para validar el test").located(By.xpath("//span[text()='US$0.00']"));
}
