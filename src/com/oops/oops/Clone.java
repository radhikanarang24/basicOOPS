package com.oops.oops;

import java.util.ArrayList;
import java.util.List;

public class Clone {

    public static void main(String[] args) throws CloneNotSupportedException {
        Object o = new Object();
        Address address=new Address("Bangalore");
        List<Address> addresses=new ArrayList<>();
        addresses.add(address);
        Person A=new Person(25,"Radhika",addresses);
        Person B= (Person) A.clone();
        System.out.println(B.age+" "+B.name+" "+B.addresses.size());
        System.out.println("A and B are same? "+A.equals(B));
        System.out.println("A and B addresses are same? ");
        System.out.println(A.addresses==B.addresses);
        System.out.println("A and B are same? ");
        System.out.println(A==B);
    }

    static class Person implements Cloneable {
        Integer age;
        String name;
        List<Address> addresses;

        Person(int age,String name,List<Address> addresses)
        {
            this.age=age;
            this.name=name;
            this.addresses=addresses;
        }
        Person(int age,String name)
        {
            this.age=age;
            this.name=name;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }

    static class Address{
        String city;
        Address(String city)
        {
            this.city=city;
        }
    }
}


