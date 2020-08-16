import java.util.Scanner;

public class Demo_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		float diemThi = 0;
		int soLanRot = 0;
		System.out.println("Nhập vào điểm thi : ");
		diemThi = Float.parseFloat(scan.nextLine());
		
		while(diemThi < 5) {
			soLanRot++;
			System.out.println("Nhập vào điểm thi : ");
			diemThi = Float.parseFloat(scan.nextLine());
		}
		System.out.println("số lần thi rớt : " + soLanRot);
	}

}
