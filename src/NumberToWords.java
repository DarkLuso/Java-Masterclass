public class NumberToWords {


    public static void numberToWords (int number){

        if (number < 0) {
            System.out.println("Invalid Value");

        }

        int reverse = reverse(number);

        int digit;

        int digitCount = getDigitCount(number);

        while (digitCount > 0){

            digit = reverse % 10;

            switch (digit){

                case 1:
                    System.out.println("One");
                    break;

                case 2:
                    System.out.println("Two");
                    break;

                case 3:
                    System.out.println("Three");
                    break;

                case 4:
                    System.out.println("Four");
                    break;

                case 5:
                    System.out.println("Five");
                    break;

                case 6:
                    System.out.println("Six");
                    break;

                case 7:
                    System.out.println("Seven");
                    break;

                case 8:
                    System.out.println("Eight");
                    break;

                case 9:
                    System.out.println("Nine");
                    break;

                case 0:
                    System.out.println("Zero");
                    break;

            }

            reverse /= 10;
            digitCount --;

        }

    }

    public static int getDigitCount (int number){

        if (number < 0)
            return -1;

        if (number == 0)
            return 1;

        int x = 0;

        while (number != 0) {
            number /= 10;
            x++;
        }

        return x;

    }

    public static int reverse (int number){

        /**
         * I can't use the getDigitCount in this method, because he need's to return negative numbers,
         * and the exercise ask you to return -1 if number is negative in getDigitCount.
         */

        double digits = 0;
        int x = number;

        if (x == 0)
            digits = 1;

        while (x != 0) {
            x /= 10;
            digits++;
        }

        int reverse = 0;
        int pow;

        for (int i = 1; digits != 0; i *= 10){

            pow = (int)Math.pow(10,digits);

            reverse += ((number % pow) / (pow / 10)) * i;

            digits--;

        }

        return reverse;

    }

}
