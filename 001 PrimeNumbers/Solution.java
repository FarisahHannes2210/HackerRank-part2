import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

        bufferedReader.close();

        BigInteger a = new BigInteger(n);

        boolean isPrime;
        isPrime = a.isProbablePrime(1);

        if (isPrime == true) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }

    }
}
