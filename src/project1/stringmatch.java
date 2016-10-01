package project1;

public class stringmatch {
	public static void main(String[] args) {
		String str1 = "JavaSelenium";
		String str2 = "JavaSelenium";

		/*
		 * if (str1.equalsIgnoreCase(str2)) { System.out.println("equal"); }
		 * else { System.out.println("not equal"); }
		 */
		boolean equal = true;
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] != arr2[j]) {
					equal = false;
				}

			}
		}
		if (equal) {
			System.out.println("String matches");
		} else {
			System.out.println("Strinf not equal");
		}

	}

}
