/*
La tarea consiste en convertir cada palabra en una posición par a mayúsculas y devolver la cadena modificada.

Dividir la cadena de entrada en un arreglo de palabras utilizando el método split(" ") de la clase String.
Crear un objeto para construir la cadena de resultado paso a paso usando la clase StringBuilder.
Recorrer todos los elementos del array.
Dentro del ciclo, comprobar si el índice es par utilizando el operador de resto % con 2.
Si el índice es par, convertir la palabra correspondiente a mayúsculas usando el método toUpperCase().
Si el índice es impar, añadir la palabra tal como está.
Al finalizar el ciclo, convertir el resultado a una cadena usando el método toString().
*/
package com.example;

public class Main {
    static String makeEvenWordsUppercase(String sentence) {
        String[] array = sentence.split(" ");
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                builder.append(array[i].toUpperCase()).append(" ");
            } else {
                builder.append(array[i]).append(" ");
            }
        }
        return builder.toString();
    }

    // do not modify the code below
    public static void main(String[] args) {
        String sentence = "Green hot-dog with cucumber and mustard";
        String result = makeEvenWordsUppercase(sentence);
        System.out.println(result);
    }
    // do not modify the code above
}