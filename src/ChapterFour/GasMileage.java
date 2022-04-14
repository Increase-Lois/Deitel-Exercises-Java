package ChapterFour;
import java.util.Scanner;
/*
        4.17 (Gas Mileage) Drivers are concerned with the mileage their automobiles get. One driver has
        kept track of several trips by recording the miles driven and gallons used for each tankful. Develop
        a Java application that will input the miles driven and gallons used (both as integers) for each trip.
        The program should calculate and display the miles per gallon obtained for each trip and print the
        combined miles per gallon obtained for all trips up to this point. All averaging calculations should
        produce floating-point results. Use class Scanner and sentinel-controlled iteration to obtain the data
        from the user.
*/
public class GasMileage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int miles;
        int gallons;
        int count = 0;
        double milesPerGallon;
        double total =0.0;

        //input miles driven and gallons used per trip

               System.out.println("Enter miles driven or -42 to exit: ");
               int milesDriven = scanner.nextInt();
               System.out.println("Enter gallons used or -42 to exit: ");
               int gallonUsed = scanner.nextInt();

            while (milesDriven != -42 && gallonUsed != -42){
                milesPerGallon = (double) milesDriven / (double) gallonUsed;
                total = (double) total + (double) milesPerGallon;
                count++;

                System.out.printf("%f is the milesPerGallon for this trip\n", milesPerGallon);

                System.out.println("Enter miles driven or -42 to exit: ");
                milesDriven = scanner.nextInt();
                System.out.println("Enter gallons used or -42 to exit: ");
                gallonUsed = scanner.nextInt();
            }
            if (total != 0){
        System.out.printf("%.2f is the combined milesPerGallon of the %d trips", total, count);
    }
            else {
                System.out.println("No mile was Driven or gallons were used");
            }
}
}

