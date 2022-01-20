package Models;

import java.util.HashMap;

public class Table {
    private String name;
    private HashMap<String, Column> columnsLoc;

    public Table() {
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
    public double sum(String colName) {
        return this.columnsLoc.get(colName).sum();
    }
}
