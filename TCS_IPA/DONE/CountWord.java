
// Count the number of words in a String
// Note: Always ignore the spaces if more than 1 space given between two words

// Sample input : My Name is Naman
// Process ------> [My, Name, is, Naman]
// Output: Number of Words : 4

// Sample input : My Name  is Naman
// Process ------> [My, Name, , is, Naman]
// Output: Number of Words : 4

package TCS_IPA;
import java.util.*;
public class CountWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String words[] = s.split(" ");
        int count=0;
        for(int i=0;i<words.length;i++)
            {
                if(words[i]!="")
                    count++;  
            }
        System.out.println(count);
    }
}
