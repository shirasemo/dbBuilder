import Models.Table;

import java.util.HashMap;

public class DataBase {
    private String name;
    private HashMap<String, Table> tables;

    public DataBase(String name) {
        this.name = name;
        this.tables = new HashMap<>();
    }
    public void create(String name) {
        this.tables.put(name, new Table(name));
    }
    public void remove(String name) {
        this.tables.remove(name);
    }
}
