package com.byteoper;

public class Convert {
	/*
	 * int转byte[]
	 */
	public static byte[] int2Bytes(int id) {
		byte[] arr = new byte[4];
//		arr[0] = (byte)((int)(id >> 0 * 8) & 0xff);
//		arr[1] = (byte)((int)(id >> 1 * 8) & 0xff);
//		arr[2] = (byte)((int)(id >> 2 * 8) & 0xff);
//		arr[3] = (byte)((int)(id >> 3 * 8) & 0xff);
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (byte)((int)(id >> i * 8) & 0xff);
		}
		return arr;
	}
	
	/*
	 * byte[] 转化为int
	 */
	public static int bytes2Int(byte[] arr) {
//		int rs0 = (int)((arr[0] & 0xff) << 0*8);
//		int rs1 = (int)((arr[1] & 0xff) << 1*8);
//		int rs2 = (int)((arr[2] & 0xff) << 2*8);
//		int rs3 = (int)((arr[3] & 0xff) << 3*8);
		
		int res = 0;
		for(int i = 0; i < arr.length; i++) {
			res += (int)((arr[i] & 0xff) << i*8);
		}
		return res;
	}
	
	/*
	 * long转byte[]
	 */
	public static byte[] long2Bytes(long id) {
		byte[] arr = new byte[8];
//		arr[0] = (byte)((int)(id >> 0 * 8) & 0xff);
//		arr[1] = (byte)((int)(id >> 1 * 8) & 0xff);
//		arr[2] = (byte)((int)(id >> 2 * 8) & 0xff);
//		arr[3] = (byte)((int)(id >> 3 * 8) & 0xff);
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (byte)((int)(id >> i * 8) & 0xff);
		}
		return arr;
	}
	
	/*
	 * byte[] 转化为long
	 */
	public static int bytes2Long(byte[] arr) {
//		int rs0 = (int)((arr[0] & 0xff) << 0*8);
//		int rs1 = (int)((arr[1] & 0xff) << 1*8);
//		int rs2 = (int)((arr[2] & 0xff) << 2*8);
//		int rs3 = (int)((arr[3] & 0xff) << 3*8);
		
		int res = 0;
		for(int i = 0; i < arr.length; i++) {
			res += (long)((arr[i] & 0xff) << i*8);
		}
		return res;
	}
	
	
	
	/**
	 * main()方法
	 * @param args
	 */
	public static void main(String[] args) {
//		byte arr[] = Convert.int2Bytes(8143);
//		System.out.println(arr[0] + "," + arr[1] + "," + arr[2] + "," + arr[3]);
//		System.out.println(Convert.bytes2Int(arr));
		
		byte arr[] = Convert.long2Bytes(8143);
		System.out.println(arr[0] + "," + arr[1] + "," + arr[2] + "," + arr[3] + 
					arr[4] + "," + arr[5] + "," + arr[6] + "," + arr[7]);
		System.out.println(Convert.bytes2Long(arr));
		
		//字符串与字节数组转换
		String describe = "我每天都练功，我天下无敌..."; 
		byte[] barr = describe.getBytes();
		
		String des = new String(barr);
		System.out.println(des);
	}

}
