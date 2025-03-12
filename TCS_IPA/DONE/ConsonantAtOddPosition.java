
// Find the characters at odd position in a string which are consonant

// Input: Arijit Ghosh
// Output: hs

package TCS_IPA;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class ConsonantAtOddPosition {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        String vowels ="aeiouAEIOU";
        for(int i=0;i<s.length();i++)
            {
                char ch =s.charAt(i);
                if(i%2==0 && vowels.indexOf(ch)==-1)
                    {
                        if(ch==' ')
                            continue;
                            System.out.print(s.charAt(i));
                    }
            }


    }
}
