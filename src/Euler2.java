/**
 * Written by Michael Asper on 09/2015.
 */
public class Euler2 {

    public static void main(String[] args) {

        //Even Fibonacci Numbers https://projecteuler.net/problem=2 4613732

        int x = 1;
        int y = 1;
        int sum = 1;

        while (x < 4000000){
            int c = x + y; //need a temp value
            sum+=(c % 2 == 0 ? c:0);
            x = y; //simple fib o' nacci stuff
            y = c;
        }

        System.out.println(sum);


    }
}

   
            