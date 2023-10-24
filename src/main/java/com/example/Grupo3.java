package com.example;

import java.util.Scanner;

public class Grupo3 {
    public void ejercicio1() {
        Scanner input = new Scanner(System.in);
        System.out.println("Calculadora de Biología");
        System.out.print("Ingrese la cadena de ADN: ");
        String cadenaADN = input.nextLine();

        int cantidadAdenina = contarAdenina(cadenaADN);
        System.out.println("Cantidad de adenina (A) en la cadena de ADN: " + cantidadAdenina);

        input.close();
    }

    public int contarAdenina(String cadenaADN) {
        int contador = 0;

        cadenaADN = cadenaADN.toUpperCase();

        for (int i = 0; i < cadenaADN.length(); i++) {
            if (cadenaADN.charAt(i) == 'A') {
                contador++;
            }
        }

        return contador;
    }
}
