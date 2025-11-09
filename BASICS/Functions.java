import java.util.*;
public class Functions{
    public static void printHello(){
        System.out.println("Hello Guyz!!");
    }

    public static int sum(int a, int b){
        int sum = a +b;
        return sum ;
    }
    public static void main(String[] args) {
        printHello();
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = sum(a,b);
        System.out.println("Sum is:"+result);

    }
}                                                     