package com.exam.gui;


class A{
	private int num;
	
	//instance (객체단위) 내부클래스 정의
	public class B{
		
	}
}

/*static */ class C{
	
	static  class D{
		
	}
}
public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a= new A();
		A.B b = a.new B(); 
		
		C c = new C();
		C.D d = new C.D(); 
	}

}
