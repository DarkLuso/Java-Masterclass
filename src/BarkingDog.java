public class BarkingDog {

    public static boolean shouldWakeUp (boolean barking, int hoursOfDay){
        if(hoursOfDay < 0 || hoursOfDay > 23)
            return false;
        else return (hoursOfDay < 8 || hoursOfDay > 22) && barking;
    }

}
