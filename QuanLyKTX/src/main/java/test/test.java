package test;

import java.util.List;

import iotstart.vn.DAO.Impl.AdminDaoImpl;
import iotstart.vn.Model.InvoiceModel;
import iotstart.vn.Service.AdminService;
import iotstart.vn.Service.Impl.AdminServiceImpl;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//AdminDaoImpl admin = new AdminDaoImpl();
		AdminService admin = new AdminServiceImpl();
		InvoiceModel inv = new InvoiceModel();
		inv = admin.getInvoiceRoom("P103");
//		System.out.print(getInvoiceRoom("P102"));
		//System.out.println(Arrays.toString(.toArray()));
//		for(int i=0;i<lst.size();i++){
//		    System.out.println(lst.get(i));
//		}
		System.out.printf("%s", inv.getMaphong());
	}
}
