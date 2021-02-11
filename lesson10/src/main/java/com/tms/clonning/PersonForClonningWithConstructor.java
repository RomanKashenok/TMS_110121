package com.tms.clonning;

public class PersonForClonningWithConstructor {
    private int age;
    private String name;
    private Car car;
    
    public PersonForClonningWithConstructor(int age, String name, Car car){
        this.age=age;
        this.name=name;
        this.car = car;
    }
    
    // конструктор копии
    public PersonForClonningWithConstructor(PersonForClonningWithConstructor other) {
        this(other.getAge(), other.getName(), new Car(other.getCar().getBrand(), other.getCar().getModel(), other.getCar().getColor()));
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "PersonForClonningWithConstructor{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", car=" + car +
                '}';
    }

    public static void main(String[] args) {
    	PersonForClonningWithConstructor original = new PersonForClonningWithConstructor(18, "Petya", new Car("mazda", "mx3,", "red"));
    	PersonForClonningWithConstructor clone = new PersonForClonningWithConstructor(original);
        System.out.println(original);
        System.out.println(clone);
    }
}
