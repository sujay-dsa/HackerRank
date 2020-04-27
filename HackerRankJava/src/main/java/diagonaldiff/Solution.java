package diagonaldiff;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
    	
    	int n = arr.size();
    	int i=0;
    	ArrayList<Integer> frontDiagonal = new ArrayList<Integer>();
    	ArrayList<Integer> backDiagonal = new ArrayList<Integer>();
    	
    	while(i< n) {
    		frontDiagonal.add(arr.get(i).get(i));
    		backDiagonal.add(arr.get(i).get(n-1-i));
    		i++;
    	}
    	
    	Integer frontSum = frontDiagonal.stream().reduce(0, (a, b) -> a + b);
    	Integer backSum = backDiagonal.stream().reduce(0, (a, b) -> a + b);
    	
    	System.out.println(backDiagonal);
    	int diff = frontSum - backSum;
		return diff < 0? -1*diff:diff;
    

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.diagonalDifference(arr);

        
    }
}
