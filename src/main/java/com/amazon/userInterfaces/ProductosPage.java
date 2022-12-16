package com.amazon.userInterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ProductosPage extends PageObject {

    public static final Target BTN_LISTAR = Target.the("clic para desplegar la lista de categoria").located(By.id("nav-hamburger-menu"));
    public static final Target BTN_OPCION_LISTA = Target.the("clic para seleccionar categoria").located(By.xpath("//a[@data-menu-id='5']"));
    public static final Target BTN_SUBOPCION = Target.the("clic para seleccionar subopcion").located(By.xpath("//a[text()='Equipos y accesorios']"));

    public static final Target BTN_CARRO = Target.the("clic para  ir al carro de compras").located(By.xpath("//a[@href='/-/es/gp/cart/view.html?ref_=sw_gtc']"));

}
