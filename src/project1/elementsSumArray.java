package project1;

public class elementsSumArray {
	public static void sumofElements(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		sumofElements(new int[] { 0, 3, 5, 4, 2 });

	}

}
