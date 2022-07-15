package com.oops.oops;

public class Stringdemo {
        public static void main(String[] args) {
            String a="hello";
            String b="hey";
            System.out.println(a+" "+a.hashCode());
            System.out.println(b+" "+b.hashCode());

            replace(a,b);
            System.out.println(a+" "+a.hashCode());
            System.out.println(b+" "+b.hashCode());

        }

        private static void replace(String a,  String b) {
            String temp = a;
            System.out.println(temp+" "+temp.hashCode());
            a = b;
            System.out.println(a+" "+a.hashCode());

            b = temp;
            System.out.println(b+" "+b.hashCode());

        }
}
