
public class DemoLogicOperator {

	public static void main(String[] args) {
		/*
		 * Demo Logic Operator
		 */

		// phủ định
		boolean b1 = false;
		boolean b2 = !b1;
		
		// and - và : && 
		// chỉ trả về true khi cả 2 vế true
		b1 = false;
		b2 = false;
		
		//System.out.println(b1 && b2);
		
		// or - hoặc : ||
		// chỉ trả về false khi cả 2 vế đều false
		b1 = false;
		b2 = false;
		
		System.out.println(b1 || b2);
		
	}

}
