package com.amazon.exceptions;

public class ResultadoNoEsperado extends AssertionError{

    public static final String FALLO_REGISTRO = "Validar los datos ingresados";
    public static final String ERROR_COMPRA = "El proceso de comprar y eliminacionde prodcutos fallo";

    public ResultadoNoEsperado(String message) {
        super(message);
    }

    public ResultadoNoEsperado(String message, Throwable cause) {
        super(message, cause);
    }

}
