package Models;

public class Field {
    private int row;
    private String value;

    public Field(int row, String value) {
        this.row = row;
        this.value = value;
    }

    public int getRow() {
        return row;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
