package com.in28minutes.spring.basics.springin5steps;

public class Ci {

    String name;
    int id;

    public Ci(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Ci{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
