public class ArraysDemo {

	public static void main(String[] args) {

//		int arr[5];

//		int arr[] = { 10, 20, 30, 40, 50 };

		int arr[] = new int[5];

		arr[0] = 10;
		arr[1] = new Integer(20); // Autoboxing
		arr[3] = 30;

		System.out.println("elements of the array are: ");

//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}

		for (int element : arr) {
			System.out.println(element);
		}
	}

}
