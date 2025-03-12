
// aabbbcc = a2b3c2
// abbccc = a1b2c3

package TCS_IPA;
import java.util.Scanner;
public class CharRepeat
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine()+" ";
        String ans="";
        int count=1;
        int si=0;
        for(int i=1;i<s.length();i++)
            {
                if(s.charAt(si)==s.charAt(i))
                    {
                        count++;
                    }
                else
                    {
                        ans=ans+s.charAt(i-1)+count;
                        count=1;
                        si=i;
                    }
            }
        System.out.println(ans);
        sc.close();
    }
}