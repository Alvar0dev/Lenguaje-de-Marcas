package EjerciciosJavaaleatorios;

import java.util.Scanner;

class MayorArray {

    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        int grande = 0;
        int pequeño = 99999;

        for (int i = 0; i < array.length; i++) {

            System.out.println("Introduce numero para guardar en la posicion " + i + "del array");
            int entrada = Integer.parseInt(scanner.nextLine());
            array[i] = entrada;
            if (entrada > grande) {
                grande = entrada;
            } else if (entrada < pequeño) {
                pequeño = entrada;
            }

            System.out.println("el numero mas grande del array es " + grande + " y el mas pequeño es " + pequeño);

            scanner.close();

        }

    }
}