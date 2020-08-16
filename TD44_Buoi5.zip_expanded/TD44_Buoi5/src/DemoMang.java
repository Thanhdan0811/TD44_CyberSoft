import java.util.Scanner;

public class DemoMang {
	public static void main(String[] args) {
		/*
		 * Demo về mảng
		 */
		
		/*
		 * Khai báo 1 mảng
		 */
		int mangInt[];
		float mangFloat[];
		Scanner mangScanner[];
		
		/*
		 * Cấp phát vùng nhớ
		 */
		mangInt = new int[5];
		mangFloat = new float[5];
		mangScanner = new Scanner[50];
		
		String mangString[] = new String[20];
		
		/*
		 * Khởi tạo giá trị
		 */
		int mangIntDaKhoiTao[] = {1,3,4,5,6};
		
		mangInt[0] = 5;
		mangInt[4] = 10;
		
		/*
		 * Truy xuất giá trị của mảng
		 */
		for(int i = 0; i < 5; i++) {
			System.out.print(mangInt[i] + " ");
		}
		
		/*
		 * Gán giá trị
		 */
		int mangSoChan[] = new int[20];
		
		for(int i = 2, j = 0; j < mangSoChan.length; i += 2, j++) {
			mangSoChan[j] = i;
		}
		System.out.println();
		System.out.print("Mảng số chẵn: ");
		for(int i = 0; i < mangSoChan.length; i++) {
			System.out.print(mangSoChan[i] + " ");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
