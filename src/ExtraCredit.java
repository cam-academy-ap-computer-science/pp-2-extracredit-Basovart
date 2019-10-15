/* 
Top and bottom are the same
	14 spaces
	2 * down the middle
	add slashes to either side
		max of 5 to a side
3 lines that are the same
	print a +
	12 characters in between starting with = *




*/
public class ExtraCredit {
	public static final int SIZE = 3;
	public static void main(String[] args) {
		drawLine();

	}

	public static void drawTriangle() {
		
	}
	public static void drawLine() {
		System.out.print("+");
		for (int i = 1; i <= SIZE * 2; i++) {
			System.out.print("=*");
		}
		System.out.print("+");
	}
	public static void drawBox1() {
		
	}
	public static void drawBox2() {
		
	}
}
