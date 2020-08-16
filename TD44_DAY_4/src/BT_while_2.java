import java.util.Scanner;

public class BT_while_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		float tongNhap = 0, soNhap;
		boolean tiepTucChay = false;
		
		do {
			System.out.print("nhập vào số bất kỳ : ");
			soNhap = Float.parseFloat(scan.nextLine());
			if(soNhap > 0) {
				tongNhap += soNhap;
				tiepTucChay = true;
			} else {
				tiepTucChay = false;
			}
		}
		while(tiepTucChay);
		System.out.println("Tong so nhap vào là : " + tongNhap);
	}

}
