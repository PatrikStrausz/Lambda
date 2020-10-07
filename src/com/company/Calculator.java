package com.company;

public class Calculator {
     interface IntegerMath {

        int operation(int a, int b);
    }


    public static void main(String[] args) {

        Calculator myApp = new Calculator();
        IntegerMath addition = (a, b) -> a+b;
        IntegerMath subtraction = (a,b) -> a-b;
        IntegerMath diagonale = (a,b) -> (int) Math.sqrt(a*a+b*b);

        System.out.println(myApp.operateBinary(40,2,addition));
        System.out.println(myApp.operateBinary(20,10, subtraction));
        System.out.println(myApp.operateBinary(5,4, diagonale));


    }

    public int operateBinary(int a, int b, IntegerMath op){
        return  op.operation(a,b);
    }

}
