package iotstart.vn.Controller.Admin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import iotstart.vn.Model.RoomModel;
import iotstart.vn.Service.AdminService;
import iotstart.vn.Service.Impl.AdminServiceImpl;

@WebServlet(urlPatterns = {"/admin/room/search"})
public class Room_SearchController extends HttpServlet {
	AdminService adminservice = new AdminServiceImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		String maphong = req.getParameter("maphong");
		RoomModel roommodel = adminservice.getRoom(maphong);
		req.setAttribute("roommodel", roommodel);
		RequestDispatcher dispatcher = req.getRequestDispatcher("/view/admin/room-search.jsp");
		dispatcher.forward(req, resp);
		//System.out.print(maphong);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
	
	
}
