package OOP.Student;

public class Pies {


    public Pies(String rasa, int age, String gender) {
        this.rasa = rasa;
        this.age = age;
        this.gender = gender;


    }


    private String rasa;
    private int age;
    private String gender;

    public void sayPies() {
        System.out.println("Cześć, Jestem " + this.rasa + " i mam" + this.age + " lat i jestem " + this.gender +" Woof!");
    }
}
