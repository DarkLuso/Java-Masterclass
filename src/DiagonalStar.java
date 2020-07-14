public class DiagonalStar {

    public static void printSquareStar (int number){

        if (number < 5)
            System.out.println("Invalid Value");

        else {

            int x;

            for (int i = 0; i < number; i++){

                for (x = 0; x < number; x++){

                    if (x == 0 || x == number -1 || i == 0 || i == number -1 || i == x || i == (number - x -1))
                        System.out.print("*");
                    else
                        System.out.print(" ");

                }
                System.out.println();
                x = 0;

            }

        }

    }

}
