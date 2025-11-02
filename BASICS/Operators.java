public class Operators{
    public static void main (String args[]){
          int A = 10;
          int B = 5;
        System.out.println("add="+(A+B));
        System.out.println("sub="+(A-B));
        System.out.println("mul="+(A*B));
        System.out.println("div="+(A/B));

        //INCREMENT OPERATOR
        int a = 5;
        int b =++a;
        System.out.println(a);
        System.out.println(b);

        int a1 = 5;
        int b1 =a1++;
        System.out.println(a1);
        System.out.println(b1);

        //DECREMENT OPERATOR
        int a2 = 5;
        int b2 =--a2;
        System.out.println(a2);
        System.out.println(b2);

        int a3 = 5;
        int b3 =a3--;
        System.out.println(a3);
        System.out.println(b3);

        //RELATIONAL OPERATORS
        int X=5 ;
        int Y=6 ;
        System.out.println(X==Y);
        System.out.println(X!=Y);
        System.out.println(X>Y);
        System.out.println(X<Y);
        System.out.println(X>=Y);
        System.out.println(X<=Y);

        //LOGICAL OPERATORS
        System.out.println((3>2)&&(5>0));
        System.out.println((3<2)||(5>0));
        System.out.println(!(3<2));

        //ASSIGNMENT OPERATORS
        int R=51;
        System.out.println(R);
        System.out.println(R+=1);
        System.out.println(R-=1);
        System.out.println(R*=1);
    }
}