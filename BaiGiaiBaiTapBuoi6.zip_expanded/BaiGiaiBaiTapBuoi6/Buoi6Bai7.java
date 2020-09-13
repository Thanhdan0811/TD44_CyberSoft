
/*
 * 7. Tính tổng các chữ số có chữ số hàng chục là 5 trong mảng 1 chiều các số nguyên
 */
import java.util.Scanner;

public class Buoi6Bai7 {
	public static final int SO_KHONG = 0;
	public static final int SO_NAM = 5;
	public static final int SO_MUOI = 10;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = nhapMang(scan);
		xuatMang(arr);
		tinhTongCacChuSoHangChuc5(arr);
	}

	public static int[] nhapMang(Scanner scan) {
		System.out.print("Nhập số phần tử mảng: ");
		int n = Integer.parseInt(scan.nextLine());
		int[] arr = new int[n];
		for (int i = SO_KHONG; i < arr.length; i++) {
			System.out.print("arr[" + i + "]=");
			arr[i] = Integer.parseInt(scan.nextLine());
		}
		return arr;
	}

	public static void xuatMang(int[] arr) {
		System.out.println("Các phần tử trong mảng là : ");
		for (int i = SO_KHONG; i < arr.length; i++) {
			System.out.println("arr[" + i + "]=" + arr[i]);
		}
	}

	public static void tinhTongCacChuSoHangChuc5(int[] arr) {
		float tong = SO_KHONG;
		int tam = SO_KHONG;
		for (int i = SO_KHONG; i < arr.length; i++) {
			if (Math.abs(arr[i]) >= SO_MUOI) {
				tam = arr[i] / SO_MUOI;
				if (tam % SO_MUOI == SO_NAM || tam % SO_MUOI == -SO_NAM) {
					System.out.println("Số có chữ số hàng chục là 5 là : arr[" + i + "]=" + arr[i]);
					tong += arr[i];
				}
			}
		}
		if (tong == SO_KHONG) {
			System.out.println("Mảng không có số nào thỏa yêu cầu");
		} else {
			System.out.println("Tổng các số có chữ số hàng chục là 5 là : " + tong);
		}
	}
}
