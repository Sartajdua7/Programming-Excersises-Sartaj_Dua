package homework;

import java.util.ArrayList;

public class SparseArray {
ArrayList<Integer> entries = new ArrayList<>();

	public int getValueAt(int row, int col) {
		for(int i = 0; i < entries.size(); i++) {
			if(entries.get(i).getRow() == row && entries.get(i).getCol() == col) {
				return entries.get(i).getValue();
			}
		}
		return 0;
	}
	
	public void removeCol(int col) {
		int temp = Integer.MAX_VALUE;
		for(int i = 0; i < entries.size(); i++) {
			if(entries.get(i).getCol() == col) {
				temp = entries.get(i).getCol();
				entries.remove(i);
			}
			if(entries.get(i).getCol() > temp) {
				entries.set(i, new SparseArrayEntry(entries.get(i).getRow(), entries.get(i).getCol()-1, entries.get(i).getValue()));
			}
		}
	}
}
