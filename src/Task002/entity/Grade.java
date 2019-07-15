package Task002.entity;

public class Grade {
    private Subject lesson;
    private Value value;

    public Grade(Subject lesson, Value value) {
        this.lesson = lesson;
        this.value = value;
    }

    public Subject getLesson() {
        return lesson;
    }

    public void setLesson(Subject lesson) {
        this.lesson = lesson;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }


    @Override
    public String toString() {
        return "Урок " + lesson.getNameSubject() + " - " + value.getIdValue();
    }
}
