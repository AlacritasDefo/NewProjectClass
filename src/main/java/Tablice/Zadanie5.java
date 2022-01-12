package Tablice;

public class Zadanie5 {
    public static void main(String[] args) {
        int[][] tablicaEmpty = new int[4][4];
        int[][] tablica = {{1, 2, 5, 18, 22}, {1, 2}, {11, 21, 99}, {1}, {2, 1, 5}};
        int[][] tablica1 = {{1, 2, 5, 18, 22}, {1, 21, 2}, {11, 21, 20, 99}, {1, 55}, {2, 1, 5}};
        int[][] tablica2 = {{1, 2, 5, 22}, {1,3, 2}, {11, 21, 99}, {1, 96}, {2, 1, 5}};

        for (int[] tab : tablica){
            for (int t : tab){
                System.out.print(t + " ");
            }
            System.out.println();

        }
        for (int i = 0; i < tablica.length; i++){

        }
    }
}
