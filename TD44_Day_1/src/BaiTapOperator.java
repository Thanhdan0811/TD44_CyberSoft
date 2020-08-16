import java.util.Scanner;

public class BaiTapOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ctrl + shift + f : format document Viết chương trình nhập vào 3 số tự nhiên
		 * In ra tổng ba số vừa nhâp
		 * 
		 */
		Scanner scanInput = new Scanner(System.in);
		System.out.print("Nhập vào 3 số : ");
		System.out.print("Nhập vào số thứ 1 : ");
		int so_1 = Integer.parseInt(scanInput.nextLine());
		System.out.print("Nhập vào số thứ 2 : ");
		int so_2 = Integer.parseInt(scanInput.nextLine());
		System.out.print("Nhập vào số thứ 3 : ");
		int so_3 = Integer.parseInt(scanInput.nextLine());
		scanInput.close();
		System.out.println("Tổng của ba số vừa nhập là : " + (so_1 + so_2 + so_3));
		
//		System.out.println("Tổng của ba số vừa nhập là : " + (Integer.parseInt(scanInput.nextLine())
//				+ Integer.parseInt(scanInput.nextLine()) 
//				+ Integer.parseInt(scanInput.nextLine())));
		
		

	}

}
