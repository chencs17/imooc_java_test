package com.ccs;

public class RadixMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//十进制转为其他进制
		System.out.println(Integer.toBinaryString(112));//二进制
		System.out.println(Integer.toOctalString(112));//八进制
		System.out.println(Integer.toHexString(112));//二进制
		
		//其他进制转化为十进制
		System.out.println(Integer.parseInt("1110000", 2));
		System.out.println(Integer.parseInt("160", 8));
		System.out.println(Integer.parseInt("70", 16));
	}

}
