<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
	integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js"
	integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+"
	crossorigin="anonymous"></script>
	
	<style>
		.rq {
			color: red;
		}
	</style>
	
	<script type="text/javascript">
		function my_submit() {
			error = ""
			// bắt lỗi
			maSanPham = document.getElementById("maSanPham").value
			tenSanPham = document.getElementById("tenSanPham").value
			giaBan = document.getElementById("giaBan").value
			giaNhap = document.getElementById("giaNhap").value
			if(maSanPham.length == 0) {
				error += "Bạn phải nhập mã sản phẩm!"
				error_maSanPham = document.getElementById("error_maSanPham")
				error_maSanPham.innerHTML = "<span class='rq'>Bạn phải nhập mã sản phẩm.</span>"
			} 
			if(tenSanPham.length == 0) {
				error += "Bạn phải nhập tên sản phẩm!"
				error_tenSanPham = document.getElementById("error_tenSanPham")
				error_tenSanPham.innerHTML = "<span class='rq'> Bạn phải nhập mã sản phẩm.</span>"
			} 
			if(giaBan <= 0) {
				error += "Bạn phải nhập giá bán!"
				error_giaBan = document.getElementById("error_giaBan")
				error_giaBan.innerHTML = "<span class='rq'> Bạn phải nhập giá bán. </span>"
			}
			if(giaNhap <= 0) {
				error += "Bạn phải nhập giá nhập!"
				error_giaNhap = document.getElementById("error_giaNhap")
				error_giaNhap.innerHTML = "<span class='rq'> Bạn phải nhập giá nhập. </span>"
			}
			
			if(error.length > 0) {
				// alert(error)
				return
			} else {			
				// submit form
				my_form = document.getElementById("my_form").value
				my_form.submit()
			}
		}
	</script>
</head>
<body>
<%
	String e_maSanPham = request.getAttribute("e_maSanPham") + "";
	if(e_maSanPham == null || e_maSanPham.equals("null")) {
		e_maSanPham = "";
	}

	String value_maSanPham = request.getAttribute("value_maSanPham") + "";
	String value_tenSanPham = request.getAttribute("value_tenSanPham") + "";
	String value_giaBan = request.getAttribute("value_giaBan") + "";
	String value_giaNhap = request.getAttribute("value_giaNhap") + "";
	String value_hanSuDung = request.getAttribute("value_hanSuDung") + "";
	String value_vat = request.getAttribute("value_vat") + "";
	String value_moTa = request.getAttribute("value_moTa") + "";
	
	value_maSanPham = (value_maSanPham.equals("null")) ? "" : value_maSanPham; 
	value_tenSanPham = (value_tenSanPham.equals("null")) ? "" : value_tenSanPham;
	value_giaBan = (value_giaBan.equals("null")) ? "" : value_giaBan;
	value_giaNhap = (value_giaNhap.equals("null")) ? "" : value_giaNhap;
	value_hanSuDung = (value_hanSuDung.equals("null")) ? "" : value_hanSuDung;
	value_vat = (value_vat.equals("null")) ? "" : value_vat;
	value_moTa = (value_moTa.equals("null")) ? "" : value_moTa;

%>
	<div class="container mt-4">
		<form class="row g-3 needs-validation" action="save-product" id="my_form">
			<div class="row">
				<div class="col-6">
					<label for="maSanPham" class="form-label">
						Mã sản phẩm <span class="rq">*</span>
					</label> 
					<input type="text" class="form-control" id="maSanPham" name="maSanPham" value="<%=value_maSanPham %>" required>
					<!-- <div id="error_maSanPham"></div> -->
					<div class="rq"><%=e_maSanPham %></div>
				</div>
				<div class="col-6">
					<label for="tenSanPham" class="form-label">
						Tên sản phẩm <span class="rq">*</span>
					</label> 
					<input type="text" class="form-control" id="tenSanPham" name="tenSanPham" value="<%=value_tenSanPham %>" required>
					<div id="error_tenSanPham"></div>
				</div>
			</div>
			<div class="row">
				<div class="col-6">
					<label for="giaNhap" class="form-label">
						Giá nhập <span class="rq">*</span>
					</label> 
					<input type="number" step="0.01" class="form-control" id="giaNhap" name="giaNhap" min="0" value="<%=value_giaNhap %>" required>
					<div id="error_giaNhap"></div>
				</div>
				<div class="col-6">
					<label for="giaBan" class="form-label">
						Giá bán <span class="rq">*</span>
					</label> 
					<input type="number" step="0.01" class="form-control" id="giaBan" name="giaBan" min="0" value="<%=value_giaBan %>" required>
					<div id="error_giaBan"></div>
				</div>
			</div>
			<div class="row">
				<div class="col-6">
					<label for="hanSuDung" class="form-label">
						Hạn sử dụng
					</label> 
					<input type="date" class="form-control" id="hanSuDung" name="hanSuDung" value="<%=value_hanSuDung %>">
				</div>
				<div class="col-6">
					<label for="vat" class="form-label">
						VAT
					</label> 
					<input type="number" class="form-control" id="vat" name="vat" value="<%=value_vat %>">
				</div>
			</div>
			<div class="row">
				<div class="col-12">
					<label for="moTa" class="form-label">
						Mô tả sản phẩm
					</label> 
					<textarea class="form-control" rows="10" cols="" id="moTa" name="moTa" ><%=value_moTa %></textarea>
				</div>
			</div>
			<div class="row mt-4">
				<button class="btn btn-primary" type=" button" onclick="my_submit()" >Submit form</button>
			</div>
		</form>
	</div>
</body>
</html>