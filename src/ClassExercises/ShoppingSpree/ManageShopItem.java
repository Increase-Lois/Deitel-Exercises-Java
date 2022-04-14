package ClassExercises.ShoppingSpree;

import java.util.ArrayList;
import java.util.Scanner;

public class ManageShopItem {
    ArrayList<ItemInShop> shopListInfo = new ArrayList<ItemInShop>();
    Scanner input = new Scanner(System.in);

    public void captureItemInformation(){
        ItemInShop shopItem = new ItemInShop();

        System.out.println("What did you buy? ");
        String itemName = input.next();
        input.nextLine();


        System.out.println("Enter quantity of items");
        int itemQuantity = input.nextInt();

        System.out.println("Enter the amount for item");
        double itemAmount = input.nextDouble();

        shopItem.setItemName(itemName);
        shopItem.setItemQuantity(itemQuantity);
        shopItem.setItemAmount(itemAmount);
        shopListInfo.add(shopItem);
    }


    public void getAllItemsPurchased(){
        System.out.println("Shop Store Invoice for items purchase");
        System.out.println("Item Name:    Item Quantity:    Item Amount:    Amount to pay");
        System.out.println();
        for (ItemInShop item : shopListInfo){
            System.out.printf("%s%13d%20.2f%22.2f",item.getItemName(),
                    item.getItemQuantity(),item.getItemAmount(),item.getTotalAmountForItem());
            System.out.println();
        }

    }
    public void getSumOfAllItemsPurchased(){
        double sum =0;
        for (ItemInShop sumTotal : shopListInfo){
            sum = sum + sumTotal.getTotalAmountForItem();
        }
        System.out.println();
        System.out.println("Total of all items purchased is "+sum);
    }
}


