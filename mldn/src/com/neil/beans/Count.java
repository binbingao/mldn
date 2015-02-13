package com.neil.beans;

public class Count {
	private int count=0;
	public Count(){
		System.out.println("a new count object");
	}
	public int getCount(){
		return ++this.count;
	}
}
