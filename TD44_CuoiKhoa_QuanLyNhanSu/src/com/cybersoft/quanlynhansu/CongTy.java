package com.cybersoft.quanlynhansu;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Scanner;
//public class CongTy implements IExportable, IXuatNhap
public class CongTy {
	/* properties */
	private String tenCongTy;
	private String tenVietTat; //CG -> CG20200001
	private String maSoThue;
	private double doanhThuThang;
	private ArrayList<NhanSu> dsNhanSu;
	
	private int STT = 999;

	/* constructors */
	public CongTy() {
		tenCongTy = "";
		maSoThue = "";
		tenVietTat = "";
		dsNhanSu = new ArrayList<NhanSu>();
	}
	
	public CongTy(String tenCongTy, String maSoThue) {
		this();
		this.tenCongTy = tenCongTy;
		this.maSoThue = maSoThue;
	}
	
	public CongTy(String tenCongTy, String tenVietTat, String maSoThue, double doanhThuThang) {
		this(tenCongTy,maSoThue);
		this.tenVietTat = tenVietTat;
		this.doanhThuThang = doanhThuThang;
	}
	
	/* Getters, Setters */
	
	/* methods */
	// Cau 1
	public void nhapThongTin(Scanner sc) {
		System.out.print("Tên công ty: ");
		tenCongTy =  sc.nextLine();
		System.out.print("Tên viết tắt: ");
		tenVietTat =  sc.nextLine();
		System.out.print("Mã số thuế: ");
		maSoThue = sc.nextLine();
		System.out.print("Doanh thu tháng hiện tại: ");
		doanhThuThang = Double.parseDouble(sc.nextLine());
	}
	
	// Cau 2
	public void phanBoNhanVien(Scanner scanner) {
		ArrayList<NhanVien> dsNhanVienChuaPhanBo = new ArrayList<NhanVien>();
		ArrayList<TruongPhong> dsTruongPhong = new ArrayList<TruongPhong>();
		int luaChon;
		// Lấy ra danh sách trưởng phòng và nhân viên cần phân bổ
		for(NhanSu ns : dsNhanSu) {
			if(ns instanceof NhanVien && ((NhanVien) ns).getTruongPhong() == "") {
				dsNhanVienChuaPhanBo.add((NhanVien)ns);
			} else if(ns instanceof TruongPhong) {
				dsTruongPhong.add((TruongPhong) ns);
			}
		}
		// Kiểm tra xem có nhân viên hay trưởng phòng hay không.
		if(dsTruongPhong.size() == 0 || dsNhanVienChuaPhanBo.size() == 0) return;
		System.out.println("PHAN BO NHAN VIEN: ");
		
		for (NhanVien nv : dsNhanVienChuaPhanBo) {
			System.out.println("Thong tin nhan vien:");
			nv.xuatThongTin();
			
			System.out.println("Danh sach truong phong:");
			for(int i = 0; i < dsTruongPhong.size(); i++) {
				System.out.print("\t" + (i + 1) + ". ");
				dsTruongPhong.get(i).xuatThongTin();
			}
			System.out.println("\t0. Khong phan bo");
			System.out.print("Lua chon: ");
			luaChon = phanBoTuDong(dsTruongPhong.size());
//			luaChon = Integer.parseInt(scanner.nextLine());
			System.out.println(luaChon);
			TruongPhong tp;
			//de-coupling code <> couple
			// micro optimize
			if(luaChon <= 0) {
				continue;
			}
			tp = dsTruongPhong.get(luaChon - 1);
			nv.setTruongPhong(tp.getMaSo());
			tp.tangNhanVien();
		}
	}

	private int phanBoTuDong(int size) {
		int a = 1, b = size;
		if(b < a) return 0;
		return a+(int)(Math.random()*((b-a)+1));
	}
	
	// Cau 3
	public boolean themNhanSu(Scanner scan) {
		int luaChon;
		System.out.println("Nhân sự bạn muốn thêm là : \n\t1. Nhân Viên \n\t2.Trưởng Phòng \n\t3 Giám Đốc ");
		System.out.print("Lựa chọn : ");
		luaChon = Integer.parseInt(scan.nextLine());
		NhanSu ns = null;
		switch(luaChon) {
			case 1:
				ns = new NhanVien();
				ns.nhapThongTin(scan);
				break;
			case 2:
				ns = new TruongPhong();
				ns.nhapThongTin(scan);
				break;
			case 3:
				ns = new GiamDoc();
				ns.nhapThongTin(scan);
				break;
			default :
				System.out.println("Lựa chọn không hợp lệ");
				break;
		}
		// 1. kiểm tra null
		// 2. kiểm tra tên rỗng
		// 3. kiểm tra trùng lặp
		// 4. thêm 
		if(ns == null)
			return false;
		
		if("".equals(ns.getHoTen()))
			return false;
		
		if(daTonTaiNhanSu(ns))
			return false;
		
		ns.setMaSo(generateId());
		dsNhanSu.add(ns);
		return true;
	}

	public boolean themNhanSuTuDong(NhanSu ns) {
		if(ns == null)
			return false;
		
		if("".equals(ns.getHoTen()))
			return false;
		
		if(daTonTaiNhanSu(ns))
			return false;
		
		ns.setMaSo(generateId());
		dsNhanSu.add(ns);
		return true;
	}
	
	private String generateId() {
		return tenVietTat 
				+ OffsetDateTime.now().getYear()
				+ getStt(4);
	}
	
	private String getStt(int length) {
		String result = "";
		int i = 1;
		
		while(STT / (int)Math.pow(10, length-i) == 0) {
			result += "0";
			i++;
		}
		result += STT;
		STT++;
		
		return result;
	}
	
	private boolean daTonTaiNhanSu(NhanSu ns) {
		for (NhanSu nhanSu : dsNhanSu) {
			if(nhanSu.getSoDt().equalsIgnoreCase(ns.getSoDt()))
				return true;
		}
		return false;
	}
	
	// Cau 4
	public boolean xoaNhanSu(Scanner scan) {
		NhanSu nsCanXoa = null;
		String maSo;
		System.out.print("Nhập vào mã số nhân sự cần xóa : ");
		maSo = scan.nextLine();
		// Nếu mã số là null
		if(maSo == null)
			return false;
		
		for (NhanSu nhanSu : dsNhanSu) {
			if(!maSo.equalsIgnoreCase(nhanSu.getMaSo())) continue;
			nsCanXoa = nhanSu;
		}
		// Nếu không mã nếu không trùng với bất cứ nhân sự nào.
		if(nsCanXoa == null) return false;
		// Nếu là class NhanVien thì giảm số nhân viên của trưởng phòng
		if(nsCanXoa instanceof NhanVien) {
			// Lấy mã trưởng phòng của nhân viên
			String maTruongPhongCuaNhanVien = ((NhanVien) nsCanXoa).getTruongPhong();
			System.out.println("mã trưởng phòng của nhân viên : " + maTruongPhongCuaNhanVien);
			// Nếu đã phân vào trưởng phòng, giảm số nhân viên xuống.
			for(int i = 0; i < dsNhanSu.size(); i++) {
				NhanSu nhanSu = dsNhanSu.get(i);
				// Kiểm tra xem có phân vào trưởng phòng nào chưa
				if("".equals(maTruongPhongCuaNhanVien)) break;
				// Kiểm tra nhanSu có thuộc class Truong Phong
				if(!(nhanSu instanceof TruongPhong)) continue;
				String maSoNhanSu = nhanSu.getMaSo();
				if(maTruongPhongCuaNhanVien.equalsIgnoreCase(maSoNhanSu))
					((TruongPhong) nhanSu).giamNhanVien();
			}
		}
		// Nếu là class TruongPhong thì reset lại NhanVien được phân bổ vào trưởng phòng này
		if(nsCanXoa instanceof TruongPhong) {
			int soNhanVien = ((TruongPhong) nsCanXoa).getSoNhanVien();
			String maSoTruongPhong  = ((TruongPhong) nsCanXoa).getMaSo();
			
			for(int i = 0; i < dsNhanSu.size(); i++) {
				// Kiểm tra Trưởng phòng có số nhân viên nào không
				if(soNhanVien == 0) break;
				NhanSu nhanSu = dsNhanSu.get(i);
				// Kiểm tra nhanSu có thuộc class NhanVien
				if(!(nhanSu instanceof NhanVien)) continue;
				String maTruongPhongCuaNhanVien  = ((NhanVien) nhanSu).getTruongPhong();
				if(maSoTruongPhong.equalsIgnoreCase(maTruongPhongCuaNhanVien))
					((NhanVien) nhanSu).setTruongPhong("");
			}
		}
		// Xóa nhân sự
		dsNhanSu.remove(nsCanXoa);
		return true;
	}
	
	// Cau 5
	public void xuatThongTin() {
		int num = 72;
		String ttCongTy = "THÔNG TIN CÔNG TY";
		String ttNhanSu = "DANH SÁCH NHÂN SỰ";
		
		System.out.println();
		System.out.println(String.format("%" + (num*2 - ttCongTy.length())/2 + "s", "") + ttCongTy + String.format("%" + (num*2 - ttCongTy.length())/2 + "s", ""));
		System.out.println("Tên công ty: " + tenCongTy);
		System.out.println("Mã số thuế: " + maSoThue);
		System.out.println("Doanh thu: " + String.format("%20.2f", doanhThuThang));
		
		
		System.out.println();
		System.out.println(String.format("%" + (num*2 - ttNhanSu.length())/2 + "s", "") + ttNhanSu + String.format("%" + (num*2 - ttNhanSu.length())/2 + "s", ""));
		drawLine(num);
		System.out.println();
		System.out.println(
				String.format(" %3s  ", "Stt")
				+ String.format(" %10s  ", "Mã số")
				+ String.format("%16s  ", "Họ tên")
				+ String.format("%16s  ", "Số điện thoại")
				+ String.format("%12s  ", "Ngày làm")
				+ String.format("%16s  ", "Lương cơ bản")
				+ String.format("%17s  ", "Lương")
				+ String.format("%16s", "Chức vụ")
				+ String.format("%25s  ", "Số nhân viên/Cổ phần")
			);
		drawLine(num);
		System.out.println();
		for(int i = 0; i < dsNhanSu.size(); i++) {
			NhanSu nhanSu = dsNhanSu.get(i);
			nhanSu.nhapSTT(i+1);
			nhanSu.xuatThongTin();
		}
		drawLine(num);
		System.out.println();
		System.out.println(
				String.format(" %3s  ", "")
				+ String.format(" %10s  ", "")
				+ String.format("%16s  ", "")
				+ String.format("%16s  ", "")
				+ String.format("%30s  ", "Tổng lương")
				+ String.format("%17.2f  ", tinhTongLuong())
				+ String.format("%16s", "")
				+ String.format("%25s  |", "")
			);
		drawLine(num);
	}
	
	private void drawLine(int num) {
		for(int i = 0; i < num; i++) {
			System.out.print("- ");
		}
	}
	
	// Cau 6
	public double tinhTongLuong() {
		double tongLuong = 0;
		for (NhanSu nhanSu : dsNhanSu) {
			tongLuong += nhanSu.tinhLuong();
		}
		
		return tongLuong;
	}
	
	// Cau 7
	public void timNhanVienThuongLuongCaoNhat() {
		double maxLuong = 0;
		int soNhanVienThuongTrongCongTy = 0;
		// Tìm mức lương cao nhất
		for(int i = 0; i < dsNhanSu.size(); i++) {
			if(!(dsNhanSu.get(i) instanceof NhanVien)) continue;
			soNhanVienThuongTrongCongTy++;
			if(maxLuong < ((NhanVien)dsNhanSu.get(i)).tinhLuong())
				maxLuong = ((NhanVien)dsNhanSu.get(i)).tinhLuong(); 
		}
		// Kiểm tra xem cty có nhân viên thường hay không
		if(soNhanVienThuongTrongCongTy == 0) return;
		// Xuất ra tên nhân viên có lương cao nhất
		System.out.println("\nNhân viên thường có lương cao nhất : ");
		for(int i = 0; i < dsNhanSu.size(); i++) {
			if(!(dsNhanSu.get(i) instanceof NhanVien)) continue;
			if(maxLuong == ((NhanVien)dsNhanSu.get(i)).tinhLuong())
				System.out.println("Tên : " + dsNhanSu.get(i).getHoTen() + 
									"\nMã số : " + dsNhanSu.get(i).getMaSo());
		}
		System.out.println("Với mức lương là : " + maxLuong);
	}
	
	// Cau 8
	public void timTruongPhongQuanLyNhieuNhat() {
		ArrayList<TruongPhong> dsTruongPhong = new ArrayList<TruongPhong>();
		int soNhanVienMax = 0;
		int maxLength = dsNhanSu.size();
		// Lọc ra danh sách các trưởng phòng
		for(int i = 0; i < maxLength; i++) {
			if(!(dsNhanSu.get(i) instanceof TruongPhong)) continue;
				dsTruongPhong.add(((TruongPhong)dsNhanSu.get(i)));
		}
		// Kiểm tra xem có trường phòng hay không
		if(dsTruongPhong.size() == 0) return;
		// Tìm số nhân viên lớn nhất
		for(int i = 0; i < dsTruongPhong.size(); i++) {
			if(soNhanVienMax < dsTruongPhong.get(i).getSoNhanVien())
				soNhanVienMax = dsTruongPhong.get(i).getSoNhanVien();
		}
		// Kiểm tra xem đã có phân bổ hay chưa
		if(soNhanVienMax == 0) {
			System.out.println("\nCác Trưởng phòng chưa có nhân viên");
			return;
		}
		// Xuất ra trưởng phòng có nhiều nhân viên nhất.
		System.out.println("\nTrưởng phòng quản lý nhiều nhân viên nhất : ");
		for(int i = 0; i < dsTruongPhong.size(); i++) {
			if(soNhanVienMax == dsTruongPhong.get(i).getSoNhanVien())
				System.out.println("Họ tên : " + dsTruongPhong.get(i).getHoTen() + 
						"\nMã số : " + dsTruongPhong.get(i).getMaSo());
		}
		System.out.println(" với số nhân viên là : " + soNhanVienMax);
	}
	
	// Cau 9
	public void sapXepTheoABC() {
		// Dùng bubble sort
		for(int i = 0; i < dsNhanSu.size(); i++) {
			for(int j = 0; j < dsNhanSu.size()  - i - 1; j++) {
				int soSanh = dsNhanSu.get(j).getHoTen().compareToIgnoreCase(dsNhanSu.get(j+1).getHoTen());
				if(soSanh > 0) {
					NhanSu ns;
					ns = dsNhanSu.get(j);
					dsNhanSu.set(j, dsNhanSu.get(j+1));
					dsNhanSu.set(j+1, ns);
				}
			}
		}
	}
	
	// Cau 10
	public void sapXepLuongGiamDan() {
		// Dùng bubble sort
		for(int i = 0; i < dsNhanSu.size(); i++) {
			for(int j = 0; j < dsNhanSu.size()  - i - 1; j++) {
				double soSanh = dsNhanSu.get(j).tinhLuong() - dsNhanSu.get(j + 1).tinhLuong();
				if(soSanh < 0) {
					NhanSu ns;
					ns = dsNhanSu.get(j);
					dsNhanSu.set(j, dsNhanSu.get(j+1));
					dsNhanSu.set(j+1, ns);
				}
			}
		}
	}
	
	// Cau 11
	public void timGiamDocCoPhanNhieuNhat() {
		float maxSoCoPhan = 0;
		int soGiamDocTrongCongTy = 0;
		// Tìm số cổ phần MAX
		for(int i = 0; i < dsNhanSu.size(); i++) {
			if(!(dsNhanSu.get(i) instanceof GiamDoc)) continue;
			soGiamDocTrongCongTy++;
			if(maxSoCoPhan < ((GiamDoc)dsNhanSu.get(i)).getSoCoPhan())
				maxSoCoPhan = ((GiamDoc)dsNhanSu.get(i)).getSoCoPhan(); 
		}
		// Kiểm tra xem đã có tạo Giám Đốc chưa
		if(soGiamDocTrongCongTy == 0) return;
		// Xuất ra giám đốc có cổ phần MAX 
		System.out.println("\nGiám đốc có số cổ phần cao nhất : ");
		for(int i = 0; i < dsNhanSu.size(); i++) {
			if(!(dsNhanSu.get(i) instanceof GiamDoc)) continue;
			if(maxSoCoPhan == ((GiamDoc)dsNhanSu.get(i)).getSoCoPhan())
				System.out.println("Họ Tên : "+ dsNhanSu.get(i).getHoTen() + 
						"\nMã số : " + dsNhanSu.get(i).getMaSo());
		}
		System.out.println("Với số cổ phần là : " + maxSoCoPhan);
	}
	
	// Cau 12
	public void xuatThuNhapCuaTungGiamDoc() {
		double loiNhuanCongTy = this.doanhThuThang - tinhTongLuong();
		double thuNhap = 0;
		for(int i = 0; i < dsNhanSu.size(); i++) {
			if(!(dsNhanSu.get(i) instanceof GiamDoc)) continue;
			thuNhap = dsNhanSu.get(i).tinhLuong() + (((GiamDoc)dsNhanSu.get(i)).getSoCoPhan() / 100) * loiNhuanCongTy;
			System.out.println("\nGiám đốc " + dsNhanSu.get(i).getHoTen() + " có thu nhập là : " + String.format("%20.2f", thuNhap));
		}
	}
}