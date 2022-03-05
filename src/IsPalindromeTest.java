import myLib.StringFun;
import java.util.Scanner;

public class IsPalindromeTest {
    public static void main() {
        Scanner scn = new Scanner(System.in);
        do{
            System.out.print("Podaj tekst do sprawdzenia ('0' aby zakończyć): ");
            String tekst = "";
            tekst += scn.nextLine();
            if(tekst.equals("0")){
                scn.close();
                break;
            }

            System.out.println("Tekst: " + tekst + " " + (StringFun.isPalindrome(tekst) ? "" : "nie ") + "jest palindromem");
            System.out.println(StringFun.Anarchize(tekst));
            System.out.println(StringFun.Camelize(tekst));

        } while (true);
    }
}

