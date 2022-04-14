package DeitelCodes_Java.ChapterEight_Methods_DeeperLook;

public class Beverage {
    private String cocoaQty;
    private String sugarQty;
    private String milkQty;

    public Beverage(String cocoa, String sugar, String milk){
        this.cocoaQty = cocoa;
        this.sugarQty = sugar ;
        this.milkQty = milk;
    }
    public String getCocoaQty(){
        return cocoaQty;
    }
    public void setCocoaQty(String cocoa){
        this.cocoaQty = cocoa;
    }
    public String getSugarQty(){
        return sugarQty;
    }
    public void setSugarQty(String sugar){
        this.sugarQty = sugarQty;
    }
    public String getMilkQty(){
        return milkQty;
    }
    public void setMilkQty(String milkQty) {
        this.milkQty = milkQty;
    }

    public static void main(String[] args) {

    }
}
