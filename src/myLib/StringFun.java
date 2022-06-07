package myLib;
import java.util.Random;
public class StringFun {

    public static String AddChar(String str, char ch, int position) {
        return str.substring(0, position) + ch + str.substring(position);
    }

    public static int[] AddIntToArray(int n, int arr[], int x)
    {
        int i;
        int newarr[] = new int[n + 1];
        for (i = 0; i < n; i++){
            newarr[i] = arr[i];
        }
        newarr[n] = x;
        return newarr;
    }

    public static char[] AddCharToArray(int n, char arr[], char x)
    {
        int i;
        char newarr[] = new char[n + 1];
        for (i = 0; i < n; i++){
            newarr[i] = arr[i];
        }
        newarr[n] = x;
        return newarr;
    }

    public static char[] RemoveCharFromArray(char[] array, int index){
        char[] copy = new char[array.length - 1];

        for (int i = 0, j = 0; i < array.length; i++) {
            if (i != index) {
                copy[j++] = array[i];
            }
        }
        return copy;
    }

    public static boolean IsPalindrome(String wordIn){
        String wOut = "";
        char[] wChar = wordIn.toCharArray();
        for(int i = 0; i < wChar.length; i++){
            if(Character.isUpperCase(wChar[i])){
                wChar[i] = Character.toLowerCase(wChar[i]);
            }
        }
        String word = (new String(wChar)).replace(" ", "");
        for(int i = word.length()-1; i != -1; i--){
            wOut += word.charAt(i);
        }
        if((wOut.replace(" ", "")).equals(word)){
            return true;
        }
        return false;
    }

    public static String Anarchize(String text) {
        char[] wTemp = text.toCharArray();

        for(int i = 0; i < wTemp.length; i++){
            if(Character.isUpperCase(wTemp[i])){
                wTemp[i] = Character.toLowerCase(wTemp[i]);
            }else{
                wTemp[i] = Character.toUpperCase(wTemp[i]);
            }
        }
        return new String(wTemp);
    }

    public static String Camelize(String text) { // Ala ma kota
        char[] wTemp = text.toCharArray(); // A l a m a k o t a
        for(int i = 0; i < wTemp.length; i++){

            if(i == 0 && Character.isUpperCase(wTemp[i])){ // a l a m a k o t a
                wTemp[i] = Character.toLowerCase(wTemp[i]);
            }

            if(wTemp[i] == ' ' && wTemp.length != i+1){ // a l a M a K o t a
                wTemp[i+1] = Character.toUpperCase(wTemp[i+1]);
            }
            
        }
        String wTempString = new String(wTemp);
        wTempString = wTempString.replace(" ", "");  // alaMaKota
        return wTempString; //alaMaKota
    }


    public static String Decamelize(String text) {
        char[] wTemp = text.toCharArray();
        int[] upperPosition = {};
        int addedSpaces = 0;
        for(int i = 0; i < wTemp.length; i++){
            if(i==0 && Character.isUpperCase(wTemp[0])){
                continue;
            }

            if(Character.isUpperCase(wTemp[i])){
                
                wTemp[i] = Character.toLowerCase(wTemp[i]);
                upperPosition = AddIntToArray(upperPosition.length, upperPosition, i+addedSpaces);
                addedSpaces++;
            }

            if(i == 0 && Character.isLowerCase(wTemp[i])){
                wTemp[i] = Character.toUpperCase(wTemp[i]);
            }
        }
        
        String wTempString = new String(wTemp);
        for(int i = 0; i < upperPosition.length; i++){
            wTempString = AddChar(wTempString, ' ', upperPosition[i]);
        }

        return wTempString;
    }


    public static String Shuffle(String text) {
        char[] textIn = text.toCharArray();
        char[] textOut = {};

        for(int i = text.length() ; i > 0 ; i--){ 
            if(textIn.length == 1){
                textOut = AddCharToArray(textOut.length, textOut, textIn[0]);
                textIn = RemoveCharFromArray(textIn, 0);
                break;
            }
            Random random = new Random();
            int randomInt = random.nextInt(textIn.length-1);
            textOut = AddCharToArray(textOut.length, textOut, textIn[randomInt]);
            textIn = RemoveCharFromArray(textIn, randomInt);
        }

        return new String(textOut);
    }

}
