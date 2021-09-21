package hello;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class SuperObj {
	public void show() {
		print();
		
	}
	
	public void print() {
		print();
		System.out.print("Super");
	}
}

class SubObj extends SuperObj {
	public void show() {
		super.print();
		
	}
	public void print() {
		System.out.print("Sub");
		
	}
}


public class T8 {

	public static void main(String[] args) {
		SuperObj s = new SubObj();
		s.show();
		

	}
}
