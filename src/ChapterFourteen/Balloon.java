package ChapterFourteen;

public class Balloon {
    public static void main(String[] args) {
        String balloon = "balloon";
        char[] charArray = new char[5];
        System.out.printf("balloon: %s", balloon);
        System.out.println();
        System.out.printf("The string reversed is: ");
        for (int i = balloon.length() - 1; i >= 0; i--) {
            System.out.printf("%c ", balloon.charAt(i) );
        }
       
        System.out.println();
    }
}

