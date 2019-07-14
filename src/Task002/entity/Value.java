package Task002.entity;

public enum Value {
    Two(2),
    Three(3),
    Four(4),
    Five(5);

    Value(int idValue) {
        this.idValue = idValue;
    }

    private int idValue;

    public int getIdValue() {
        return idValue;
    }
}
