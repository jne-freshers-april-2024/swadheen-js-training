package com.swadheen.springboot.Learn.SpringBoot;

public class Course {
    private long id;
    private String name;
    private String authro;

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", authro='" + authro + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthro() {
        return authro;
    }

    public Course(long id, String name, String authro) {
        this.id = id;
        this.name = name;
        this.authro = authro;
    }
}
