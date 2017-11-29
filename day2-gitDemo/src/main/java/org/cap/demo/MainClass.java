package org.cap.demo;

public class MainClass {

	public static void main(String args[]){
		OrderClass od=new OrderClass();
		od.print();
		greeting();
	}
	
	public static void greeting(){
		System.out.println("Good morning");
		System.out.println("Hello");
	}
}
