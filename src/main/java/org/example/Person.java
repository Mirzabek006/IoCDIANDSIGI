package org.example;

public class Person {
    private String fullname;
    private Integer age;

public static Person getInstance(){
    return new Person();
}

    private Person() {
    }

    public Person(String fullname, Integer age) {
        this.fullname = fullname;
        this.age = age;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullname='" + fullname + '\'' +
                ", age=" + age +
                '}';
    }

    private void init() {
        System.out.println("Person ::::: Person bean is intialized");
    }

    private void destroy() {
        System.out.println("Person::::: Person bean is destroy  ");
    }
}
