package ChapterFive;
/*
(“The Twelve Days of Christmas” Song) Write an application that uses iteration and switch
statements to print the song “The Twelve Days of Christmas.” One switch statement should be
used to print the day (“first,” “second,” and so on). A separate switch statement should be used to
print the remainder of each verse. Visit the website en.wikipedia.org/wiki/The_Twelve_Days_
of_Christmas_(song) for the lyrics of the song.
 */
public class TwelveDaysOfChristmas {
    public static void main(String[] args) {
        int daysLength = 12;
        for (int days = 1; days <= daysLength; days++){
        switch (days) {
            case 1:
                System.out.println("On the first day of christmas My true love gave to me");
                break;
            case 2:
                System.out.println("On the second day of Christmas My true love gave to me");
                break;
            case 3:
                System.out.println("On the third day of Christmas My true love gave to me");
                break;
            case 4:
                System.out.println("On the fourth day of Christmas My true love gave to me");
                break;
            case 5:
                System.out.println("On the fifth day of Christmas My true love gave to me");
                break;
            case 6:
                System.out.println("On the sixth day of Christmas My true love gave to me");
                break;
            case 7:
                System.out.println("On the seventh day of Christmas My true love gave to me");
                break;
            case 8:
                System.out.println("On the eight day of Christmas My true love gave to me");
                break;
            case 9:
                System.out.println("On the ninth day of Christmas My true love gave to me");
                break;
            case 10:
                System.out.println("On the tenth day of Christmas My true love gave to me");
                break;
            case 11:
                System.out.println("On the eleventh day of Christmas My true love gave to me");
                break;
            case 12:
                System.out.println("On the twelfth day of Christmas My true love gave to me");
                break;
        }
        for (int verse = days; verse > 0; verse--){
            switch (verse){
                case 12:
                    System.out.println("12 drummers drumming");
                    break;
                case 11:
                    System.out.println("11 pipers piping");
                    break;
                case 10:
                    System.out.println("Ten lords a-leaping");
                    break;
                case 9:
                    System.out.println("Nine ladies dancing");
                    break;
                case 8:
                    System.out.println("Eight maids a-milking");
                    break;
                case 7:
                    System.out.println("Seven swans a-swimming");
                    break;
                case 6:
                    System.out.println("Six geese a-laying");
                    break;
                case 5:
                    System.out.println("Five golden rings");
                    break;
                case 4:
                    System.out.println("Four calling birds");
                    break;
                case 3:
                    System.out.println("Three french hens");
                    break;
                case 2:
                    System.out.println("Two turtle-doves");
                    break;
                case 1:
                    System.out.println("And a Partridge in a pear tree");
                    break;
            }
        }
            System.out.println("=".repeat(30));
            }
        }
    }

