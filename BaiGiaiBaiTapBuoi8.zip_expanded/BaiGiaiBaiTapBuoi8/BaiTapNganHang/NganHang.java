package BaiTapNganHang;

import java.util.LinkedList;

final public class NganHang implements INhap, IXuat {
	// Instance variables
	private LinkedList<TaiKhoan> dstk;
	private int soTK_hienTai = 1;
	// Getter, setter methods

	public LinkedList<TaiKhoan> getDstk() {
		return dstk;
	}

	public void setDstk(LinkedList<TaiKhoan> dstk) {
		this.dstk = dstk;
	}

	// Constructor
	public NganHang() {
		this.dstk = new LinkedList<TaiKhoan>();
	}

	// Other methods
	private void inMenu() {
		System.out.println("+----------------------------------------+");
		System.out.println("|                  Menu                  |");
		System.out.println("|  - Chọn 1: để thêm tài khoản mới       |");
		System.out.println("|  - Chọn 2: để xuất tất cả tài khoản    |");
		System.out.println("|  - Chọn 3: để nạp tiền vào tài khoản   |");
		System.out.println("|  - Chọn 4: để rút tiền trong tài khoản |");
		System.out.println("|  - Chọn 5: để chuyển khoản             |");
		System.out.println("|(*) Chọn 0: để thoát chương trình       |");
		System.out.println("+----------------------------------------+");
	}

	public void thucHien() {
		boolean thoat = false;
		int luaChon = 0;
		do {
			this.inMenu();
			luaChon = this.validationInt(" --> chọn: ");
			switch (luaChon) {
			case 1:
//				this.themTaiKhoanAo(); // ---> test
				this.themTaiKhoan();
				break;
			case 2:
				this.xuatTaiKhoan();
				break;
			case 3:
				this.nhapThemTien();
				break;
			case 4:
				this.rutTien();
				break;
			case 5:
				this.chuyenKhoan();
				break;
			case 0:
				thoat = true;
				System.out.println("Chương trình kết thúc!");
				break;
			default:
				System.out.println("Vui lòng lựa chọn từ 0 - 5!");
			}
		} while (!thoat);
	}

/*	private void themTaiKhoanAo() {
		this.dstk.add(new TaiKhoan(this.soTK_hienTai++, "TaiKhoan1", 100_000));
		this.dstk.add(new TaiKhoan(this.soTK_hienTai++, "TaiKhoan2", 200_000));
		this.dstk.add(new TaiKhoan(this.soTK_hienTai++, "TaiKhoan3", 300_000));
		this.dstk.add(new TaiKhoan(this.soTK_hienTai++, "TaiKhoan4", 400_000));
		this.dstk.add(new TaiKhoan(this.soTK_hienTai++, "TaiKhoan5", 500_000));
		System.out.println("Đã thêm thành công!");
	} */

	private void themTaiKhoan() {
		TaiKhoan tk = new TaiKhoan();
		tk.setSoTaiKhoan(this.soTK_hienTai++);
		tk.NhapThongTinTaiKhoan();
		this.dstk.add(tk);
		System.out.println("Đã thêm thành công!");
	}

	private void xuatTaiKhoan() {
		if (this.dstk.isEmpty()) {
			System.out.println("Vui lòng nhập thên ít nhất 1 tài khoản!");
		} else {
			System.out.println("Đây là danh sách tài khoản: ");
			for (TaiKhoan tk : this.dstk) {
				tk.XuatThongTinTaiKhoan();
			}
		}
	}

	private TaiKhoan timTaiKhoan() {
		TaiKhoan tkTim = null;
		int soTK = this.validationInt("Vui lòng nhập số tài khoản muốn tìm: ");
		for (TaiKhoan tk : this.dstk) {
			if (tk.getSoTaiKhoan() == soTK) {
				tkTim = tk;
				break;
			}
		}
		return tkTim;
	}

	private TaiKhoan cloneTK(TaiKhoan tk) {
		TaiKhoan tkClone = new TaiKhoan(tk.getSoTaiKhoan(), tk.getTenTaiKhoan(), tk.getSoTienTaiKhoan());
		return tkClone;
	}

	private void nhapThemTien() {
		if (this.dstk.isEmpty()) {
			System.out.println("Vui lòng nhập thêm ít nhất 1 tài khoản!");
		} else {
			this.xuatTaiKhoan();
			TaiKhoan tkThem = this.timTaiKhoan();
			if (tkThem != null) {
				TaiKhoan tkCu = this.cloneTK(tkThem);
				do {
					System.out.println("Số tiền hiện tại trong tk: " + this.dinhDangTien(tkThem.getSoTienTaiKhoan()));
					double tienThem = this.validationDouble("Nhập số tiền muốn thêm: ");
					if (tienThem < 0) {
						System.out.println("Số tiền nhập không hợp lệ! Vui lòng nhập lại");
					} else {
						double currentMoney = tkThem.getSoTienTaiKhoan();
						tkThem.setSoTienTaiKhoan(currentMoney + tienThem);
						System.out.println(
								"Số tiền trong tk trước khi thêm: " + this.dinhDangTien(tkCu.getSoTienTaiKhoan()));
						System.out.println(
								"Số tiền trong tk sau khi thêm: " + this.dinhDangTien(tkThem.getSoTienTaiKhoan()));
						System.out.println("Thêm tiền thành công!");
						break;
					}
				} while (true);
			} else {
				System.out.println("Không tìm thấy tài khoản trong danh sách!");
			}
		}
	}

	private void rutTien() {
		if (this.dstk.isEmpty()) {
			System.out.println("Vui lòng nhập thêm ít nhất 1 tài khoản!");
		} else {
			this.xuatTaiKhoan();
			TaiKhoan tkRut = this.timTaiKhoan();
			if (tkRut != null) {
				TaiKhoan tkCu = this.cloneTK(tkRut);
				do {
					System.out.println("Số tiền hiện tại trong tk: " + this.dinhDangTien(tkRut.getSoTienTaiKhoan()));
					double tienRut = this.validationDouble("Nhập số tiền muốn rút: ");
					if (tienRut < 0 || tienRut > tkRut.getSoTienTaiKhoan()) {
						System.out.println("Số tiền nhập không hợp lệ! Vui lòng nhập lại");
					} else {
						double currentMoney = tkRut.getSoTienTaiKhoan();
						tkRut.setSoTienTaiKhoan(currentMoney - tienRut);
						System.out.println(
								"Số tiền trong tk trước khi rút: " + this.dinhDangTien(tkCu.getSoTienTaiKhoan()));
						System.out.println(
								"Số tiền trong tk sau khi rút: " + this.dinhDangTien(tkRut.getSoTienTaiKhoan()));
						System.out.println("Rút tiền thành công!");
						break;
					}
				} while (true);
			} else {
				System.out.println("Không tìm thấy tài khoản trong danh sách!");
			}
		}
	}

	private void chuyenKhoan() {
		if (this.dstk.size() < 2) {
			System.out.println("Phương thức này cần ít nhất 2 tài khoản để thực hiện!");
		} else {
			this.xuatTaiKhoan();
			System.out.println("Tài khoản gửi:");
			TaiKhoan tkGui = this.timTaiKhoan();
			if (tkGui != null) {
				do {
					System.out.println("Số tiền hiện tại trong tk: " + this.dinhDangTien(tkGui.getSoTienTaiKhoan()));
					double tienGui = this.validationDouble("Nhập số tiền muốn gửi: ");
					if (tienGui < 0 || tienGui > tkGui.getSoTienTaiKhoan()) {
						System.out.println("Số tiền nhập không hợp lệ! Vui lòng nhập lại");
					} else {
						System.out.println("Tài khoản nhận:");
						TaiKhoan tkNhan = this.timTaiKhoan();
						if (tkNhan == null || tkNhan == tkGui) {
							System.out.println("Không tìm thấy tài khoản trong danh sách!");
						} else {
							double current_send = tkGui.getSoTienTaiKhoan();
							tkGui.setSoTienTaiKhoan(current_send - tienGui);
							double current_receive = tkNhan.getSoTienTaiKhoan();
							tkNhan.setSoTienTaiKhoan(current_receive + tienGui);
							System.out.println("Giao dịch thành công!");
							System.out.println("Tài khoản gửi: ");
							tkGui.XuatThongTinTaiKhoan();
							System.out.println("Tài khoản nhận: ");
							tkNhan.XuatThongTinTaiKhoan();
						}
						return;
					}
				} while (true);
			} else {
				System.out.println("Không tìm thấy tài khoản trong danh sách!");
			}
		}
	}
}
