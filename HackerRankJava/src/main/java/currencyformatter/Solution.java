package currencyformatter;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        Locale indiaLocale = new Locale("en", "IN");
        System.out.println("US: " + NumberFormat.getCurrencyInstance(Locale.US).format(payment));
        System.out.println("India: " + NumberFormat.getCurrencyInstance(indiaLocale).format(payment));
        System.out.println("China: " + NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment));
        System.out.println("France: " + NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment));

	}

}
