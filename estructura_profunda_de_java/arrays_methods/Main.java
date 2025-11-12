/*
Importar la biblioteca Arrays.

Ordenar el arreglo dado de elementos char.

Mostrar el arreglo ordenado en pantalla.

*/

package com.example;

// import the Arrays library here
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        char[] unsortedArray = {'y', 'e', 'e', 'p', 'w', 'c', '>', '3'};
        Arrays.sort(unsortedArray);// sort the array and output it to the console

        for (char c: unsortedArray){
            System.out.print(c + " ");
        }
    }
}