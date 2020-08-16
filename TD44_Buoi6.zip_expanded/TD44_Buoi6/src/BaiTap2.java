import java.util.Scanner;

public class BaiTap2 {
	public static void main(String[] args) {
		/*
		 * Bài luyện tập 2
		 */
		Scanner scanner = new Scanner(System.in);
		int n, x, y; 
		int[] mangInt;
		
		System.out.print("Nhập số phần tử: ");
		n = Integer.parseInt(scanner.nextLine());
		
		mangInt = new int[n];
		
		mangInt = taoSoNgauNhien(mangInt, -100, 100);
		xuatMang(mangInt);
		
		System.out.print("\nx = ");
		x = Integer.parseInt(scanner.nextLine());
		System.out.print("y = ");
		y = Integer.parseInt(scanner.nextLine());
		
		System.out.print("Các phần tử trong khoảng [ " + x + " : " + y + " ]: ");
		for (int i = 0; i < mangInt.length; i++) {
			if(mangInt[i] >= x && mangInt[i] <= y)
				System.out.print(mangInt[i] + " ");
		}
		
	}

	private static int[] taoSoNgauNhien(int[] mangInt, int a, int b) {
		for(int i = 0; i < mangInt.length; i++) {
			mangInt[i] = a+(int)(Math.random()*((b-a)+1));
		}
		return mangInt;
	}
	
	private static void xuatMang(int[] mangInt) {
		// xuất mảng
		System.out.print("Mảng đã nhập: ");
		for(int i = 0; i < mangInt.length ; i++) {
			System.out.print(mangInt[i] + " ");
		}
	}

}
