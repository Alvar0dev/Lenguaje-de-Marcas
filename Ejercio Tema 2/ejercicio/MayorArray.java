package ejercicio;

import java.util.Scanner;

class MayorArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {

            System.out.println("Introduce numero para guardar en la posicion " + i + " del array");
            int entrada = Integer.parseInt(scanner.nextLine());
            array[i] = entrada;

        }

        // Establezco el array para el minimo y el maximo solamente se establezcan desde
        // los numeros introducidos

        int pequeño = array[0];
        int grande = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > grande) {
                grande = array[i];
            }

            if (array[i] < pequeño) {
                pequeño = array[i];
            }
        }

        System.out.println("Perfecto ya has registrado todos los numeros \n\n");

        System.out.println("el numero mas grande del array es " + grande + " y el mas pequeño es " + pequeño);

        scanner.close();

    }
}