package com.shapes;

public class TestDelete1 {

	public static void main(String[] args) {
		try {
			Class.forName("com.shapes.Circle");
			System.out.println("after class dot for name");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
