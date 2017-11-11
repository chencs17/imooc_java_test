package com.imooc.colection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * ��ѡ�γ���
 * @author Administrator
 *
 */
public class ListTest {
	/*
	 * ��ѡ�γ̵�List
	 */
	public List coursesToSelect;
	
	@SuppressWarnings("rawtypes")
	public ListTest() {
		this.coursesToSelect = new ArrayList();
	}
	
	/*
	 * ������coursesToSelect����ӱ�ѡ�γ�
	 */
	public void testAdd() {
		//����һ���γ̶��󣬲���ͨ������add��������ӵ���ѡ�γ�List��
		Course cr1 = new Course("1", "���ݽṹ");
		coursesToSelect.add(cr1);
		Course temp = (Course)coursesToSelect.get(0);
		System.out.println("����˿γ̣�" + temp.id + ":" + temp.name);
		
		Course cr2 = new Course("2", "C����");
		coursesToSelect.add(0, cr2);
		Course temp2 = (Course)coursesToSelect.get(0);
		System.out.println("����˿γ̣�" + temp2.id + ":" + temp2.name);
		
		//������ظ�
		coursesToSelect.add(cr1);
		Course temp0 = (Course)coursesToSelect.get(2);
		System.out.println("����˿γ̣�" + temp0.id + ":" + temp0.name);
		
		
		//Course cr3 = new Course("3", "test");
		//coursesToSelect.add(4, cr3);//IndexOutOfBoundsException
		
		Course [] course = {new Course("3", "��ɢ��ѧ"), new Course("4", "�������")};
		coursesToSelect.addAll(Arrays.asList(course));
		Course temp3 = (Course)coursesToSelect.get(3);
		Course temp4 = (Course)coursesToSelect.get(4);
		System.out.println("��������ſγ̣�" + temp3.id + ":" + temp3.name + 
				";" + temp4.id + ":" + temp4.name);
		
		
		Course [] course2 = {new Course("5", "�ߵ���ѧ"), new Course("6", "��ѧӢ��")};
		coursesToSelect.addAll(2, Arrays.asList(course2));
		Course temp5 = (Course)coursesToSelect.get(2);
		Course temp6 = (Course)coursesToSelect.get(3);
		System.out.println("��������ſγ̣�" + temp5.id + ":" + temp5.name + 
				";" + temp6.id + ":" + temp6.name);
		
		
	}
	
	/**
	 * ȡ��List�е�Ԫ�ط���
	 * @param args
	 */
	public void testGet() {
		//ͨ�����ϵ�iterator()������ȡ�õ�������ʵ��
		int size = coursesToSelect.size();
		System.out.println("�����¿γ̴�ѡ()��");
		for(int i = 0; i < size; i++) {
			Course cr = (Course)coursesToSelect.get(i);
			System.out.println("�γ̣�" + cr.id + ":" + cr.name);
		}
	}
	
	/**
	 * ͨ������������List
	 * @param args
	 */
	public void testIterator() {
		Iterator it = coursesToSelect.iterator();
		System.out.println("�����¿γ̴�ѡ(ͨ������������)��");
		while(it.hasNext()) {
			Course cr = (Course)it.next();
			System.out.println("�γ̣�" + cr.id + ":" + cr.name);
		}
	}
	
	/**
	 * ͨ��foreach�������ʼ���
	 * @param args
	 */
	public void testForEach() {
		System.out.println("�����¿γ̴�ѡ(ͨ��foreach����)��");
		for(Object obj : coursesToSelect) {
			Course cr = (Course)obj;
			System.out.println("�γ̣�" + cr.id + ":" + cr.name);
		}
	}
	
	/**
	 * �޸�List�е�Ԫ��
	 * @param args
	 */
	public void testModify() {
		coursesToSelect.set(4,new Course("7", "ë��"));
	}
	
	
	/**
	 * ɾ��List�е�Ԫ��
	 * @param args
	 */
	public void testRemove() {
		//ɾ������Ԫ��
		//Course cr = (Course)coursesToSelect.get(4);
		//System.out.println("���ǿγ̣�" + cr.id + ":" + cr.name + "���Ҽ�����ɾ��");
		//coursesToSelect.remove(cr);
		//System.out.println("ɾ���ɹ���");
		
		//ɾ�����Ԫ��
		System.out.println("���ǿγ�4λ�ú�5λ���ϵĿγ�");
		Course [] course = {(Course)coursesToSelect.get(4), (Course)coursesToSelect.get(5)};
		coursesToSelect.removeAll(Arrays.asList(course));
		System.out.println("ɾ���ɹ����Ԫ�أ�");
		
		
		testForEach();
	}
	
	
	/**
	 * ��List�����һЩ��ֵĶ���
	 * @param args
	 */
	public void testType() {
		System.out.println("�ܷ���List�����һЩ��ֵĶ����أ�");
		coursesToSelect.add("�Ҳ��ǿγ̣� ��ֻ��һ���޹����ַ���������");
	}
	
	
	public static void main(String args[]) {
		ListTest lt = new ListTest();
		lt.testAdd();
		//lt.testGet();
		//lt.testIterator();
		//lt.testForEach();
		//lt.testModify();
		//lt.testForEach();
		//lt.testRemove();
		lt.testType();
		lt.testForEach();
	}
}
