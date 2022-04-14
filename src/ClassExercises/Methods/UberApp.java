package ClassExercises.Methods;

import java.util.Scanner;

        //Enter a score 10x... print out the scores, average, min,max and total
public class UberApp {
        public static void main(String[] args) {
            //Enter a Number 10x
            // Display a Number 10x
            //Total
            //Maximum Number
            //Minimum Number
            //Average
              //  int ARRAY_LENGTH =10;
                 int[] scores =new int[10];
            Scanner input = new Scanner(System.in);

                //Collect numbers
                for (int i =0; i < scores.length; i++){
                    System.out.println("Enter a number");
                      scores[i]= input.nextInt();
                }

                  System.out.println();

                //Display
                for (int i=0; i < scores.length; i++){
                    System.out.println(scores[i]);
                }
                //total
            int totalScore =0;
            for (int i=0; i < scores.length; i++) {
                totalScore = totalScore + scores[i];
            }
            System.out.println("totalScore is "+ totalScore);

            System.out.println();

            //Maximum
            int maximumNumber =scores[0];
            for (int i=0; i < scores.length; i++){
                maximumNumber =Math.max(maximumNumber, scores[i]);
            }
            System.out.println("MaximumNumber is " +maximumNumber);

            System.out.println();

            //Minimum
            int minimumNumber = scores[0];
            for (int i =0; i <scores.length; i++){
                minimumNumber =Math.min(minimumNumber, scores[i]);
            }
            System.out.println("MinimumNumber is " +minimumNumber);
        }
        }

