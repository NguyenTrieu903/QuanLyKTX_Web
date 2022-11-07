package iotstart.vn.Controller.Admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import iotstart.vn.Model.RoomModel;
import iotstart.vn.Service.AdminService;
import iotstart.vn.Service.Impl.AdminServiceImpl;

@WebServlet(urlPatterns = {"/admin/room/add"})
public class Room_AddController extends HttpServlet {
	AdminService adminservice = new AdminServiceImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		req.getRequestDispatcher("/view/admin/room-add.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RoomModel room = new RoomModel();
		DiskFileItemFactory diskFileItemFactory = new DiskFileItemFactory();
		ServletFileUpload servletFileUpload = new ServletFileUpload(diskFileItemFactory);
		servletFileUpload.setHeaderEncoding("UTF-8");
		
		try {
			resp.setContentType("text/html");
			resp.setCharacterEncoding("UTF-8");
			req.setCharacterEncoding("UTF-8");
			List<FileItem> items = servletFileUpload.parseRequest(req);
			
			for (FileItem item : items) {
				if (item.getFieldName().equals("maphong")) {
					room.setMaphong(item.getString("UTF-8"));
				}else if(item.getFieldName().equals("giaphong")) {
					room.setGiaphong(Integer.parseInt(item.getString()));
				}else if (item.getFieldName().equals("sosinhvienhientai")) {
					room.setSosinhvienhientai(Integer.parseInt(item.getString()));
				}else if (item.getFieldName().equals("sosinhvientoida")) {
					room.setSosinhvientoida(Integer.parseInt(item.getString()));
				}else if (item.getFieldName().equals("tinhtrang")) {
					String tinhtrang = item.getString("UTF-8");
					if(tinhtrang.equals("Hoạt động")) {
						room.setTinhtrang(1);
					}else {
						room.setTinhtrang(0);
					}
				}
			}
			adminservice.AddRoom(room);
			resp.sendRedirect(req.getContextPath() + "/admin/room");
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
