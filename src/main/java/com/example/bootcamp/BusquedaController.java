package com.example.bootcamp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BusquedaController {

    @GetMapping("/holis/{busqueda}")
    public String[] obtenerPalabrasAutocompletar(@PathVariable String busqueda){
        String [] datos = {"hola", "que", "tal", busqueda};
        return datos;
    }
}
