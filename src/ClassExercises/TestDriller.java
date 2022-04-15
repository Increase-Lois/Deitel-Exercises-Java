package ClassExercises;

public class TestDriller {
    //Ask user to enter number of copies he/she wishes to purchase,
//input the conditions necessary for every copy made, calculate the sum per copies purchased.

    public int calculateQuantityAgainstPrice(int quantity, int price) {

        if (quantity >= 1)
            if (quantity <= 4)
                price = 2000 * quantity;

        if (quantity >= 5)
            if (quantity <= 9)
                price = 1800 * quantity;


        if (quantity >= 10)
            if (quantity <= 29)
                price = 1600 * quantity;


        if (quantity >= 30)
            if (quantity <= 49)
                price = 1500 * quantity;


        if (quantity >= 50)
            if (quantity <= 99)
                price = 1300 * quantity;


        if (quantity >= 100)
            if (quantity <= 199)
                price = 1200 * quantity;


        if (quantity >= 200)
            if (quantity <= 499)
                price = 1100 * quantity;


        if (quantity >= 500)
            price = 1000 * quantity;

        return price;
    }
}
