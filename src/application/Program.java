package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {
	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
				
		System.out.println("*****1. seller findById*****");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println();
		System.out.println("*****2. seller findByDepartment*****");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println();
		System.out.println("*****3. seller findByAll*****");
		list = sellerDao.findAll();
		for(Seller obj : list) {
			System.out.println(obj);
		}

		System.out.println();
		System.out.println("*****4. seller insert*****");
		Seller newSeller = new Seller(null, "Maria", "maria@gmail.com", new Date(), 9000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());
		
		System.out.println();
		System.out.println("*****5. seller update*****");
		seller = sellerDao.findById(3);
		seller.setName("Martha Waine");
		seller.setEmail("martha@gmail.com");
		sellerDao.update(seller);
		System.out.println("Update completed!");
		
		System.out.println();
		System.out.println("*****6. seller delete*****");
		sellerDao.deleteById(7210);
		System.out.println("Delete completed!");
		
	}
}
