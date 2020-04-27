package md5;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		scanner.close();
		
		MessageDigest md5 = MessageDigest.getInstance("MD5");
		for (byte b : md5.digest(s.getBytes())) {
			System.out.printf("%02x", b);
		};
		

	}

}
