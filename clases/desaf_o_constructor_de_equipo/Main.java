/*
Aquí tienes una clase llamada Team escrita para ti. Tu tarea es escribir un constructor que reciba los 4 parámetros e inicialice los 4 campos. Por favor, no modifiques la clase Main ni sus métodos.

Escribe un constructor con 4 parámetros: name, sport, yearFounded y city.
Inicializa el campo name con el valor del parámetro name.
Inicializa el campo sport con el valor del parámetro sport.
Inicializa el campo yearFounded con el valor del parámetro yearFounded.
Inicializa el campo city con el valor del parámetro city.

    */
package com.example;

class Team {
    String name;
    String sport;
    int yearFounded;
    String city;

    public Team(String name, String sport, int yearFounded, String city) {
        this.name = name;
        this.sport = sport;
        this.yearFounded = yearFounded;
        this.city = city;
    }

    public void displayTeamInfo() {
        System.out.println("Team: " + name);
        System.out.println("Sport: " + sport);
        System.out.println("Year Founded: " + yearFounded);
        System.out.println("City: " + city);
    }
}

public class Main {
    public static void main(String[] args) {
        Team team = new Team("Lakers", "Basketball", 1947, "Los Angeles");
        team.displayTeamInfo();
    }
}