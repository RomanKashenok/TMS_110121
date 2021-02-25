package com.tms.figures;

public class Circle implements Shape {

    private int id;
    private String name;

    public Circle(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        if (id != circle.id) return false;
        return name != null ? name.equals(circle.name) : circle.name == null;
    }

    @Override
    public int hashCode() {
        return 5;
    }

    @Override
    public String toString() {
        return getName() + " " + getId() + " " + super.toString();
    }
}
