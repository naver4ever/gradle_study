package kr.or.dgit.bigdata.school;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.bigdata.school.dto.PhoneNumber;
import kr.or.dgit.bigdata.school.dto.Student;
import kr.or.dgit.bigdata.school.service.StudentService;

public class StudentServiceTest {
	
	private static StudentService studentService;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		studentService = StudentService.getInstance();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		studentService = null;
	}

	/*@Test
	public void testSelectByall() {
		List<Student> list = studentService.findAllStudent();
		Assert.assertNotNull(list);
		for(Student s : list){
			System.out.println(s);
		}
	}*/
	
	/*@Test
	public void testSelectByNo(){
		Student std = studentService.selectByNo(3);
		Assert.assertNotNull(std);
	}*/
	
	@Test
	public void testInsertItem(){
		Calendar cal = Calendar.getInstance();
		cal.set(2000, 01, 01);
		
		Student insStd = new Student(1, "모모", "momo@test.co.kr", cal.getTime(), new PhoneNumber("010-2133-2320"));
		studentService.insertItem(insStd);
		
	/*	List<Student> list = studentService.findAllStudent();
		
		Assert.assertEquals(5, list.size());*/
	}
	
	/*@Test
	public void testDeleteItem(){
		studentService.deleteItem(2);
		
		Student std = studentService.selectByNo(1);
		
		Assert.assertNull(std);
	}*/
	
	
	/*@Test
	public void testUpdateItem(){
		Calendar cal = Calendar.getInstance();
		cal.clear();
		cal.set(2000, 01, 01);
		
		Student upStd = new Student(4, "사나", "sana@test.co.kr", cal.getTime(), new PhoneNumber("010-2133-2320"));
		studentService.updateItem(upStd);
		
		Student selectItem = studentService.selectByNo(4);
		
		Assert.assertEquals(selectItem, upStd);
	}*/

}
