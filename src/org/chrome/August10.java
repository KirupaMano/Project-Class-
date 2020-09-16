package org.chrome;

import java.util.Scanner;

public class August10 {
	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the mobile number ");
		String mobileNumber = obj.nextLine();
		if(mobileNumber.matches("[0-9]+") && mobileNumber.length() < 11) {
			System.out.println("valid");
		}
		else {
			System.out.println("Invalid");
		}
		}
		}