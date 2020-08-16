import java.util.Scanner;

public class StudyCaseSonTuong {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		float daiPhong, rongPhong, caoPhong, sTuong, sTran;
		float rongCuaSo, caoCuaSo, soCuaSo, sCuaSo;
		float rongCuaChinh, caoCuaChinh, soCuaChinh, sCuaChinh;
		float sSonTuong, sSonTran;
		float tieuHaoTrungBinh;
		float luongSonTuong, luongSonTran;

		System.out.print("Nhập vào chiều dài của phòng: ");
		daiPhong = Float.parseFloat(scan.nextLine());
		System.out.print("Nhập vào chiều rộng của phòng: ");
		rongPhong = Float.parseFloat(scan.nextLine());
		System.out.print("Nhập vào chiều cao của phòng: ");
		caoPhong = Float.parseFloat(scan.nextLine());
		sTran = daiPhong * rongPhong; //tính diện tích trần
		sTuong = daiPhong * caoPhong * 2 + rongPhong * caoPhong * 2; //tính diện tích xung quanh phòng

		System.out.print("Nhập vào chiều rộng cửa chính: ");
		rongCuaChinh = Float.parseFloat(scan.nextLine());
		System.out.print("Nhập vào chiều cao cửa chính: ");
		caoCuaChinh = Float.parseFloat(scan.nextLine());
		System.out.print("nhập vào số lượng cửa chính: ");
		soCuaChinh = Float.parseFloat(scan.nextLine());
		sCuaChinh = rongCuaChinh * caoCuaChinh * soCuaChinh; //tính diện tích các cửa chính

		System.out.print("Nhập vào chiều rộng cửa sổ: ");
		rongCuaSo = Float.parseFloat(scan.nextLine());
		System.out.print("Nhập vào chiều cao cửa sổ: ");
		caoCuaSo = Float.parseFloat(scan.nextLine());
		System.out.print("nhập vào số lượng cửa sổ: ");
		soCuaSo = Float.parseFloat(scan.nextLine());
		sCuaSo = rongCuaSo * caoCuaSo * soCuaSo; //tính diện tích các cửa sổ
		
		sSonTuong = sTuong - sCuaSo - sCuaChinh;
		sSonTran = sTran; 
		
		System.out.println("Nhập lượng sơn tiêu hao trung bình trên mỗi m2 là:....(lít/m2)");
		tieuHaoTrungBinh = Float.parseFloat(scan.nextLine());
		
		luongSonTuong = sSonTuong * tieuHaoTrungBinh;
		luongSonTran = sSonTran * tieuHaoTrungBinh;
		
		System.out.println("Lượng sơn cần dùng để sơn tường phòng là: "+ luongSonTuong);
		System.out.println("Lượng sơn cần dùng để sơn trần nhà là: "+ luongSonTran);

	}

}
