import java.util.*;
public class Conditional_Statements{
    public static void main(String args[]){
        int age=22;
        if(age>18){
            System.out.println("Adult");
        }
        else{
            System.out.println("Not Adult");
        }

        //Print argest of two
        int a=5;
        int b =10;
        if(a>=b){
            System.out.println(a);
        }
        else{
            System.out.println(b);  
        }

        //PRINT IF A NUMBER IS ODD OR EVEN
        int num =4;
        if(num%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }

        //else-if
        age = 13;
        if(age>=18){
            System.out.println("Adult");
        }
        else if(age>=13&&age<18){
            System.out.println("Teenager");
        }
        else{
            System.out.println("Child");
        }

        //Income Tax Calculator
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax=0;

        if(income<500000){
            tax=0;
        }
        else if(income>500000&&income<1000000){
            tax=(int)(income*(0.2));
        }
        else{
            tax=(int)(income*(0.3));
        }
        System.out.println("Tax is:" + (tax));

        //Check if a student is pass or fail?
        int marks = sc.nextInt();
        String ReportCard=marks>=33?"PASS":"FAIL";
        System.out.println(ReportCard);

        //Switch Statement
        int choice = 2;
        switch(choice){
            case 1:
            System.out.println("MoMOS");
            break;

            case 2:
            System.out.println("Samosa");
            break;

            case 3:
            System.out.println("Burger");
            break;

            default:
            System.out.println("Nhi hai kuchh");
        }char operator = sc.next().charAt(0);

        //CALCULATOR
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        switch(operator){
            case '+':
            System.out.println("Sum is:"+(a1+b1));

            case '-':
            System.out.println("Sum is:"+(a1-b1));

            case '*':
            System.out.println("Sum is:"+(a1*b1));

            case '/':
            System.out.println("Sum is:"+(a1/b1));

            default:
            System.out.println("Incorrect choice");


        }



    }

}