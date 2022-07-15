package com.oops.oops;

public class Casting {
    public static void main(String args[])
    {
        Person p1 = new Employee();//Upcasting
        Person p2 = new Person();
        Employee e1=new Employee();
        // Employee e2 = new Person();//gives compile time error as every emp is a person but every person
        // is not an employee
        //Employee e2 = (Employee) p2; // Downcasting

        p2.print();
        p1.print();
        e1.print();
        //p1 only has name and print(); doesnt have age and salary as https://stackoverflow.com/a/12159803
    }
}


class Person{
    String name;

    Person(){}

    Person(String name){
        this.name=name;
    }

    void print(){
        System.out.println("Person");
    }
}

class Employee extends Person{
    Integer age;
    Integer salary;

    Employee(){}

    Employee(Integer age, Integer salary){
        this.age=age;
        this.salary=salary;
    }

    void print(){
        System.out.println("Employee");
    }

}

