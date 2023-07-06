package com.example.bootcamp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class MainController {
    public static void main(String[] args) {
        buscarPersona();
    }


    @GetMapping("/hola")
    public static String hola(){
        return "Hello World";
    }

    @GetMapping("/generate-password")
    public static String generatePassword(){
        String password = "Nw82nf";
        double firstAleatorio = Math.random() * 1000;
        long firstNumAleatorio = Math.round(firstAleatorio);
        double secondAleatorio = Math.random() * 1000;
        long secondNumAleatorio = Math.round(secondAleatorio);
        String nuevoPassword = firstNumAleatorio + password + secondNumAleatorio;
        return nuevoPassword;
    }


    private static void buscarPersona(){
        Scanner teclado = new Scanner(System.in);
    /*
        String[] personas = new String[5];
        personas[0] = "Nicolas Michel";
        personas[1] = "Melitza Lopez";
        personas[2] = "Eduardo Persona";
        personas[3] = "Miguel Romero";
        personas[4] = "Juan Melba";
        */
        String[] personas = {"Nicolas Pierret", "Melitzouche Gavire", "Michel Merlin", "Jessica Albahaca"};

        System.out.println("Busca un nombre: ");
        String busqueda = teclado.nextLine();
        boolean personaEncontrada = false;
                /*
        for (int i = 0; i < personas.length; i++) {
            if (personas[i].toLowerCase().contains(busqueda.toLowerCase())){
                System.out.println(personas[i]);
            }
        }
        */
        for (String persona : personas) {
            if (persona.toLowerCase().contains(busqueda.toLowerCase())) {
                System.out.println("La persona buscada puede ser: " + persona);
                personaEncontrada = true;
            }
        }
        if(!personaEncontrada){
            System.out.println("No existe esa persona en el array dado");
        }
    }



}
