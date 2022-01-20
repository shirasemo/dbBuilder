package Models;

import java.util.List;

public class Column {
    private String name;
    private List<Field> fields;

    protected void add(String value) {
        this.fields.add(new Field(this.fields.size(), value));
    }
    protected void set(String value) {
        for (Field field : this.fields)
            field.setValue(value);
    }

    protected void setWhere(String value, boolean condition) {
        for (Field field : this.fields)
            if (condition)
                field.setValue(value);
    }
    protected double sum() {
        double sum = 0;
        for (Field f: this.fields)
            sum += Double.parseDouble(f.getValue());
        return sum;
    }
    protected String print() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < this.fields.size() - 1; i++)
            s.append(this.fields.get(i).toString()).append(", ");
        s.append(this.fields.get(this.fields.size() - 1).toString());
        return s.toString();
    }
    protected String print(boolean condition) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < this.fields.size() - 1; i++)
            if (condition)
                s.append(this.fields.get(i).toString()).append(", ");
        if (condition)
            s.append(this.fields.get(this.fields.size() - 1).toString());
        return s.toString();
    }
}
