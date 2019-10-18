public class ExtraCredit {
	public static final int SIZE = 4;
	public static void main(String[] args) {
		tip();
		topHalf();
		middle();
	}
	
	public static void middle() {
		for (int k = 1; k <= SIZE * 4; k++) {
			for (int space = 1; space<= SIZE * 2; space++) {
				System.out.print(" ");
			}
			System.out.println(" |%%||%%|");
		}
	}
	public static void tip() {
		for (int tip = 1; tip <= SIZE; tip++) {
			for (int space = 1; space<= SIZE * 3; space++) {
				System.out.print(" ");
			}
			System.out.println("||");
		}
	}
	public static void topHalf() {
		for (int top = SIZE; top >= 1; top--) {
			for (int space = (SIZE * 3) - 3; space >= 1; space--) {
				System.out.print(" ");
			}
		}
	}
}
		