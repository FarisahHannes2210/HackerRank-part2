import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        // String n;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // ArrayList<Double> values = new ArrayList<>();
        ArrayList<Double> values = new ArrayList<Double>();
        
        for(int i = 0; i < br.read(); i++){
        //    String n = br.readLine();
        double d =  Double.parseDouble(br.readLine());
           values.add(d);
            
        }
   
Double[] valueArray = new Double[values.size()];
     valueArray = values.toArray(valueArray);
     Arrays.sort(valueArray);
     
     for(int i = valueArray.length; i >= 0; i--){
        
     }
     
    }
  
    
     
    
}
