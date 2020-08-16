import java.util.Scanner;

public class Bai_3_QuyDoiTien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float tienUSD = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhập số tiền USD cần quy đổi : " );
		tienUSD = Float.parseFloat(scan.nextLine());
		scan.close();
		System.out.println("Số tiền quy đổi ra VND : " + tienUSD * 23500);
	}

}
