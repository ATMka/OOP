package Task002.entity;

public enum Value {
    Two("Неудовлетворительно", 2),
    Three("Удовлетворительно", 3),
    Four("Хорошо", 4),
    Five("Отлично", 5);

    Value(String nameValue, int idValue) {
        this.nameValue = nameValue;
        this.idValue = idValue;
    }

    private String nameValue;
    private int idValue;

    public String getNameValue() {
        return nameValue;
    }

    public int getIdValue() {
        return idValue;
    }
}
