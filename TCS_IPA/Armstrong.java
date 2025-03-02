
// Write a java program to check if a given number is an Armstrong number or not.

// Input Number : 153
// Output: "Yes, the number is an Armstrong number."

package TCS_IPA;
import java.util.*;

public class Armstrong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x =sc.nextInt();
        int dup=x;
        int sum=0;
        while(x!=0)
            {
                int rem = x%10;
                sum+=Math.pow(rem,3);
                x/=10;
            }
        if(sum==dup)
            System.out.println("yes");
        else
            System.out.println("No");
    }
}