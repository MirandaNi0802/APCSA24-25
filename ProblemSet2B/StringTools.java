/**
 * Miranda Ni
 * September 25, 2024
 * Problem Set 2B
 */
public class StringTools
{
    public String lastLetter(String str){
        return str.substring(str.length()-1);
    }
    
    public String formatPhoneNumber(String str1){
        return "(" + str1.substring(0, 3) + ") " + str1.substring(3, 6) + "-" + str1.substring(6);
    }
    
    public String middleThree(String str){
        return str.substring(str.length()/2 - 1, str.length()/2 + 2);
    }
    
    public String swapLastTwo (String str){
        String temp = str.substring(str.length()-1);
        return str.substring(0, str.length()-2) + temp + str.substring(str.length()-2, str.length()-1);
    }
    
    public boolean frontAgain (String str, int n){
        boolean r = str.substring(0, n).equals(str.substring(str.length()-n));
        return r;
    }
}
