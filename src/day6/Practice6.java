package day6;

import java.util.Scanner;

public class Practice6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		// Cau 1
//		System.out.println("Tong cua S(n) = " + sum());

		// Cau 2
//		System.out.println("Nhap so nguyen duong n: ");
//		int n = in.nextInt();
//		System.out.println("Tich cac uoc so le cua so nguyen duong n = "+tichUSL(n));

		// Cau 3
//		System.out.println("Nhap so nguyen duong n: ");
//		int a = in.nextInt();
//		System.out.println("Tong cac uoc so nho hon chinh no = "+tongUS(a));

		// Cau 4
//		System.out.println("Nhap so nguyen duong n: ");
//		int b = in.nextInt();
//		System.out.println("Tich cac chu so le cua so nguyen duong n = " + tinhTichChuSoLe(b));

		// Cau 5
//		System.out.println("Nhap so nguyen duong n: ");
//		int c = in.nextInt();
//		timChuSoDau(c);

		// Cau 6
//		System.out.println("Nhap so nguyen duong n: ");
//		int d = in.nextInt();
//		System.out.println("So dao nguoc cua so nguyen duong n = " + timSoDaoNguoc(d));

		// Cau 7
//		System.out.println("Nhap so nguyen duong n: ");
//		int e = in.nextInt();
//		timChuSoLonNhat(e);
		
		// Cau 8
		System.out.println("Nhap so nguyen duong x: ");
		int x = in.nextInt();
		System.out.println("Nhap so nguyen duong y: ");
		int y = in.nextInt();
		timUCLN(x, y);
		
		// Cau 9
		timBCNN(x, y);
	}

	// Cau 1
	public static double sum() {
		int n;
		double sum = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Nhap n: ");
		n = in.nextInt();
		for (int i = 1; i <= n; i++) {
			sum += (double) i / (i + 1);
		}
		return sum;
	}

	// Cau 2
	public static int tichUSL(int n) {
		int tich = 1;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0 && i % 2 != 0) {
				tich *= i;
			}
		}
		return tich;
	}

	// Cau 3
	public static int tongUS(int a) {
		int sum = 0;
		for (int i = 1; i < a; i++) {
			if (a % i == 0) {
				sum += i;
			}
		}
		return sum;
	}

	// Cau 4
	public static int tinhTichChuSoLe(int b) {
		int tich = 1;
		while (b > 0) {
			int viTriCuoi = b % 10;
			if (viTriCuoi % 2 != 0) {
				tich *= viTriCuoi;
			}
			b = b / 10;
		}
		return tich;
	}

	// Cau 5
	public static void timChuSoDau(int c) {
		while (c / 10 != 0) {
			c = c / 10;
		}
		System.out.println("Chu so dau tien cua so nguyen duong n la: " + c);
	}

	// Cau 6
	public static int timSoDaoNguoc(int d) {
		int SoDaoNguoc = 0;
		while (d > 0) {
			int viTriCuoi = d % 10;
			SoDaoNguoc = SoDaoNguoc * 10 + viTriCuoi;
			d = d / 10;
		}
		return SoDaoNguoc;
	}

	// Cau 7
	public static void timChuSoLonNhat(int e) {
		int max = e % 10;
		while (e > 0) {
			int viTriCuoi = e % 10;
			if (viTriCuoi > max) {
				max = viTriCuoi;
			}
			e = e / 10;
		}
		System.out.println("Chu so lon nhat cua so nguyen duong n = " + max);
	}

	// Cau 8
	public static void timUCLN(int x, int y) {
		int UCLN;
		while (x != y) {
			if (x > y) {
				x = x - y;
			} else {
				y = y - x;
			}
		}
		UCLN = x;
		System.out.println("Uoc chung lon nhat cua 2 so nay la: " + UCLN);
	}
	
	// Cau 9
	public static void timBCNN(int x, int y) {
		int BCNN;
		int i = x;
		int j = y;
		while (x != y) {
			if (x > y) {
				y = y + j;
				
			} else {
				x = x + i;
				
			}
		}
		BCNN = x;
		System.out.println("Boi chung nho nhat cua 2 so nay la: " + BCNN);
	}
}
