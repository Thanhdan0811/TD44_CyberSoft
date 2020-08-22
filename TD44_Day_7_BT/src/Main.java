
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HinhChuNhat hinh_1 = new HinhChuNhat();
		hinh_1.setChieuDai(12);
		hinh_1.setChieuRong(7);
		System.out.println("Chiều dài hình chữ nhật : " + hinh_1.getChieuDai());
		System.out.println("Chiều rộng hình chữ nhật : " + hinh_1.getChieuRong());
		System.out.println("Chu Vi hình chữ nhật : " + hinh_1.getChuVi());
		System.out.println("Diện tích hình chữ nhật : " + hinh_1.getDienTich());
		System.out.println("Loại Hình chữ nhật : " + hinh_1.loaiHinhChuNhat());
	}

}
