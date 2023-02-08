package r6.siege.model;

import lombok.Data;

@Data
public class Map {

    private long id;
    private String name;

    public Map() {
        this.name = "Default";
    }

    public Map(String name) {
        this.name = name;
    }
}
