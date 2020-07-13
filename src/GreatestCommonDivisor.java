public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor (int first, int second){

        if (first < 10 || second < 10)
            return -1;

        int maxValue = Math.max(first, second);
        int firstGreatestDivisor = 0;
        int secondGreatestDivisor = 0;
        int commonDivisor = 0;

        for (int i = 1; i < maxValue; i++){

            if (first % i == 0)
                firstGreatestDivisor = i;

            if (second % i == 0)
                secondGreatestDivisor = i;

            if (firstGreatestDivisor == secondGreatestDivisor)
                commonDivisor = firstGreatestDivisor;

        }
            return commonDivisor;
    }

}
