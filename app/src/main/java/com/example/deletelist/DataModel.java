package com.example.deletelist;

public class DataModel {

    String name;
    Boolean delete;

    public DataModel(String name, Boolean delete) {
        this.name = name;
        this.delete = delete;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getDelete() {
        return delete;
    }

    public void setDelete(Boolean delete) {
        this.delete = delete;
    }
}
