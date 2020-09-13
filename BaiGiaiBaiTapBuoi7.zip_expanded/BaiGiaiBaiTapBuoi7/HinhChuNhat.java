import java.util.Scanner;

public class HinhChuNhat {
	// 1. Thuộc tính - attributes
	private float chieuDai;
	private float chieuRong;

	// 2. Khởi tạo - constructors
	public HinhChuNhat() {
		this.chieuDai = 1;
		this.chieuRong = 1;
	}

	public HinhChuNhat(float chieuDai, float chieuRong) {
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}

	// 3. get,set
	public float getChieuDai() {
		return chieuDai;
	}

	public void setChieuDai(float chieuDai) {
		this.chieuDai = chieuDai;
	}

	public float getChieuRong() {
		return chieuRong;
	}

	public void setChieuRong(float chieuRong) {
		this.chieuRong = chieuRong;
	}

	// 4. nhập, xuất - input, output
	public void nhap() {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhập chiều dài (m): ");
		chieuDai = Float.parseFloat(input.nextLine());
		System.out.print("Nhập chiều rộng (m): ");
		chieuRong = Float.parseFloat(input.nextLine());
		input.close();
	}

	public void xuat() {
		System.out.println("-------o0 HÌNH CHỮ NHẬT 0o-------");
		System.out.print("-\tChiều dài: " + this.chieuDai + " m");
		System.out.print("\n-\tChiều rộng: " + this.chieuRong + " m");
	}

	// 5. Nghiệp vụ - business methods
	public float tinhChuVi() {
		float chuVi = 0;
		chuVi = (this.chieuDai + this.chieuRong) * 2;
		return chuVi;
	}

	public float tinhDienTich() {
		return this.chieuDai * this.chieuRong;
	}
}
