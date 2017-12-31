package com.spring.info;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import com.spring.model.Address;
import com.spring.model.Student;


public class CollectionInfo {

	private List<String> studentNameList;
	private Set<String> citiesSet;
	private List<Student> stuList;
	private Map<Integer,String> stuIdNameMap;
	private Map<Student,Address> stuAddrMap;
	private Properties stateCapProps;
	private String []cities = new String[4];
	
	public List<String> getStudentNameList() {
		return studentNameList;
	}
	public void setStudentNameList(List<String> studentNameList) {
		this.studentNameList = studentNameList;
	}
	public Set<String> getCitiesSet() {
		return citiesSet;
	}
	public void setCitiesSet(Set<String> citiesSet) {
		this.citiesSet = citiesSet;
	}
	public List<Student> getStuList() {
		return stuList;
	}
	public void setStuList(List<Student> stuList) {
		this.stuList = stuList;
	}
	public Map<Integer, String> getStuIdNameMap() {
		return stuIdNameMap;
	}
	public void setStuIdNameMap(Map<Integer, String> stuIdNameMap) {
		this.stuIdNameMap = stuIdNameMap;
	}
	public Map<Student, Address> getStuAddrMap() {
		return stuAddrMap;
	}
	public void setStuAddrMap(Map<Student, Address> stuAddrMap) {
		this.stuAddrMap = stuAddrMap;
	}
	public Properties getStateCapProps() {
		return stateCapProps;
	}
	public void setStateCapProps(Properties stateCapProps) {
		this.stateCapProps = stateCapProps;
	}
	public String[] getCities() {
		return cities;
	}
	public void setCities(String[] cities) {
		this.cities = cities;
	}
}
