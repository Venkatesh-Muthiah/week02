package week02.day01;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 64, factor = 0;

		if (num > 1) {
			for (int i = 2; i < num; i++) {
				if (num % i == 0)
				factor++;
				break;
			}
			if (factor == 0) {
				System.out.println(num + " is a prime number");
			} else {
				System.out.println(num + " is not a prime number");
			}
		} else {
			System.out.println(num + " is not a prime number");
		}
	}
}
