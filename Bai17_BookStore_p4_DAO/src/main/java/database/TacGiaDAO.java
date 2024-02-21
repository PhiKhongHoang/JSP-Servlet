package database;

import java.util.ArrayList;

import model.TacGia;

public class TacGiaDAO implements DAOInterface<TacGia> {
	private ArrayList<TacGia> data = new ArrayList<>();
	
	@Override
	public ArrayList<TacGia> selectAll() {
		// TODO Auto-generated method stub
		return data;
	}

	@Override
	public TacGia selectById(TacGia t) {
		for (TacGia tacGia : data) {
			if(data.equals(t)) {
				return tacGia;
			}
		}
		return null;
	}

	@Override
	public int insert(TacGia t) {
		if(selectById(t) == null) {
			data.add(t);
			return 1;
		}
		return 0;
	}

	@Override
	public int insertAll(ArrayList<TacGia> arr) {
		int dem = 0;
		for (TacGia tacGia : arr) {
			dem += insert(tacGia);
		}
		return dem;
	}

	@Override
	public int delete(TacGia t) {
		if(selectById(t) != null) {
			data.remove(t);
			return 1;
		}
		return 0;
	}

	@Override
	public int deleteAll(ArrayList<TacGia> arr) {
		int dem = 0;
		for (TacGia tacGia : arr) {
			dem += delete(tacGia);
		}
		return dem;
	}

	@Override
	public int update(TacGia t) {
		if(selectById(t) != null) {
			data.remove(t);
			data.add(t);
			return 1;
		}
		return 0;
	}

}
