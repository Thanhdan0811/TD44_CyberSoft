import java.util.Scanner;

public class SuaBaiTap {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int luaChon; 
		int ketQua = 0; // kết quả: 0. hòa	1. người thắng	-1. máy thắng
		int diemNguoiChoi = 0, diemMay = 0;
		// Lựa chọn của máy
		int luaChonCuaMay;
		String luaChonCuaMayString;
		
		// Số ván chơi
		int soVan;
		System.out.print("Số ván muốn chơi: ");
		soVan = Integer.parseInt(scanner.nextLine());
		// kiểm tra số ván hợp lệ
		while(soVan <= 0) {
			System.out.print("Số ván không hợp lệ, vui lòng nhập lại: ");
			soVan = Integer.parseInt(scanner.nextLine());
		}
		
		do {
			luaChonCuaMay = (int)(Math.random() * 3 + 1);
			luaChonCuaMayString = luaChonCuaMay == 1 ? "Bao" : luaChonCuaMay == 2 ?"Búa" : "Kéo";
			// Nhập lựa chọn
			System.out.println("Mời lựa chọn:");
			System.out.println("\t1. Bao\t2. Búa\t3. Kéo");
			System.out.print("Lựa chọn: ");
			
			luaChon = Integer.parseInt(scanner.nextLine());
			// kiểm tra lựa chọn hợp lệ
			while (luaChon > 3 || luaChon < 1) {
				System.out.print("Lựa chọn không hợp lệ, vui lòng nhập lại: ");
				luaChon = Integer.parseInt(scanner.nextLine());
			} 
			
			// Kiểm tra người chơi có muốn kết thúc trò chơi
			if(luaChon == 0)
				break;
			
			// Kiểm tra kết quả thắng thua
			switch(luaChon) {
				case 1:
					if(luaChonCuaMay == 1)
						ketQua = 0;
					else if(luaChonCuaMay == 2)
						ketQua = 1;
					else 
						ketQua = -1;
					break;
				case 2:
					if(luaChonCuaMay == 2)
						ketQua = 0;
					else if(luaChonCuaMay == 3)
						ketQua = 1;
					else 
						ketQua = -1;
					break;
				case 3:
					if(luaChonCuaMay == 3)
						ketQua = 0;
					else if(luaChonCuaMay == 1)
						ketQua = 1;
					else 
						ketQua = -1;
					break;
			}
			
			// Cộng điểm cho người thắng
			if(ketQua == 1) {
				System.out.println("Chúc mừng bạn đã chiến thắng!");
				System.out.println("Lựa chọn của máy: " + luaChonCuaMayString);
				diemNguoiChoi++;
			} else if (ketQua == -1) {
				System.out.println("Rất tiếc bạn đã thua cuộc!");
				System.out.println("Lựa chọn của máy: " + luaChonCuaMayString);
				diemMay++;
			} else {
				System.out.println("Hòa!");
				System.out.println("Lựa chọn của máy: " + luaChonCuaMayString);
			}
			// giảm số ván game còn chơi tiếp
			soVan--;
			scanner.nextLine();
		}while(soVan > 0);
		
		System.out.println("Tỉ số:");
		System.out.println("\tNgười chơi: " + diemNguoiChoi + "\tMáy: " + diemMay);
		System.out.println("Kết thúc chương trình.");
	}
}
/*int soNgauNhien = (int) (Math.random() * 999 + 1);

int soThapNhat = 1, soCaoNhat = 1000;
int soDoan, soLanDoan = 0;

do {
	soLanDoan++;
	soDoan = (soCaoNhat + soThapNhat) / 2;
	System.out.println("======> Số đoán: " + soDoan);
	if(soDoan > soNgauNhien) {
		System.out.println("Số vừa đoán lớn hơn số bí mật.\nVui lòng đoán lại");
		soCaoNhat = soDoan;
	} else if(soDoan < soNgauNhien) {
		System.out.println("Số vừa đoán bé hơn số bí mật.\nVui lòng đoán lại");
		soThapNhat = soDoan;
	}
} while(soDoan != soNgauNhien);

System.out.println("Chúc mừng bạn đã đoán đúng.");
System.out.println("Số bí mật là " + soNgauNhien);
System.out.println("Số lần đã đoán là " + soLanDoan);
*/