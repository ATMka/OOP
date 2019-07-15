package Task002.service;

import Task002.entity.Grade;
import Task002.entity.Student;
import Task002.entity.Value;
import Task002.repository.Group;

public class MarksCalculationService {
    public static double сalcAverMarkStud(Student student){
        double result = 0;
        for (Grade grade: student.getSessionProgress().getProgress()
             ) {
            result += grade.getValue().getIdValue();
        }
        return result / student.getSessionProgress().getProgress().length;
    }

    public static double calcAverMarkGroup(Group group){
        double result = 0;
        for (Student student: group.getStudents()
             ) {
            result+=MarksCalculationService.сalcAverMarkStud(student);
        }
        return result / group.getStudents().length;
    }

    public static int findExcellentStudents(Group group){
        int result = 0;
        for(Student student: group.getStudents()){
            if (IsExcellentStudent(student)){
                result++;
            }
        }
        return result;
    }

    public static boolean IsExcellentStudent(Student student){
        return MarksCalculationService.сalcAverMarkStud(student) == Value.Five.getIdValue();
    }

    public static boolean IsBadStudent(Student student){
        boolean result = false;
        for (Grade grade: student.getSessionProgress().getProgress()
             ) {
            if(grade.getValue() == Value.Two){
                result = true;
            }
        }
        return result;
    }

    public static int findBadStudens(Group group){
        int result = 0;
        for (Student student: group.getStudents()
             ) {
            if(IsBadStudent(student)){
                result++;
            }
        }
        return result;
    }
}
