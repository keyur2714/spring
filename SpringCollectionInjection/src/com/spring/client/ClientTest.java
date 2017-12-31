package com.spring.client;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.info.CollectionInfo;
import com.spring.model.Address;
import com.spring.model.Student;

public class ClientTest {

	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		CollectionInfo collectionInfo = ctx.getBean("collectionInfo", CollectionInfo.class);
		
		List<String> studentNameList = collectionInfo.getStudentNameList();
		System.out.println("studentNameList============================================");
		for (String name : studentNameList) {
			System.out.println(name);
		}
		
		System.out.println("CitiesSet============================================");
		Set<String> citiesSet = collectionInfo.getCitiesSet();
		for (String city : citiesSet) {
			System.out.println(city);
		}
		System.out.println("StuList============================================");
		
		List<Student> stuList = collectionInfo.getStuList();
		
		for (Student student : stuList) {
			System.out.println(student.getStudentId()+"\t"+student.getStudentName()+"\t"+student.getPhone());
		}
		System.out.println("StuIdNameMap============================================");
		
		Map<Integer, String> stuIdNameMap = collectionInfo.getStuIdNameMap();
		
		Set<Integer> keySet = stuIdNameMap.keySet();
		for (Integer studentId : keySet) {
			System.out.println(studentId+":"+stuIdNameMap.get(studentId));
			
		}
		System.out.println("StuAddrMap============================================");
		
		Map<Student, Address> stuAddrMap = collectionInfo.getStuAddrMap();
		
		Set<Entry<Student, Address>> entrySet = stuAddrMap.entrySet();
		for (Entry<Student, Address> entry : entrySet) {
			
			Student student = entry.getKey();
			Address address = entry.getValue();
			
			System.out.println(student.getStudentId()+"\t"+student.getStudentName()+"\t"+student.getPhone());
			System.out.println(address.getAddressId()+"\t"+address.getCity()+"\t"+address.getStreet()+"\t"+address.getZipCode());
		}
		System.out.println("StateCapProps============================================");
		
		Properties stateCapProps = collectionInfo.getStateCapProps();
		Set<Entry<Object, Object>> entrySet2 = stateCapProps.entrySet();
		for (Entry<Object, Object> entry : entrySet2) {
			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}
		System.out.println("Cities============================================");
		String[] cities = collectionInfo.getCities();
		for (String city : cities) {
			System.out.println(city);
		}
		ctx.close();
	}

}
