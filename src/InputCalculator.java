import java.util.Scanner;


public class InputCalculator {

    public static void inputThenPrintSumAndAverage (){

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (true){

            boolean hasInt = scanner.hasNextInt();

            if (hasInt){
                sum += scanner.nextInt();
                count++;
            }
            else {

                break;

            }

        }

        long average = Math.round((double)sum / count);

        System.out.println("SUM = " + sum + " AVG = " + average);

    }

}
