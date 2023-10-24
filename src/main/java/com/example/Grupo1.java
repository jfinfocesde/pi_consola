package com.example;
import java.util.Scanner;
import java.text.DecimalFormat;


public class Grupo1 {
    public void ejercicio1(){
        Scanner input = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("0");

        System.out.println("Calculadora de Calorías Diarias");

        int edad = obtenerNumero(input, "Ingresa tu edad: ");
        String genero = obtenerGenero(input);
        String nivelActividad = obtenerNivelActividad(input);
        String objetivoPeso = obtenerObjetivoPeso(input);

        double factorActividad = calcularFactorActividad(nivelActividad);

        double tmb = calcularTMB(edad, genero);

        double caloriasDiarias = calcularCaloriasDiarias(tmb, factorActividad, objetivoPeso);

        System.out.println("Tu requerimiento diario de calorías es de aproximadamente: " + formato.format(caloriasDiarias) + " calorías por día.");

        input.close();
    }

    public String obtenerGenero(Scanner input) {
        String genero;
        while (true) {
            System.out.print("Ingresa tu género (Hombre/Mujer): ");
            genero = input.next().toLowerCase();
            if (genero.equals("hombre") || genero.equals("mujer")) {
                break; 
            } else {
                System.out.println("Error: Debes ingresar 'Hombre' o 'Mujer'.");
            }
        }
        return genero;
    }

    public int obtenerNumero(Scanner input, String mensaje) {
        int numero;
        while (true) {
            try {
                System.out.print(mensaje);
                numero = Integer.parseInt(input.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Error: Debes ingresar un número válido.");
            }
        }
        return numero;
    }

    public String obtenerNivelActividad(Scanner input) {
        String nivelActividad;
        while (true) {
            System.out.print("Ingresa tu nivel de actividad (sedentario, ligero, moderado, activo, muy activo): ");
            nivelActividad = input.next().toLowerCase();
            if (nivelActividad.equals("sedentario") || nivelActividad.equals("ligero") ||
                nivelActividad.equals("moderado") || nivelActividad.equals("activo") ||
                nivelActividad.equals("muy activo")) {
                break; 
            } else {
                System.out.println("Error: Nivel de actividad no válido.");
            }
        }
        return nivelActividad;
    }

    public String obtenerObjetivoPeso(Scanner input) {
        String objetivoPeso;
        while (true) {
            System.out.print("Ingresa tu objetivo de peso (perder, mantener, ganar): ");
            objetivoPeso = input.next().toLowerCase();
            if (objetivoPeso.equals("perder") || objetivoPeso.equals("mantener") || objetivoPeso.equals("ganar")) {
                break; 
            } else {
                System.out.println("Error: Objetivo de peso no válido.");
            }
        }
        return objetivoPeso;
    }

    public double calcularFactorActividad(String nivelActividad) {
        double factorActividad = 1.0;
        switch (nivelActividad) {
            case "sedentario":
                factorActividad = 1.2;
                break;
            case "ligero":
                factorActividad = 1.375;
                break;
            case "moderado":
                factorActividad = 1.55;
                break;
            case "activo":
                factorActividad = 1.725;
                break;
            case "muy activo":
                factorActividad = 1.9;
                break;
            default:
                System.out.println("Nivel de actividad no válido. Se usará el valor por defecto (Moderado).");
                factorActividad = 1.55;
                break;
        }
        return factorActividad;
    }

    public double calcularTMB(int edad, String genero) {
        double tmb;
        if (genero.equals("hombre")) {
            tmb = 88.362 + (13.397 * edad);
        } else {
            tmb = 447.593 + (9.247 * edad);
        }
        return tmb;
    }

    public double calcularCaloriasDiarias(double tmb, double factorActividad, String objetivoPeso) {
        double caloriasDiarias;
        switch (objetivoPeso) {
            case "perder":
                caloriasDiarias = tmb * factorActividad - 500; 
                break;
            case "mantener":
                caloriasDiarias = tmb * factorActividad;
                break;
            case "ganar":
                caloriasDiarias = tmb * factorActividad + 500; 
                break;
            default:
                System.out.println("Objetivo de peso no válido. Se asumirá mantener el peso.");
                caloriasDiarias = tmb * factorActividad;
                break;
        }
        return caloriasDiarias;
    }
}