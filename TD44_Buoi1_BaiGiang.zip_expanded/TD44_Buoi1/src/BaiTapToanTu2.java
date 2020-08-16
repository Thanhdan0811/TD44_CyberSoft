import java.util.Scanner;

public class BaiTapToanTu2 {

	public static void main(String[] args) {
		/*
		 * Viết chương trình cho người dùng nhập vào
		 * điểm 3 môn Toán, Văn, Anh Văn
		 * 
		 * In ra điểm trung bình ba môn học.
		 */
		Scanner scanner = new Scanner(System.in);
		float diemTong = 0;
		
		System.out.print("Nhập điểm Toán: ");
		diemTong += Float.parseFloat(scanner.nextLine());
		System.out.print("Nhập điểm Văn: ");
		diemTong += Float.parseFloat(scanner.nextLine());
		System.out.print("Nhập điểm Anh: ");
		diemTong += Float.parseFloat(scanner.nextLine());
		
		
		System.out.println("Điểm trung bình: " + diemTong/3);
	}

}
