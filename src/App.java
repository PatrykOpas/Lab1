import java.util.Scanner;

import myLib.StringFun;
public class App {

    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    } 
        public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        do{
            String[] programs = new String[]{"IsPalindrome","Anarchize","Camelize","Decamelize","Shuffle","StrongPasswordGenerator"};
            for (int i = 0; i < programs.length; i++) {
                System.out.println(i+1+". Uruchom: "+programs[i]);
            }
            System.out.print("Podaj liczbę aby wybrać program ('0' aby zakończyć): ");
            String tekst = "";
            tekst += scn.nextLine();
            if(tekst.equals("0")){
                break;
            }
            switch (tekst) {
                case "1":
                do{
                    Scanner scn2 = new Scanner(System.in);
                    System.out.print("Podaj tekst do sprawdzenia ('0' aby wrócic): ");
                    String tekst2 = "";
                    tekst2 += scn2.nextLine();
                    if(tekst2.equals("0")){
                        break;
                    }
                    System.out.println("Tekst: " + tekst2 + " " + (StringFun.IsPalindrome(tekst2) ? "" : "nie ") + "jest palindromem");
                } while (true);
                break;

                case "2":
                do{
                    Scanner scn2 = new Scanner(System.in);
                    System.out.print("Podaj tekst do sprawdzenia ('0' aby wrócic): ");
                    String tekst2 = "";
                    tekst2 += scn2.nextLine();
                    if(tekst2.equals("0")){
                        break;
                    }
                    System.out.println(StringFun.Anarchize(tekst2));
                } while (true);
                break;

                case "3":
                do{
                    Scanner scn2 = new Scanner(System.in);
                    System.out.print("Podaj tekst do sprawdzenia ('0' aby wrócic): ");
                    String tekst2 = "";
                    tekst2 += scn2.nextLine();
                    if(tekst2.equals("0")){
                        break;
                    }
                    System.out.println(StringFun.Camelize(tekst2));
                } while (true);
                break;

                case "4":
                do{
                    Scanner scn2 = new Scanner(System.in);
                    System.out.print("Podaj tekst do sprawdzenia ('0' aby wrócic): ");
                    String tekst2 = "";
                    tekst2 += scn2.nextLine();
                    if(tekst2.equals("0")){
                        break;
                    }
                    System.out.println(StringFun.Decamelize(tekst2));
                } while (true);
                break;

                case "5":
                do{
                    Scanner scn2 = new Scanner(System.in);
                    System.out.print("Podaj tekst do sprawdzenia ('0' aby wrócic): ");
                    String tekst2 = "";
                    tekst2 += scn2.nextLine();
                    if(tekst2.equals("0")){
                        break;
                    }
                    System.out.println(StringFun.Shuffle(tekst2));

                } while (true);
                break;

                case "6":
                
                break;
            
                default:
                    break;
            }
        } while (true);


    }
}
