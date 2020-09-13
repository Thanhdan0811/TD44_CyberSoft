public class XuLy {
	public static void main(String[] args) {
		HinhChuNhat hcn = new HinhChuNhat();
//		HinhChuNhat hcn = new HinhChuNhat(50,20); => Gọi constructor có tham số
		
		hcn.nhap();
		hcn.xuat();
		
		float chuVi = hcn.tinhChuVi();
		float dienTich = hcn.tinhDienTich();
		
		System.out.print("\n- Chu vi hình chữ nhật là: " + chuVi + " m");
		System.out.print("\n- Diện tích  hình chữ nhật là: " + dienTich + " m2");

	}
}
