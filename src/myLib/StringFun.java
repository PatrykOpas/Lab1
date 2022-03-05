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

}
