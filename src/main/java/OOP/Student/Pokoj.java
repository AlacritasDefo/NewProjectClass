package OOP.Student;

public class Pokoj {
    public Pokoj(double height, double lenght, int width) {
        this.height = height;
        this.lenght = lenght;
        this.width = width;
    }

    public Pokoj(int width, double lenght) {
        this.width = width;
        this.lenght = lenght;
        this.height = 2.4;
    }

    private double height;
    private double lenght;
    private double width;

    public void sayRound() {
        System.out.println("Pole powierzchni pokoju wynosi: " + this.lenght * this.width + " oraz objętość pokoju wynosi: " + this.width * this.lenght * this.height);
    }
}
