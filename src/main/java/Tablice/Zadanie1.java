package Tablice;

public class Zadanie1 {
    public static void main(String[] args) {
        int [] tablica = {2, 5, 1, 6, 7, 1, 8, 3, 87, 12, 1235};
        boolean[] tablica1 = {true, false, true, true};
        String[] tablica2 = {"asdf", "qwerty", "uiop"};

        System.out.println("Tablica 1 ma rozmiar: "+ tablica.length);

//        int element3 = tablica[3];
//        System.out.println("Element o indeksie 3 z pierwszej tablicy" + element3);

        System.out.println(tablica);

        for (int i = 0; i < tablica.length; i++){
            System.out.println(tablica[i] + " ");
        }
    for (int element : tablica){
        System.out.println(element);
    }

    }
}
