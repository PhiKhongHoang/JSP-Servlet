package database;

import java.util.ArrayList;

import model.DonHang;

public class DonHangDAO implements DAOInterface<DonHang> {
	private ArrayList<DonHang> data = new ArrayList<>();
	
	@Override
	public ArrayList<DonHang> selectAll() {
		// TODO Auto-generated method stub
		return data;
	}

	@Override
	public DonHang selectById(DonHang t) {
		for (DonHang DonHang : data) {
			if(data.equals(t)) {
				return DonHang;
			}
		}
		return null;
	}

	@Override
	public int insert(DonHang t) {
		if(selectById(t) == null) {
			data.add(t);
			return 1;
		}
		return 0;
	}

	@Override
	public int insertAll(ArrayList<DonHang> arr) {
		int dem = 0;
		for (DonHang DonHang : arr) {
			dem += insert(DonHang);
		}
		return dem;
	}

	@Override
	public int delete(DonHang t) {
		if(selectById(t) != null) {
			ChiTietDonHangDAO ctdh = new ChiTietDonHangDAO();
			ctdh.deleteAll(t);
			data.remove(t);
			return 1;
		}
		return 0;
	}

	@Override
	public int deleteAll(ArrayList<DonHang> arr) {
		int dem = 0;
		for (DonHang DonHang : arr) {
			dem += delete(DonHang);
		}
		return dem;
	}

	@Override
	public int update(DonHang t) {
		if(selectById(t) != null) {
			data.remove(t);
			data.add(t);
			return 1;
		}
		return 0;
	}
}
