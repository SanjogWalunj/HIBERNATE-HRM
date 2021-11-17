package com.csi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {
@Id
@GeneratedValue

private int empId;
private String empName;
private double empSalary;
private String empAddress;
private long empContactNumber;
private String empEmailId;
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public double getEmpSalary() {
	return empSalary;
}
public void setEmpSalary(double empSalary) {
	this.empSalary = empSalary;
}
public String getEmpAddress() {
	return empAddress;
}
public void setEmpAddress(String empAddress) {
	this.empAddress = empAddress;
}
public long getEmpContactNumber() {
	return empContactNumber;
}
public void setEmpContactNumber(long empContactNumber) {
	this.empContactNumber = empContactNumber;
}
public String getEmpEmailId() {
	return empEmailId;
}
public void setEmpEmailId(String empEmailId) {
	this.empEmailId = empEmailId;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", empAddress="
			+ empAddress + ", empContactNumber=" + empContactNumber + ", empEmailId=" + empEmailId + "]";
}


}
