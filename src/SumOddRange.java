public class SumOddRange {

    public static boolean isOdd (int number){

        return number % 2 == 1;

    }

    public static int sumOdd (int start, int end){

        if ( start < 0 || end < start)
            return -1;

        else {
            int result = 0;

            for (int i = start; i <= end; i++){

                if (isOdd(i))
                    result += i;

            }
            return result;
        }

    }

}
