package org.cap.demo;

public class OrderClass {
	int sum=0;
	int arr[]={1,45,457};
	public void print() {
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
			System.out.println(arr[i]);
	}
		System.out.println(sum);
		}
	public void show() {
		System.out.println("this is show");
	}
}
