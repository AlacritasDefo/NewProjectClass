package Zadanie1;

import java.util.Locale;

public class Zadanie1 {
    public static void main(String[] args) {

        String testString = "Lorem Ipsum Dolor";
        String otherString = "Sit Amet";
        System.out.println("Długość tekstu: " + testString.length());
        System.out.println("Czy napisy są takie same?: " + (testString.equals(otherString)));
        System.out.println("Litera o indeksie 4 to: " + testString.charAt(4));
        System.out.println("Połączone napisy: " + testString.concat(otherString));
        System.out.println("Napis małymi literami: " + testString.toLowerCase() + " " + otherString.toLowerCase());
        System.out.println("Napis wielkimi literami: " + testString.toUpperCase() + " " + otherString.toUpperCase());
        System.out.println("Napis powtorzony 3 razy: " + testString.repeat(3));
        System.out.println("Czy pierwszy napis konczy sie litera r? " + testString.endsWith("r"));
        System.out.println("Czy drugi napis konczy sie litera r? " + otherString.endsWith("r"));
        System.out.println("Napis z zamienionym m na X: " + testString.replace("m", "x"));
    }
}
