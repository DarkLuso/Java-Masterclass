public class EvenDigitSum {

    public static int getEvenDigitSum (int number){

        if (number <0)
            return -1;

        int result = 0;
        int i = 0;

        while (number != 0){

            i = number % 10;

            if (i % 2 == 0)
                result += i;

            number /= 10;
            i = 0;

        }

        return result;

    }

}
