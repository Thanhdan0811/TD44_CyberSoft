/*
 * 13. Xóa tất cả các số chẵn trong mảng
 */
public class Buoi6Bai13 {

	public static final int SO_KHONG = 0;
	public static final int SO_MOT = 1;
	public static final int SO_HAI = 2;
	public static final int SO_TRU_MOT = -1;

	public static void main(String[] args) {
		float[] arr = { 6.0f, 8, -9.5f, 0, -7, -9.6f, 4, -10, -96, 0 };
		xuatMang(arr);
		xoaSoChan(arr);
	}

	public static void xuatMang(float[] arr) {
		System.out.println("Mảng trước khi xóa : ");
		for (int i = SO_KHONG; i < arr.length; i++) {
			System.out.println("arr[" + i + "]=" + arr[i]);
		}
	}

	public static void xoaSoChan(float[] arr) {
		int viTriChan = SO_TRU_MOT;
		int k = SO_KHONG;
		// Đếm số vị trí chẵn
		for (int i = SO_KHONG; i < arr.length; i++) {
			if (arr[i] % SO_HAI == SO_KHONG) {
				k++;
			}
		}
		// Xóa các số chẵn
		for (int h = SO_KHONG; h < arr.length; h++) {
			for (int i = SO_KHONG; i < arr.length; i++) {
				if (arr[i] % 2 == SO_KHONG) {
					viTriChan = i;
					for (int j = viTriChan; j < (arr.length - SO_MOT); j++) {
						arr[j] = arr[j + SO_MOT];
					}
				}
			}
		}
		if (viTriChan == SO_TRU_MOT) {
			System.out.println("Mảng không có giá trị chẵn nào");
		} else {
			System.out.println("Mảng sau khi xóa : ");
			for (int i = SO_KHONG; i < (arr.length - k); i++) {
				System.out.println("arr[" + i + "]=" + arr[i]);
			}
		}
	}

}
