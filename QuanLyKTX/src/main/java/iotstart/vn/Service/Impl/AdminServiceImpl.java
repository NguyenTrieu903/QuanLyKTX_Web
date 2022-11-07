package iotstart.vn.Service.Impl;

import java.util.List;

import iotstart.vn.DAO.AdminDao;
import iotstart.vn.DAO.Impl.AdminDaoImpl;
import iotstart.vn.Model.InvoiceModel;
import iotstart.vn.Model.RoomModel;
import iotstart.vn.Service.AdminService;

public class AdminServiceImpl implements AdminService {
	AdminDao admindao = new AdminDaoImpl();

	@Override
	public List<RoomModel> getAllRoom() {
		// TODO Auto-generated method stub
		return admindao.getAllRoom();
	}

	@Override
	public void AddRoom(RoomModel roommodel) {
		// TODO Auto-generated method stub
		admindao.AddRoom(roommodel);
	}

	@Override
	public void DeleteRoom(String maphong) {
		// TODO Auto-generated method stub
		admindao.DeleteRoom(maphong);
	}

	@Override
	public void UpdateRoom(RoomModel roommodel) {
		// TODO Auto-generated method stub
		admindao.UpdateRoom(roommodel);
	}

	@Override
	public RoomModel getRoom(String maphong) {
		// TODO Auto-generated method stub
		return admindao.getRoom(maphong);
	}

	@Override
	public int CheckDebt(String maphong) {
		// TODO Auto-generated method stub
		return admindao.CheckDebt(maphong);
	}

	@Override
	public List<InvoiceModel> getInvoiceRoom(String maphong) {
		// TODO Auto-generated method stub
		return admindao.getInvoiceRoom(maphong);
	}

	

}
