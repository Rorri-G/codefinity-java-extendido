/*
Tu tarea es sortear el modificador de acceso private y crear dos objetos con los parámetros necesarios, luego mostrarlos.

Crear dos objetos de la clase Animal: uno para un gato y otro para un perro.
Debes crear un objeto cat de la clase Animal con el tipo "Cat", nombre "Garfield" y color "Red".
También debes crear un objeto dog de la clase Animal con el tipo "Dog", nombre "Maks" y color "Black".
Crear y utilizar el constructor Animal(String type, String name, String color) para pasar los parámetros type, name y color para cada objeto.
Después de crear los objetos, utiliza System.out.println() para imprimir la información de cada animal.
    */
package com.example;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("Cat","Garfield","Red");// You should write your solution here.
        Animal dog = new Animal("Dog","Maks","Black");
         System.out.println(cat);
        System.out.println(dog);
    }
}

class Animal {
    private String type;
    private String name;
    private String color;


    public Animal(String type, String name, String color){
        this.type = type;
        this.name = name;
        this.color = color;
    }
    
    @Override
    public String toString() {
        return "Animal{" + "type='" + type + '\'' + ", name='" + name + '\'' + ", color='" + color + '\'' + '}';
    }
}