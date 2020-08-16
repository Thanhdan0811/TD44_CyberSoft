package com.cybersoft.td44.baitapb2;

public class DemoToanTuBaNgoi {
	public static void main(String[] args) {
		
		int soInt = 100;
		int soLe = 0;
		
		if(soInt % 2 == 1) {
			soLe += 1;
		} 
		
		soLe += soInt % 2 == 1? 1 : 0;
		
		// nếu số soInt là số lẻ thì tăng biến soLe 1 đơn vị
				
				
		System.out.println(soInt < 0 ? 0 - soInt : soInt);
	}
}
