import java.util.Scanner;

public class Bt_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int soPhanTu;
		int mangInt[];
		System.out.print("Nhập vào số phàn tử của mảng : ");
		soPhanTu = Integer.parseInt(scan.nextLine());
		
		mangInt = new int[soPhanTu];
		// nhập mảng
		for(int i = 0; i < mangInt.length; i++) {
			System.out.print("Nhập vào phần tử thứ " + i + " : ");
			mangInt[i] = Integer.parseInt(scan.nextLine());
		}
		// Xuất mảng
		System.out.println("Mảng đã nhập");
		for(int i = 0; i < mangInt.length; i++) {
			System.out.print(mangInt[i]+ " ");
		}
	}

}