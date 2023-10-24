package com.example;

import java.util.Scanner;

public class Grupo2 {
    public void ejercicio1() {
        System.out.println("Calculadora de caida libre");
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese velocidad inicial");
        double velIni = input.nextDouble();
        System.out.println("Ingrese altura del objeto");
        double altura = input.nextDouble();
        double velocidadFinal = calcularVelocidadFinal(altura, velIni);
        if (velocidadFinal >= 28) {
            System.out.println("El coco cayó a una velocidad letal");
        } else {
            System.out.println("El coco no cayó con una velocidad letal");
        }
        double tiempo = calcularTiempo(altura);
        System.out.println("El tiempo en que cae el coco es: " + tiempo + " segundos");
        input.close();
    }

    public double calcularVelocidadFinal(double h, double velIni) {
        double VelFinal = Math.sqrt(Math.pow(velIni, 2) + 2 * 9.8 * h);
        return VelFinal;
    }

    public double calcularTiempo(double h) {
        double tiempo = Math.sqrt((2 * h) / 9.8);
        return tiempo;
    }
}
