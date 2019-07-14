package Task002.entity;

import Task002.service.StudentProgressImpl;

public class StudentProgress implements StudentProgressImpl {
    public StudentProgress(String name) {
        this.name = name;
    }

    private Grade[] Progress;
    private String name;

    public Grade[] getProgress() {
        return Progress;
    }

    public String getName() {
        return name;
    }
    
    @Override
    public boolean addGrade(Grade grade){
        for (:
             ) {
            
        }
    }
}
