package mainday1;

public class PhepTinh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float firstNum = 10, secondNum = 5;
		
		System.out.println("Tong: " + (firstNum + secondNum));
		System.out.println("Hieu: " + (firstNum - secondNum));
		System.out.println("Tich: " + (firstNum * secondNum));
		System.out.println("Thuong: " + (firstNum / secondNum));
		
		float length = 10.5f, width = 5.5f;
		float canh = 7.7f;
		
		System.out.println("Dien tich HCN: " + tinhdienTichHCN(length, width));
		
		System.out.println("Chu vi HCN: " + tinhchuviHCN(length, width));
		
		System.out.println("Dien tich hinh vuong: " + tinhdienTichHV(canh));
		
		System.out.println("Chu vi hinh vuong: " + tinhchuvihHV(canh));
		
	}

	public static float tinhdienTichHCN(float length, float width) {

		float dienTich = length * width;
		return dienTich;
	}

	public static float tinhchuviHCN(float length, float width) {

		float chuVi = (length + width) * 2;
		return chuVi;
	}

	public static float tinhdienTichHV(float canh) {

		float dienTich = canh * canh;
		return dienTich;
	}

	public static float tinhchuvihHV(float canh) {

		float chuVi = canh * 4;
		return chuVi;
	}

}
