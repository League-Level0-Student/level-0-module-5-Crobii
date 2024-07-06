package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class primeOrNot {
	public static void main(String [] args) {
		String number = JOptionPane.showInputDialog(null, "Put in a number and we'll tell you if it is prime");
		int primeNumber = Integer.parseInt(number);
		boolean isPrime = true;

		for(int i = 2; i <= primeNumber/2; i++) {
			if(primeNumber%i == 0) {
				isPrime = false;
				break;
			}
			
		}
		if(isPrime == false) {
			JOptionPane.showMessageDialog(null, "Your number is not prime");
		}
		else {
			JOptionPane.showMessageDialog(null, "Your number is prime");
		}
	}
}
