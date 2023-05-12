package br.com.devops.modules;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Collections;
import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
public class Catraca {
    private Map<String, Evento> eventos;
    public Map<String, Evento> getEventos() {
        return Collections.unmodifiableMap(eventos);
    }

    public void executarEvento(){

    }
}
