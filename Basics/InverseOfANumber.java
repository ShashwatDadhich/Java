import java.util.*;
public class InverseOfANumber {
    public static void main(String []args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scn.nextInt();
        int inverse = 0;
        int origitmalPosition = 1;
        while(number>0){
            int originalDigit = number%10;
            int invertedDigit = origitmalPosition;
            int invertedPosition = originalDigit;

            inverse = inverse + invertedDigit * (int)Math.pow(10, invertedPosition -1);

            number = number/10;
            origitmalPosition++;

        }
        System.out.println(inverse);
        scn.close();
    }
}
