public class MyMain {
    // This method adds up the values of all digits
    // in x, recursively
    public static int addDigits(int x) {
        if (x < 1)
        {
            return 0;
        }
        else
        {
            int num = x % 10;
            x = x/10;
            return num + addDigits(x);
        }
    }


    // This method checks if a String is a palindrome
    // (e.g. "racecar", "madam"), recursively
    public static boolean isPalindrome(String str) { 
        if (str.length() == 0 || str.length() == 1)
        {
            return true;
        }
        if(str.charAt(0) == str.charAt(str.length()-1))
        {
            str = str.substring(1,str.length()-1);
            return isPalindrome(str);
        }
        return false;
    }

    // This method returns the orignal string reversed;
    // this method should be written using recursion
    public static String reverse(String str) { 
        if(str.length() == 0)
        {
            return "";
        }
        else
        {
            char stri = str.charAt(str.length()-1);
            str = str.substring(0,str.length()-1);
            return stri + reverse(str);
        }
    }

    public static void main(String[] args) {
        // You can test your code here
    }
}
