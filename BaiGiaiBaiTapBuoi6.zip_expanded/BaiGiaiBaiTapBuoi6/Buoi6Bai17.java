/*
 * 17. Đảo ngược mảng ban đầu
 */
public class Buoi6Bai17 {

	public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7 };
		xuatMang(arr);
		daoNguoc(arr);
	}

	public static void xuatMang(int[] arr) {
		int SO_KHONG = 0;
		System.out.println("Mảng trước khi đảo ngược là: ");
		for (int i = SO_KHONG; i < arr.length; i++) {
			System.out.println("arr[" + i + "]=" + arr[i]);
		}
	}

	public static void daoNguoc(int[] arr) {
		final int SO_KHONG = 0;
		final int SO_MOT = 1;
		final int SO_HAI = 2;
		int n = SO_KHONG;
		boolean flag = true;
		while (flag) {
			for (int i = SO_KHONG; i < arr.length; i++) {
				if (n < (arr.length / SO_HAI)) {
					int tam = arr[i];
					arr[i] = arr[arr.length - n - SO_MOT];
					arr[arr.length - n - SO_MOT] = tam;
					n++;
				} else {
					flag = false;
					break;
				}
			}

		}
		System.out.println("Mảng sau khi đảo là : ");
		for (int i = SO_KHONG; i < arr.length; i++) {
			System.out.println("arr[" + i + "]=" + arr[i]);
		}
	}
}
