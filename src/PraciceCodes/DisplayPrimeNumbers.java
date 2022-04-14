package PraciceCodes;
/*
Display prime numbers between 2 and 1000 inclusive.
Display eight prime numbers per line. Numbers are separated by exactly one space.
 */
public class DisplayPrimeNumbers {
    public static void main(String[] args) {
        short lineCounter = 1;

        for (short primeNumber = 2; primeNumber<= 1000; primeNumber++) {
            boolean isPrime = true;

            for (short number = 2; number <= Math.sqrt(primeNumber); number++) {
                if (primeNumber % number == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                StringBuilder sbPrimeNumber = new StringBuilder(String.format("%03d", primeNumber));
                if (lineCounter++ % 8 != 0) {
                    System.out.print(sbPrimeNumber + " ");
                } else {
                    System.out.println(sbPrimeNumber + " ");
                }
//                if (lineCounter++ % 8 != 0) {
//                    System.out.print(primeNumber + " ");
//                } else {
//                    System.out.println(primeNumber + " ");
//                }
            }
        }
    }
}
