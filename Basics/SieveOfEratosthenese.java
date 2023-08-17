import java.util.*;

public class SieveOfEratosthenese{
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Eneter a number");
        int n = scn.nextInt();
        int []arr = getPrimeNumbersTillN(n);
        for(int val: arr){
            System.out.println(val);
        }
        scn.close();
    }
    public static int[] getPrimeNumbersTillN(int n){
        ArrayList<Integer> al  = new ArrayList<>();
        
        boolean []PrimeArray = new boolean[n+1];
        Arrays.fill(PrimeArray, true);

        for(int i = 2; i*i<=n; i++){
            if(PrimeArray[i]==true){
                int j = 2;
                while(i*j<=n){
                    PrimeArray[i*j] = false;
                    j++;
                }
            }
        }

        for(int i = 2; i< PrimeArray.length; i++){
            if(PrimeArray[i]){
                al.add(i);
            }
        }

        int []arr = new int[al.size()];
        for(int i =0; i<al.size(); i++){
            arr[i]=al.get(i);
        }
        return arr;
    }
}