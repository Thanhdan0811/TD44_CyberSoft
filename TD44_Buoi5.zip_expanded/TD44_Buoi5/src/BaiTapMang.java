import java.util.Scanner;

public class BaiTapMang {
	public static void main(String[] args) {
		/*
		 * Bài tập nhập xuất mảng
		 */
		Scanner scanner = new Scanner(System.in);
		int soPhanTu;
		int mangInt[];
		
		System.out.print("Số phần tử trong mảng: ");
		soPhanTu = Integer.parseInt(scanner.nextLine());
		
		mangInt = new int[soPhanTu];
		
		// nhập mảng
		for(int i = 0; i < mangInt.length; i++) {
			System.out.print("mangInt[" + i + "] = ");
			mangInt[i] = Integer.parseInt(scanner.nextLine());
		}
		
		// xuất mảng
		System.out.print("Mảng đã nhập: ");
		for(int i = 0; i < mangInt.length; i++) {
			System.out.print(mangInt[i] + " ");
		}
	}
}
