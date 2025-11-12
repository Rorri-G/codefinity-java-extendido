package com.example;

public class Main {
    public static void main(String[] args) {
        String string = "California, Texas, New York, Florida, Alaska";
        System.out.println(string.contains("Florida") ? "The string contains Florida" : "Florida is not found");
    }
}