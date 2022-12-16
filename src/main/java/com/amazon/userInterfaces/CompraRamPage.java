package com.amazon.userInterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class CompraRamPage extends PageObject {

    public static final Target BTN_AGREGAR_RAM = Target.the("Agrega el pructo RAM al carro").located(By.id("add-to-cart-button"));
}
