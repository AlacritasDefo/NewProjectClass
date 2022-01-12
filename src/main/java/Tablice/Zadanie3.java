package Tablice;

public class Zadanie3 {
    public static void main(String[] args) {
        String imiona = "";
        String[] tablica = {"Jakub", "Marzena", "Stanisław", "Alicja", "Natalia"};
        for (String element : tablica){
            imiona += element + ", ";
        }
        System.out.println(imiona);
    }
}
