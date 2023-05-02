package br.com.ada.testeautomatizado.util;

import br.com.ada.testeautomatizado.exception.PlacaInvalidaException;
import org.springframework.stereotype.Component;

@Component
public class ValidacaoPlaca {
    public boolean isPlacaValida(String placa) throws PlacaInvalidaException {
        if (placa == null || placa.isEmpty()) {
            throw new PlacaInvalidaException("Placa não pode ser nula ou vazia");
        }

        String regex = "[A-Z]{3}-\\d{4}";

        if (!placa.matches(regex)) {
            throw new PlacaInvalidaException("Placa inválida");
        }

        return true;
    }
}
