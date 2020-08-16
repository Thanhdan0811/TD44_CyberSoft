import java.util.Scanner;

public class Case_Study {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ý tường bài toán :
		 * Mỗi cây sẽ chiếm 1 khoảng không gian cần thiết và 
		 * khoảng không gian này sẽ chỉ nẳm ở 1 bên của cây
		 * 		
		 */
		int chieuDaiSan = 0, banKinhCay = 0, khongGianCay = 0; 
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhập vào chiều dài sân : ");
		chieuDaiSan = Integer.parseInt(scan.nextLine());
		System.out.print("Nhập vào bán kính cây : ");
		banKinhCay = Integer.parseInt(scan.nextLine());
		System.out.print("Nhập vào không cần thiết giữa các cây : ");
		khongGianCay = Integer.parseInt(scan.nextLine());
		scan.close();
		// 		tông số cây có thể trông là : 
		//		phần nguyên của phép chia chiều dài sân cho khoảng không chiếm bởi 
		//		đường kính cây và khoảng không gian cần thiết
		
		System.out.println("Só cây có thể trồng : " + chieuDaiSan / (banKinhCay*2 + khongGianCay));
		
		// 		tông không gian chiếm bởi cây sẽ là đường kính cây + khoảng cách cần thiết rồi * cho số cây
		
		System.out.println("Tông không gian chiếm bởi cây : " + (chieuDaiSan / (banKinhCay*2 + khongGianCay)) * (banKinhCay*2 + khongGianCay));
	}

}
