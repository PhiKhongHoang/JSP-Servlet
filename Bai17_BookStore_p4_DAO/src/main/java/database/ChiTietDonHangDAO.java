package database;

import java.util.ArrayList;

import model.ChiTietDonHang;
import model.DonHang;

public class ChiTietDonHangDAO implements DAOInterface<ChiTietDonHang> {
	private ArrayList<ChiTietDonHang> data = new ArrayList<>();
	
	@Override
	public ArrayList<ChiTietDonHang> selectAll() {
		// TODO Auto-generated method stub
		return data;
	}

	@Override
	public ChiTietDonHang selectById(ChiTietDonHang t) {
		for (ChiTietDonHang ChiTietDonHang : data) {
			if(data.equals(t)) {
				return ChiTietDonHang;
			}
		}
		return null;
	}

	@Override
	public int insert(ChiTietDonHang t) {
		if(selectById(t) == null) {
			data.add(t);
			return 1;
		}
		return 0;
	}

	@Override
	public int insertAll(ArrayList<ChiTietDonHang> arr) {
		int dem = 0;
		for (ChiTietDonHang ChiTietDonHang : arr) {
			dem += insert(ChiTietDonHang);
		}
		return dem;
	}

	@Override
	public int delete(ChiTietDonHang t) {
		if(selectById(t) != null) {
			data.remove(t);
			return 1;
		}
		return 0;
	}

	@Override
	public int deleteAll(ArrayList<ChiTietDonHang> arr) {
		int dem = 0;
		for (ChiTietDonHang ChiTietDonHang : arr) {
			dem += delete(ChiTietDonHang);
		}
		return dem;
	}
	
	public int deleteAll(DonHang dh) {
		int dem = 0;
		for (ChiTietDonHang ChiTietDonHang : data) {
			if(ChiTietDonHang.getDonHang().equals(dh))
				dem += delete(ChiTietDonHang);
		}
		return dem;
	}

	@Override
	public int update(ChiTietDonHang t) {
		if(selectById(t) != null) {
			data.remove(t);
			data.add(t);
			return 1;
		}
		return 0;
	}
}
