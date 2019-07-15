package Task002.entity;

public class Student {
    public Student(String name) {
        id++;
        this.name = name;
    }
    private String name;
    private static int id=0;
    private StudentProgress progress = new StudentProgress("Сессия 1");

    public String getName() {
        return name;
    }

    public static int getId() {
        return id;
    }

    public StudentProgress getSessionProgress() {
        return progress;
    }

    public void addProgress (Grade grade){
        id++;
        progress.addGrade(grade);
    }

    public boolean delProgress (int id){
        id--;
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
