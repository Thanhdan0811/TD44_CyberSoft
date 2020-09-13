package com.cybersoft.td44.quanlysinhvien;

import java.time.OffsetDateTime;
import java.util.Scanner;

public class SinhVien {
	// properties
	private String maSv;
	private String ten;
	private float diemToan;
	private float diemLy;
	private float diemHoa;
	// id tự tăng
	private static int soTT = 1;
	
	private static String generateId() {
		return "SV" 
				+ OffsetDateTime.now().getYear()
				+ OffsetDateTime.now().getMonth().getValue()
				+ soTT++;
	}
	
	// constructors
	public SinhVien() {
		maSv = generateId();
		ten = "";
	}
	
	public SinhVien(String ten) {
		maSv = generateId();
		this.ten = ten;
	}
	
	// getters, setters
	public float getDiemToan() {
		return diemToan;
	}

	public void setDiemToan(float diemToan) {
		if(diemToan >= 0 && diemToan <= 10) {
			this.diemToan = diemToan;
			return;
		}
		
		System.out.println("Điểm không hợp lệ.");
	}

	public float getDiemLy() {
		return diemLy;
	}

	public void setDiemLy(float diemLy) {
		if(diemLy >= 0 && diemLy < 10) {
			this.diemLy = diemLy;
			return;
		}
		
		System.out.println("Điểm không hợp lệ.");
	}

	public float getDiemHoa() {
		return diemHoa;
	}

	public void setDiemHoa(float diemHoa) {
		if(diemHoa >= 0 && diemHoa <= 10) {
			this.diemHoa = diemHoa;
			return;
		}
			
		System.out.println("Điểm không hợp lệ.");
	}

	public String getMaSv() {
		return maSv;
	}

	public String getTen() {
		return ten;
	}
	
	// methods
	public void nhapThongTin(Scanner scanner) {
		System.out.println("* * * * N H Ậ P  T H Ô N G  T I N * * * *");
		System.out.print("Tên sinh viên: ");
		ten = scanner.nextLine();
		System.out.print("Điểm toán: ");
		setDiemToan(Float.parseFloat(scanner.nextLine()));
		System.out.print("Điểm lý: ");
		setDiemLy(Float.parseFloat(scanner.nextLine()));
		System.out.print("Điểm hóa: ");
		setDiemHoa(Float.parseFloat(scanner.nextLine()));
		System.out.println("* * * * * * * * * * * * * * * * * * * * * ");
	}

	public void xuatThongTin() {
		System.out.println(
					String.format("*%10s *", maSv)
					+ String.format("%16s *", ten)
					+ String.format("%12.2f *", diemToan)
					+ String.format("%12.2f *", diemLy)
					+ String.format("%12.2f *", diemHoa)
					+ String.format("%17.2f *", tinhDiemTrungBinh())
					+ String.format("%11s *", xepLoai())
				);
	}

	public float tinhDiemTrungBinh() {
		// TODO Auto-generated method stub
		return (diemToan + diemLy + diemHoa) / 3;
	}

	public String xepLoai() {
		float diemTb = tinhDiemTrungBinh();
		if(diemTb >= 9)
			return "Xuất sắc";
		else if(diemTb >= 8)
			return "Giỏi";
		else if(diemTb >= 7)
			return "Khá";
		else if(diemTb >= 6)
			return "TB - Khá";
		else if(diemTb >= 5)
			return "Trung Bình";
		else
			return "Yếu";
	}
}
