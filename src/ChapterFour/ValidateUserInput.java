package ChapterFour;

import java.util.Scanner;
/*
   (Validating User Input) Modify the program in Fig. 4.12 to validate its inputs. For any in-
   put, if the value entered is other than 1 or 2, keep looping until the user enters a correct value.
    */
public class ValidateUserInput {

        public static void main(String[] args) {
            int passes = 0;
            int failure = 0;
            int count = 1;

            Scanner scanner = new Scanner(System.in);

            while (count <= 10){
                System.out.println("Enter result (1 = Passed,2 = failed)");
                int result = scanner.nextInt();

                if(result == 1){
                    passes++;
                }
                else if (result == 2){
                    failure++;
                }
                else {
                    System.out.println("Invalid output");
                }
                count++;
            }
            System.out.printf("Passes: %d%nFailure: %d%n", passes,failure);


        }
    }


