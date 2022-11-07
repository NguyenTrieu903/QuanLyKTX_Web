package iotstart.vn.DAO.Impl;

import java.awt.Window.Type;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Types;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import iotstart.vn.DAO.AdminDao;
import iotstart.vn.Connection.DBConnection;
import iotstart.vn.Model.InvoiceModel;
import iotstart.vn.Model.RoomModel;

public class AdminDaoImpl extends DBConnection implements AdminDao {

	@Override
	public List<RoomModel> getAllRoom() {
		// TODO Auto-generated method stub
		List<RoomModel> ListRoom = new ArrayList<RoomModel>();
		String sql = "SELECT * FROM Phong";
		try {
			Connection conn = super.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				RoomModel roommodel = new RoomModel();
				roommodel.setMaphong(rs.getString("MaPhong"));
				roommodel.setGiaphong(rs.getInt("GiaPhong"));
				roommodel.setSosinhvienhientai(rs.getInt("SoLuongSinhVienHienTai"));
				roommodel.setSosinhvientoida(rs.getInt("SoLuongSinhVienToiDa"));
				roommodel.setTinhtrang(rs.getInt("TinhTrang"));
				ListRoom.add(roommodel);
			}
			return ListRoom;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void AddRoom(RoomModel roommodel) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO Phong(MaPhong, GiaPhong, SoLuongSinhVienHienTai, SoLuongSinhVienToiDa, TinhTrang) VALUES (?,?,?,?,?)";
		try {
			Connection con = super.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, roommodel.getMaphong());
			ps.setInt(2, roommodel.getGiaphong());
			ps.setInt(3, roommodel.getSosinhvienhientai());
			ps.setInt(4, roommodel.getSosinhvientoida());
			ps.setInt(5, roommodel.getTinhtrang());
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Override
	public void DeleteRoom(String maphong) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM Phong WHERE MaPhong = ?";
		try {
			Connection con = super.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, maphong);
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void UpdateRoom(RoomModel roommodel) {
		// TODO Auto-generated method stub
		String sql = "UPDATE Phong SET TinhTrang = ? WHERE MaPhong = ?";
		try {
			Connection con = super.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, roommodel.getTinhtrang());
			ps.setString(2, roommodel.getMaphong());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public RoomModel getRoom(String maphong) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM Phong WHERE MaPhong = ? ";
		try {
			Connection con = super.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, maphong);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				RoomModel roommodel = new RoomModel();
				roommodel.setMaphong(rs.getString("MaPhong"));
				roommodel.setGiaphong(rs.getInt("GiaPhong"));
				roommodel.setSosinhvienhientai(rs.getInt("SoLuongSinhVienHienTai"));
				roommodel.setSosinhvientoida(rs.getInt("SoLuongSinhVienToiDa"));
				roommodel.setTinhtrang(rs.getInt("TinhTrang"));
				return roommodel;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int CheckDebt(String maphong) {
		CallableStatement cstmt = null;
		int check = 0;
		// TODO Auto-generated method stub
		try {
			Connection con = super.getConnection();
			cstmt = con.prepareCall("{? = call Thongtinnophi(?)}");
			cstmt.registerOutParameter(1, Types.INTEGER);
			cstmt.setString(2, maphong);
			cstmt.execute();
			return cstmt.getInt(1);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return 1;
	}
//	public static void main(String[] args) {
//		AdminDaoImpl dao = new AdminDaoImpl();
//		System.out.print(dao.CheckDebt("P103"));
//	}

	@Override
	public InvoiceModel getInvoiceRoom(String maphong) {
		// TODO Auto-generated method stub
		//InvoiceModel Invoice = new InvoiceModel();
		String sql = "select * from HoaDon where MaPhong=?";
		try {
			Connection con = super.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, maphong);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				InvoiceModel invoice = new InvoiceModel();
				invoice.setMahd(rs.getString("MAHD"));
				invoice.setTiendien(rs.getInt("TienDien"));
				invoice.setTiennuoc(rs.getInt("TienNuoc"));
				invoice.setMaphong(rs.getString("MaPhong"));
				invoice.setNgaytao(rs.getDate("NgayTao"));
				invoice.setTrangthai(rs.getInt("TrangThai"));
				return invoice;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void UpdateInvoice(InvoiceModel invoicemodel) {
		// TODO Auto-generated method stub
		String sql = "UPDATE HoaDon SET TrangThai = ? WHERE MaPhong = ?";
		try {
			Connection con = super.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, invoicemodel.getTrangthai());
			ps.setString(2, invoicemodel.getMaphong());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
