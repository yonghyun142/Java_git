package LS;


class Circle{
	double i;
	
	
	public Circle(double i) {
		
	this.i=i;	
		
		
		
	}
	
	void pa() {
		
		System.out.println(3.14*i*i);
	}

}











public class PP {

	public static void main(String[] args) {

		Circle circle = new Circle(10);

		System.out.println(circle); // 원의 넓이는 314.1592 이고 반지름은 10 인원
	}
}
