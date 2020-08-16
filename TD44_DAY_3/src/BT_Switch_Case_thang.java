import java.util.Scanner;

public class BT_Switch_Case_thang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * bài tập switch case
		 * Cho người dùng nhập vào tháng trong năm
		 * nếu tháng không hợp lệ in ra "tháng không hợp lệ"
		 * Nếu tháng hợp lệ in ra số ngày trong tháng. 
		 * Không cần xét năm nhuận
		 */
		Scanner scan = new Scanner(System.in);
		int thang;
		System.out.print("Nhập vào tháng : ");
		thang = Integer.parseInt(scan.nextLine());
		scan.close();
		switch(thang) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("Tháng " + thang + " có 31 ngày");
				break;
			case 2 :
				System.out.println("Tháng " + thang + " có 28 ngày");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("Tháng " + thang + " có 30 ngày");
				break;
			default: 
				System.out.println("Tháng không hợp lệ");
				break;
		}
	}

}
