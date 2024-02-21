package model;

public class ChiTietDonHang {
	private String maChiTietDonHang;
	private DonHang donHang;
	private String maSach;
	private String soLuong;
	private double giaBia;
	private double giamGia;
	private double giaBan;
	private double VAT;
	private double tongThanhTien;
	
	public ChiTietDonHang() {}

	public ChiTietDonHang(String maChiTietDonHang, DonHang donHang, String maSach, String soLuong, double giaBia,
			double giamGia, double giaBan, double vAT, double tongThanhTien) {
		this.maChiTietDonHang = maChiTietDonHang;
		this.donHang = donHang;
		this.maSach = maSach;
		this.soLuong = soLuong;
		this.giaBia = giaBia;
		this.giamGia = giamGia;
		this.giaBan = giaBan;
		VAT = vAT;
		this.tongThanhTien = tongThanhTien;
	}

	public String getMaChiTietDonHang() {
		return maChiTietDonHang;
	}

	public void setMaChiTietDonHang(String maChiTietDonHang) {
		this.maChiTietDonHang = maChiTietDonHang;
	}

	public DonHang getDonHang() {
		return donHang;
	}

	public void setDonHang(DonHang donHang) {
		this.donHang = donHang;
	}

	public String getMaSach() {
		return maSach;
	}

	public void setMaSach(String maSach) {
		this.maSach = maSach;
	}

	public String getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(String soLuong) {
		this.soLuong = soLuong;
	}

	public double getGiaBia() {
		return giaBia;
	}

	public void setGiaBia(double giaBia) {
		this.giaBia = giaBia;
	}

	public double getGiamGia() {
		return giamGia;
	}

	public void setGiamGia(double giamGia) {
		this.giamGia = giamGia;
	}

	public double getGiaBan() {
		return giaBan;
	}

	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}

	public double getVAT() {
		return VAT;
	}

	public void setVAT(double vAT) {
		VAT = vAT;
	}

	public double getTongThanhTien() {
		return tongThanhTien;
	}

	public void setTongThanhTien(double tongThanhTien) {
		this.tongThanhTien = tongThanhTien;
	}
	
}
