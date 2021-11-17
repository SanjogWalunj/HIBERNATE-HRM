package com.csi.service;

import java.util.List;

import com.csi.dao.EmployeeDaoIMPL;
import com.csi.model.Employee;

public class EmployeeServiceIMPL implements EmployeeService{
	 static EmployeeDaoIMPL employeeDaoIMPL = new EmployeeDaoIMPL(); 

	@Override
	public List<Employee> getalldata() {
		// TODO Auto-generated method stub
		return employeeDaoIMPL.getalldata();
	}

	@Override
	public Employee getdatabyid(int empId) {
		// TODO Auto-generated method stub
		return employeeDaoIMPL.getdatabyid(empId);
	}

	@Override
	public void savedata(Employee employee) {
		// TODO Auto-generated method stub
		employeeDaoIMPL.savedata(employee);
	}

	@Override
	public void savebulkdata(List<Employee> employees) {
		// TODO Auto-generated method stub
		employeeDaoIMPL.savebulkdata(employees);
	}

	@Override
	public void updatedata(int empId, Employee employee) {
		// TODO Auto-generated method stub
		employeeDaoIMPL.updatedata(empId, employee);
	}

	@Override
	public void deletdatabyid(int empId) {
		// TODO Auto-generated method stub
		employeeDaoIMPL.deletdatabyid(empId);
	}

	@Override
	public void deletalldata() {
		// TODO Auto-generated method stub
		employeeDaoIMPL.deletalldata();
	}

}
