package com.amazon.userInterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ProductoPilasPage extends PageObject {

    public static final Target BTN_PRODUCTO_PILAS = Target.the("clic en el prodcuto pilas").located(By.xpath("(//a[@class='a-link-normal s-no-outline'])[2]"));
}
