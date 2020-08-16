import java.util.Scanner;

public class Bai8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int TONG_SO_NHAP = 5;
		int soNhap;
		int demChan = 0;

		System.out.println("Mời nhập vào số thứ nhất: ");
		soNhap = Integer.parseInt(scan.nextLine());
		if (soNhap % 2 == 0) {
			demChan++;
		}
		System.out.println("Mời nhập vào số thứ hai: ");
		soNhap = Integer.parseInt(scan.nextLine());
		if (soNhap % 2 == 0) {
			demChan++;
		}
		System.out.println("Mời nhập vào số thứ ba: ");
		soNhap = Integer.parseInt(scan.nextLine());
		if (soNhap % 2 == 0) {
			demChan++;
		}
		System.out.println("Có " + demChan + " số chẵn. " + "Có " + (TONG_SO_NHAP - demChan) + " số lẻ.");
	}

}
