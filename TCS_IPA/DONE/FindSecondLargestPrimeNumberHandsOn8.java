
// Write a Program to read the n numbers and print the second-largest prime number.
// The first number entered will be considered as n. Next, the program should read n numbers(no decimal values).
//Input: 6
//       1 3 17 33 44 43
// Output: 17

package TCS_IPA;
import java.util.*;

public class FindSecondLargestPrimeNumberHandsOn8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int []arr= new int[n];
        ArrayList <Integer> ll = new ArrayList<>();
        for (int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
                if(checkPrime(arr[i]))
                    ll.add(arr[i]);
            }
        System.out.println(ll.get(ll.size()-2));

    }
    public static boolean checkPrime (int n)
        {
            if(n==1)
                return false;
            int count =0;
                for (int i=1;i<=n;i++)
                {
                    if(n%i==0)
                        count++;
                }
            if(count<=2)
                return true;
            return false;
        }
}

