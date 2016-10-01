package project1;

public class primenumber {
	public static void main(String[] args) {
		// prime number

		for (int i = 1; i <= 100; i++) {
			int k = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					k = 1;
					break;
				}
			}
			if (k == 0) {
				System.out.println(i);
			}

		}
	}

}
