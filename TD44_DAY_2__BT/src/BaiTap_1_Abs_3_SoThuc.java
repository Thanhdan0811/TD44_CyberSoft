import java.util.Scanner;
public class BaiTap_1_Abs_3_SoThuc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		float so_1, so_2, so_3;
		System.out.print("Nhập vào số thứ nhất : ");
		so_1 = Float.parseFloat(scan.nextLine());
		System.out.print("Nhập vào số thứ hai : ");
		so_2 = Float.parseFloat(scan.nextLine());
		System.out.print("Nhập vào số thứ ba : ");
		so_3 = Float.parseFloat(scan.nextLine());
		scan.close();
		// Kiểm tra các số là dương hay âm		
		if(so_1 < 0) {
			so_1 = -so_1;
		}
		if(so_2 < 0) {
			so_2 = -so_2;
		}
		if(so_3 < 0) {
			so_3 = -so_3;
		}
		System.out.println("Trị tuyệt đối của số thứ nhất : " + so_1);
		System.out.println("Trị tuyệt đối của số thứ hai : " + so_2);
		System.out.println("Trị tuyệt đối của số thứ ba : " + so_3);
	}

}
