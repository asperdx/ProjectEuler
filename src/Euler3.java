import java.util.Scanner;

/**
 * Written by Michael Asper on 09/2015.
 */
public class Euler3 {



    public static void main(String[] args) {

        //Largest prime factor https://projecteuler.net/problem=3

        //must factor 600851475143, but will set up program to do any number where sqrt(n) is less than Integer.MAX_VALUE

        Scanner input = new Scanner(System.in);
        long number = 600851475143L; //input.nextDouble(); //using double because of much higher MAX_VALUE
        int n = (int) Math.sqrt(number);
        int largest = Integer.MIN_VALUE;
        for (int i = 2; i <= n; i++) {
            if (number % i == 0){
                if(primeNumber(i)){
                    largest = Math.max(largest, i);
                }
            }
        }

        System.out.println(largest);


    }

    public static boolean primeNumber(int x){

        //Typical prime number function I use often. Will most likely see being used in other programs

        if (x == 0 || x == 1) return false; //1 is not a prime number :-)
        if (x == 2 || x == 3) return true;
        if (x % 2 == 0 || x % 3 == 0) return false; //we do this because primes not divisible by
        //2 or 3, have the form 6k-1 and 6k+1

        int xsqrt = (int) Math.sqrt(x);

        for (long i = 5; i <= xsqrt; i+=6L) {
            if (x % i == 0 || x % (i+2) == 0) return false;
        }


        return true;
    }
}

   
            