
// Input: Home, Sweet Home
//        Home
// Output: Number of that word present in the sentence : 2

// Process ------> The word Home present in the sentence 2 times.

package TCS_IPA;
import java.util.Scanner;

public class FindCountWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(",| ");
        String s = sc.next();
        int ct=0;
        for (int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
        for (int i=0;i<arr.length;i++)
            {
                if(arr[i].equalsIgnoreCase(s))
                    ct++;
            }
        System.out.println(ct);
    }
}
