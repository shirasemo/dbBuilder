package Models;

import java.util.HashMap;

public class Table {
    private String name;
    private HashMap<String, Column> columnsLoc;

    public Table(String name) {
        this.name = name;
        this.columnsLoc = new HashMap<>();
    }
    public void insert(String colName, String value) {
        this.columnsLoc.get(colName).add(value);
    }
    public void update(String col, String value, boolean condition) {
        this.columnsLoc.get(col).setWhere(value, condition);
    }
    public void update(String colName, String value) {
        this.columnsLoc.get(colName).set(value);
    }
    public void update(int row, String value) {
        for (String s: this.columnsLoc.keySet()) {
            this.columnsLoc.get(s).update(row, value);
        }
    }
    public double sum(String colName) {
        return this.columnsLoc.get(colName).sum();
    }
    public void select(String colName) {
        System.out.println(this.columnsLoc.get(colName).print());
    }
    public void select() {
        for (String s: this.columnsLoc.keySet())
            System.out.println(this.columnsLoc.get(s).print());
    }
    public void select(String colName, boolean condition) {
        System.out.println(this.columnsLoc.get(colName).print(condition));
    }
    public void delete(String colName) {
        this.columnsLoc.remove(colName);
    }
    public void delete(int row) {
        for (String s: this.columnsLoc.keySet())
            this.columnsLoc.get(s).removeField(row);
    }
}
