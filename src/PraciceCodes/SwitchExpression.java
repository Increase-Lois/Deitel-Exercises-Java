package PraciceCodes;
import java.util.Scanner;

public class SwitchExpression {
    public static void main(String[] args) {
        System.out.println("Enter her name:");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();

        switch (string.toLowerCase()){
            case "increase", "miju" -> {System.out.println("She smart and maybe she is pretty");
                System.out.println("She is a great person who can cook for Africa");
                System.out.println("""
                        She studied fashion
                        In Yaba Tech""");
            }

            case "whoever" -> System.out.println("Whatever");
            default -> System.out.println("This is the default");
        }
    }
}
