import java.util.Scanner;

public class BT_If_Else_XepLoaiHs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String hoTenHs;
		float diemXepLoai = 0;
		System.out.print("Họ và tên học sinh : ");
		hoTenHs = scan.nextLine();
		System.out.print("Điểm môn Toán : ");
		diemXepLoai += Float.parseFloat(scan.nextLine());
		System.out.print("Điểm môn Lý : ");
		diemXepLoai += Float.parseFloat(scan.nextLine());
		System.out.print("Điểm môn Hóa : ");
		diemXepLoai += Float.parseFloat(scan.nextLine());
		scan.close();
		diemXepLoai /= 3;
		System.out.println("Điểm trung bình 3 môn của học sinh là : " + String.format("%.2f", diemXepLoai));
		if(diemXepLoai >= 8.5) {
			System.out.println("Học sinh " + hoTenHs + " đạt loại giỏi");
		} else if(diemXepLoai >= 6.5) {
			System.out.println("Học sinh " + hoTenHs + " đạt loại khá");
		} else if(diemXepLoai >= 5) {
			System.out.println("Học sinh " + hoTenHs + " đạt loại Trung Bình");
		} else {
			System.out.println("Học sinh " + hoTenHs + " đạt loại Yếu");
		}
	}

}
