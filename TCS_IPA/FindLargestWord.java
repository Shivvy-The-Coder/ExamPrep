
// Find largest-word from a given Sentence.
// If two string have same length then print the first one

// Input: TCS is the best Company ever
// Output: Company


package TCS_IPA;
import java.util.Scanner;
public class FindLargestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String arr [] = str.split(" ");
        int len =Integer.MIN_VALUE;

        for (int i=0;i<arr.length;i++)
        {
            if(arr[i].length()>len)
                len=arr[i].length();
        }
        System.out.println(len);
    }
}
