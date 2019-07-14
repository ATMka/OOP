package Task002.entity;

public enum Subject {
    Mathematic("Математика",1),
    Russian("Русский язык",2),
    Physics("Физика",3);

    Subject(String nameSubject, int idSubject) {
        this.nameSubject = nameSubject;
        this.idSubject = idSubject;
    }

    private String nameSubject;
    private int idSubject;

    public String getNameSubject() {
        return nameSubject;
    }

    public int getIdSubject() {
        return idSubject;
    }
}
