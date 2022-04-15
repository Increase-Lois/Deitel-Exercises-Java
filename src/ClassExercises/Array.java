package ClassExercises;

public class Array {
    private static int total;
    int[] numbers ={1,2,3,4,5};


    public static int calculateTotalOf(int[] numbers) {
        int total =0;
        for ( int i=0; i <numbers.length; i++){
            total +=numbers[i];
        }
        return total;
    }

    public static int calculateMinimumOf(int[] numbers) {
        int minimumNumber = numbers[0];
        //Enhanced for
//        for(int number : numbers)
//            minimumNumber = Math.min(minimumNumber,number);

        for (int i= 0; i< numbers.length; i++){
            minimumNumber= Math.min(minimumNumber,numbers[i]);
        }
        return minimumNumber;
    }

    public static int calculateMaximumOf(int[] numbers) {
        int maximumNumber=numbers[0];
        for (int i=0; i<numbers.length; i++){
            maximumNumber= Math.max(maximumNumber, numbers[i]);
        }
        return maximumNumber;
    }

    public static double calculateAverageOf(int[] numbers) {
        double average =0.0;
        for (int i = 0; i < numbers.length; i++) {
            total +=numbers[i];
            average = total / (double) numbers[i];
        }
        return average;
    }
}

