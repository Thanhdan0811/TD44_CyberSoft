import java.util.Scanner;

public class BaiTap_7_SinhVien_TreNhat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String tenSv_1, tenSv_2, tenSv_3;
		int namSinhSv_1, namSinhSv_2, namSinhSv_3;
		System.out.print("Nhập vào tên sinh viên thứ nhất :");
		tenSv_1 = scan.nextLine();
		System.out.print("Nhập vào năm sinh của sinh viên thứ nhất :");
		namSinhSv_1 = Integer.parseInt(scan.nextLine());
		System.out.print("Nhập vào tên sinh viên thứ hai :");
		tenSv_2 = scan.nextLine();
		System.out.print("Nhập vào năm sinh của sinh viên thứ hai :");
		namSinhSv_2 = Integer.parseInt(scan.nextLine());
		System.out.print("Nhập vào tên sinh viên thứ ba :");
		tenSv_3 = scan.nextLine();
		System.out.print("Nhập vào năm sinh của sinh viên thứ ba :");
		namSinhSv_3 = Integer.parseInt(scan.nextLine());
		scan.close();
		if(namSinhSv_1 > namSinhSv_2 && namSinhSv_1 > namSinhSv_3) {
			System.out.println("Sinh viên trẻ nhât là " + tenSv_1 + " với năm sinh là " + namSinhSv_1);
		}
		else if(namSinhSv_2 > namSinhSv_1 && namSinhSv_2 > namSinhSv_3) {
			System.out.println("Sinh viên trẻ nhât là " + tenSv_2 + " với năm sinh là " + namSinhSv_2);
		}
		else {
			System.out.println("Sinh viên trẻ nhât là " + tenSv_3 + " với năm sinh là " + namSinhSv_3);
		}
	}

}
