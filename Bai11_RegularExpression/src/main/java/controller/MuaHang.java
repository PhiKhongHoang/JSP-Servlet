package controller;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MuaHang
 */
@WebServlet("/mua-hang")
public class MuaHang extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public MuaHang() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		String soLuong = request.getParameter("soLuong");
		String soDienThoai = request.getParameter("soDienThoai");
		String email = request.getParameter("email");
		
		boolean checkError = false;
		double giaTri_soLuong = 0;
//		Bắt lỗi số lượng
		try {
			giaTri_soLuong = Double.parseDouble(soLuong);
		} catch (Exception e) {
			checkError = true;
			request.setAttribute("e_soLuong", "Nhập dữ liệu số lượng không đúng");
		}
		// bắt lỗi số lượng phải lớn hơn 0
		if(giaTri_soLuong == 0) {
			checkError = true;
			request.setAttribute("e_SoLuong", "Vui lòng chọn số lượng lớn hơn 0!");
		}
		
//		kiểm tra SDT
		Pattern soDienThoaiPatter = Pattern.compile("\\d{10}");
		Matcher soDienThoaiMatcher = soDienThoaiPatter.matcher(soDienThoai);
		if(!soDienThoaiMatcher.matches()) {
			checkError = true;
			request.setAttribute("e_SoDienThoai", "Số điện thoại bao gồm 10 ký tự!");
		}
		
//		kiểm tra email
		Pattern emailPatter = Pattern.compile("\\w+@\\w+(.\\w+)*");
		Matcher emailMatcher = emailPatter.matcher(email);
		if(!emailMatcher.matches()) {
			checkError = true;
			request.setAttribute("e_Email", "Email chưa đúng!");
		}
		
		String url = "/success.jsp";
		if(checkError) {
			url = "/index.jsp";
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
