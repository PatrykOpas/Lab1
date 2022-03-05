import java.util.Scanner;
import java.util.Random;
import myLib.StringFun;

class StrongPasswordGenerator{

    private int dlugosc = 0;
    private Boolean maleLitery = false;
    private Boolean wielkieLitery = false;
    private Boolean cyfry = false;
    private Boolean znakiSpecjalne = false;
    char[] dozwoloneZnakiSpecjalne = {};

    public StrongPasswordGenerator(){

    }

    public StrongPasswordGenerator(int dlugosc, Boolean maleLitery, Boolean wielkieLitery, Boolean cyfry, Boolean znakiSpecjalne, char[] dozwoloneZnakiSpecjalne){
        this.dlugosc = dlugosc;
        this.maleLitery = maleLitery;
        this.wielkieLitery = wielkieLitery;
        this.cyfry = cyfry;
        this.znakiSpecjalne = znakiSpecjalne;
        this.dozwoloneZnakiSpecjalne = dozwoloneZnakiSpecjalne;
    }

    public StrongPasswordGenerator(int dlugosc, Boolean maleLitery, Boolean wielkieLitery, Boolean cyfry){
        this.dlugosc = dlugosc;
        this.maleLitery = maleLitery;
        this.wielkieLitery = wielkieLitery;
        this.cyfry = cyfry;
        this.znakiSpecjalne = false;
        this.dozwoloneZnakiSpecjalne = new char[]{};
    }

    public StrongPasswordGenerator(int dlugosc, Boolean cyfry){
        this.dlugosc = dlugosc;
        this.maleLitery = true;
        this.wielkieLitery = false;
        this.cyfry = cyfry;
        this.znakiSpecjalne = false;
        this.dozwoloneZnakiSpecjalne = new char[]{};
    }

    public String generate(){
        String pass = "";

        String LOWER = "abcdefghijklmnopqrstuvwxyz";
        String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String DIGITS = "0123456789";
        Random random = new Random();
        String WszystkieZnaki = "";
        if(maleLitery) WszystkieZnaki += LOWER;
        if(wielkieLitery) WszystkieZnaki += UPPER;
        if(cyfry) WszystkieZnaki += DIGITS;
        if(znakiSpecjalne) WszystkieZnaki += (new String(dozwoloneZnakiSpecjalne));
        if(WszystkieZnaki.length() == 0){
            return "";
        }

        for (int i = 0; i < dlugosc; i++) {
            int randomInt = 0;
            randomInt = random.nextInt(WszystkieZnaki.length());
            pass += WszystkieZnaki.toCharArray()[randomInt];
        }

        return pass;
    }

    public String choice(){
        System.out.println("Wybierz wymogi hasla (0 - Wroc)");
        String[] wymogi = {"Pełny Wybor","Umiarkowany Wybor","Podstawowy Wybor"};
        for (int i = 0; i < wymogi.length; i++) {
            System.out.println(i+1+". "+wymogi[i]);
        }

        Scanner scn2 = new Scanner(System.in);
        String tekst2 = "";
        tekst2 += scn2.nextLine();
        if(tekst2.equals("0")){
            return "";
        }

        String[] dane = {"Dlugosc hasla (Liczba): ","Male Litery (tak/nie): ","Cyfy (tak/nie): ","Duze litery (tak/nie): ","Znaki Specjalne (tak/nie): ","Dozwolone znaki Specjalne (np. !,@,#): "}; 
        switch (tekst2) {
            case "1":
                for (int i = 0; i < dane.length; i++) {
                    System.out.print(dane[i]);
                    Scanner scn = new Scanner(System.in);
                    String tekst = "";
                    tekst += scn.nextLine();
                    switch (i) {
                        case 0:
                            this.dlugosc = Integer.parseInt(tekst);
                        break;
                        case 1:
                            if(tekst.equals("tak")) maleLitery = true; else maleLitery = false;
                        break;
                        case 2:
                            if(tekst.equals("tak")) wielkieLitery = true; else wielkieLitery = false;
                        break;
                        case 3:
                            if(tekst.equals("tak")) cyfry = true; else cyfry = false;
                        break;
                        case 4:
                            if(tekst.equals("tak")) znakiSpecjalne = true; else znakiSpecjalne = false;
                        break;
                        case 5:
                            dozwoloneZnakiSpecjalne = tekst.toCharArray();
                        break;
                        default:
                            break;
                    }
                }
            return this.generate();

            case "2":
            for (int i = 0; i < dane.length-2; i++) {
                System.out.print(dane[i]);
                Scanner scn = new Scanner(System.in);
                String tekst = "";
                tekst += scn.nextLine();
                switch (i) {
                    case 0:
                        this.dlugosc = Integer.parseInt(tekst);
                    break;
                    case 1:
                        if(tekst.equals("tak")) maleLitery = true; else maleLitery = false;
                    break;
                    case 2:
                        if(tekst.equals("tak")) wielkieLitery = true; else wielkieLitery = false;
                    break;
                    case 3:
                        if(tekst.equals("tak")) cyfry = true; else cyfry = false;
                    break;
                    default:
                        break;
                }

            }
        return this.generate();

            case "3":
            for (int i = 0; i < dane.length-3; i++) {
                System.out.print(dane[i]);
                Scanner scn = new Scanner(System.in);
                String tekst = "";
                tekst += scn.nextLine();
                switch (i) {
                    case 0:
                        this.dlugosc = Integer.parseInt(tekst);
                    break;
                    case 1:
                        if(tekst.equals("tak")) maleLitery = true; else maleLitery = false;
                    break;
                    case 2:
                        if(tekst.equals("tak")) cyfry = true; else cyfry = false;
                    break;
                    default:
                        break;
                }
            }
        return this.generate();
        
            default:
                return "";
        }
    }

}


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
                do{
                    String pass = new StrongPasswordGenerator().choice();
                    if(pass.equals("")) break;
                    System.out.println("\nTwoje haslo to: "+(pass)+"\n");

                } while (true);
                break;
            
                default:
                    break;
            }
        } while (true);


    }
}
