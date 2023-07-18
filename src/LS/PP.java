package LS;

import java.util.HashSet;

class Num{//this
	int i;
	public Num(int i) {
		this.i = i;
	}

	@Override
	public int hashCode() {
		
		return i;
	}

	@Override
	public boolean equals(Object obj) {
		Num objNum =(Num)obj;
		int obji = objNum.i;
		boolean tOf = (i == obji);
		return tOf;
	}

	@Override
	public String toString() {
		
		return String.valueOf(i);
	}
	
	
}






class PP{
public static void main(String[] args) {
	
	HashSet<Num> set = new HashSet<>();
	set.add(new Num(7799));
	set.add(new Num(9955));
	set.add(new Num(7799));
	
	System.out.println("인스턴스 수: " + set.size());
	
	for(Num n : set)
		System.out.print(n.toString() + '\t');
	
	System.out.println();
}
}
/*
====출력
인스턴스 수: 2
7799        9955

}*/