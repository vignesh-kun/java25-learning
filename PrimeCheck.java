// create a program to check if a number is prime
import java.util.Scanner;

class PrimeCheck {
    public static void main(String[] args) {
        int count = 0, n;
        // creating scanner object
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        n = sc.nextInt();

        for(int i = 1; i<= n; i++){
            if(n%i == 0){
                count++;
            }
        }
        if(count == 2){
            System.out.println("It is a prime number");
        }else{
            System.out.println("It is not a prime number");
        }
    }
}