
/*
 * 4. Tạo ngẫu nhiên mảng 1 chiều n phần tử nguyên có giá trị chứa trong đoạn [-1000, 1000].Hãy liệt kê các giá trị có toàn chữ số lẻ 
	trong mảng 1 chiều các số nguyên
 */
import java.util.Scanner;

public class Buoi6Bai4 {
	public static final int SO_MUOI = 10;
	public static final int SO_KHONG = 0;
	public static final int SO_MOT = 1;
	public static final int SO_MOT_NGAN = 1000;
	public static final int SO_HAI = 2;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = taoMang(scan);
		xuatMang(arr);
		lietKeSoLe(arr);
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

	public static boolean kiemTraSoLe(int n) {
		n = Math.abs(n);
		do {
			int temp = n % SO_MUOI;
			if (temp % SO_HAI == SO_KHONG)
				return false;
			n /= SO_MUOI;
		} while (n > SO_KHONG);
		return true;
	}

	public static void lietKeSoLe(int[] arr) {
		int dem = SO_KHONG;
		for (int i = SO_KHONG; i < arr.length; i++) {
			if (kiemTraSoLe(arr[i])) {
				System.out.println("Số có các chữ số toàn số lẻ là : " + "arr[" + i + "]=" + arr[i]);
				dem++;
			}
		}
		if (dem == SO_KHONG) {
			System.out.println("Không có số nào thỏa mãn");
		}
	}
}
