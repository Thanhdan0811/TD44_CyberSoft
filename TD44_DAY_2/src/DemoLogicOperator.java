
public class DemoLogicOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Demo Logic Operator
		 */
		// Phủ định
		boolean b1 = true;
		boolean b2 = !b1;
//		System.out.println(b1);
//		System.out.println(b2);
		// AND &&
		// Chỉ trả về true khi cả hai true
		b1 = true;
		b2 = true;
		System.out.println("AND : " + (b1 && b2));
		// OR ||
		// chỉ trả về false khi cả 2 false
		b1 = false;
		b2 = false;
		System.out.println("OR : " + (b1 || b2));
	}

}
