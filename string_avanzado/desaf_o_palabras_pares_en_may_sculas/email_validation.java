/*
Implementar validación de correo electrónico eliminando los espacios en blanco al principio y al final de la cadena. Luego, verificar la validez del correo electrónico según tres condiciones: debe haber caracteres antes del símbolo @, debe haber caracteres después del @, y el dominio después del @ debe contener un punto. Si el correo electrónico es válido, extraer y mostrar el dominio (la parte después del símbolo @, excluyendo el propio símbolo).

En el método validateEmail, encontrar el índice del símbolo @ en el email.
En el método validateEmail, encontrar el índice del último punto (.) en el email.
Comprobar que el índice de @ es mayor que 0, y que el índice del punto es mayor que el índice de @ y menor que la longitud del correo electrónico menos 1.
En el método extractDomainFromEmail, encontrar el índice del símbolo @ en el email.
Extraer y devolver la subcadena que comienza desde el carácter inmediatamente después de @ en el método extractDomainFromEmail.
En el método main, eliminar los espacios en blanco al principio y al final de la cadena de correo electrónico.
    */
package com.example;

public class Main {

    static boolean validateEmail(String email) {
        int atSymbolIndex = email.indexOf("@");
        int dotIndex = email.lastIndexOf(".");
        return atSymbolIndex > 0 && dotIndex > atSymbolIndex && dotIndex < email.length() - 1;
    }

    static String extractDomainFromEmail(String email) {
        int atSymbolIndex = email.indexOf('@');
        return email.substring(atSymbolIndex + 1);
    }

    public static void main(String[] args) {
        String email = "  john.doe@example.com  ";
        email = email.trim();
        
        if (validateEmail(email)) {
            String domain = extractDomainFromEmail(email);
            System.out.println("Domain email: " + domain);
        } else {
            System.out.println("Invalid email address.");
        }
    }
}
