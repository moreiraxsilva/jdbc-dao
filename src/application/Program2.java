package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println();
		System.out.println("*****1. departement insert*****");
		Department newDepartment = new Department(null, "Software");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());
		
		System.out.println("*****2. department findById*****");
		Department department = departmentDao.findById(3);
		System.out.println(department);
		
		System.out.println();
		System.out.println("*****3. department findByAll*****");
		List<Department> list = departmentDao.findAll();
		for(Department obj : list) {
			System.out.println(obj);
		}
		
	}
}
