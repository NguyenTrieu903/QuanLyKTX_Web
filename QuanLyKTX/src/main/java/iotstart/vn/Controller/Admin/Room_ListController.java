package iotstart.vn.Controller.Admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import iotstart.vn.Model.RoomModel;
import iotstart.vn.Service.AdminService;
import iotstart.vn.Service.Impl.AdminServiceImpl;

@WebServlet(urlPatterns = {"/admin/room"})
public class Room_ListController extends HttpServlet {
	AdminService adminservice = new AdminServiceImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		List<RoomModel> roomlist = adminservice.getAllRoom();
		req.setAttribute("roomlist", roomlist);
		req.getRequestDispatcher("/view/admin/room-list.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
	}
	
}	
