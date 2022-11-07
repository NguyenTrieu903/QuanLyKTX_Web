package iotstart.vn.Service;

import java.util.List;

import iotstart.vn.Model.InvoiceModel;
import iotstart.vn.Model.RoomModel;

public interface AdminService {
	List<RoomModel> getAllRoom();
	void AddRoom(RoomModel roommodel);
	void DeleteRoom(String maphong);
	void UpdateRoom(RoomModel roommodel);
	RoomModel getRoom(String maphong);
	int CheckDebt(String maphong);
	List<InvoiceModel> getInvoiceRoom (String maphong);
}
