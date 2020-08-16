import java.util.Scanner;

public class casestudy {

	public static void main(String[] args) {
		// Đầu vào
		Scanner scan = new Scanner(System.in);

		float chieuDaiSan;
		float banKinhCay, khoangCachCay, soLuongCay;
		double dienTichCay;

		// Nhập dữ liệu
		System.out.print("Nhập vào chiều dài sân: ");
		chieuDaiSan = Float.parseFloat(scan.nextLine());
		System.out.println("Nhập vào bán kính cây trưởng thành: ");
		banKinhCay = Float.parseFloat(scan.nextLine());
		System.out.println("Nhập vào khoảng cách cần thiết giữa các cây trưởng thành: ");
		khoangCachCay = Float.parseFloat(scan.nextLine());

		// Xử lý
		soLuongCay = Math.round(chieuDaiSan / (banKinhCay * 2 + khoangCachCay)); // làm tròn xuống
		dienTichCay = (Math.sqrt(banKinhCay) * 3.14f) * soLuongCay; // diện tích 1 cây * số lượng cây

		// Đầu ra
		System.out.println("Số lượng cây có thể trồng là: " + soLuongCay);
		System.out.println("Tổng diện tích các cây trồng sau khi trưởng thành là: " + dienTichCay);

	}

}
