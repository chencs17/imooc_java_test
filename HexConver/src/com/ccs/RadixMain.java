package com.ccs;

public class RadixMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ʮ����תΪ��������
		System.out.println(Integer.toBinaryString(112));//������
		System.out.println(Integer.toOctalString(112));//�˽���
		System.out.println(Integer.toHexString(112));//������
		
		//��������ת��Ϊʮ����
		System.out.println(Integer.parseInt("1110000", 2));
		System.out.println(Integer.parseInt("160", 8));
		System.out.println(Integer.parseInt("70", 16));
	}

}
