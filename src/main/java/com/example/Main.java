package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Grupo1 grupo1 = new Grupo1();
        Grupo2 grupo2 = new Grupo2();
        Grupo3 grupo3 = new Grupo3();
        Grupo4 grupo4 = new Grupo4();
        Grupo5 grupo5 = new Grupo5();
        Grupo6 grupo6 = new Grupo6();
        Grupo7 grupo7 = new Grupo7();

        int opcion = 0;
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("------------------------------------");
            System.out.println("Menú");
            System.out.println("1 para grupo 1");
            System.out.println("2 para grupo 2");
            System.out.println("3 para grupo 3");
            System.out.println("4 para grupo 4");
            System.out.println("5 para grupo 5");
            System.out.println("6 para grupo 6");
            System.out.println("7 para grupo 7");
            System.out.println("8 para grupo 8");
            System.out.println("9 para grupo 9");
            System.out.println("Selecciona una opción: ");
            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    grupo1.ejercicio1();
                case 2:
                    grupo2.ejercicio1();
                case 3:
                    grupo3.ejercicio1();
                case 4:
                    grupo4.ejercicio1();
                case 5:
                    grupo5.ejercicio1();
                case 6:
                    grupo6.ejercicio1();
                case 7:
                    grupo7.ejercicio1();

            }
            input.close();
        }

    }
}
