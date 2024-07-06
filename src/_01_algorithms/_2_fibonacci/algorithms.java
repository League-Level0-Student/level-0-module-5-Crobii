package _01_algorithms._2_fibonacci;

import javax.swing.JOptionPane;

import java.util.Scanner;
public class algorithms {
public static void main(String [] args) {
	Scanner scnr = new Scanner(System.in);
	int num1;
	int num2;
	int sum;
	
	num1 = scnr.nextInt();
	num2 = scnr.nextInt();
	
	for(int i = 0; i<10; i++) {
		sum = (num2+num1);
		num1=num2;
		num2=sum;
		System.out.println(sum);
	}
}
}
