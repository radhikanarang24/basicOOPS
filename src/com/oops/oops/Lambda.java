package com.oops.oops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda {
    public static void main(String args[])
    {

        Greeting greeting=msg -> System.out.println("hello"+msg);
        greeting.printMesg("Radhika");

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        //find a value
        System.out.println("find a value");
        Integer a = list.stream().filter(ele->ele==2).findFirst().orElse(0);
        System.out.println(a);

        //filter values
        System.out.println("filter values");
        List<Integer> arr = list.stream().filter(ele->(ele==2 || ele==3)).findAny().stream().collect(Collectors.toList());
        for(int i=0;i<arr.size();i++)
        {
            System.out.println(arr.get(i));
        }

        //map to different list
        System.out.println("map to different list");
        List<Integer> mappedList = list.stream().map(ele->ele*ele).collect(Collectors.toList());
        //looping
        mappedList.forEach(ele->System.out.println(ele));

        //convert comma separated list
        System.out.println("convert comma separated list");
        List<String> newList = Arrays.asList("1,2,3,4".split(","));
        newList.forEach(s->System.out.println(s));
    }
}


interface Greeting{//functional interface - interface with one method only
    void printMesg(String msg);
}