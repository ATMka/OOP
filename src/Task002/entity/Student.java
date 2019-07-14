package Task002.entity;

public class Student {
    public Student(String name) {
        id++;
        this.name = name;
    }
    private String name;
    private static int id=0;
    private StudentProgress progress;

    public String getName() {
        return name;
    }

    public static int getId() {
        return id;
    }

    public StudentProgress getProgress() {
        return progress;
    }

    public boolean addProgress (Grade grade){
        return progress.addGrade(grade);
    }



    public boolean delProgress (int id){
        return progress.delGrade(id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", progress=" + progress.toString() +
                '}';
    }
}
