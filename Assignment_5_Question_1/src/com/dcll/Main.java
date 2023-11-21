package com.dcll;

public class Main {

	public static void main(String[] args) {
		DCLL dcll = new DCLL();
		
		dcll.addAtPos(100, 3);
		dcll.addAtPos(101, 5);
		dcll.addAtPos(102, 3);
		dcll.addAtPos(103, 4);
		dcll.addAtPos(104, 5);
		dcll.addAtPos(105, 6);
		
		dcll.fDisplay();
		dcll.rDisplay();
		
		dcll.deleteAtPos(6);
		dcll.fDisplay();
		dcll.deleteAtPos(5);
		dcll.fDisplay();
		dcll.deleteAtPos(4);
		dcll.fDisplay();
		dcll.deleteAtPos(3);
		
		dcll.fDisplay();
		dcll.deleteAtPos(2);
		dcll.fDisplay();
		dcll.deleteAtPos(1);
		dcll.fDisplay();
		dcll.deleteAtPos(0);
		dcll.fDisplay();
		dcll.deleteAtPos(100);
		dcll.fDisplay();
	}

}
