package logical_Question;

class BubbleSortExample {

	public static void main(String[] args) {

		int[] a = { 6, -2, 4, 5, 1, -10, 0 };
		System.out.println(" Unssorted Array is");

		for (int i : a) {
			System.out.print(i + " ");

		}
		System.out.println();
		System.out.println("--------------------------------------");

		bubbleSort(a);
		System.out.println("Sorted Array is");
		for (int i : a) {
			System.out.print(i + " ");

		}

	}

	static void bubbleSort(int[] a) {
		int temp = 0;

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];

					a[j] = temp;

				}

			}

		}
	}

}
