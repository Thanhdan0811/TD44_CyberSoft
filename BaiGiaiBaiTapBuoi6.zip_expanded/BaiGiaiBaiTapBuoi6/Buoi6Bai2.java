/*
 * 2. Cho mảng 1 chiều các số nguyên có nhiều hơn 2 giá trị. Hãy viết hàm liệt kê các cặp giá trị gần nhau nhất
 */
public class Buoi6Bai2 {

	public static void main(String[] args) {
		int[] arr = { -9, 7, 1, 6, 15, -9, 0, 13, 15, -14, 100, -9, 101 };
		lietKeCapGanNhau(arr);
	}

	public static void lietKeCapGanNhau(int[] arr) {
		final int SO_KHONG = 0;
		final int SO_MOT = 1;
		int khoangCach = Math.abs(arr[SO_KHONG] - arr[SO_MOT]);
		int viTri1 = SO_KHONG;
		int viTri2 = SO_MOT;

		for (int i = SO_MOT; i < (arr.length - SO_MOT); i++) {
			if (Math.abs(arr[i] - arr[i + SO_MOT]) < khoangCach) {
				khoangCach = Math.abs(arr[i] - arr[i + SO_MOT]);
			}
		}
		for (int i = SO_KHONG; i < (arr.length - SO_MOT); i++) {
			if (Math.abs(arr[i] - arr[i + SO_MOT]) == khoangCach) {
				viTri1 = i;
				viTri2 = i + SO_MOT;
				System.out.println("Các cặp giá trị gần nhau nhất là : arr[" + viTri1 + "]=" + arr[viTri1] + " & arr["
						+ viTri2 + "]=" + arr[viTri2]);
				System.out.println("Với khoảng cách gần nhau nhất là : " + khoangCach);
			}
		}
	}
}
