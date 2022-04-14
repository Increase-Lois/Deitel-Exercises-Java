package Sucre_Joseph.ChapterSix__Methods;

import java.security.SecureRandom;

/*
Rolling a six sided die 60_000_000 times.
 */
public class DieRoll {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();

        // roll count from 1-6
        int dieRoll1 = 0;
        int dieRoll2 = 0;
        int dieRoll3 = 0;
        int dieRoll4 = 0;
        int dieRoll5 = 0;
        int dieRoll6 = 0;

        //count for 60000000 rolls
        for (int roll = 1; roll <=60000000; roll++){
            int face = 1 + randomNumbers.nextInt(6);

            switch (face){
                case 1:
                    dieRoll1++;
                    break;
                case 2:
                    dieRoll2++;
                    break;
                case 3:
                    dieRoll3++;
                    break;
                case 4:
                    dieRoll4++;
                    break;
                case 5:
                    dieRoll5++;
                    break;
                case 6:
                    dieRoll6++;
                    break;
            }
        }
        System.out.println("Face\t\tFrequency");
        System.out.printf("1\t\t%d%n2\t\t%d%n3\t\t%d%n4\t\t%d%n5\t\t%d%n6\t\t%d%n",dieRoll1,dieRoll2,dieRoll3,dieRoll4,dieRoll5,dieRoll6);
    }
}
