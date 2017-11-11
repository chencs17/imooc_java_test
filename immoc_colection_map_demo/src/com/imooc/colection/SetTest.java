package com.imooc.colection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SetTest {

	public List<Course> coursesToSelect;
	
	public SetTest() {
		coursesToSelect = new ArrayList<Course>();
	}
	
	/*
	 * 用于往coursesToSelect中添加被选课程
	 */
	public void testAdd() {
		//创建一个课程对象，并且通过调用add方法，添加到备选课程List中
		Course cr1 = new Course("1", "数据结构");
		coursesToSelect.add(cr1);
		//Course temp = (Course)coursesToSelect.get(0);
		//System.out.println("添加了课程：" + temp.id + ":" + temp.name);
		
		Course cr2 = new Course("2", "C语言");
		coursesToSelect.add(0, cr2);
		//Course temp2 = (Course)coursesToSelect.get(0);
		//System.out.println("添加了课程：" + temp2.id + ":" + temp2.name);
		
		//有序可重复
		//coursesToSelect.add(cr1);
		//Course temp0 = (Course)coursesToSelect.get(2);
		//System.out.println("添加了课程：" + temp0.id + ":" + temp0.name);
		
		
		//Course cr3 = new Course("3", "test");
		//coursesToSelect.add(4, cr3);//IndexOutOfBoundsException
		
		Course [] course = {new Course("3", "离散数学"), new Course("4", "汇编语言")};
		coursesToSelect.addAll(Arrays.asList(course));
		//Course temp3 = (Course)coursesToSelect.get(3);
		//Course temp4 = (Course)coursesToSelect.get(4);
		//System.out.println("添加了两门课程：" + temp3.id + ":" + temp3.name + 
		//		";" + temp4.id + ":" + temp4.name);
		
		
		Course [] course2 = {new Course("5", "高等数学"), new Course("6", "大学英语")};
		coursesToSelect.addAll(2, Arrays.asList(course2));
		//Course temp5 = (Course)coursesToSelect.get(2);
		//Course temp6 = (Course)coursesToSelect.get(3);
		//System.out.println("添加了两门课程：" + temp5.id + ":" + temp5.name + 
		//		";" + temp6.id + ":" + temp6.name);
		
		
	}
	
	
	/**
	 * 通过foreach方法访问集合
	 * @param args
	 */
	public void testForEach() {
		System.out.println("有如下课程待选(通过foreach访问)：");
		for(Object obj : coursesToSelect) {
			Course cr = (Course)obj;
			System.out.println("课程：" + cr.id + ":" + cr.name);
		}
	}
	
	public void testForEachForSet(Student student) {
		//打印输出学生所选的课程
		System.out.println("共选择了：" + student.courses.size() + "门课！");
		for(Course cr : student.courses) {
			System.out.println("选择了课程：" + cr.id + ":" + cr.name);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetTest st = new SetTest();
		st.testAdd();
		st.testForEach();
		//创建一个学生对象
		Student student = new Student("1", "小明");
		System.out.println("欢迎学生：" + student.name + "选课!");
		//创建一个scanner对象，用于接受从键盘输入的课程id
		Scanner console = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {
			System.out.println("请输入课程id：");
			String courseId = console.next();
			for(Course cr : st.coursesToSelect) {
				if(cr.id.equals(courseId)) {
					student.courses.add(cr);
					/**
					 * Set中添加某个对象，无论添加多少次
					 * 最终只会保留该对象（的引用）
					 * 并且保留的是第一次添加的那个
					 */
					//student.courses.add(cr);
					//student.courses.add(null);
				}
			}
		}
		st.testForEachForSet(student);
	}

}
