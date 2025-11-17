/*
Su tarea es escribir un método sortNamesStartWithLetterB que devuelva únicamente los nombres de este arreglo names que comienzan con la letra B.

Recorrer el arreglo y contar cuántos nombres empiezan con la letra B.
Utilizar el método charAt() para extraer la primera letra de cada nombre y compararla con la letra B.
Asegurarse de verificar la letra 'B' en mayúscula.
Después de contar, establecer el tamaño del nuevo arreglo de resultados.
Inicializar la variable de índice, que se utilizará como índice para el arreglo de resultados.
Recorrer nuevamente el arreglo y agregar los nombres que comiencen con B al nuevo arreglo.
Incrementar el índice cada vez que se agregue un elemento al nuevo arreglo.
Devolver el nuevo arreglo con los nombres.
En el método main, llamar al método sortNamesStartWithLetterB.
*/
package com.example;

public class Main {
    static String[] sortNamesStartWithLetterB(String[] names) {
        int size = 0;
        for (String name : names) {
            if (name.charAt(0) == 'B') {
                size++;
            }
        }
        String[] result = new String[size];
        int index = 0;
        for (String name : names) {
            if (name.charAt(0) == 'B') {
                result[index] = name;
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] names = {"Ben", "Bob", "Alice", "Mikel", "Brian", "Brandon", "Nick", "Ryan"};
        String[] namesStartsLetterB = sortNamesStartWithLetterB(names);
        for (String name : namesStartsLetterB) {
            System.out.print(name + " ");
        }
    }
}