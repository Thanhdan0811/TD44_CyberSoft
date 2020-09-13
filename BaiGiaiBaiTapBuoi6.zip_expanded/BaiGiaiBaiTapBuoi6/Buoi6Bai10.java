
/*
 * 10. Tạo ngẫu nhiên mảng 1 chiều n phần tử (n nguyên) có giá trị chứa trong đoạn [-1000, 1000]. Tính trung bình cộng các giá trị lớn hơn
	giá trị x do người dùng nhập vào trong mảng 1 chiều các số thực
 */
import java.util.Scanner;

public class Buoi6Bai10 {

	public static final int SO_KHONG = 0;
	public static final int SO_MOT = 1;
	public static final int SO_MOT_NGAN = 1000;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = taoMang(scan);
		xuatMang(arr);
		tinhTongYeuCau(scan, arr);

	}

	public static int[] taoMang(Scanner scan) {
		System.out.print("Nhập số phần tử mảng: ");
		int n = Integer.parseInt(scan.nextLine());
		int[] arr = new int[n];
		for (int i = SO_KHONG; i < arr.length; i++) {
			arr[i] = -SO_MOT_NGAN + (int) (Math.random() * ((SO_MOT_NGAN + SO_MOT_NGAN) + SO_MOT));
		}
		return arr;
	}

	public static void xuatMang(int[] arr) {
		System.out.println("Các phần tử trong mảng là : ");
		for (int i = SO_KHONG; i < arr.length; i++) {
			System.out.println("arr[" + i + "]=" + arr[i]);
		}
	}

	public static void tinhTongYeuCau(Scanner scan, int[] arr) {
		int tong = SO_KHONG;
		int soGiaTri = SO_KHONG;
		System.out.print("Mời nhập mức x : ");
		int x = Integer.parseInt(scan.nextLine());
		for (int i = SO_KHONG; i < arr.length; i++) {
			if (arr[i] > x) {
				soGiaTri++;
				System.out.println("Giá trị lớn hơn " + x + " là : " + "arr[" + i + "]=" + arr[i]);
				tong += arr[i];
			}
		}
		if (tong == SO_KHONG) {
			System.out.println("Không có số thỏa yêu cầu");
		} else {
			System.out.println("--->> Trung bình cộng các giá trị lớn hơn " + x + " là : " + (tong / soGiaTri));
		}
	}
}
