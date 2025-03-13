// Remove duplicates characters in a string

// Input: Naman Paandey
// Output: Nam Pdey

package TCS_IPA;
import java.util.*;
public class Remove_Duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashSet <Character> hs = new HashSet<>();
        String ans ="";
        for (int i=0;i<str.length();i++)
            {
                
                if(!hs.contains(str.charAt(i)))
                    {
                        if(str.charAt(i)==' ')
                            continue;
                        else
                            hs.add(str.charAt(i));
                        ans=ans+str.charAt(i);
                    }
                
            }
        System.out.println(ans);
    }
}
