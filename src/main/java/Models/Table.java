package Models;

import java.util.HashMap;

public class Table {
    private String name;
    private HashMap<String, Column> columns;

    public Table(String name) {
        this.name = name;
        this.columns = new HashMap<>();
    }
    public void addColumn(String name) {
        this.columns.put(name, new Column(name));
    }
    public void insert(String colName, String value) {
        this.columns.get(colName).add(value);
    }
    public void update(String col, String value, boolean condition) {
        this.columns.get(col).setWhere(value, condition);
    }
    public void update(String colName, String value) {
        this.columns.get(colName).set(value);
    }
    public void update(int row, String value) {
        for (String s: this.columns.keySet())
            this.columns.get(s).update(row, value);
    }
    public double sum(String colName) {
        return this.columns.get(colName).sum();
    }
    public void select(String colName) {
        System.out.println(this.columns.get(colName).print());
    }
    public void select() {
        for (String s: this.columns.keySet())
            System.out.println(this.columns.get(s).print());
    }
    public void select(String colName, boolean condition) {
        System.out.println(this.columns.get(colName).print(condition));
    }
    public void delete(String colName) {
        this.columns.remove(colName);
    }
    public void delete(int row) {
        for (String s: this.columns.keySet())
            this.columns.get(s).removeField(row);
    }
}
