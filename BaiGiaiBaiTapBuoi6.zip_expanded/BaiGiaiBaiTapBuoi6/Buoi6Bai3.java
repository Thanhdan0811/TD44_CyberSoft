/*
 * Bài3. Tạo ngẫu nhiên mảng 1 chiều gồm n phẩn tử (n nguyên chẵn) có giá trị chứa trong đoạn [-100, 100]. Hãy liệt kê các số chẵn 
		trong mảng 1 chiều các số nguyên thuộc đoạn [x, y] cho trước (x, y là các số nguyên). 
		Sinh số ngẫu nhiên trong đoạn [a, b]: a + (int)(Math.random() * ((b-a) + 1)); 
 */
import java.util.Scanner;

public class Buoi6Bai3 {
	public static final int SO_KHONG = 0;
	public static final int SO_MOT = 1;
	public static final int SO_TRU_MOT = -1;;
	public static final int SO_HAI = 2;
	public static final int SO_MOT_TRAM = 100;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = nhapMang(scan);
		xuatMang(arr);
		lietKeSoChan(scan, arr);

	}

	public static int[] nhapMang(Scanner scan) {
		System.out.print("Nhập số phần tử mảng : ");
		int n = Integer.parseInt(scan.nextLine());
		int[] arr = new int[n];
		for (int i = SO_KHONG; i < arr.length; i++) {
			arr[i] = -SO_MOT_TRAM + (int) (Math.random() * ((SO_MOT_TRAM + SO_MOT_TRAM) + SO_MOT));
		}
		return arr;
	}

	public static void xuatMang(int[] arr) {
		for (int i = SO_KHONG; i < arr.length; i++) {
			System.out.println("arr[" + i + "]=" + arr[i]);
		}
	}

	public static void lietKeSoChan(Scanner scan, int[] arr) {
		int viTri = SO_TRU_MOT;
		System.out.print("Nhập mức bắt đầu x : ");
		int x = Integer.parseInt(scan.nextLine());
		System.out.print("Nhập mức kết thúc y : ");
		int y = Integer.parseInt(scan.nextLine());
		for (int i = SO_KHONG; i < arr.length; i++) {
			if (arr[i] >= x && arr[i] <= y && arr[i] % SO_HAI == SO_KHONG) {
				viTri = i;
				System.out.println(
						"Các số chẵn trong đoạn [" + x + ";" + y + "] là : " + "arr[" + viTri + "]=" + arr[viTri]);
			}
		}
		if (viTri == SO_TRU_MOT)
			System.out.println("Không có số chẵn nào trong đoạn yêu cầu");
	}
}
