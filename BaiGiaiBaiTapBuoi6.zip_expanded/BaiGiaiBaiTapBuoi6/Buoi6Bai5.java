/*
 * 5. Hãy liệt kê các giá trị trong mảng 1 chiều các số nguyên có chữ số đầu tiên là số chẵn
 */
import java.util.Scanner;

public class Buoi6Bai5 {
	public static final int SO_KHONG = 0;
	public static final int SO_MUOI = 10;
	public static final int SO_HAI = 2;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = nhapMang(scan);
		xuatMang(arr);
		lietKeCacPhanTuCoSoDauTienChan(arr);
	}

	public static int[] nhapMang(Scanner scan) {
		System.out.print("--->> Nhập số phần tử mảng: ");
		int n = Integer.parseInt(scan.nextLine());
		int[] arr = new int[n];
		for (int i = SO_KHONG; i < arr.length; i++) {
			System.out.print("arr[" + i + "]=");
			arr[i] = Integer.parseInt(scan.nextLine());
		}
		return arr;
	}

	public static void xuatMang(int[] arr) {
		System.out.println("--->> Các phần tử trong mảng là : ");
		for (int i = SO_KHONG; i < arr.length; i++) {
			System.out.println("arr[" + i + "]=" + arr[i]);
		}
	}

	public static void lietKeCacPhanTuCoSoDauTienChan(int[] arr) {
		int soSoChan = SO_KHONG;
		System.out.println("--->> Các số có chữ số đầu tiên chẵn là : ");
		for (int i = SO_KHONG; i < arr.length; i++) {
			boolean flag = true;
			int tam = arr[i];
			while (flag) {
				if (Math.abs(tam) < SO_MUOI) {
					flag = false;
					continue;
				}
				tam /= SO_MUOI;
			}
			if (tam % SO_HAI == SO_KHONG) {
				soSoChan++;
				System.out.println("arr[" + i + "]=" + arr[i]);
			}
		}
		if (soSoChan == SO_KHONG) {
			System.out.println("--->> Không có số thỏa điều kiện");
		}
	}
}
