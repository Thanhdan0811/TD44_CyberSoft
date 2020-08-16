import java.util.Scanner;

public class BT_Day_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int mangSoNguyen[];
		mangSoNguyen = nhapMangInt(scan);
		xuatMang(mangSoNguyen);
		// Các giá trị có dạng 3^k
		
		System.out.println("\n**************************************");
		inGiaTriBaMuK(mangSoNguyen);
	}

	private static void inGiaTriBaMuK(int[] mangSoNguyen) {
		boolean tonTaiGiaTri = false;
		System.out.print("giá trị có dạng 3^k: ");
		for(int i = 0, soChia; i < mangSoNguyen.length ;i++) {
			if(mangSoNguyen[i] < 3 || mangSoNguyen[i] % 3 != 0 ) {
				continue;
			}
			soChia = 1;
			while(true) {
				soChia *= 3;
				if(mangSoNguyen[i] == soChia) {
					System.out.print(mangSoNguyen[i] + " ");
					tonTaiGiaTri = true;
					break;
				} else if(mangSoNguyen[i] < soChia) {
					break;
				}
			}
			
		}
		if(!tonTaiGiaTri) System.out.print(0);
	}

	private static void xuatMang(int[] mangSoNguyen) {
		// TODO Auto-generated method stub
		System.out.print("Mảng : ");
		for(int i = 0; i <  mangSoNguyen.length ;i++) {
			System.out.print( mangSoNguyen[i] + " ");
		}
	}

	private static int[] nhapMangInt(Scanner scan) {
		// TODO Auto-generated method stub
		int n, mangInt[];
		
		System.out.print("Nhập vào số phần tử mảng : ");
		n = Integer.parseInt(scan.nextLine());
		
		mangInt = new int[n];
		
		for(int i = 0; i <  mangInt.length ;i++) {
			System.out.print("Nhập mang[" + i + "] : ");
			mangInt[i] = Integer.parseInt(scan.nextLine());
		}
		return mangInt;
	}

}
