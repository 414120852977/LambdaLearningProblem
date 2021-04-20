package com.bridgelabz;
@FunctionalInterface
interface IMathFunction {
    int calculate(int a,int b);
     static void printResult(int a,int b,String function,IMathFunction fobj) {
         System.out.println("Result of function :"+function+"is"+fobj.calculate(a,b));
     }
}
public class LambdaPractice {
    public static void main(String[] args) {
        IMathFunction add = ((a, b) -> a+b);
        IMathFunction substraction = ((a, b) -> a-b);
        IMathFunction multiply = ((a, b) -> a*b);
        IMathFunction division = ((a, b) -> a/b);

        System.out.println("addition is:"+add.calculate(6,3));
        System.out.println("substraction is:"+substraction.calculate(6,3));
        System.out.println("multiplication is:"+multiply.calculate(6,3));
        System.out.println("division is:"+division.calculate(6,3));

        IMathFunction.printResult(6,3,"Addition",add);
        IMathFunction.printResult(6,3,"multiplication",multiply);
        IMathFunction.printResult(6,3,"division",division);
    }
}
