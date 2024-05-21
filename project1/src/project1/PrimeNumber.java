package project1;

public class PrimeNumber {

    public static void main(String[] args) {
    
        int num = 53334, r, res = 0, p = 1;
        
        while (num != 0) {
            r = num % 10; // Get the last digit
            num = num / 10; // Remove the last digit
            if (r == 3) continue; // Skip if the digit is 3
            res = res + r * p; // Build the resulting number
            p = p * 10; // Move to the next positional value
        }
        
        System.out.println(res); // Print the resulting number
    }
}

