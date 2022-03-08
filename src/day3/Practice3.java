package day3;

import java.rmi.server.RemoteStub;
import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testNumber();
		System.out.println("So lon nhat la: " + largestNumber());
		number();
		sortNumber();
		System.out.println("Luong cua nhan vien: " + salary());
		math();
		testYear();
	}

	public static void testNumber() {
		int a = 5;
		if (a % 2 == 0) {
			System.out.println("a la so chan");
		} else {
			System.out.println("a la so le");
		}
	}

	public static int largestNumber() {
		int a = 9, b = 8, c = 7;
		int max;

		if (a < b && c < b) {
			max = b;
		} else if (a < b && b < c) {
			max = c;
		} else {
			max = a;
		}
		return max;

	}

	public static void number() {
		int num = 45;
		if (num >= 10 && num <= 100) {
			System.out.println("So da cho nam trong khoang 10 den 100");
		}
	}

	public static void sortNumber() {
		int a = 5, b = 7, c = 4;
		if (a < b && b < c) {
			System.out.println("a, b, c sap xep theo chieu tang dan");
		} else if (a > b && b > c) {
			System.out.println("a, b, c sap xep theo chieu giam dan");
		} else {
			System.out.println("a, b, c khong sap xep theo chieu tang dan hay giam dan");
		}
	}

	public static double salary() {
		final int basicSalary = 650000;
		double salary = 0;
		int years;
		Scanner in = new Scanner(System.in);
		System.out.println("Moi nhap so nam cong tac theo thang: ");
		years = in.nextInt();
		if (years < 12) {
			salary = 1.92 * basicSalary;
		} else if (years >= 12 && years < 36) {
			salary = 2.34 * basicSalary;
		} else if (years >= 36 && years < 60) {
			salary = 3 * basicSalary;
		} else {
			salary = 4.5 * basicSalary;
		}
		return salary;
	}

	public static void math() {
		int a, b;
		int x;
		Scanner in = new Scanner(System.in);
		System.out.println("Nhap so a: ");
		a = in.nextInt();
		System.out.println("Nhap so b: ");
		b = in.nextInt();
		if (a == 0) {
			if (b == 0) {
				System.out.println("Phuong trinh vo so nghiem");
			} else {
				System.out.println("Phuong trinh vo nghiem");
			}
		} else if (a != 0) {
			if (b == 0) {
				System.out.println("Phuong trinh co nghiem x = 0");
			} else {
				System.out.println("Phuong trinh co nghiem x = -b/a");
				System.out.printf("Nghiem cua phuong trinh = %f", (float) -b / a);
			}
		}
	}

	public static void testYear() {
		int year;
		int month;
		Scanner in = new Scanner(System.in);
		System.out.println("Nhap nam");
		year = in.nextInt();
		System.out.println("Nhap thang");
		month = in.nextInt();
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Thang co 31 ngay");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("Thang co 30 ngay");
			break;
		case 2:
			if(year % 4 == 0 && year % 4 !=0 || year % 400 == 0) {
				System.out.println("Thang co 29 ngay");
			}
			else {
				System.out.println("Thang co 28 ngay");
			}
		default:
			break;
		}
	}
}
