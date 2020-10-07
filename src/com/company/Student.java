package com.company;

import java.util.Arrays;

public class Student {

    interface Activity{

       String activity(String text);

    }

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();

        Activity t1 = text -> text.toUpperCase();
        Activity t2 = text -> text.toLowerCase();
        Activity t3 = text -> text.replaceAll("[aeiou]", " ");
        Activity t4 = text -> new StringBuilder(text).reverse().toString();


        System.out.println(s1.operate("Hello", t1));
        System.out.println(s2.operate("HELLO", t2));
        System.out.println(s3.operate("Hello", t3));
        System.out.println(s4.operate("Hello", t4));
        }




    public String operate(String text, Activity ac){

        return ac.activity(text);
    }

}
