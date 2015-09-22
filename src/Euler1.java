/**
 * Written by Michael Asper on 09/2015.
 */
public class Euler1 {

    public static void main(String[] args) {

        //Multiples of 3 and 5 https://projecteuler.net/problem=1
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            sum+=(i % 3 == 0 || i % 5 == 0 ? i:0);
        }
        System.out.println(sum);

    }
}

   
            