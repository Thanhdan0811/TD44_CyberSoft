import java.util.Scanner;

public class DemoVongFor {

	public static void main(String[] args) {
		/*
		 * Ví dụ demo vòng lặp for
		 * Viết chương trình cho người dùng nhập vào 
		 * một số N
		 * In ra màn hình hình vuông có chiều dài cạnh
		 * bằng N
		 * Ví dụ: -> N = 3
		 * 			***
		 * 			***
		 * 			***
		 */

		Scanner scanner = new Scanner(System.in);
		int chieuDaiCanh;
		
		System.out.print("Nhập chiều dài cạnh: ");
		chieuDaiCanh = Integer.parseInt(scanner.nextLine());
		//int soLanLap = 0;
		for(int soLanLap = 0; soLanLap < chieuDaiCanh;  soLanLap++) {
			for(int i = 0; i < chieuDaiCanh; i++)
				System.out.print(" * ");
			System.out.println();
		}
		
		System.out.println("Kết thúc chương trình.");
		
	}

}
