import java.util.Scanner;

public class BaiTapToanTu_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * NHập vào điểm 3 môn Toán, ANh, Văn
		 * In ra điểm TB
		 */
		Scanner scanInput = new Scanner(System.in);
		System.out.println("Nhập vào điểm 3 môn : ");
		System.out.print("Điểm môn Toán : ");
		float so_1 = Float.parseFloat(scanInput.nextLine());
		System.out.print("Điểm môn Văn : ");
		float so_2 = Float.parseFloat(scanInput.nextLine());
		System.out.print("Điểm môn Anh Văn : ");
		float so_3 = Float.parseFloat(scanInput.nextLine());
		scanInput.close();
		System.out.println("Điểm trung bình 3 môn là : " + (so_1 + so_2 + so_3) / 3);
		// có thể dùng 1 biến và dùng      +=   
	}

}
