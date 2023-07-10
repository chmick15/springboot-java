package com.example.bootcamp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class MainController {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        buscarPersona();
        Persona persona = new Persona("Nicolas",2,"01-01-2000", "abc-123");
        System.out.println(persona.getDni());
        String presentacion = persona.mostrarDatos(persona.getNombre(), persona.getFechaNacimiento(), persona.getEdad(),persona.getDni());
        System.out.println(presentacion);

        String mayor = persona.esMayorDeEdad(persona.getNombre(),persona.getEdad());
        System.out.println(mayor);

        Cuenta cuenta = new Cuenta("Nicolas", 100.00);
        String cuenta1 = cuenta.mostrar(cuenta.getTitular(), cuenta.getCantidad());
        System.out.println(cuenta1);

        System.out.println("Ingrese la cantidad de dinero que quiere sacar:");
        int dineroIngresado = teclado.nextInt();
        String ingreso = cuenta.ingresar(dineroIngresado);
        System.out.println(ingreso);
        System.out.println(cuenta.getCantidad());

        System.out.println("Ingrese la cantidad de dinero que quiere sacar:");
        int dineroRetirado = teclado.nextInt();
        String retiro = cuenta.retirar(dineroRetirado);
        System.out.println(retiro);
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
