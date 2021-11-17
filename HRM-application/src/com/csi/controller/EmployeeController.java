package com.csi.controller;

import java.util.LinkedList;
import java.util.List;

import com.csi.model.Employee;
import com.csi.service.EmployeeServiceIMPL;

public class EmployeeController {

	static EmployeeServiceIMPL employeeServiceIMPL = new EmployeeServiceIMPL();

	public static void main(String[] args) {
savedata();
	}

	static void savedata() {
		Employee employee = new Employee();
		employee.setEmpName("rata");
		employee.setEmpAddress("pune");
		employee.setEmpSalary(12345);
		employee.setEmpEmailId("s@123");
		employee.setEmpContactNumber(9850369696L);
		employeeServiceIMPL.savedata(employee);

	}

	static void savebulkdata() {
		List<Employee> employees=new LinkedList<Employee>();
		Employee employee1 = new Employee();

		employee1.setEmpName("KUNAL");
		employee1.setEmpSalary(454655.89);
		employee1.setEmpEmailId("KUNAL@CSI.COM");
		employee1.setEmpContactNumber(34354655L);

		Employee employee2 = new Employee();

		employee2.setEmpName("LAKSHMI");
		employee2.setEmpSalary(455465.89);
		employee2.setEmpEmailId("LAKSHMI.V@CSI.COM");
		employee2.setEmpContactNumber(45646576L);

		employees.add(employee1);
		employees.add(employee2);
		employeeServiceIMPL.savebulkdata(employees);

	}

	static void updatedata() {
		Employee employee = new Employee();

		employee.setEmpName("VAIBHAV POHANE");
		employee.setEmpSalary(99999.89);
		employee.setEmpEmailId("VAIBHAV.POHANE@CSI.COM");
		employee.setEmpContactNumber(3456465675L);
		employeeServiceIMPL.updatedata(2, employee);

	}

	static void getdatabyid(int empId) {
System.out.println(employeeServiceIMPL.getdatabyid(empId));
	}

	static void getalldata() {
		employeeServiceIMPL.getalldata().forEach(System.out::println);
	}

	static void deletealldata() {
		employeeServiceIMPL.deletalldata();
	}

	static void deletedatabyid() {
		employeeServiceIMPL.deletdatabyid(2);
	}

}
