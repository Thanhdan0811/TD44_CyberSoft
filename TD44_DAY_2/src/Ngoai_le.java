import java.util.Scanner;

public class Ngoai_le {
	public static void main(String[] args) {
		
		// code đầu vào
		Scanner scanner = new Scanner(System.in);
		double canh1 , canh2 , canh3;
		String   chuoiKetQua = "";
		canh1 = scanner.nextDouble();
		System.out.println("Nhập cạnh thứ nhât ");
		canh2 = scanner.nextDouble();
		System.out.println("Nhập cạnh thứ hai ");
		canh3 = scanner.nextDouble();
		System.out.println("Nhập cạnh thứ ba ");
		
		//code xử lí
		if (canh1 + canh2 > canh3 && canh1 + canh3 > canh2 && canh2 + canh3 > canh1 ) {
			if (canh1 == canh2 && canh2 == canh3) {
				chuoiKetQua = " Đây là tam giác đều ";
			}
			else if (canh1 == canh2 || canh2 == canh3 || canh3 == canh1) {
				chuoiKetQua = " Đây là tam giác cân";
			}
			else if(Math.pow(canh1, 2) == (Math.pow(canh2, 2) + Math.pow(3, 2))
					||(Math.pow(2, 2) == (Math.pow(1, 2) + Math.pow(3, 2))
					||(Math.pow(3, 2) == (Math.pow(2, 2)) + Math.pow(1, 2))))
			chuoiKetQua = "Đây là tam giác vuông";
		
		else  {
			chuoiKetQua = "Đây là tam giác khác 3 tam giác trên!! ";
		}
		}
		 else  {
			chuoiKetQua = " 3 cạnh vừa nhập không tạo được tam giác";
		}
		
	       
		//code kết quả
		System.out.println(chuoiKetQua);
	}
}
