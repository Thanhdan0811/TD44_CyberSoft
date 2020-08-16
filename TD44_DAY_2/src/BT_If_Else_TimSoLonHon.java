import java.util.Scanner;

public class BT_If_Else_TimSoLonHon {
	public static void main(String[] args) {
		/*
		 * Viết chương trình nhập 2 số thực
		 * In ra số lơn hơn
		 * vd : 4 và 5 => in ra số thứ nhất lớn hơn số thứ hai
		 */
		float so_1 = 0 , so_2 = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhập vào số thứ nhất : ");
		so_1 = Float.parseFloat(scan.nextLine());
		System.out.print("Nhập vào số thứ hai : ");
		so_2 = Float.parseFloat(scan.nextLine());
		scan.close();
		if(so_1 > so_2) {
			System.out.println("Số thứ nhất lớn hơn số thứ hai");
		} else if(so_1 == so_2) {
			System.out.println("Số thứ nhất bằng số thứ hai");
		}
		else {
			System.out.println("Số thứ hai lớn hơn số thứ nhất");
		}
	}
}
