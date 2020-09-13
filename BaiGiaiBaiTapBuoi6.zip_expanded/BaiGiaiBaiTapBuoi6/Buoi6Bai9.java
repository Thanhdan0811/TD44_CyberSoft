
/*
 * 9. Tạo ngẫu nhiên mảng 1 chiều n phần tử (n nguyên) có giá trị chứa trong đoạn [-1000, 1000]. Tính trung bình cộng các số nguyên tố trong 
	mảng 1 chiều các số nguyên
 */
import java.util.Scanner;

public class Buoi6Bai9 {

	public static final int SO_KHONG = 0;
	public static final int SO_MOT = 1;
	public static final int SO_HAI = 2;
	public static final int SO_MOT_NGAN = 1000;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = taoMang(scan);
		xuatMang(arr);
		tinhTrungBinhCong(arr);

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

	public static boolean checkSoNguyenTo(int arr) {
		boolean kiemTra = true;
		int soChia = arr / SO_HAI;
		if (arr == SO_MOT || arr <= SO_KHONG) {
			kiemTra = false;
		} else {
			for (int i = SO_HAI; i <= soChia; i++) {
				if (arr % i == SO_KHONG) {
					kiemTra = false;
				}
			}
		}
		return kiemTra;
	}

	public static void tinhTrungBinhCong(int[] arr) {
		int soSoNguyenTo = SO_KHONG;
		int tong = SO_KHONG;
		for (int i = SO_KHONG; i < arr.length; i++) {
			if (checkSoNguyenTo(arr[i])) {
				soSoNguyenTo++;
				System.out.println("Số nguyên tố là: " + arr[i]);
				tong += arr[i];
			}
		}
		if (soSoNguyenTo == SO_KHONG) {
			System.out.println("Mảng không có số nào thỏa điều kiện");
		} else {
			System.out.println("Trung bình cộng các số nguyên tố là : " + (tong / soSoNguyenTo));
		}
	}
}
