package Task002.service;

import Task002.entity.Grade;
import Task002.entity.Student;
import Task002.entity.Subject;
import Task002.entity.Value;
import Task002.repository.Group;

public class Demo {
    public void go(){
        Group group1 = new Group("Малина", 3);

        group1.addStudentinGroup(new Student("Алина Прекрасная"));
        group1.addStudentinGroup(new Student("Алексей Премудрый"));
        group1.addStudentinGroup(new Student("Антон Необычный"));

        group1.getStudents()[0].addProgress(new Grade(Subject.Mathematic, Value.Two));
        group1.getStudents()[0].addProgress(new Grade(Subject.Physics, Value.Three));
        group1.getStudents()[0].addProgress(new Grade(Subject.Russian, Value.Five));

        group1.getStudents()[1].addProgress(new Grade(Subject.Mathematic, Value.Five));
        group1.getStudents()[1].addProgress(new Grade(Subject.Physics, Value.Four));
        group1.getStudents()[1].addProgress(new Grade(Subject.Russian, Value.Two));

        group1.getStudents()[2].addProgress(new Grade(Subject.Mathematic, Value.Five));
        group1.getStudents()[2].addProgress(new Grade(Subject.Physics, Value.Five));
        group1.getStudents()[2].addProgress(new Grade(Subject.Russian, Value.Five));

        for (int i = 0; i < group1.getStudents().length; i++) {
            System.out.println("Оценки студента " + group1.getStudents()[i].getName() + ": " + group1.getStudents()[i].getSessionProgress().toString());
            System.out.println("Средний балл: " + MarksCalculationService.сalcAverMarkStud(group1.getStudents()[i]));
            System.out.println();
        }

        System.out.println("Средний балл группы " + group1.getName() + ": " + MarksCalculationService.calcAverMarkGroup(group1));
        System.out.println("Количество отличников в группе " + group1.getName() + ": " + MarksCalculationService.findExcellentStudents(group1));
        System.out.println("Количество двоечников в группе " + group1.getName() + ": " + MarksCalculationService.findBadStudens(group1));

    }
}
