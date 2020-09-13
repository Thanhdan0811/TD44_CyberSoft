package BaiTapNganHang;

public interface IXuat {
	default String dinhDangTien(double tien) {
		return String.format("%,.3f VNĐ", tien);
	}
}
