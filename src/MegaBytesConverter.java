public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0)
            System.out.println("Invalid Value");
        else {
            int mBytes = kiloBytes / 1024;
            int kBytes = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + mBytes + " MB and " + kBytes + " KB");
        }
    }

}
