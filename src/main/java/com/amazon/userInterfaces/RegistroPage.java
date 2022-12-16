package com.amazon.userInterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class RegistroPage extends PageObject {

    public static final Target TXT_NOMBRE = Target.the("Escribir nombre y apellido").located(By.id("ap_customer_name"));
    public static final Target TXT_CORREO = Target.the("Escribir el correo").located(By.id("ap_email"));
    public static final Target TXT_CLAVE = Target.the("Escribir la clave").located(By.id("ap_password"));
    public static final Target TXT_CONFIRMAR_CLAVE = Target.the("Escribir la clave nuevamente").located(By.id("ap_password_check"));
    public static final Target BTN_CONTINUAR = Target.the("Clic en el boton continuar").located(By.id("continue"));

}
