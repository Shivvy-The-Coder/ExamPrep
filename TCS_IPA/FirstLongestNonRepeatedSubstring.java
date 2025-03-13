
// Find the first non-repeated character substring
// Input : Arijit
// Output: Arij

package TCS_IPA;
import java.util.*;
public class FirstLongestNonRepeatedSubstring {
    public static void main(String[] args) 
    {
         Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine();
        // String s = "";
        // int i, j, count = 0;
        // for(i = 0; i < str.length(); i++){
        //     for(j = 0; j <= i; j++){
        //         if(i == j){
        //             s = s + str.charAt(i);
        //         } else{
        //             if(str.charAt(i) == str.charAt(j)){
        //                 count++;
        //                 break;
        //             }
        //         }
        //     }
        //     if(count > 0)
        //     {
        //         break;
        //     }
        // }
        // System.out.println(s);
   
        String s = sc.nextLine();
        String ans ="";
        int len=0;String lans="";
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
