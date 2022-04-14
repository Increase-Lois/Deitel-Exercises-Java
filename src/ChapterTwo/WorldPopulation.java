package ChapterTwo;
/*
2.34 (World Population Growth Calculator) Use the web to determine the current world population and the annual world population growth rate.
Write an application that inputs these values, then displays the estimated world population after one, two, three, four and five years.
 */
public class WorldPopulation {

        public static void main(String[]args){

            double worldPopulation = 7.9;
            double growthRate = 1.0;

            System.out.printf("The world population is currently %f billion %n ", worldPopulation);

            System.out.printf("Annual World population growth rate is %f percent %n ", growthRate);

            double growthEstimate = (worldPopulation * 0.1);

            double yearOne = worldPopulation + (worldPopulation * 0.1);
            double yearTwo = yearOne + (worldPopulation * 0.1);
            double yearThree = yearTwo + (worldPopulation * 0.1);
            double yearFour = yearThree + (worldPopulation * 0.1);
            double yearFive = yearFour + (worldPopulation * 0.1);

            System.out.printf("Estimated World population After one year is %.2f billion %n ", yearOne);
            System.out.printf("Estimated World population After two years is %.2f billion %n", yearTwo);
            System.out.printf("Estimated World population After three years is %.2f billion %n ", yearThree);
            System.out.printf("Estimated World population After four years is %.2f billion %n", yearFour);
            System.out.printf("Estimated World population After five years is %.2f billion ", yearFive);

        }

}
