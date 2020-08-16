import java.util.Scanner;

public class SoNamChoDoi {
	public static void main(String[] args) {
		int soTienMongMuon = 400000000;
		int soTienGui = 100000000;
		int tuoi = 30;
		int laiSuat = 7;
		int soNamGui = 0;
		Scanner sc = new Scanner(System.in);
		
		for( ; soTienGui < soTienMongMuon ; soNamGui++, tuoi++) {
			System.out.println(soTienGui);
			soTienGui += (int)((float)soTienGui * laiSuat / 100);
			sc.nextLine();
		}
		
		while (soTienGui < soTienMongMuon) {
			soTienGui += soTienGui * laiSuat / 100;
			soNamGui++;
			tuoi++;
		}
		
		System.out.println(soNamGui);
		System.out.println(tuoi);
	}
}
