
// Print 1 to 10 numbers
public class GitTest {
	public static void main(String[] args) {

		System.out.print("Print 1 to 10 numbers : ");
		for (int i = 1; i < 11; i++) {
			System.out.print(i + " ");
		}

		System.out.print("\nPrint 10 to 1 numbers : ");
		for (int i = 10; i > 0; i--) {
			System.out.print(i + " ");
		}

		System.out.print("\nPrint Even numbers : ");
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}

		System.out.print("\nPrint Odd Numbers : ");
		for (int i = 0; i < 10; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}

	}
}
