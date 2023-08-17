import java.util.*;

public class PrintDigitsOfANumber{
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scn.nextInt();
        int numOfDigits = 0;
        int tempNum = num;
        while(tempNum>0){
            tempNum = tempNum/10;
            numOfDigits++;
        }

        int div = (int)Math.pow(10, numOfDigits-1);
        while(div > 0){
            int digit = num/div;
            System.out.println(digit);
            num = num%div;
            div = div/10;
        }
        scn.close();
    }
}