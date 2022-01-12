package OOP.Student;

public class ChildWithAgeLimit {
    public ChildWithAgeLimit(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private static final int MAX_AGE = 18;
    private String name;
    private int age;

    public void sayChild() {
        if (age <= MAX_AGE) {
            System.out.println("My name is: " + this.name + " and I am " + this.age + " years old");
        } else {
            System.out.println("My name is: " + this.name + " I am not child anymore");
        }
//    public static void MAX_AGE = MAX_AGE;
    }
}
