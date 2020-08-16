import java.util.Scanner;

public class Bai_4_DienTich_ChuVi_HinhChuNhat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int chieuDaiHCN = 0, chieuRongHCN = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhập vào chiều dài HCN : ");
		chieuDaiHCN = Integer.parseInt(scan.nextLine());
		System.out.print("Nhập vào chiều rộng HCN : ");
		chieuRongHCN = Integer.parseInt(scan.nextLine());
		scan.close();
		System.out.println("DIện tích HCN là : " + chieuDaiHCN * chieuRongHCN + 
							"\nChu vi HCN là : " + (chieuDaiHCN + chieuRongHCN) * 2);
		// Nên viết x * 2 + y * 2 để tính toán nhanh hơn
	}

}
