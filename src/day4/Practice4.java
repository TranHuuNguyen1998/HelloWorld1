package day4;

import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// breakpoint --> duoc dat tai dong muon ktra loi
		// f6 --> di den dong ke tiep
		// f8 --> nhay den breakpoint ke tiep
		// f5 --> nhay vao trong 1 menthod
		printNumber();
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
		Scanner in = new Scanner(System.in);
		System.out.println("Nhap so: ");
		int myInt = in.nextInt();
//		float myFloat = in.nextFloat();
//		String myString = in.next();
		
		// Kiem tra SNT
		for(int i = 2; i < myInt;i++) {
			if(myInt % i == 0) {
				System.out.println("So da nhap khong phai la so nguyen to");
				break;
			}
			else {
				System.out.println("So da nhap la so nguyen to");
				break;
			}
		}
	}
	
	public static void printNumber() {
		System.out.println("1");
		System.out.println("2");
	}

}
