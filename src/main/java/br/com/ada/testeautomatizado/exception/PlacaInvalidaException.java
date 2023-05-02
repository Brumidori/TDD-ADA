package br.com.ada.testeautomatizado.exception;

public class PlacaInvalidaException extends RuntimeException {

    public PlacaInvalidaException(String s){
        super("Placa invalida!");
    }

}
