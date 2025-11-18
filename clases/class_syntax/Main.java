/*
Alice quiere encontrar un amigo dentro de un rango de edad específico (25 - 30, inclusive). Debes escribir un programa que verifique si Bob cumple con los criterios de Alice's. Si la edad de Bob's está dentro del rango especificado, el programa debe devolver true; de lo contrario, debe devolver false.

En el método main, debes pasar el objeto correcto como primer parámetro al método findFriend.
En el método findFriend, compara la age del objeto pasado con el rango de edad especificado (25 - 30).
Si el objeto está dentro del rango de edad, devuelve true; de lo contrario, devuelve false.
Para mostrar el resultado en pantalla, utiliza la variable foundFriend, que almacena el resultado de la búsqueda.
    */
package com.example;

public class Main {
    public static void main(String[] args) {
        Person bob = new Person();
        bob.name = "Bob";
        bob.age = 30;

        Person alice = new Person();
        alice.name = "Alice";
        alice.age = 27;

        boolean foundFriend = alice.findFriend(bob, 25, 30);

        System.out.println("Friend found: " + foundFriend);
    }
}

class Person {
    String name;
    int age;

    boolean findFriend(Person person, int minAge, int maxAge) {
        if (person.age >= minAge && person.age <= maxAge) {
            return true;
        }
        return false;
    }
}