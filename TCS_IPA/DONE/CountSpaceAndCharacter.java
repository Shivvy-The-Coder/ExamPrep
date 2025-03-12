
// Write a Program to compute the number of spaces and characters in a String.
// Input: Hi I am a Student
// Output: 4 13

package TCS_IPA;
import java.util.Scanner;
public class CountSpaceAndCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int space =0, charCount =0;
        for (int i=0;i<str.length();i++)
            {
                char ch =str.charAt(i);
                if(ch==' ')
                    space++;
                else if(ch>='a'||ch<='z' ||ch>='A'||ch<='Z')
                    charCount++;
            }
            System.out.println(space+" "+charCount);

    }
}
