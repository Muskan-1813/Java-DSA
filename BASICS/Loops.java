import java.util.*;
public class Loops{
    public static void main (String args[]){

        //While Loop
        int counter =0;
        while(counter<100){
            System.out.println("Hello World");
            counter++;
        }

        //Print 1 to 10
        int n =1;
        while (n<=10){
            System.out.println(n);
            n++;
        }

        //Print Sum of first i natural numbers
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        int sum=0;
        int i =1;
        while (i<=z){
            sum+=i;
            i++;
        }
        System.out.println("Sum is :"+sum);

        //FOR LOOP
        for(int count=1;count<=5;count++){
            System.out.println("HII guyz!!");
        }

        //Square pattern
        for(int r=1;r<=4;r++){
            System.out.println("****");
        }

        //Print reverse of a number
        int num = sc.nextInt();
        int r=0;
        int rev=0;
        int n1 =0;
        while(num!=0){
             r=num%10;
             rev=(rev*10)+r;
             num=num/10;
        }
        System.out.println("Reverse is:"+rev);

        //DO-WHILE LOOP
        int number=1;
        do { 
            System.err.println(number);
            number++;
        } while (number<10);

        //BREAK Keyword
        do { 
            int nn= sc.nextInt();
            if(nn%5==0){
                break;
            }
            System.out.println(nn);
        } while (true);

        //Continue
        for(int s=1;s<=10;s++){
            if(s==3){
                break;
            }
            System.out.println(s);
        }
    }
}