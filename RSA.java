import java.util.ArrayList;
import java.util.HashMap;

/**
 * @description COSC 314 Final Project
 * @author Joshua Alexander
 */

public class RSA {
    
    protected String decrypt (int c, int n, int e) {
        int [] pq = findPrimeFactor(n); // calc prime factors of n, put in array where p is index 0 and q is index 1
        int d = extendedEuclidean(e, ((pq[0] - 1) * (pq[1] - 1))); // find d by calculating the modular inverse using the extended euclidean algorithm on e and p-1 * q-1.
        int m = modularExponentiation(c, d, n); // calculate the message by using the decryption equation of m = c^d mod n with modular exponentiation
        
        return numToText(m); // calls the convert num to text function on the message and returns the string.
    }
    
    // Finds the modular inverse of a number given the number and the modulus, finds d for RSA
    private int extendedEuclidean (int e, int pq) {
        int remainder = 1, quotient, p = 0, mod = pq;
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> Q = new ArrayList<>();
        
        A.add(0); // add 0 for step p0 to list
        A.add(1); // add 1 for step p1 to list
        
        while (remainder != 0) {
            
            remainder = pq % e; // sets the remainder
            quotient = pq / e; // sets the quotient (no need to round, int diviision)
            Q.add(quotient); // adds the quotient to the Q list
            
            if(p != 0 && p != 1) { // if loop is not on p0 or p1 steps
                int num = (A.get(p - 2) - (A.get(p - 1) * Q.get(p - 2))) % mod; // calculate the p value for current step
                if (num < 0) { // fix for negative remainder using modulus in java
                    num += mod;
                }
                
                A.add(num); // add the result of pi calculation to the A list
            }
            
            pq = e; // set new pq value to e
            e = remainder; // set new e to remainder
            p++; // increment p
        }
            
        int num = (A.get(p - 2) - (A.get(p - 1) * Q.get(p - 2))) % mod; // calculate the p value
        
        if (num < 0) { // fix for negative remainder using modulus in java
            num += mod;
        }
        
        A.add(num); // add the last last p value to the list
        
        return A.get(p);
    }
    
    // finds two prime numbers that when multiplied equal the input number
    private int[] findPrimeFactor (int num) {
        ArrayList<Integer> primeNums = new ArrayList<>();
        primeNums.add(2);
        
        // starts at 3 and increments by 2 up to num, checking each number if it is prime
        for (int i = 3; i < num; i+=2) {
            if(isNumPrime(i)) { // check if current number is prime
                primeNums.add(i); // if number is prime, adds to list
            }
        }
        
        // Goes through the list of primes, checking if two of them multiplied together give you num
        for (int j = primeNums.size() - 1; j > 0; j--) {
            for (int k = primeNums.size() - 1; k > 0; k--) {
                if(primeNums.get(j) * primeNums.get(k) == num) {
                    int [] arr = {primeNums.get(j), primeNums.get(k)};
                    return arr;
                }
            }
        }
        
        int [] error = {0};
        
        return error;
    }
    
    // performs modular exponentiation by continuously calculating the mod after each power evaluation
    private int modularExponentiation (int num, int exp, int mod) {
        int result = 1;
   
        for (int i = 0; i < exp; i++) { // iterates up to the number of the exp
            result = ((result * num) % mod);
        }
        
        return result;
    }
    
    // converts numbers back t letters by reversing the encryption a * 26^2 + b * 26 + c
    private String numToText (int num) {
        int a, b, c, temp;
        HashMap<Integer, Character> map = new HashMap<>(); // hash map to map numbers to letters
        
        map.put(0, 'a');
        map.put(1, 'b');
        map.put(2, 'c');
        map.put(3, 'd');
        map.put(4, 'e');
        map.put(5, 'f');
        map.put(6, 'g');
        map.put(7, 'h');
        map.put(8, 'i');
        map.put(9, 'j');
        map.put(10, 'k');
        map.put(11, 'l');
        map.put(12, 'm');
        map.put(13, 'n');
        map.put(14, 'o');
        map.put(15, 'p');
        map.put(16, 'q');
        map.put(17, 'r');
        map.put(18, 's');
        map.put(19, 't');
        map.put(20, 'u');
        map.put(21, 'v');
        map.put(22, 'w');
        map.put(23, 'x');
        map.put(24, 'y');
        map.put(25, 'z');
        
        a = num % 26;
        temp = (num - a) / 26;
        b = temp % 26;
        c = (temp - b) / 26;
        
        // get the letter value of the number key from map. Return them concat together
        return String.valueOf(map.get(c)) + String.valueOf(map.get(b)) + String.valueOf(map.get(a));
    }
    
    // Checks if a input number is prime by incrementing up to square root of num mod i
    private Boolean isNumPrime (int num) {
        
        if (num == 2 || num == 3) { 
            return true; // if num is 2 or 3 then it is prime
        }
        
        if (num % 2 == 0 || num % 3 == 0) { 
            return false; // if num is evenly divisible by 2, 3, or 5, then it is not prime
        }
        
        // check all numbers starting at 3 up to the square root of thr number if they are divisible by i
        for (int i = 3; i < Math.sqrt(num) + 1; i+=2) { 
            if (num % i == 0) {
                return false; // if num is evenly divisibel by i then it is not prime
            }
        }
        
        return true;
    }
    
}