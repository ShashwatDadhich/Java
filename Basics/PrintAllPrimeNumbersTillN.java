import java.util.*;
public class PrintAllPrimeNumbersTillN{
    public static void main(String []arge){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scn.nextInt();
        for(int i=2; i<=n; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
        scn.close();
    }
    public static boolean isPrime(int n){
        for(int i = 2; i*i <= n; i++){
            if (n%i == 0){
                return false;
            }
        }
        return true;
    }
}
// time complexity : number of queries * root n