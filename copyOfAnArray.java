public class copyOfAnArray {
	private static int[] copyOfAnArray(int[] ap) {
		int[] copy = new int[ap.length];
		for (int i=0; i < ap.length; ++i) {
			copy[i] = ap[i];
		}
		return copy;
	}
	public static void main(String[] args) {
		int[] original = {1, 2, 3, 4, 5};
		int[] copy;
		copy = copyOfAnArray(original);

		// change the copy
		for (int i=0; i < copy.length; ++i)
			copy[i] *= 2;

		System.out.println("original:");
		// print original
		for (int i=0; i < original.length; ++i)
			System.out.print(original[i] + " ");
		System.out.println();

		System.out.println("copy:");
		// print copy
		for (int i=0; i < copy.length; ++i)
			System.out.print(copy[i] + " ");
		System.out.println();
	}
}

