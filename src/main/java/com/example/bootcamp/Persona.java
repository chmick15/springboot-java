package com.example.bootcamp;

public class Persona {
    private int id;
    private String nombre;
    private int edad;
    private String fechaNacimiento;
    private String dni;
    private Persona(){
    }
    public Persona(String nombre, int edad, String fechaNacimiento, String dni){
        this.nombre = nombre;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String mostrarDatos(String nombre, String fechaNacimiento, int edad, String dni){
        return "Hola, soy " + nombre + " nací el " + fechaNacimiento
                + " por lo que tengo " + edad + " años. "
                + "Mi número de documento es el: " + dni +".";
    }

    public String esMayorDeEdad(String nombre,int edad){
        if (edad >= 18){
            return nombre + " es mayor de edad.";
        }
        return nombre + " no es mayor de edad";
    }
}
