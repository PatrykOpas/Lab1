package myLib;
public class StringFun {

    public static boolean isPalindrome(String word){
        String w2 = "";
        for(int i = word.length()-1; i != -1; i--){
            w2 += word.charAt(i);
        }
        if(w2.equals(word)){
            return true;
        }
        return false;
    }

    public static String Anarchize(String text) {
        char[] w2 = text.toCharArray();

        for(int i = 0; i < w2.length; i++){
            if(Character.isUpperCase(w2[i])){
                w2[i] = Character.toLowerCase(w2[i]);
            }else{
                w2[i] = Character.toUpperCase(w2[i]);
            }
        }
        return new String(w2);
    }

    public static String Camelize(String text) {
        char[] w2 = text.toCharArray();
        for(int i = 0; i < w2.length; i++){
            if(i == 0 && Character.isUpperCase(w2[i])){
                w2[i] = Character.toLowerCase(w2[i]);
            }

            if(w2[i] == ' ' && w2.length != i+1){
                w2[i+1] = Character.toUpperCase(w2[i+1]);
            }
        }
        String w2String = new String(w2);
        w2String = w2String.replace(" ", ""); 
        return w2String;
    }


}
