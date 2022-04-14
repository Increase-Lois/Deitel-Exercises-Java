package ClassExercises;

public class Pap {
//water, sugar, milk, chocolate, starch;

    private int waterInLitre;
    private int sugarInGrams;
    private int milkInGrams;
    private int chocolateInGrams;
    private int starchInGrams;

    public Pap(int waterInLitre, int starchInGrams, int sugarInGrams) {
        this.waterInLitre = waterInLitre;
        this.starchInGrams = starchInGrams;
        this.sugarInGrams = sugarInGrams;

    }

    public int getWaterInLitre() {
        return waterInLitre;
    }

    public int getSugarInGrams() {
        return sugarInGrams;
    }

    public int getMilkInGrams() {
        return milkInGrams;
    }

    public int getChocolateInGrams() {
        return chocolateInGrams;
    }

    public int getStarchInGrams() {
        return starchInGrams;
    }

    public void setWaterInLitre(int waterQuantity) {
        waterInLitre = waterQuantity;
    }

    public void setSugarInGrams(int sugarInGrams) {
        this.sugarInGrams = sugarInGrams;
    }

    public void setMilkInGrams(int milkInGrams) {
        this.milkInGrams = milkInGrams;
    }

    public void setChocolateInGrams(int ourchocolate) {
        chocolateInGrams = ourchocolate;
    }

    public void setStarchInGrams(int starchInGrams) {
        this.starchInGrams = starchInGrams + this.starchInGrams;
    }


}
