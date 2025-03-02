
// Given two strings s and t, return true if t is an anagram of s, and false otherwise.

// Input: s = "anagram" t = "nagaram"
// Output: true

// Input: s = "rat" t = "cat"
// Output: false

package TCS_IPA;
import java.util.*;
public class AnagramStrings
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        s1=s1.toUpperCase();
        String s2 = sc.nextLine();
        s2=s2.toUpperCase();
        boolean flag=true;

        // System.out.println(s1+" "+s2);
        int ch[]= new int [26];
        for (int i=0;i<s1.length();i++)
            {
                ch[s1.charAt(i)-65]++;
                ch[s2.charAt(i)-65]--;
            }

        for (int i=0;i<26;i++)
            {
                if(ch[i]!=0)
                    {
                        flag=false;
                    }
            }
        if(!flag)
            System.out.println("Not Anagram");
        else
            System.out.println("Anagram");
            sc.close();
    }
}
