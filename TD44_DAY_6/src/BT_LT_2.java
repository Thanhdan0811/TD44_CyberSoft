import java.util.Scanner;

public class BT_LT_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, x, y, mangNgauNhien[];
		System.out.print("Nhập số phàn tử mảng phải là số chẳn : ");
		n = Integer.parseInt(scan.nextLine());
		while(n % 2 != 0) {
			System.out.println("Số phàn tử phải là số chẵn, hãy nhập lại");
			System.out.print("Nhập số phàn tử mảng phải là số chẳn : ");
			n = Integer.parseInt(scan.nextLine());
		}
		System.out.print("Nhập vào x : ");
		x = Integer.parseInt(scan.nextLine());
		System.out.print("Nhập vào y : ");
		y = Integer.parseInt(scan.nextLine());
		
		mangNgauNhien = new int[n];
		for(int i = 0; i < mangNgauNhien.length; i++) {
			mangNgauNhien[i] = -100 + (int)(Math.random() *201);
		}
		System.out.print("Mảng đã tạo : " );
		for(int i = 0; i < mangNgauNhien.length; i++) {
			System.out.print(mangNgauNhien[i] + " ");
		}
		
		System.out.print("\nCác số trong khoảng " + x + " và " + y + " : ");
		for(int i = 0; i < mangNgauNhien.length; i++) {
			if(mangNgauNhien[i] >= x && mangNgauNhien[i] <= y)
				System.out.print(mangNgauNhien[i] + " ");
		}
		// 
	}
}
