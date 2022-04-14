package ClassExercises;

public class PapTest {

        public static void main(String[] args){

            Pap ogi= new Pap(2,1,5);

            System.out.printf("Quantity of sugar is %d%n",ogi.getSugarInGrams());
            System.out.printf("Quantity of water in litre is %d%n" ,ogi.getWaterInLitre());
            System.out.printf("Quantity of Chocolate in grams is %d%n" ,ogi.getChocolateInGrams());
            System.out.printf("Quantity of Starch in grams is %d%n" ,ogi.getStarchInGrams());
            System.out.printf("Quantity of Milk in grams is %d%n" ,ogi.getMilkInGrams());

            ogi.setStarchInGrams(22);
            System.out.printf("After Update Quantity of starch is %d%n", ogi.getStarchInGrams());
        }


}
