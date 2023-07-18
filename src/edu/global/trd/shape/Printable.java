package edu.global.trd.shape;

import java.math.BigInteger;
import java.util.Scanner;

import javax.swing.Box;
class MyLinkedList{
	int num;
	MyLinkedList myLinkedList;
}
class Printable{
	public static void main(String[]args) {
		MyLinkedList my1 = new MyLinkedList();
		my1.num = 10;
		
		MyLinkedList my2 = new MyLinkedList();
		my1.num = 11;
		my2.myLinkedList = my1;
	}
}