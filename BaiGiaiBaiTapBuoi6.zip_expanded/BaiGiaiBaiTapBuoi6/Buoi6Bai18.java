
/*
 * 18. Viết chương trình thực hiện những yêu cầu sau:
	. Tạo mảng 1 chiều phần tử nguyên có giá trị nhập vào từ bàn phím
	. Tìm các phần tử có số lần xuất hiện là như nhau và nhiều nhất
 */
import java.util.Scanner;

public class Buoi6Bai18 {

	public static final int SO_KHONG = 0;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		int[] arr = { 0, 0, 1, 1, 2, 2, 2, 3, 4, 5, 5, 5, 6, 7, 7, 7, 8, 8 }; // --->test
		int[] arr = nhapMang(scan);
		xuatMang(arr);
		timPhanTuNhieu(arr);

	}

	public static int[] nhapMang(Scanner scan) {
		System.out.print("Nhập số phần tử mảng : ");
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

	public static void timPhanTuNhieu(int[] arr) {
		int[] a = new int[arr.length];
		int viTri = SO_KHONG;
		int dem = SO_KHONG;
		for (int i = SO_KHONG; i < arr.length; i++) {
			int tam = arr[i];
			for (int j = i; j < arr.length; j++) {
				if (arr[j] == tam) {
					dem++;
				}
			}
			a[i] = dem;
			dem = SO_KHONG;
		}
		int max = a[SO_KHONG];
		for (int i = SO_KHONG; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("Các phần tử xuất hiện nhiều nhất và như nhau là : ");
		for (int i = SO_KHONG; i < a.length; i++) {
			if (a[i] == max) {
				viTri = i;
				System.out.println("arr[" + viTri + "]=" + arr[viTri]);
			}
		}
	}
}
