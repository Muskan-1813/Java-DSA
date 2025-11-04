public class patterns{
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i1=5;i1>0;i1--){
            for(int j1=1;j1<i1+1;j1++){
                 System.out.print("*");
            }
        System.out.println();
        }

        for (int i2 = 1; i2 < 5; i2++) {
            for (int j2 = 1; j2 <= i2; j2++) {
                System.out.print(j2);
            }
            System.out.println();
        }
 
        char ch = 'A';
        for (int i3 = 0; i3 < 4; i3++) {
            for (int j3 = 0; j3 < i3+1; j3++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}