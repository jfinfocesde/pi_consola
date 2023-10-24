package com.example;

import java.util.Scanner;

public class Grupo6 {

    public void ejercicio1() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Calculadora de dimesiones");
            System.out.print("Ingrese Largo del área: ");
            double areaLargo = sc.nextDouble();

            System.out.print("Ingrese Ancho del área: ");
            double areaAncho = sc.nextDouble();

            System.out.print("Ingrese Espesor del área: ");
            double areaEspesor = sc.nextDouble();

            // Calcula el área total
            double cubicado = areaLargo * areaAncho * areaEspesor;
            System.out.println("Cantidad necesaria de cemento: " + cubicado + " metros cúbicos");
        }
    }
}
