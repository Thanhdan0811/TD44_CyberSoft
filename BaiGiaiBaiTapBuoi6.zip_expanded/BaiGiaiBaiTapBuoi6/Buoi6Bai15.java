
/*
 * 15. Tạo ngẫu nhiên mảng 1 chiều n phần tử (n nguyên) có giá trị chứa trong đoạn [-100, 100] và xuất mảng. Hãy dịch phải xoay
	vòng mảng k lần, k nhập từ bàn phím.
	Ví dụ: Mảng ban đầu: 4 -33 36 -4 12 72 -9 -87 76 -40
	Số lần dịch: 3 ---> -87 76 -40 4 -33 36 -4 12 72 -9
 */
import java.util.Scanner;

public class Buoi6Bai15 {
	public static final int SO_KHONG = 0;
	public static final int SO_MOT = 1;
	public static final int SO_MOT_TRAM = 100;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = taoMang(scan);
		xuatMang(arr);
		dichMang(scan, arr);

	}

	public static int[] taoMang(Scanner scan) {
		System.out.print("Nhập số phần tử mảng : ");
		int n = Integer.parseInt(scan.nextLine());
		int[] arr = new int[n];
		for (int i = SO_KHONG; i < arr.length; i++) {
			arr[i] = -SO_MOT_TRAM + (int) (Math.random() * ((SO_MOT_TRAM + SO_MOT_TRAM) + SO_MOT));
		}
		return arr;
	}

	public static void xuatMang(int[] arr) {
		System.out.println("Mảng trước khi dịch chuyển là : ");
		for (int i = SO_KHONG; i < arr.length; i++) {
			System.out.println("arr[" + i + "]=" + arr[i]);
		}
	}

	public static void dichMang(Scanner scan, int[] arr) {
		System.out.print("Nhập số lần dịch : ");
		int k = Integer.parseInt(scan.nextLine());
		int[] a = new int[arr.length + k];
		for (int i = SO_MOT; i <= k; i++) {
			for (int j = SO_KHONG; j < arr.length; j++) {
				a[j + k] = arr[j];
				int tam = SO_MOT;
				while (tam <= k) {
					a[k - tam] = a[a.length - tam];
					tam++;
				}
			}
		}
		System.out.println("Mảng sau khi dịch chuyển là : ");
		for (int i = SO_KHONG; i < (a.length - k); i++) {
			System.out.println("arr[" + i + "]=" + a[i]);
		}
	}
}
