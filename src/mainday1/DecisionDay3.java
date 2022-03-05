package mainday1;

public class DecisionDay3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myNum1 = 15;
		int myNum2 = 15;
		if (myNum1 > myNum2) {
			System.out.println("My num1 greater than num2");
		} else if (myNum1 == myNum2) {
			System.out.println("My num1 equal to than num2");
		} else {
			System.out.println("My num1 less than num2");
		}
		
		int a = 5, b = 9;
		
		boolean c = a > b ? true:false;
		System.out.println(c);
		
		int month = 1;
		switch(month) {
		case 1:
		case 3:
		case 5:
			System.out.println("31days");
		case 4:
		case 6:
		case 9:
			System.out.println("30days");
			break;
		default:
			System.out.println("Default");
			break;
		
		}
	}
}
