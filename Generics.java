package trimester6;

import java.util.*;

class MyGeneric<T1>
{
	int val;
	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	private T1 t1;
	
	public T1 getT1() {
		return t1;
	}

	public void setT1(T1 t1) {
		this.t1 = t1;
	}

	public MyGeneric(int val, T1 t1)
	{
		this.val = val;
		this.t1 = t1;
	}
}

public class Generics 
{
	public static void main(String[] args) 
	{
		ArrayList <Integer> al = new ArrayList();
		al.add(54);
		al.add(643);
		
		int a = (int) al.get(0);
//		System.out.println(a);
		
		MyGeneric<String> g1 = new MyGeneric(23,"Akshit");
		String s = g1.getT1();

		System.out.println(s);
	}
}
