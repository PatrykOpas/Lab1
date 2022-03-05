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
}
