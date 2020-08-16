import java.util.Scanner;

public class BaiTapIfElse {

	public static void main(String[] args) {
		/*
		 * Viết chương trình cho người dùng nhập vào
		 * 2 số thực
		 * 
		 * In ra màn hình Kết quả số nào lớn hơn.
		 * 
		 * Ví dụ: 	nhập 2 số 15 và 10
		 * 			-> kết quả: Số thứ nhất lớn hơn số thứ hai
		 * 			nhập 2 số 5 và 10
		 * 			-> kết quả: Số thứ hai lớn hơn số thứ nhất
		 */
		Scanner scanner = new Scanner(System.in);
		float so1, so2;
		
		System.out.print("Nhập số thứ nhất: ");
		so1 = Float.parseFloat(scanner.nextLine());
		
		System.out.print("Nhập số thứ hai: ");
		so2 = Float.parseFloat(scanner.nextLine());
		
		if(so1 > so2) {
			System.out.println("Số thứ nhất lớn hơn số thứ hai.");
		} else if(so1 < so2){
			System.out.println("Số thứ hai lớn hơn số thứ nhất.");
		} else {
			System.out.println("Hai số bằng nhau.");
		}
	}

}
