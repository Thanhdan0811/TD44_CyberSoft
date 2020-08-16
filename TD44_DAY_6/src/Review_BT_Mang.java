import java.util.Scanner;

public class Review_BT_Mang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Đầu vào
		int mangSoNguyen[], soPhanTuMang, tongSoChan = 0;
		Scanner scan = new Scanner(System.in);
		// Nhập dữ liệu
		System.out.print("Nhập vào số phần tử ");
		soPhanTuMang = Integer.parseInt(scan.nextLine());
		
		mangSoNguyen = new int[soPhanTuMang];
		
		for(int i = 0; i < mangSoNguyen.length; i++) {
			System.out.print("Phần tử thứ " + (i + 1)  + " : ");
			mangSoNguyen[i] = Integer.parseInt(scan.nextLine());
		}
		// Đầu ra
		System.out.print("Mảng đã nhập : ");
		for(int i = 0; i < mangSoNguyen.length; i++) {
			System.out.print(mangSoNguyen[i] + "  ");
		}
		// Tính tổng các số chẵn
		System.out.print("Tổng số chẵn : ");
		for(int i = 0; i < mangSoNguyen.length; i++) {
			tongSoChan += mangSoNguyen[i] % 2 == 0 ? mangSoNguyen[i] : 0;  
		}
	}

}
