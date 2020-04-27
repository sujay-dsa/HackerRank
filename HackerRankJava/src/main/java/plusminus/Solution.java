package plusminus;

import java.util.Scanner;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
    	int i=0;
    	double positives = 0, negatives = 0, zeros = 0;
    	Double total = Double.valueOf(arr.length);
    	while( i < total) {
    		if(arr[i]> 0) {
    			positives = positives+1;
    		}else if(arr[i]==0) {
    			zeros = zeros+1;
    		}else {
    			negatives = negatives+1;
    		}
    		
    	i++;	
    	}
    	System.out.println(String.format("%.6f",positives/total));
    	System.out.println(String.format("%.6f",negatives/total));
    	System.out.println(String.format("%.6f",zeros/total));
    	

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}

