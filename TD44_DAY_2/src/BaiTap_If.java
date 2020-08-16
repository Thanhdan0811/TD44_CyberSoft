import java.util.Scanner;

public class BaiTap_If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Viết chương trình cho người dùng nhập vào số nguyên
		 * Nếu nhập âm thì chuyển thành dương và in ra màn hình
		 */
		Scanner scan = new Scanner(System.in);
		int soInt;
		System.out.println("Nhập vào số âm : ");
		soInt = Integer.parseInt(scan.nextLine());
		scan.close();
		if(soInt < 0) {
			soInt *= -1;
		}
		System.out.println("Số dương là " + soInt);
	}

}
