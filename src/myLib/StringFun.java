package myLib;
public class StringFun {

    public static String addChar(String str, char ch, int position) {
        return str.substring(0, position) + ch + str.substring(position);
    }

    public static int[] addToArray(int n, int arr[], int x)
    {
        int i;
        int newarr[] = new int[n + 1];
        for (i = 0; i < n; i++){
            newarr[i] = arr[i];
        }
        newarr[n] = x;
        return newarr;
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

    public static String Camelize(String text) {
        char[] wTemp = text.toCharArray();
        for(int i = 0; i < wTemp.length; i++){
            if(i == 0 && Character.isUpperCase(wTemp[i])){
                wTemp[i] = Character.toLowerCase(wTemp[i]);
            }

            if(wTemp[i] == ' ' && wTemp.length != i+1){
                wTemp[i+1] = Character.toUpperCase(wTemp[i+1]);
            }
        }
        String wTempString = new String(wTemp);
        wTempString = wTempString.replace(" ", ""); 
        return wTempString;
    }


    public static String Decamelize(String text) {
        char[] wTemp = text.toCharArray();
        int[] upperPosition = {};
        int addedSpaces = 0;
        for(int i = 0; i < wTemp.length; i++){
            if(Character.isUpperCase(wTemp[0])){
                continue;
            }

            if(Character.isUpperCase(wTemp[i])){
                wTemp[i] = Character.toLowerCase(wTemp[i]);
                upperPosition = addToArray(upperPosition.length, upperPosition, i+addedSpaces);
                addedSpaces++;
            }

            if(i == 0 && Character.isLowerCase(wTemp[i])){
                wTemp[i] = Character.toUpperCase(wTemp[i]);
            }
        }
        String wTempString = new String(wTemp);
        for(int i = 0; i < upperPosition.length; i++){
            wTempString = addChar(wTempString, ' ', upperPosition[i]);
        }

        return wTempString;
    }


}
