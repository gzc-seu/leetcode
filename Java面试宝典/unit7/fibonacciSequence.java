package TestTest.Java.unit7;

import java.util.Scanner;

public class fibonacciSequence {
    public static void main(String[] args) {
        System.out.println("请输入n：");
        Scanner cin=new Scanner(System.in);
        int n = cin.nextInt();
        System.out.println(fibonacci(n));
    }
    public static int fibonacci(int n){
        if(n==0||n==1) return n;
        else return fibonacci(n-1)+fibonacci(n-2);
    }
}
