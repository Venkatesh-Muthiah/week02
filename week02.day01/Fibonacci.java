package week02.day01;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int firstNum = 0, secondNum = 1, nextNum = 0, lastNum = 56;

		for (int i = 0; i <= 11; i++) {
			if (firstNum <= lastNum) {
				System.out.print(firstNum + " ");
				nextNum = firstNum + secondNum;
				firstNum = secondNum;
				secondNum = nextNum;
			}
		}
	}
}
