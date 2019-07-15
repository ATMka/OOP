package Task002.repository;

import Task002.entity.Student;

public class Group {

    public Group(String name, int size) {
        id++;
        this.name = name;
        this.students = new Student[size];
    }

    private int id=0;
    private String name;
    private Student[] students;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Student[] getStudents() {
        return students;
    }

    public boolean addStudentinGroup(Student student){
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null){
                students[i] = student;
                id++;
                return true;
            }
        }
        return false;
    }

    public boolean delStudentFromGroup(int id){
        if (id < students.length && students[id] != null) {
            students[id] = null;
            id--;
            return true;
        }
        return false;
    }


}
