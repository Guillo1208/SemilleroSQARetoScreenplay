package com.amazon.userInterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.amazon.com/-/es")

public class InicioPage extends PageObject {

    public static final Target BTN_IDENTIFICATE = Target.the("clic en identificate").located(By.id("nav-link-accountList"));
    public static final Target BTN_ELECTRONICO = Target.the("clic en categoria electronica").located(By.xpath("(//img[@alt='Electrónicos'])[1]"));
}
