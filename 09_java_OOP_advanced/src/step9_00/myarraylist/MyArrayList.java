package step9_00.myarraylist;

import java.util.Arrays;

public class MyArrayList<T>{
	
	Object[] arr;
	int cnt;
	
	public void add(T t) {
		if (arr == null) arr = new Object[cnt + 1];
		else {
			Object[] tmp = new Object[cnt + 1];
			
			for (int i = 0; i < cnt; i++) tmp[i] = arr[i];
			arr = new Object[cnt + 1];
			arr = tmp;
		}
		
		arr[cnt++] = t;
	}
	
	public void add(int idx, T t) {
		// 뒤에다가 추가하는건 되고
		// 그 뒤로 숫자가 넘어가면 에러나야함
		
		Object[] tmp = new Object[cnt+1];
		
		if (idx < cnt) {
			for (int i = 0; i < idx; i++) tmp[i] = arr[i];
			for (int i = idx; i < cnt; i++) tmp[i+1] = arr[i];
			tmp[idx] = t;
		}
		else {
			for (int i = 0; i < cnt; i++) tmp[i] = arr[i];
			tmp[idx] = t;
		}
		
		arr = new Object[cnt+1];
		arr = tmp;
		cnt += 1;
	}
	
	public void set(int idx, T t) {arr[idx] = t;}
	
	public void remove(int idx) {
		Object[] tmp = new Object[cnt-1];
		
		for (int i = 0; i < idx; i++) tmp[i] = arr[i];
		for (int i = idx; i < cnt-1; i++) tmp[i] = arr[i+1];
		
		arr = new Object[cnt-1];
		arr = tmp;
		cnt -= 1;
	}
	
	public void remove(T t) {
		int delIdx = -1;
		
		for (int i = 0; i < cnt; i++) {
			if (arr[i] == t) delIdx = i;
		}
		
		if (delIdx != -1) {
			Object[] tmp = new Object[cnt-1];
			
			for (int i = 0; i < delIdx; i++) tmp[i] = arr[i];
			for (int i = delIdx; i < cnt-1; i++) tmp[i] = arr[i+1];
			
			arr = new Object[cnt-1];
			arr = tmp;
			cnt -= 1;
		}
	}
	
	public int indexOf(T t) {
		int idx = -1;
		for (int i = 0; i < cnt; i++) if (arr[i] == t) idx = i;
		
		return idx;
	}
	
	public boolean contains(T t) {
		boolean isIn = false;
		for (int i = 0; i < cnt; i++) {
			if (arr[i] == t) isIn = true;
		}
		return isIn;
	}
	
	public boolean isEmpty() {
		if (cnt == 0) return true;
		else return false;
	}
	
	public T get(int idx) {return (T) arr[idx];}
	
	
	public void clear() {
		arr = null;
		cnt = 0;
	}
	
	public int size() {return cnt;}
	
	
	@Override
	public String toString() {
		if (arr == null) return "[]";
		else return Arrays.toString(arr);
	}
}