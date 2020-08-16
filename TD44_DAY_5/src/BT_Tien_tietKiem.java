import java.util.Scanner;

public class BT_Tien_tietKiem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		float soTienGui, soTienMongMuon, laiSuat;
		int soNam = 0;
		int soTuoi = 0;
		System.out.print("Số tiền gửi : ");
		soTienGui = Float.parseFloat(scan.nextLine());
		System.out.print("Số tiền mong muốn : ");
		soTienMongMuon = Float.parseFloat(scan.nextLine());
		System.out.print("lãi suất : ");
		laiSuat = Float.parseFloat(scan.nextLine());
		laiSuat *= 0.01;
		for(; soTienGui < soTienMongMuon; soNam++,soTuoi++) {
			soTienGui += soTienGui * laiSuat;
		}
		System.out.println("So năm " + soNam);
	}

}
