import java.util.Scanner;

public class Bai_5_TongHaiKySo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int soHaiKySo = 0;
		Scanner scan = new Scanner(System.in);
		// Kiểm tra yêu cầu có 2 ký số		
		while(soHaiKySo < 10 || soHaiKySo > 99) {
			System.out.print("Nhập vào số có hai ký sô : ");
			soHaiKySo = Integer.parseInt(scan.nextLine());
		}
		scan.close();
		System.out.println("Tổng hai ký số là " + ((soHaiKySo % 10) + soHaiKySo / 10));
	}

}
