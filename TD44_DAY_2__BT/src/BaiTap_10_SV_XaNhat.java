import java.util.Scanner;

public class BaiTap_10_SV_XaNhat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String tenSv_1, tenSv_2, tenSv_3;
		float nhaSv_1_x, nhaSv_1_y, nhaSv_2_x, nhaSv_2_y, nhaSv_3_x, nhaSv_3_y, truong_x, truong_y;
		float khoangCach_Sv1_Truong, khoangCach_Sv2_Truong, khoangCach_Sv3_Truong;
		System.out.print("Tên SV 1: ");
		tenSv_1 = scan.nextLine();
		System.out.print("Tọa độ x nhà SV 1 : ");
		nhaSv_1_x = Float.parseFloat(scan.nextLine());
		System.out.print("Tọa độ y nhà SV 1 : ");
		nhaSv_1_y = Float.parseFloat(scan.nextLine());
		System.out.print("Tên SV 2: ");
		tenSv_2 = scan.nextLine();
		System.out.print("Tọa độ x nhà SV 2 : ");
		nhaSv_2_x = Float.parseFloat(scan.nextLine());
		System.out.print("Tọa độ y nhà SV 2 : ");
		nhaSv_2_y = Float.parseFloat(scan.nextLine());
		System.out.print("Tên SV 3: ");
		tenSv_3 = scan.nextLine();
		System.out.print("Tọa độ x nhà SV 3 : ");
		nhaSv_3_x = Float.parseFloat(scan.nextLine());
		System.out.print("Tọa độ y nhà SV 3 : ");
		nhaSv_3_y = Float.parseFloat(scan.nextLine());
		System.out.print("Tọa độ x của trường : ");
		truong_x = Float.parseFloat(scan.nextLine());
		System.out.print("Tọa độ y của trường : ");
		truong_y = Float.parseFloat(scan.nextLine());
		scan.close();
		khoangCach_Sv1_Truong = (float)Math.sqrt((truong_x - nhaSv_1_x) * (truong_x - nhaSv_1_x)  + (truong_y - nhaSv_1_y) * (truong_y - nhaSv_1_y));
		khoangCach_Sv2_Truong = (float)Math.sqrt((truong_x - nhaSv_2_x) * (truong_x - nhaSv_2_x)  + (truong_y - nhaSv_2_y) * (truong_y - nhaSv_2_y));
		khoangCach_Sv3_Truong = (float)Math.sqrt((truong_x - nhaSv_3_x) * (truong_x - nhaSv_3_x)  + (truong_y - nhaSv_3_y) * (truong_y - nhaSv_3_y));
		
		if(khoangCach_Sv1_Truong == khoangCach_Sv2_Truong && khoangCach_Sv1_Truong == khoangCach_Sv3_Truong) {
			System.out.println("Không có nhà sinh viên nào xa nhất");
		} else if(khoangCach_Sv1_Truong == khoangCach_Sv2_Truong && khoangCach_Sv1_Truong > khoangCach_Sv3_Truong) {
			System.out.println("nhà 2 sinh viên là " + tenSv_1 + " và " + tenSv_2 + " ở xa nhất");
		} else if(khoangCach_Sv2_Truong == khoangCach_Sv3_Truong && khoangCach_Sv2_Truong > khoangCach_Sv1_Truong) {
			System.out.println("nhà 2 sinh viên là " + tenSv_2 + " và " + tenSv_3 + " ở xa nhất");
		} else if(khoangCach_Sv1_Truong == khoangCach_Sv3_Truong && khoangCach_Sv1_Truong > khoangCach_Sv2_Truong) {
			System.out.println("nhà 2 sinh viên là " + tenSv_1 + " và " + tenSv_3 + " ở xa nhất");
		} else if(khoangCach_Sv1_Truong > khoangCach_Sv2_Truong && khoangCach_Sv1_Truong  > khoangCach_Sv3_Truong) {
			System.out.println("Sinh viên " + tenSv_1 + " ở xa nhất");
		} else if(khoangCach_Sv2_Truong > khoangCach_Sv1_Truong && khoangCach_Sv2_Truong  > khoangCach_Sv3_Truong) {
			System.out.println("Sinh viên " + tenSv_2 + " ở xa nhất");
		} else {
			System.out.println("Sinh viên " + tenSv_3 + " ở xa nhất");
		}
	}

}
