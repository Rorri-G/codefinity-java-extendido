/*
Tu tarea es escribir un método toString() que muestre toda la información sobre el loro.

En el método toString(), utiliza la palabra clave return para especificar la salida del método.
Comienza creando una cadena, ya sea usando concatenación o formato de cadena, empezando con algo como Parrot{.
Agrega cada campo a la cadena, usando + para la concatenación, e incluye tanto el nombre del campo como su valor (por ejemplo, "name='" + name + "'").
Separa cada campo con una coma y un espacio para mejorar la legibilidad.
Termina la cadena con una llave de cierre } para representar correctamente el objeto.
Finalmente, retorna la cadena formateada desde el método toString().
    */
package com.example;

class Parrot {
    String name;
    int age;
    String color;
    boolean canParrotTalk;

   @Override
    public String toString() {
        return "Parrot { " +
                "name='" + name + "'" +
                ", age=" + age +
                ", color='" + color + "'" +
                ", canParrotTalk=" + canParrotTalk +'}';
    }

    public Parrot(String name, int age, String color, boolean canParrotTalk) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.canParrotTalk = canParrotTalk;
    }
}

public class Main {
    public static void main(String[] args) {
        Parrot bubba = new Parrot("Bubba", 1, "Yellow", true);
        Parrot rio = new Parrot("Rio", 3, "Blue", false);
        Parrot ollie = new Parrot("Ollie", 2, "Red", true);
        System.out.println(bubba);
        System.out.println(rio);
        System.out.println(ollie);
    }
}