/*
 * 11. Hãy xóa tất cả số lớn nhất trong mảng 1 chiều các số thực
 */
public class Buoi6Bai11 {
	public static final int SO_KHONG = 0;
	public static final int SO_MOT = 1;

	public static void main(String[] args) {
		float[] arr = { 9.5f, 9.5f, 6, 8, 9.5f, 0, 7, 9.5f, 9.5f, 4 };
		xuatMang(arr);
		xoaSoLonNhat(arr);
	}

	public static void xuatMang(float[] arr) {
		System.out.println("Mảng trước khi xóa : ");
		for (int i = SO_KHONG; i < arr.length; i++) {
			System.out.println("arr[" + i + "]=" + arr[i]);
		}
	}

	public static void xoaSoLonNhat(float[] arr) {
		int viTriMax = SO_KHONG;
		float max = arr[SO_KHONG];
		int k = SO_KHONG;
		// Tìm giá trị lớn nhất trong mảng
		for (int i = SO_KHONG; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		// Đếm số lượng vị trí lớn nhất trong mảng
		for (int i = SO_KHONG; i < arr.length; i++) {
			if (arr[i] == max) {
				k++;
			}
		}
		// Xóa giá trị lớn nhất trong mảng
		for (int h = SO_KHONG; h < arr.length; h++) {
			for (int i = SO_KHONG; i < arr.length; i++) {
				if (arr[i] == max) {
					viTriMax = i;
					for (int j = viTriMax; j < (arr.length - SO_MOT); j++) {
						arr[j] = arr[j + SO_MOT];
					}
				}
			}
		}
		System.out.println("Mảng sau khi xóa : ");
		for (int i = SO_KHONG; i < (arr.length - k); i++) {
			System.out.println("arr[" + i + "]=" + arr[i]);
		}
	}
}
