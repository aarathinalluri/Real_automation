package com.pracctice.java;

public class Apple extends Mango {

	public static void main(String[] args) {
		
		
		
		Apple a = new Apple();
		a.getSize();
		
		
				a.getType();
		{
			System.out.println("i am fruit");
		}
		
		a.seeColor();
		
	}

	@Override
	void getSize() {
		System.out.println("My size is medium");
		// TODO Auto-generated method stub
		
	}

	@Override
	void getType() {
		// TODO Auto-generated method stub
		
	}

}

