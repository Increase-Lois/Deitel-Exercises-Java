package ChapterSix;

public class ParkingCharges {
    /*
    (Parking Charges) A parking garage charges a $2.00 minimum fee to park for up to three
    hours. The garage charges an additional $0.50 per hour for each hour or part thereof in excess of three
    hours. The maximum charge for any given 24-hour period is $10.00. Assume that no car parks for
    longer than 24 hours at a time. Write an application that calculates and displays the parking charges
    for each customer who parked in the garage yesterday. You should enter the hours parked for each
    customer. The program should display the charge for the current customer and should calculate and
    display the running total of yesterday’s receipts. It should use the method calculateCharges to determine the charge for each customer.
     */

        private double chargeFee = 2.00;
        private double additionalFee = 0.50;
        private double maximumCharge = 10.00;
        private double parkingCharge= 0.0;


        public ParkingCharges(double chargeFee, double additionalFee, double maximumCharge, double parkingCharge) {
            this.chargeFee = chargeFee;
            this.additionalFee = additionalFee;
            this.maximumCharge = maximumCharge;
            this.parkingCharge = parkingCharge;
        }

        public double getChargeFee() {
            return chargeFee;
        }

        public double getAdditionalFee() {
            return additionalFee;
        }

        public double getMaximumCharge() {
            return maximumCharge;
        }

        public double getParkingCharge() {
            return parkingCharge;
        }

        public double calculateParkingCharge(int hourlyDuration) {

            if (hourlyDuration <= 3) {
                parkingCharge = chargeFee;
                return parkingCharge;
            }
            if (hourlyDuration > 3 && hourlyDuration < 24) {
                double extraHour = hourlyDuration - 3;
                parkingCharge = chargeFee + additionalFee * extraHour;
                return parkingCharge;
            }
            if (hourlyDuration == 24) {
                return parkingCharge = maximumCharge;
            }
            return parkingCharge;
        }
        public static void main(String[] args) {
            ParkingCharges parkingCharges = new ParkingCharges(2.00,0.50,10.00,0.0);

            parkingCharges.getChargeFee();
            System.out.println("ChargeFee is: " + parkingCharges.getChargeFee() );

            parkingCharges.getMaximumCharge();
            System.out.println("Maximum Charge for 24 hours is: " + parkingCharges.getMaximumCharge());

            parkingCharges.getAdditionalFee();
            System.out.println("Additional fee is: " + parkingCharges.getAdditionalFee());

            parkingCharges.calculateParkingCharge(29);
            System.out.println("Parking Charge fee is: " + parkingCharges.getParkingCharge());
        }
    }


