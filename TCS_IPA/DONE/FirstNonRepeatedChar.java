
// Write a java program to find the first non-repeated character in a given string.

// Input String : "minimum"
// Output: "n"

package TCS_IPA;
import java.util.*;
public class FirstNonRepeatedChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashMap<Character,Integer> hs = new HashMap<>();
        for(int i=0;i<str.length();i++)
            {
                if(!hs.containsKey(str.charAt(i)))
                    {
                        hs.put(str.charAt(i),1);
                    }
                else
                    {
                        hs.put(str.charAt(i),hs.get(str.charAt(i))+1);
                    }
            }
        for (int i=0;i<str.length();i++)
            {
                if(hs.get(str.charAt(i))==1)
                    {
                        System.out.println(str.charAt(i));
                        break;
                    }
            }

        sc.close();
    }
}
