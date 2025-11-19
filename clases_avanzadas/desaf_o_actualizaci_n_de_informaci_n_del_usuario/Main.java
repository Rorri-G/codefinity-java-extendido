/*
Tu tarea es actualizar los campos del objeto person existente utilizando setters y getters. Cambia el name a Bob y establece el age en 27.

Implementa los métodos getName() y getAge(), así como los métodos setName() y setAge() con los parámetros y tipos apropiados.

Actualiza el nombre y la edad usando los métodos setName() y setAge().

Imprime el objeto con los campos actualizados en la consola.

*/
package com.example;

class Person {
    private String name;
    private int age;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name ;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Alice");
        person.setAge(30);

        System.out.println("Initial Person's name: " + person.getName() + ", Initial Person's age: " + person.getAge());

        person.setName("Bob");
        person.setAge(27);

        System.out.println("Updated Person's name: " + person.getName() + ", Updated Person's age: " + person.getAge());
    }
}