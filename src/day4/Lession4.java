package day4;

public class Lession4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			System.out.println(i + 1);
		}
		System.out.println("---------------------------\n");
		int i = 1;
		while (i < 6) {
			System.out.println(i);
			i++;
		}
		System.out.println("\n");
		int a = 1;
		do {
			System.out.println(a);
			a++;
		} while (a < 6);

		System.out.println("----------------");
		for (int k = 0; k < 5; k++) {
			System.out.print(k + ": ");
			for (int j = 0; j < 5; j++) {
				if (j == 4) {
					break;
				}
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		System.out.println("----------------");
		for (int k = 0; k < 6; k++) {
			System.out.print(k + ": ");
			for (int j = 0; j < 6; j++) {
				if (j == 4) {
					continue;
				}
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
