package com.amazon.userInterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class CrearCuentaPage extends PageObject {

    public static final Target BTN_CREAR_CUENTA = Target.the("clic en identificate").located(By.id("createAccountSubmit"));
}
