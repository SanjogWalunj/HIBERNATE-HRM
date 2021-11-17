package com.csi.dao;

import java.util.List;

import com.csi.model.Employee;

public interface EmployeeDao {

	public List<Employee>getalldata();
	public Employee getdatabyid(int empId);
	public void savedata(Employee employee);
	public void savebulkdata(List<Employee>employees);
	public void updatedata(int empId ,Employee employee);
	public void deletdatabyid(int empId);
	public void deletalldata();
}
