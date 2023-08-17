import java.util.*;
public class ReverseANumber {
    public static void main(String []args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scn.nextInt();
        while(n>0){
            int r = n%10;
            System.out.println(r);
            n = n/10;
        }
        scn.close();
    }
}
