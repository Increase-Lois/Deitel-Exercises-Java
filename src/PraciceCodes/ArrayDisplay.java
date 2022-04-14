package PraciceCodes;

public class ArrayDisplay {
    public static void main(String[] args) {
        int [] number = new int[10];
        int total = 0;
        for (int i = 0; i < number.length; i++){
            total = i * i + 5;
            System.out.print(i +" ");  // TODO: 2/22/22 Displays all the indexes
            System.out.println();
            System.out.print(number[i]); // TODO: 2/22/22 Displays all the numbers in the indexes
            System.out.println();
            System.out.println(i + " - "+ number[i]); // TODO: 2/22/22 Displays all the indexes alongside the numbers
            System.out.println(total); // TODO: 2/22/22 Displays the total of the array when multiplied by 2 and added by 5
        }
    }
}
