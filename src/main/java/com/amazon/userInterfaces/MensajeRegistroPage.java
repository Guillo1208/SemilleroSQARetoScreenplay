package com.amazon.userInterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class MensajeRegistroPage extends PageObject {

    public static final Target MSJ_REGISTRO = Target.the("Mensaje registro").located(By.xpath("//span[contains(text(),'Hola ')]"));

}
