import java.util.Scanner;

public class Bai_1_TienLuongNhanVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		float soNgayLam = 0;
		// Kiểm tra nhập số lớn hơn 0		
		do {
			System.out.print("Nhập vào số ngày làm của bạn : ");
			soNgayLam = Float.parseFloat(scan.nextLine());
			if(soNgayLam < 0) {
				System.out.println("bạn đã nhập sai ");

			};
		}while(soNgayLam < 0);
		scan.close();
		System.out.print("Tổng tiền lương của bạn là : " + soNgayLam * 100000);
	}

}

