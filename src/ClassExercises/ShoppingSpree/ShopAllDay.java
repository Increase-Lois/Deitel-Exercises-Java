package ClassExercises.ShoppingSpree;

import java.util.Scanner;

public class ShopAllDay {
    public static void main(String[] args) {

        ManageShopItem shopItem = new ManageShopItem();
        Scanner input = new Scanner(System.in);

        checkOutItems(shopItem, input);
    }

    public static void checkOutItems(ManageShopItem shopItem, Scanner input) {
        do {
            String format = """
                        
                        Enter 1 to capture Shop Items
                        Enter 2 to  display all items purchased
                        Enter 3 to exit
                        """;
            System.out.println(format);
            int value = input.nextInt();

            switch (value){
                case 1:
                    shopItem.captureItemInformation();
                    break;
                case 2:
                    shopItem.getAllItemsPurchased();
                    shopItem.getSumOfAllItemsPurchased();
                    break;
                case 3:
                    System.exit(3);
                    break;
            }
        }
        while (true);
    }


}


