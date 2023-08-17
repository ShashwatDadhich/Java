import java.util.*;
public class FibonacciNumber{
    public static void main(String []args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scn.nextInt();
        System.out.println("0");
        System.out.println("1");
        int a=0;
        int b=1;
        for(int i = 0; i<n; i++){
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;
        }
        scn.close();
    }
}
