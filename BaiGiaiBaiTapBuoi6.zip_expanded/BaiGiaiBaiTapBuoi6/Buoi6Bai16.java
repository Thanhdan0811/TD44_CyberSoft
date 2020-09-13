
/*
 * 16. Tạo mảng 1 chiều n phần tử (n nguyên) có giá trị nhập từ bàn phím. Xuất phần tử xuất hiện nhiều nhất, 
	xuất hiện ít nhất tìm thấy đầu tiên. (Đầu tiên để loại trường hợp tính số phần tử xuất hiện nhiều nhất bằng nhau)
	Ví dụ: Mảng ban đầu: 3 2 2 3 4 3 2 5 5 3
	Phần tử xuất hiện nhiều nhất: 3 [4 lần]
	Phần tử xuất hiện ít nhất: 4 [1 lần]
 */
import java.util.Scanner;

public class Buoi6Bai16 {

	public static final int SO_KHONG = 0;
	public static final int SO_MOT = 1;
	public static final int SO_TRU_MOT = -1;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		int[] arr = { 0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 1, 5, 5, 5, 7, 7, 7, 8, 8 };
		int[] arr = nhapMang(scan);
		xuatMang(arr);
		demPhanTuNhieuNhat(arr);
		demPhanTuItNhat(arr);
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

	public static void demPhanTuNhieuNhat(int[] arr) {
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
		for (int i = SO_KHONG; i < a.length; i++) {
			if (a[i] == max) {
				viTri = i;
				break;
			}
		}
		System.out.println("Số có số phần tử nhiều nhất xuất hiện đầu tiên là : arr[" + viTri + "]=" + arr[viTri]
				+ " với " + a[viTri] + " lần");
	}

	public static void demPhanTuItNhat(int[] arr) {
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
		for (int i = SO_KHONG; i < arr.length; i++) {
			int tam = arr[i];
			for (int j = i + SO_MOT; j < arr.length; j++) {
				if (arr[j] == tam) {
					a[j] = SO_TRU_MOT;
				}
			}
		}
		int min = a[SO_KHONG];
		for (int i = SO_KHONG; i < a.length; i++) {
			if (a[i] < min && a[i] != SO_TRU_MOT) {
				min = a[i];
			}
		}
		for (int i = SO_KHONG; i < a.length; i++) {
			if (a[i] == min) {
				viTri = i;
				break;
			}
		}
		System.out.println("Số có số phần tử ít nhất xuất hiện đầu tiên là : arr[" + viTri + "]=" + arr[viTri] + " với "
				+ a[viTri] + " lần");
	}

}
