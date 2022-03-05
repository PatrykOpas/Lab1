import myLib.StringFun;
import java.util.Scanner;

public class IsPalindromeTest {
    public static void main() {
        Scanner scn = new Scanner(System.in);
        do{
            System.out.print("Podaj tekst do sprawdzenia ('0' aby zakończyć): ");
            String tekst = scn.next();
            if(tekst.equals("0")){
                break;
            }

            System.out.print("Tekst: " + tekst + " " + (StringFun.isPalindrome(tekst) ? "" : "nie ") + "jest palindromem\n");


        } while (true);
    }
}

