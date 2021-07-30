package logical_Question;

class S {

	public static void main(String[] args) {

		int[] a = { 10, 3, 4, 7, 0, -1 };
		System.out.println("Originl array ");
		for (int i : a) {
			System.out.print(i + " ");
		}
		int temp;
		for (int i = 0; i < a.length; i++) {
			int min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[i]) {
					min = j;
				}

				// max value store in temp
				temp = a[i];
				// swap the value ie min value store in original array from min
				a[i] = a[min];
				// store the value of temp in a[j]
				a[min] = temp;

			}

		}
		System.out.println();
		System.out.println("----------------------------");
		System.out.println("Sorted  array ");
		for (int i : a) {

			System.out.print(i + " ");
		}

	}

}