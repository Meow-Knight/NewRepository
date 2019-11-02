package view;

@FunctionalInterface
interface Addable {
	int add(int a, int b);
}

public class Ex01 {


public static void main(String[] args) {
		Addable ad5 = (a, b) -> (a + b);
		System.out.println(ad5.add(10, 20));

		Addable ad51 = (a, b) -> (a - b);
		System.out.println(ad51.add(10, 20));

		Addable ad52 = (a, b) -> (a * b);
		System.out.println(ad52.add(10, 20));

		Addable ad53 = (a, b) -> (a / b);
		System.out.println(ad53.add(10, 20));
	}


	private int tong(int a, int b) {
		return a + b;
	}

	private int tich(int a, int b) {
		return a * b;
	}
}
