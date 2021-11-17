package com.csi.dao;

import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.search.annotations.Factory;

import com.csi.model.Employee;

public class EmployeeDaoIMPL implements EmployeeDao{
private static SessionFactory factory = new AnnotationConfiguration().configure().buildSessionFactory();
	@Override
	public List<Employee> getalldata() {
		Session session = factory.openSession();
		List<Employee>emplist = session.createQuery("from Employee").list();
		
		// TODO Auto-generated method stub
		return emplist;
	}

	@Override
	public Employee getdatabyid(int empId) {
		Session session = factory.openSession();
		List<Employee>emplist = session.createQuery("from Employee").list();
		Employee employee = new Employee();
		for(Employee ee:emplist){
			if(ee.getEmpId()==empId){
				employee.setEmpName(ee.getEmpName());
				employee.setEmpAddress(ee.getEmpAddress());
				employee.setEmpSalary(ee.getEmpSalary());
				employee.setEmpEmailId(ee.getEmpEmailId());
				employee.setEmpContactNumber(ee.getEmpContactNumber());
				session.save(employee);
			}
		}
		return employee;
	}

	@Override
	public void savedata(Employee employee) {
		
		Session session = factory.openSession();
		org.hibernate.Transaction transaction = session.beginTransaction();
		session.save(employee);
		transaction.commit();
		
	}

	@Override
	public void savebulkdata(List<Employee> employees) {
		
		Session session = factory.openSession();
		for(Employee e:employees){
			org.hibernate.Transaction transaction = session.beginTransaction();
			session.save(e);
			transaction.commit();
			
		}
		
	}

	@Override
	public void updatedata(int empId, Employee employee) {
		Session session = factory.openSession();
		org.hibernate.Transaction transaction = session.beginTransaction();
		List<Employee>emplist = session.createQuery("from Employee").list();
		for(Employee e:emplist){
			if(e.getEmpId()==empId){
				e.setEmpName(employee.getEmpName());
				e.setEmpAddress(employee.getEmpAddress());
				e.setEmpEmailId(employee.getEmpEmailId());
				e.setEmpSalary(employee.getEmpSalary());
				e.setEmpContactNumber(employee.getEmpContactNumber());
				session.update(e);
				transaction.commit();
			}
		}
		
		
	}

	@Override
	public void deletdatabyid(int empId) {
		Session session = factory.openSession();
		org.hibernate.Transaction transaction = session.beginTransaction();
		List<Employee>emplist = session.createQuery("from Employee").list();
		for(Employee e:emplist){
			if(e.getEmpId()==empId){
				
				session.delete(e);
				transaction.commit();
			}
		}
		
		
	}

	@Override
	public void deletalldata() {
		Session session = factory.openSession();
		List<Employee>emplist = session.createQuery("from Employee").list();
		for(Employee e:emplist){
			org.hibernate.Transaction transaction = session.beginTransaction();
			session.delete(emplist);
			transaction.commit();
		
	}

}
	}
