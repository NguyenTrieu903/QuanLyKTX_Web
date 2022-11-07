package iotstart.vn.Controller.Admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import iotstart.vn.Service.AdminService;
import iotstart.vn.Service.Impl.AdminServiceImpl;


@WebServlet(urlPatterns = { "/admin/room/delete" })
public class Room_DeleteController extends HttpServlet{

	AdminService adminservice = new AdminServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String maphong = req.getParameter("maphong");
		adminservice.DeleteRoom(maphong);
		resp.sendRedirect(req.getContextPath() + "/admin/room");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
	
}
