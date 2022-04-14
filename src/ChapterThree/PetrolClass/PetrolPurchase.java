package ChapterThree.PetrolClass;

/*
(Class PetrolPurchase ) Create a class called PetrolPurchase to represent information
about the petrol you purchase. The class should include five pieces of information in the form of instance
variables—the station’s location (type String ), the type of petrol (type String ), the quantity (type int ) of the purchase in liters,
 the price per liter ( double ), and the percentage discount
( double ). Your class should have a constructor that initializes the five instance variables. Provide a
set and a get method for each instance variable. In addition, provide a method named getPurchase-
Amount that calculates the net purchase amount (i.e., multiplies the quantity by the price per liter)
minus the discount, then returns the net amount you had to pay as a double value. Write an appli-
cation class named Petrol that demonstrates the capabilities of class PetrolPurchase .
 */
public class PetrolPurchase {
    private String stationLocation;
    private String petrolType;
    private int quantity;
    private double pricePerLitre;
    private double percentageDiscount;

    public PetrolPurchase(String stationLocation, String petrolType, int quantity, double pricePerLitre, double percentageDiscount) {
        this.stationLocation = stationLocation;
        this.petrolType = petrolType;
        this.quantity = quantity;
        this.pricePerLitre = pricePerLitre;
        this.percentageDiscount = percentageDiscount;
    }

    public String getStationLocation() {
        return stationLocation;
    }

    public void setStationLocation(String stationLocation) {
        this.stationLocation = stationLocation;
    }

    public String getPetrolType() {
        return petrolType;
    }

    public void setPetrolType(String petrolType) {
        this.petrolType = petrolType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerLitre() {
        return pricePerLitre;
    }

    public void setPricePerLitre(double pricePerLitre) {
        this.pricePerLitre = pricePerLitre;
    }

    public double getPercentageDiscount() {
        return percentageDiscount;
    }

    public void setPercentageDiscount(double percentageDiscount) {
        this.percentageDiscount = percentageDiscount;
    }


    public double getPurchaseAmount(){
        double netAmount = quantity * pricePerLitre - percentageDiscount;
        return netAmount;
    }
}
