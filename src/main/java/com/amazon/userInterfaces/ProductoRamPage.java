package com.amazon.userInterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ProductoRamPage extends PageObject {

    public static final Target BTN_PRODUCTO_RAM = Target.the("clic en el producto RAM").located(By.xpath("(//a[@class='a-link-normal s-no-outline'])[6]"));

}
