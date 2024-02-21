package model;

import java.sql.Date;

public class TacGia {
	private String maTacGia;
	private String hoVatTen;
	private Date ngaySinh;
	private String tieuSu;
	
	public TacGia() {}
	
	public TacGia(String maTacGia, String hoVatTen, Date ngaySinh, String tieuSu) {
		this.maTacGia = maTacGia;
		this.hoVatTen = hoVatTen;
		this.ngaySinh = ngaySinh;
		this.tieuSu = tieuSu;
	}

	public String getMaTacGia() {
		return maTacGia;
	}

	public void setMaTacGia(String maTacGia) {
		this.maTacGia = maTacGia;
	}

	public String getHoVatTen() {
		return hoVatTen;
	}

	public void setHoVatTen(String hoVatTen) {
		this.hoVatTen = hoVatTen;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getTieuSu() {
		return tieuSu;
	}

	public void setTieuSu(String tieuSu) {
		this.tieuSu = tieuSu;
	}
	
	
}
