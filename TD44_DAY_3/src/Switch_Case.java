import java.util.Scanner;

public class Switch_Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int soCo_3_KySo;
		int hangDonVi, hangChuc, hangTram;
		String cachDoc = "";
		do {
			System.out.print("NHập vào số có 3 chữ số ");
			soCo_3_KySo = Integer.parseInt(scan.nextLine());
		} while( soCo_3_KySo < 100 || soCo_3_KySo > 999);
		scan.close();
		//	Tách các chữ số ở hàng chục, trăm, đơn vị
		hangDonVi = soCo_3_KySo % 100 % 10;
		hangChuc =  soCo_3_KySo % 100 / 10;
		hangTram =  soCo_3_KySo / 100;
		//
		switch(hangTram) {
			case 1: 
				System.out.println("Một trăm ");
				break;
			case 2:
				System.out.println("Hai trăm ");
				break;
			case 3:
				System.out.println("Ba trăm ");
				break;
			case 4:
				System.out.println("Bốn trăm ");
				break;	
			case 5:
				System.out.println("Năm trăm ");
				break;
			case 6:
				System.out.println("Sáu trăm ");
				break;
			case 7:
				System.out.println("Bảy trăm ");
				break;
			case 8:
				System.out.println("Tám trăm ");
				break;
			case 9:
				System.out.println("Chín trăm ");
				break;
			default :
				break;
		}
		// switch sẽ chạy theo thứ tự viết code
		// không có break sẽ chạy đến case tiếp theo
		//	Xử lý cách đọc hàng trăm	
//		if(hangTram == 1) 	   cachDoc = "một trăm";
//		else if(hangTram == 2) cachDoc = "hai trăm";
//		else if(hangTram == 3) cachDoc = "ba trăm";
//		else if(hangTram == 4) cachDoc = "bốn trăm";
//		else if(hangTram == 5) cachDoc = "năm trăm";
//		else if(hangTram == 6) cachDoc = "sáu trăm";
//		else if(hangTram == 7) cachDoc = "bảy trăm";
//		else if(hangTram == 8) cachDoc = "tám trăm";
//		else if(hangTram == 9) cachDoc = "chín trăm";
//		else 			  cachDoc = "";
//		//	Xử lý cách đọc hàng chục
//		if(hangChuc == 1) 	   cachDoc += " mười";
//		else if(hangChuc == 2) cachDoc += " hai mươi";
//		else if(hangChuc == 3) cachDoc += " ba mươi";
//		else if(hangChuc == 4) cachDoc += " bốn mươi";
//		else if(hangChuc == 5) cachDoc += " năm mươi";
//		else if(hangChuc == 6) cachDoc += " sáu mươi";
//		else if(hangChuc == 7) cachDoc += " bảy mươi";
//		else if(hangChuc == 8) cachDoc += " tám mươi";
//		else if(hangChuc == 9) cachDoc += " chín mươi";
//		else if(hangChuc == 0 && hangDonVi != 0) {
//							   cachDoc += " lẻ";
//		}
//		//	Xử lý cách đọc hàng đơn vị
//		if(hangDonVi == 1) {
//			if(hangChuc == 0 || hangChuc == 1) cachDoc += " một";
//			else 							   cachDoc += " mốt";
//		}
//		else if(hangDonVi == 2) cachDoc += " hai";
//		else if(hangDonVi == 3) cachDoc += " ba";
//		else if(hangDonVi == 4) cachDoc += " bốn";
//		else if(hangDonVi == 5) {
//			if(hangChuc == 0) 	cachDoc += " năm";
//			else 			  	cachDoc += " lăm";
//		}
//		else if(hangDonVi == 6) cachDoc += " sáu";
//		else if(hangDonVi == 7) cachDoc += " bảy";
//		else if(hangDonVi == 8) cachDoc += " tám";
//		else if(hangDonVi == 9) cachDoc += " chín";
//		else cachDoc += ".";
//		// In ra kết quả		
//		System.out.println("Đọc là : " + cachDoc);
	}

}
