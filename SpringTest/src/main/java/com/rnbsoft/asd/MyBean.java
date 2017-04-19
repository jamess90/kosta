package com.rnbsoft.asd;


public class MyBean {
	private TestBean testBean=null;
	public MyBean(TestBean testBean ){
		testBean.print();
	}
	
	public void print(){
		System.out.println("함수테스트");
	}
}
