package java_git;

import java.util.Scanner;

public class BankAccount{
	public static void main(String [] args) {
		 Song song = new Song(1978, "스웨덴", "ABBA", "Dancing Queen");
		 
		song.show();
}
}

 class Song{

	//public Song(int year, String country, String artist, String title) {
	
	//}
	 
	 //}

	 String title, artist, country;
	 int year;
	 
	 
	 public Song() {
		 
	 }
	 
	 public Song(int year, String country, String artist, String title) {
		 this.year = year;
		 this.country = country;
		 this.artist = artist;
		 this.title = title;
	 }
	 
	 public void show() {
	 System.out.println(year+"년"+country+"국적의"+artist+"가 부른"+title);
	}
}
// package java_git;
// public class BankAccount {
// 	public static void main(String[] args) {

// 		for (int i = 0; i <= 10; i++)
 //			Accumulator.add(i); // 전달되는 값을 모두 누적

 //		Accumulator.showResult(); // 최종 누적 결과를 출력



// class Accumulator {

//	static int sum = 0;
 	
// 	public static void add(int i) {
 //	}
 	
// 	public static void showResult() {
 //		System.out.println(sum);
 				
 //	}

// }