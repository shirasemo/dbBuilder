import Models.Table;

import java.util.HashMap;

public class DataBase {
    private HashMap<String, Table> tables;

    public DataBase() {
        this.tables = new HashMap<>();
    }
    public void create(String name) {
        this.tables.put(name, new Table(name));
    }
    public void remove(String name) {
        this.tables.remove(name);
    }
    public Table getTable(String name) {
        return this.tables.get(name);
    }
}
