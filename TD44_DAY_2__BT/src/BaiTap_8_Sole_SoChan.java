import java.util.Scanner;

public class BaiTap_8_Sole_SoChan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int so_1, so_2, so_3, soLe = 0;
		System.out.print("Nhập vào số 1 : ");
		so_1 = Integer.parseInt(scan.nextLine());
		System.out.print("Nhập vào số 2 : ");
		so_2 = Integer.parseInt(scan.nextLine());
		System.out.print("Nhập vào số 3 : ");
		so_3 = Integer.parseInt(scan.nextLine());
		scan.close();
		if(so_1 % 2 != 0) soLe++;
		if(so_2 % 2 != 0) soLe++;
		if(so_3 % 2 != 0) soLe++;
		System.out.println("Có " + soLe + " số lẻ và " + (3 - soLe) +" số chẵn");
	}

}
//if(so_1 % 2 != 0 && so_2 % 2 != 0 && so_3 % 2 != 0) {
//	System.out.println("Có 3 số lẻ và 0 số chẵn");
//} else if(so_1 % 2 == 0 || so_2 % 2 == 0 || so_3 % 2 == 0 ) {
//	System.out.println("Có 2 số lẻ và 1 số chẵn");
//} else if(so_1 % 2 != 0 || so_2 % 2 != 0 || so_3 % 2 != 0 ) {
//	System.out.println("Có 1 số lẻ và 2 số chẵn");
//} else {
//	System.out.println("Có 0 số lẻ và 3 số chẵn");
//}