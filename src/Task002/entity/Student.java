package Task002.entity;

public class Student {
    public Student(String name) {
        id++;
        this.name = name;
    }
    private String name;
    private static int id=0;
    private StudentProgress progress;


}
