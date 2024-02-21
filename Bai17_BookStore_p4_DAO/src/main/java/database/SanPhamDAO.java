package database;

import java.util.ArrayList;

import model.SanPham;

public class SanPhamDAO implements DAOInterface<SanPham> {
	private ArrayList<SanPham> data = new ArrayList<>();
	
	@Override
	public ArrayList<SanPham> selectAll() {
		// TODO Auto-generated method stub
		return data;
	}

	@Override
	public SanPham selectById(SanPham t) {
		for (SanPham SanPham : data) {
			if(data.equals(t)) {
				return SanPham;
			}
		}
		return null;
	}

	@Override
	public int insert(SanPham t) {
		if(selectById(t) == null) {
			data.add(t);
			return 1;
		}
		return 0;
	}

	@Override
	public int insertAll(ArrayList<SanPham> arr) {
		int dem = 0;
		for (SanPham SanPham : arr) {
			dem += insert(SanPham);
		}
		return dem;
	}

	@Override
	public int delete(SanPham t) {
		if(selectById(t) != null) {
			data.remove(t);
			return 1;
		}
		return 0;
	}

	@Override
	public int deleteAll(ArrayList<SanPham> arr) {
		int dem = 0;
		for (SanPham SanPham : arr) {
			dem += delete(SanPham);
		}
		return dem;
	}

	@Override
	public int update(SanPham t) {
		if(selectById(t) != null) {
			data.remove(t);
			data.add(t);
			return 1;
		}
		return 0;
	}
}
