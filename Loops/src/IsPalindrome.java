public class IsPalindrome {
    public static void main(String[] args) {
        isPalindrome(12345);
        isPalindrome(12321);
        isPalindrome(-1221);
        isPalindrome(707);
        isPalindrome(11212);

        isPalindrome3(999);
        isPalindrome3(-999);
        isPalindrome3(989);
        isPalindrome3(-1999);
        isPalindrome3(1999);
    }
    // Challenge:
        //    Write a method called isPalindrome with one int parameter called number.
        //    The method needs to return a boolean.
        //    It should return true if the number is a palindrome number otherwise it should return false.
        //    Check the tips below for more info about palindromes.
        //    Example Input/Output
        //    isPalindrome(-1221); → should return true
        //    isPalindrome(707); → should return true
        //    isPalindrome(11212); → should return false because reverse is 21211 and that is not equal to 11212.
    // First solution I thought of:
        // sava number in new string called strNumber
        // reverse the strNumber and save it in new var reversedStrNumber
        // Compare them and return the result

    // Third solution:
        // save the last number in new int called lastDigit
        // multibly lastDigit by 10 and save int in int reversed
        // extract the last number of number by %10


    // Second solution:
        // save number in string called strNumber
        // loop through the sting and compare the element by loop iteration and the opposite to it:
        // str.chartAt(i) == str.charAt(str.length() - 1 - i)
        // Upgrade idea for faster excution:
            // There is no need to loop through the whole array, once you loop through the half you are done.
    public static boolean isPalindrome (int number) {
        String strNumber = "" + Math.abs(number);
//        String outcome = "";
//        for (int i = 0; i < strNumber.length(); i++) {
//            System.out.println("Position (" + i + ") is: " + strNumber.charAt(i) + ", and Position (" + (strNumber.length() - 1 - i) + ") is: " + strNumber.charAt(strNumber.length() - 1 - i) + ".");
//            if(strNumber.charAt(i) != strNumber.charAt(strNumber.length() - 1 - i)){
//                return false;
//            }
//        }
        // update: don't loop through the whole array, just the half of it would be enough.
        for (int i = 0; i < (int)Math.ceil((double) strNumber.length() / 2); i++) {
//            System.out.println("Position (" + i + ") is: " + strNumber.charAt(i) + ", and Position (" + (strNumber.length() - 1 - i) + ") is: " + strNumber.charAt(strNumber.length() - 1 - i) + ".");
            if(strNumber.charAt(i) != strNumber.charAt(strNumber.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }
    public static boolean isPalindrome3 (int number) {
        int originalValue = Math.abs(number);
        int reversed = 0;
        while(number > 0){
            System.out.println("While loop...");
            System.out.println("Number is: " + number);
            int lastDigit = number % 10;
            System.out.println("lastDigit: " + lastDigit);
            reversed += lastDigit;
            if(number < 10){
                break;
            }
            reversed *= 10;
            System.out.println("Reversed is: " + reversed);
            number = number / 10;

        }

        System.out.println(originalValue == reversed);
        return originalValue == reversed;
    }
}
