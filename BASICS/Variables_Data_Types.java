import java.util.*;
public class Variables_Data_Types{
    public static void main(String args[]){
        System.out.println("Hello World!");
        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");

        //VARIABLES IN JAVA
        byte b =8;                //1 byte[-128 to 127]
        char ch = 'a';            //2 byte
        boolean var = true;       //1 byte
        float price = 10.0f;      //4 byte
        int number =87;           //4 byte
        short n =240;             //2 byte
    
    //SUM of Two numbers
        int a =10;
        int c = 5;
        int sum = a+c;
        System.out.println(sum);

        //INPUTS IN JAVA
        Scanner sc = new Scanner(System.in);
        // String input = sc.next();
        // System.out.println(input);

        String name = sc.nextLine();
        System.out.println(name);
        
        //Sum
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int SUM = number1+number2;
        System.out.println(SUM);

        //Product
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int prod =n1*n2;
        System.out.println(prod);

        //AREA OF CIRCLE
        float rad = sc.nextFloat();
        float area =3.14f*rad*rad;
        System.out.println(area);

    
    }          
}