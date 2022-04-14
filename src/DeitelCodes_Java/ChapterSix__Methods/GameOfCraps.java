package DeitelCodes_Java.ChapterSix__Methods;

import java.security.SecureRandom;

/*
A popular game of chance is a dice game known as craps, which is played in casinos and
back alleys throughout the world. The rules of the game are straightforward:
You roll two dice. Each die has six faces, which contain one, two, three, four, five and
six spots, respectively. After the dice have come to rest, the sum of the spots on the two
upward faces is calculated. If the sum is 7 or 11 on the first throw, you win. If the sum
is 2, 3 or 12 on the first throw (called “craps”), you lose (i.e., the “house” wins). If the
sum is 4, 5, 6, 8, 9 or 10 on the first throw, that sum becomes your “point.” To win,
you must continue rolling the dice until you “make your point” (i.e., roll that same
point value). You lose by rolling a 7 before making your point.
 */
public class GameOfCraps {
    //create secure random number for use in method rollDice
    private static final SecureRandom randomNumbers = new SecureRandom();

    //enum type with constants that represent the game status
    private enum Status{CONTINUE,WON,LOST};

    //Constants that represent common rolls of the dice
    private static final int SNAKE_EYES =2;
    private static final int TREY =3;
    private static final int SEVEN =7;
    private static final int YO_LEVEN =11;
    private static final int BOX_CARS =12;


    public static void main(String[] args) {
        int myPoint = 0;
        Status gameStatus;

        int sumOfDice = rollDice(); //first dice roll

        //determine game status and point based on first roll
        switch (sumOfDice){
            case SEVEN:
            case YO_LEVEN:
                gameStatus=Status.WON;
                break;
            case SNAKE_EYES:;
            case TREY:
            case BOX_CARS:
                gameStatus=Status.LOST;
            default:
                gameStatus=Status.CONTINUE; //game not over
                myPoint = sumOfDice;
                System.out.printf("Point is %d%n", myPoint);
                break;
        }
        while (gameStatus ==Status.CONTINUE){
            sumOfDice = rollDice();

            if (sumOfDice == myPoint){
                gameStatus= Status.WON;

            }
            else {
                if (sumOfDice == SEVEN){
                    gameStatus = Status.LOST;
                }
            }
        }
        if (gameStatus == Status.WON){
            System.out.println("Player wins");
        }
        else {
            System.out.println("Player loses");
        }
    }
    public static int rollDice(){
        int die1= 1 + randomNumbers.nextInt(6);
        int die2= 1 + randomNumbers.nextInt(6);

        int sum = die1 +die2;

        System.out.printf("Player rolled %d + %d = %d%n", die1,die2, sum);
        return sum;
    }
}
