import java.util.ArrayList;
import java.util.Scanner;

public class MAIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<HinhChuNhat> dsHihChuNhat;
//		dsHihChuNhat = new ArrayList<HinhChuNhat>();
		
		// Ví dụ tạo 1 array list 
//		ArrayList<String> dsTenSv = new ArrayList<String>();
		
//		dsTenSv.add(e) // Thêm vào cuối danh sách
//		dsTenSv.add(index, element); // Theo vào theo index
//		dsTenSv.add("Tuấn");
//		dsTenSv.add("Thanh");
//		dsTenSv.remove(index) // Theo index
//		dsTenSv.remove(o)  // Theo object :
//		System.out.println(dsTenSv.toString());
//		dsTenSv.remove("Tuấn");
//		System.out.println(dsTenSv.toString());
//		
//		dsTenSv.set(0, "Trần");
//		System.out.println(dsTenSv.toString());
//	
//		System.out.println("Độ dài : " + dsTenSv.size());
		
		Scanner scan = new Scanner(System.in);
		SinhVien sv = new SinhVien();
		sv.nhapThongTin(scan);
		sv.xuatThongTin();
	}

}
