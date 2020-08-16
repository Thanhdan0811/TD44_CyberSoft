import java.util.Scanner;

public class BaiTap_5_SoNgay_TrongThang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int thang, nam;
		System.out.print("Nhập vào năm : ");
		nam = Integer.parseInt(scan.nextLine());
		System.out.print("Nhập vào tháng :");
		thang = Integer.parseInt(scan.nextLine());
		scan.close();
		if(thang == 1 || thang == 3 || thang == 5 || thang == 7 || thang == 8 || thang == 10 || thang == 12) {
			System.out.println("Tháng " + thang + " có 31 ngày");
		} else if(thang != 2) {
			System.out.println("Tháng " + thang + " có 30 ngày");
		} else {
			System.out.println("tính năm " + nam % 100 );
			// Cần xác định năm nhuận để tính số ngày của tháng 2
			// Nếu năm có 2 số cuối của năm là 00 thì năm đó phải chia hết cho 400 để là năm nhuận
			// Nếu năm có 2 số cuối của năm khác 00 thì năm đó phải chia hết cho 4 để là năm nhuận 
			if(nam % 100 == 0 && nam % 400 == 0 || nam % 100 != 0 && nam % 4 == 0) {
				System.out.println("Tháng " + thang + " có 29 ngày");
			} else {
				System.out.println("Tháng " + thang + " có 28 ngày");
			}
		}
	}

}
