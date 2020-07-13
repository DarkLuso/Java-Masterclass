public class SharedDigit {

    public static boolean hasSharedDigit (int x, int y){

        if (x < 10 || x > 99 || y < 10 || y > 99)
            return false;

        int firstX = x % 10;
        int lastX = x / 10;
        int firstY = y % 10;
        int lastY = y / 10;

        return firstX == firstY || lastX == lastY || firstX == lastY || firstY == lastX;

    }

}
