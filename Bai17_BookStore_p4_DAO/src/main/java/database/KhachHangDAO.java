package database;

import java.util.ArrayList;

import model.KhachHang;

public class KhachHangDAO implements DAOInterface<KhachHang> {
	private ArrayList<KhachHang> data = new ArrayList<>();
	
	@Override
	public ArrayList<KhachHang> selectAll() {
		// TODO Auto-generated method stub
		return data;
	}

	@Override
	public KhachHang selectById(KhachHang t) {
		for (KhachHang KhachHang : data) {
			if(data.equals(t)) {
				return KhachHang;
			}
		}
		return null;
	}

	@Override
	public int insert(KhachHang t) {
		if(selectById(t) == null) {
			data.add(t);
			return 1;
		}
		return 0;
	}

	@Override
	public int insertAll(ArrayList<KhachHang> arr) {
		int dem = 0;
		for (KhachHang KhachHang : arr) {
			dem += insert(KhachHang);
		}
		return dem;
	}

	@Override
	public int delete(KhachHang t) {
		if(selectById(t) != null) {
			data.remove(t);
			return 1;
		}
		return 0;
	}

	@Override
	public int deleteAll(ArrayList<KhachHang> arr) {
		int dem = 0;
		for (KhachHang KhachHang : arr) {
			dem += delete(KhachHang);
		}
		return dem;
	}

	@Override
	public int update(KhachHang t) {
		if(selectById(t) != null) {
			data.remove(t);
			data.add(t);
			return 1;
		}
		return 0;
	}
}
