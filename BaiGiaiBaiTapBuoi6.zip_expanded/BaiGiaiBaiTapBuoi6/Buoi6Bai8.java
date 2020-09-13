
/*
 * 8. Tạo ngẫu nhiên mảng 1 chiều n phần tử (n nguyên) có giá trị chứa trong đoạn [-1000, 1000]. Tính tổng các giá trị lớn hơn 
 * 	trị tuyệt đối của giá trị đứng liền sau nó trong mảng 1 chiều các số thực
 */
import java.util.Scanner;

public class Buoi6Bai8 {
	public static final int SO_KHONG = 0;
	public static final int SO_MOT = 1;
	public static final int SO_MOT_NGAN = 1000;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = taoMang(scan);

		xuatMang(arr);
		tinhTong(arr);

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

	public static void tinhTong(int[] arr) {
		float tong = SO_KHONG;
		for (int i = SO_KHONG; i < (arr.length - SO_MOT); i++) {
			if (arr[i] > Math.abs(arr[i + SO_MOT])) {
				System.out.println("Số có giá trị lớn hơn ... là : arr[" + i + "]=" + arr[i] + " > " + "arr[" + (i + SO_MOT)
						+ "]=" + "|" + arr[i + 1] + "|");
				tong += arr[i];
			}
		}
		if (tong == SO_KHONG) {
			System.out.println("Mảng không có số thỏa yêu cầu");
		} else {
			System.out.println("Tổng các giá trị lớn hơn giá trị sau nó là : " + tong);
		}
	}

}
