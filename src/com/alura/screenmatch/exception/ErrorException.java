package com.alura.screenmatch.exception;

public class ErrorException extends RuntimeException {
    private String mensaje;
    public ErrorException(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return this.mensaje;
    }
}
