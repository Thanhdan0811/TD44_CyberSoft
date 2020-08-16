import java.util.Scanner;

public class BaiTap3 {
	public static void main(String[] args) {
		/*
		 * Bài tập luyện tập 3
		 */
		Scanner scanner = new Scanner(System.in);
		int n, soAmDauTien; 
		int[] mangInt;
		
		System.out.print("Nhập số phần tử: ");
		n = Integer.parseInt(scanner.nextLine());
		
		mangInt = new int[n];
		
		mangInt = taoSoNgauNhien(mangInt, 0, 100);
		xuatMang(mangInt);
		
		soAmDauTien = timSoAmDauTien(mangInt);
		if(soAmDauTien == 0) {
			System.out.println("Không có số âm trong mảng.");
			return;
		}
		
		timViTri(mangInt, soAmDauTien);
		
		int soDuong = timSoDuongDauTien(mangInt);
		
	}
	

	private static int timSoDuongDauTien(int[] mangInt) {
		// TODO Auto-generated method stub
		return 0;
	}


	private static void timViTri(int[] mangInt, int soFloat) {
		System.out.print("Vị trí của " + soFloat + " trong mảng: ");
		for (int i = 0; i < mangInt.length; i++) {
			if(mangInt[i] == soFloat)
				System.out.print(i + " ");
		}
		
	}

	private static int timSoAmDauTien(int[] mangInt) {
		for (int i = 0; i < mangInt.length; i++) {
			if( mangInt[i] < 0)
				return mangInt[i];
		}
		return 0;
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
		System.out.println();
	}
}
