public class NumberPalindrome {

    public static boolean isPalindrome (int number){

        int reverse = 0;
        int i = number;
        int lastDigit;

        while (i != 0){

            lastDigit = i % 10;
            i /= 10;
            reverse += lastDigit;
            if (reverse == number)
                return true;
            reverse *= 10;


        }
        return false;

    }

}
