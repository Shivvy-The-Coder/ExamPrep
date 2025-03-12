
// Count the number of prime digits in a Number
// Input: "254786135"
// Output: 5

package TCS_IPA;
import java.util.*;

public class CountPrime {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        int count=0;
        int i=0;
        while(i<s.length())
            {
                int val=Integer.parseInt(String.valueOf(s.charAt(i)));
                // System.out.println(val);
                if(checkprime(val))
                    {
                        count++;
                    }
                i++;
            }
        System.out.println(count);
            sc.close();
    }
    public static boolean checkprime(int n)
        {
           boolean check=false;

           if(n==1)
            return check;
            int sum=0;
           for (int i=1;i<=n;i++)
            {
                if(n%i==0)
                    sum++;
            }
          if(sum<3)
            return true;
          else
            return false;
         
        }

}
