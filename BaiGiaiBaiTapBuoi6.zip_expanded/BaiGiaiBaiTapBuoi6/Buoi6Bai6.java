
/*
 * 6. Tạo ngẫu nhiên mảng 1 chiều n phần tử (n nguyên) có giá trị chứa trong đoạn [-1000, 1000]. 
 * 	Tính tổng các giá trị dương trong mảng 1 chiều các số thực
 */
import java.util.Scanner;

public class Buoi6Bai6 {
	public static final int SO_KHONG = 0;
	public static final int SO_MOT = 1;
	public static final int SO_MOT_NGAN = 1000;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float[] arr = taoMang(scan);
		xuatMang(arr);
		tinhTong(arr);
	}

	public static float[] taoMang(Scanner scan) {
		System.out.print("Nhập số phần tử mảng: ");
		int n = Integer.parseInt(scan.nextLine());
		float[] arr = new float[n];
		for (int i = SO_KHONG; i < arr.length; i++) {
			arr[i] = -SO_MOT_NGAN + (float) (Math.random() * ((SO_MOT_NGAN + SO_MOT_NGAN) + SO_MOT));
		}
		return arr;
	}

	public static void xuatMang(float[] arr) {
		System.out.println("Các phần tử trong mảng là : ");
		for (int i = SO_KHONG; i < arr.length; i++) {
			System.out.println("arr[" + i + "]=" + arr[i]);
		}
	}

	public static void tinhTong(float[] arr) {
		float tong = SO_KHONG;
		for (int i = SO_KHONG; i < arr.length; i++) {
			if (arr[i] > SO_KHONG) {
				tong += arr[i];
			}
		}
		if (tong == SO_KHONG) {
			System.out.println("Mảng không có số dương nào");
		} else {
			System.out.println("Tổng các số dương là : " + tong);
		}
	}
}
