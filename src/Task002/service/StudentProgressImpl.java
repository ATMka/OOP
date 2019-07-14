package Task002.service;

import Task002.entity.Grade;

public interface StudentProgressImpl {
    boolean addGrade(Grade grade);
    boolean delGrade(int id);
}
