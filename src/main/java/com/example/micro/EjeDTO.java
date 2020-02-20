package com.example.micro;

/**
 * Created by emujica on 27/01/2020.
 */
public class EjeDTO {
    int id;
    String value;

    public EjeDTO(int i, String desc) {
        this.id=i;
        this.value=desc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
