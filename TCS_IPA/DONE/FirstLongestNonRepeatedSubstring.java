
// Find the first non-repeated character substring
// Input : Arijit
// Output: Arij

package TCS_IPA;
import java.util.*;
public class FirstLongestNonRepeatedSubstring {
    public static void main(String[] args) 
    {
         Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans ="",lans="";
        for (int i=0;i<s.length();i++)
        {
            if(ans.indexOf(s.charAt(i))==-1)
                {
                    ans=ans+s.charAt(i);
                }
            else
                {
                    if(ans.length()>lans.length())
                        lans=ans;
                    ans="";
                }
            
        }
        System.out.println(lans);
   
    }
}
