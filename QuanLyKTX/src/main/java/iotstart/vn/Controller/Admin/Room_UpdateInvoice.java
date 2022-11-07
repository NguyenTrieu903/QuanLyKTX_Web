package iotstart.vn.Controller.Admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import iotstart.vn.Model.InvoiceModel;
import iotstart.vn.Model.RoomModel;
import iotstart.vn.Service.AdminService;
import iotstart.vn.Service.Impl.AdminServiceImpl;

@WebServlet(urlPatterns = { "/admin/room/update/invoice" })
public class Room_UpdateInvoice extends HttpServlet {
	AdminService adminservice = new AdminServiceImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doGet(req, resp);
		String maphong = req.getParameter("maphong");
		InvoiceModel invoiceModel = adminservice.getInvoiceRoom(maphong);
		req.setAttribute("invoiceModel", invoiceModel);
		RequestDispatcher dispatcher = req.getRequestDispatcher("/view/admin/room-update-invoice.jsp");
		dispatcher.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doPost(req, resp);
		InvoiceModel invoice = new InvoiceModel();
		DiskFileItemFactory diskFileItemFactory = new DiskFileItemFactory();
		ServletFileUpload servletFileUpload = new ServletFileUpload(diskFileItemFactory);
		servletFileUpload.setHeaderEncoding("UTF-8");
		try {
			String maphong="";
			resp.setContentType("text/html");
			resp.setCharacterEncoding("UTF-8");
			req.setCharacterEncoding("UTF-8");
			List<FileItem> items = servletFileUpload.parseRequest(req);

			for (FileItem item : items) {
				if (item.getFieldName().equals("tinhtrang")) {
					String tinhtrang = item.getString("UTF-8");
					if (tinhtrang.equals("Chưa thanh toán") || tinhtrang.equals("chưa thanh toán")) {
						invoice.setTrangthai(1);
					} else {
						invoice.setTrangthai(0);
					}
				} else if (item.getFieldName().equals("maphong")) {
					maphong = item.getString("UTF-8");
					invoice.setMaphong(item.getString("UTF-8"));
				}
			}
			adminservice.UpdateInvoice(invoice);
			String url = String.format("/admin/room/debt?maphong=%s", maphong);
			resp.sendRedirect(req.getContextPath() + url);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
}
