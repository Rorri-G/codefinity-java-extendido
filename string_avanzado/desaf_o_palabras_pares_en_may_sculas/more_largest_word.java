/*
Escribir un programa que encuentre la palabra más larga en una cadena y la muestre junto con el índice de su primera aparición.

El programa debe dividir la cadena en palabras y verificar la longitud de cada una.
Para cada palabra, comparar su longitud con la de la palabra más larga encontrada hasta el momento.
Si la palabra actual es más larga que la anterior, actualizar la palabra más larga y su índice.
Finalmente, mostrar el resultado en el formato: "Longest word: [word] at index [index]", donde [word] es la palabra más larga y [index] es el índice de su primera aparición en la cadena.

*/
package com.example;

public class Main {
    public static void main(String[] args) {
        String sentence = "I love programming in Java";
        String result = findLongestWord(sentence);
        System.out.println(result);
    }

    public static String findLongestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longestWord = "";
        int longestIndex = -1;

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
                longestIndex = sentence.indexOf(word);
            }
        }

        return "Longest word: \"" + longestWord + "\" at index " + longestIndex;
    }
}
