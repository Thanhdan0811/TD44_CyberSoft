/*
 * 12. Xóa tất cả số âm trong mảng
 */
public class Buoi6Bai12 {
	public static final int SO_KHONG = 0;
	public static final int SO_MOT = 1;
	public static final int SO_TRU_MOT = -1;

	public static void main(String[] args) {
		float[] arr = { 6.9f, 8.3f, -9.5f, 3.14f, -7, -9.5f, 4, -10, -10, 0, 9.6f };
		xuatMang(arr);
		xoaSoAm(arr);
	}

	public static void xuatMang(float[] arr) {
		System.out.println("Mảng trước khi xóa : ");
		for (int i = SO_KHONG; i < arr.length; i++) {
			System.out.println("arr[" + i + "]=" + arr[i]);
		}
	}

	public static void xoaSoAm(float[] arr) {
		int viTriAm = SO_TRU_MOT;
		int k = SO_KHONG;
		// Đếm số lượng vị trí số âm trong mảng
		for (int i = SO_KHONG; i < arr.length; i++) {
			if (arr[i] < SO_KHONG) {
				k++;
			}
		}
		// Xóa số âm trong mảng
		for (int h = SO_KHONG; h < arr.length; h++) {
			for (int i = SO_KHONG; i < arr.length; i++) {
				if (arr[i] < SO_KHONG) {
					viTriAm = i;
					for (int j = viTriAm; j < (arr.length - SO_MOT); j++) {
						arr[j] = arr[j + SO_MOT];
					}
				}
			}
		}
		if (viTriAm == SO_TRU_MOT) {
			System.out.println("Mảng không có giá trị âm nào");
		} else {
			System.out.println("Mảng sau khi xóa : ");
			for (int i = SO_KHONG; i < (arr.length - k); i++) {
				System.out.println("arr[" + i + "]=" + arr[i]);
			}
		}
	}
}
