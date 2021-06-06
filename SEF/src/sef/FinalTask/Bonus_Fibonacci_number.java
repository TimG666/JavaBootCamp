package sef.FinalTask;
import java.util.Scanner;
public class Bonus_Fibonacci_number {
        public static void main(String [] args){
            System.out.println("Enter your number and press Enter");
            int a = 1;
            int b = 1;
            int n;
            int sum_fib;
            Scanner s = new Scanner(System.in);
            n = s.nextInt();
            for(int i = 0; i < n; i++){
                sum_fib = a + b;
                a = b;
                b = sum_fib;
                System.out.print(sum_fib + " ");
            }
        }
    }

