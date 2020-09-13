/*
 * 14. Xóa tất cả các số chính phương trong mảng
 */
public class Buoi6Bai14 {

	public static final int SO_KHONG = 0;
	public static final int SO_MOT = 1;
	public static final int SO_TRU_MOT = -1;

	public static void main(String[] args) {
		int[] arr = { 1, 8, 9, 64, -7, 4, 121, -10, 0 };
		xuatMang(arr);
		xoaSoChinhPhuong(arr);
	}

	public static void xuatMang(int[] arr) {
		System.out.println("Mảng trước khi xóa : ");
		for (int i = SO_KHONG; i < arr.length; i++) {
			System.out.println("arr[" + i + "]=" + arr[i]);
		}
	}

	public static boolean check(int n) {
		boolean check = false;
		if (Math.sqrt(n) == (float) Math.sqrt(n)) {
			check = true;
		}
		return check;
	}

	public static void xoaSoChinhPhuong(int[] arr) {
		int viTri = SO_TRU_MOT;
		int k = SO_KHONG;
		// Đếm số lượng số chính phương trong mảng
		for (int i = SO_KHONG; i < arr.length; i++) {
			if (check(arr[i])) {
				k++;
			}
		}
		// Xóa số chính phương
		for (int h = SO_KHONG; h < arr.length; h++) {
			for (int i = SO_KHONG; i < arr.length; i++) {
				if (check(arr[i])) {
					viTri = i;
					for (int j = viTri; j < (arr.length - SO_MOT); j++) {
						arr[j] = arr[j + SO_MOT];
					}
				}
			}
		}
		if (viTri == SO_TRU_MOT) {
			System.out.println("Mảng không có giá trị âm nào");
		} else {
			System.out.println("Mảng sau khi xóa : ");
			for (int i = SO_KHONG; i < (arr.length - k); i++) {
				System.out.println("arr[" + i + "]=" + arr[i]);
			}
		}
	}
}
