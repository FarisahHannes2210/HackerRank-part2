import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> values = new ArrayList<>();

        int n = Integer.parseInt(br.readLine().trim()); // Read the number of elements

        for (int i = 0; i < n; i++) {
            String input = br.readLine().trim();
            values.add(input);
        }

        // Sort based on numerical value but keep the original string format
        values.sort((a, b) -> Double.compare(Double.parseDouble(b), Double.parseDouble(a)));

        //-------------------- WITHOUT LAMBDA -------------------------

         // Sort using a Comparator (instead of a lambda)
        //  Collections.sort(values, new Comparator<String>() {
        //     @Override
        //     public int compare(String a, String b) {
        //         // Convert strings to double and compare for descending order
        //         return Double.compare(Double.parseDouble(b), Double.parseDouble(a));
        //     }
        // });

        // Print the values in original format
        for (String num : values) {
            System.out.println(num);
        }
    }
}
