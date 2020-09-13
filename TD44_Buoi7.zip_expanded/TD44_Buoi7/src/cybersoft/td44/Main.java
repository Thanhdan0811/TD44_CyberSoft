package cybersoft.td44;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Demo đối tượng
		 */
		
		
		NhanVien nhanVien;
		nhanVien = new NhanVien("024663994","Tuấn đẹp trai");
		
		nhanVien.tinhLuong();
		
		nhanVien.getTenNv();
		
		nhanVien.setTenNv("Tuấn");
		
		System.out.println("Kết thúc chương trình.");
		/*
		Scanner scanner = new Scanner(System.in);
		
		XeBus xeBus = new XeBus("59-N9-333.33", (byte)50);
		
		xeBus.nhapThongTin(scanner);
		System.out.println("=======================");
		xeBus.inThongTin();
		*/
	}

	
	
	
	
	
	
	
}
