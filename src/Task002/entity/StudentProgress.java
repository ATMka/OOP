package Task002.entity;

import Task002.service.StudentProgressImpl;

import java.util.Arrays;

public class StudentProgress implements StudentProgressImpl {
    public StudentProgress(String name) {
        this.name = name;
        this.progress = new Grade[3];
    }

    private Grade[] progress;
    private String name;

    public Grade[] getProgress() {
        return progress;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean addGrade(Grade grade){
        for (int i = 0; i < progress.length; i++) {
            if (progress[i] == null){
                progress[i] = grade;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delGrade(int id){
            if (id < progress.length && progress[id] != null) {
                progress[id] = null;
                return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return name + ": " + Arrays.toString(progress);
    }
}
