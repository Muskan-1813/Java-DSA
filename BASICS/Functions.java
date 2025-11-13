import java.util.*;
public class Functions{
    public static void printHello(){
        System.out.println("Hello Guyz!!");
    }

    public static int sum(int a, int b){ //(Formal parameters)
        int sum = a +b;
        return sum ;
    }

    public static void swap(int a , int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("Value of a is:"+a);
        System.out.println("Value of b is:"+b);
    }

    public static int product(int a, int b){ //(Formal parameters)
        int mul = a*b;
        return mul ;
    }

    public static int factorial(int a){
        int fact =1;
        for(int i=a;i>=1;i--){
         fact=fact*i;
        }
        return fact;
    } 

    //Function Overloading
    //1. No of parameters
    public static int Sum(int A , int B ){
        return (A+B);
    }

    public static int Sum(int A , int B, int C ){
        return (A+B+C);
    }

    //2. Data types
    public static int Sum1(int A , int B ){
        return (A+B);
    }

    public static float Sum1(float A , float B ){
        return (A+B);
    }


    public static void main(String[] args) {
        printHello();
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = sum(a,b); //Arguments (Actual parameters)
        System.out.println("Sum is:"+result);
        int product = product(a,b); //Arguments (Actual parameters)
        System.out.println("Product is:"+product);
        int factorial = factorial(a); //Arguments (Actual parameters)
        System.out.println("Factorial is:"+factorial);
        swap(a,b);
        System.out.println(Sum(2,5));
        System.out.println(Sum(2,5,8));
        System.out.println(Sum1(2,5));
        System.out.println(Sum1(2.6f,.95f));

    }
}                                                     