/*
La tarea consiste en escribir dos métodos: uno para encontrar el valor máximo y otro para encontrar el valor mínimo en el arreglo.

En el método findMax, inicializar la variable max con el primer elemento del arreglo.
En el ciclo for, comparar el elemento actual con max.
Si el elemento actual es mayor, actualizar max con el elemento actual.
Devolver el valor de la variable max.
En el método findMin, inicializar la variable min con el primer elemento del arreglo.
En el ciclo for, comparar el elemento actual con min.
Si el elemento actual es menor, actualizar min con el elemento actual.
Devolver el valor de la variable min.
En el método main, llamar al método findMax con el parámetro correcto, pasar el arreglo numbers y asignar el resultado a la variable max.
En el método main, llamar al método findMin con el parámetro correcto, pasar el arreglo numbers y asignar el resultado a la variable min.

*/
package com.example;

public class Main {
    static int findMax(int[] array) {
        int max = array[0];
        for (int number : array) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    static int findMin(int[] array) {
        int min = array[0];
        for (int number : array) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] numbers = {10, -3, 25, 7, 99, -50, 0, 12};

        int max = findMax(numbers);
        int min = findMin(numbers);

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}