package Task002.entity;

public enum Subject {
    Mathematic("Математика"),
    Russian("Русский язык"),
    Physics("Физика");

    Subject(String nameSubject) {
        this.nameSubject = nameSubject;
    }

    private String nameSubject;

    public String getNameSubject() {
        return nameSubject;
    }

}
