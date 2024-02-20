package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class save_product
 */
@WebServlet("/save-product")
public class SaveProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public SaveProduct() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		charset utf-8
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		String maSanPham = request.getParameter("maSanPham");
		String tenSanPham = request.getParameter("tenSanPham");
		String giaBan = request.getParameter("giaBan");
		String giaNhap = request.getParameter("giaNhap");
		String hanSuDung = request.getParameter("hanSuDung");
		String vat = request.getParameter("vat");
		String moTa = request.getParameter("moTa");
		
//		check
		String e_maSanPham = "";
		if(maSanPham == null || maSanPham.trim().length() == 0) { // maSanPham.trim().length() == 0: chỉ chứa khoảng trắng
			e_maSanPham = "Vui lòng nhập mã sản phẩm!";
		} else if(maSanPham.equals("123")) {
			e_maSanPham += "Mã sản phẩm 123 đã tồn tại!";
		}
		
		request.setAttribute("e_maSanPham", e_maSanPham);
		
//		forward value
		request.setAttribute("value_maSanPham", maSanPham);
		request.setAttribute("value_tenSanPham", tenSanPham);
		request.setAttribute("value_giaBan", giaBan);
		request.setAttribute("value_giaNhap", giaNhap);
		request.setAttribute("value_hanSuDung", hanSuDung);
		request.setAttribute("value_vat", vat);
		request.setAttribute("value_moTa", moTa);
		
//		url
		String url = "/Success.jsp";
		if(e_maSanPham.length() > 0) {
			url = "/Product.jsp";
		}
		
		RequestDispatcher rq = getServletContext().getRequestDispatcher(url);
		rq.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
