import java.util.*;

public class IsNumberPrime{
    public static void main(String []args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of test cases");
        int t = scn.nextInt();
        for(int i = 0; i< t; i++){
            System.out.println("Enter " +i+ " number");
            int n = scn.nextInt();
            boolean isPrime = true;
            for(int div =2; div*div<=n; div++){
                if(n % div == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.println(n +" is a  Prime number");
            } else{
                System.out.println(n +" is not a Prime number");
            }
        }
        scn.close();
    }
}