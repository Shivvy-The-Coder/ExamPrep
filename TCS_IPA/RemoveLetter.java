// Remove a character from a string

// Input: Arijit
//        i
// Output: Arjt

package TCS_IPA;
import java.util.Scanner;
public class RemoveLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ch = sc.nextLine();
        String s = str.replace(ch,"");
        System.out.println(s);
    }
}
