package Task002.service;

import Task002.entity.Grade;
import Task002.entity.Student;
import Task002.entity.Subject;
import Task002.entity.Value;

public class Demo {
    public void go(){
        Student[] malina = {
                new Student("Алина Прекрасная"),
                new Student("Алексей Премудрый"),
                new Student("Антон Необычный")
        };
        malina[0].addProgress(new Grade(Subject.Mathematic, Value.Three));
        malina[0].addProgress(new Grade(Subject.Physics, Value.Three));
        malina[0].addProgress(new Grade(Subject.Russian, Value.Five));

        malina[1].addProgress(new Grade(Subject.Mathematic, Value.Five));
        malina[1].addProgress(new Grade(Subject.Physics, Value.Four));
        malina[1].addProgress(new Grade(Subject.Russian, Value.Five));

        malina[2].addProgress(new Grade(Subject.Mathematic, Value.Five));
        malina[2].addProgress(new Grade(Subject.Physics, Value.Four));
        malina[2].addProgress(new Grade(Subject.Russian, Value.Five));

        System.out.println("Оценки студента " + malina[0].getName() + ": " + malina[0].getProgress().toString());

    }
}
