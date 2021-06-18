/** This program checks whether the PIN you enter is correct 
 * @author (Fikri Şan Köktaş)
 * @version (16 December 2020)*/
import java.util.Scanner;
public class KFS_ATMPin_Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the PIN: ");
        String s1 = in.nextLine();
        if (s1.equals("1234"))
        {
            System.out.println("PIN is correct");
        }
        else
        {
            System.out.println("PIN is incorrect.");
            System.out.print("Enter your PIN again: ");
            String s2 = in.nextLine();
            if (s2.equals("1234"))
            {
            System.out.println("PIN is correct");
            }
            else
            {
            System.out.println("PIN is incorrect.");
            System.out.print("Enter your PIN again: ");
            String s3 = in.nextLine();
            if (s3.equals("1234"))
            {
            System.out.println("PIN is correct");
            }
            else
            {
            System.out.println("PIN is incorrect. Your account is blocked");
            }
            }
        }
    }
}
