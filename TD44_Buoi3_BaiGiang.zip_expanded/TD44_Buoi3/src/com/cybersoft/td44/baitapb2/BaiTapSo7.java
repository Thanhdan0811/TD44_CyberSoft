package com.cybersoft.td44.baitapb2;

public class BaiTapSo7 {

	public static void main(String[] args) {
		for(int i = 0; i < 2500; i++) {
			if(i % 100 == 0 && i % 400 == 0) {
				if(i % 4 != 0) {
					System.out.println(i);
				}
			}
		}
		System.out.println("End.");
	}

}
