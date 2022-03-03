package mainday1;

public class HelloStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		
		float b = 10.5f;
		
		boolean isStudent = false;
		
		char myName = 'N';
		
		String myClass = "JDEV - D014";
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("I'm a student: " + isStudent);
		System.out.println("My Name: " + myName);
		System.out.println("My Class: " + myClass);
		
		// printMyname();
		
		System.out.println("Count Student: " + countStudent());
		
		int total = sumA(10);
		System.out.println("Total: " + total);
		
		int totalCAndD = sumCAndD(10, 20);
		System.out.println("Total C&D: " + totalCAndD);
		
	}
	// [access modifier] [static] [kieu tra ve] [ten phuong thuc (method)] (bien truyen vao) {noi dung}
	public static void printMyname() {
		System.out.println("My name: Nguyen");
	}
	
	public static int countStudent() {
		printMyname();
		return 10;
	}
	public static int sumA(int a) {
		
		return 10 + a;
	}
	
	public static int sumCAndD (int c, int d) {
		
		return c + d;
	}

}
