package edu.global.tw;
class MyThread1 implements Runnable{

	@Override
	public void run() {
		TODO Auto-generated method stub
		for(int i=0; i< 500; i++)
			System.out.println("%s", new String("|"));
	}
	
}
class ThreadEx4{
	public static void main(String[]args) {
		
		String name = Thread.currentThread().getName();
		System.out.println(name);
		
		MyThread2 th2 = new MyThread2();
		
		Runnable runnable = new MyThread1();
		
		Thread th3 = new Thread(th1);
		th3.start();
		
		th1.start(); //run을 바로 실행 시키면 안됨
		th2.start();
		
		
	}
}
