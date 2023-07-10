package com.example.bootcamp;

public class Cuenta {
    private String titular;
    private double cantidad;

    public Cuenta(){
    }

    public Cuenta(String titular, double cantidad){
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public String getTitular(){
        return titular;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public double getCantidad(){
        return cantidad;
    }
    public void setCantidad(double cantidad){
        this.cantidad = cantidad;
    }

    public String mostrar(String titular, double cantidad){
        return "La persona " + titular + " tiene "
                + cantidad + "€ en su cuenta.";
    }

    public String ingresar(int dinero){
        setCantidad(cantidad + dinero);
        if(dinero <= 0){
            return "La cantidad ingresada no puede ser inferior o igual a 0€";
        }else {
            return "Ahora tienes " + cantidad + "€ en tu cuenta.";
        }
    }

    public String retirar(int dinero){
        setCantidad(cantidad - dinero);
        if (dinero<=0){
            return "No puedes retirar menos de 0€ !";
        }
        return "Has retirado " + dinero + "€."
                + "Tu nuevo sueldo es de: " + cantidad + "€.";
    }
}
