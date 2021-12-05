package com.javaex.ex08;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Friend [] fArr = new Friend[3];
		System.out.println("친구를 3명 등록해주세요.");

		String fInfo;
		String name, hp, school;
		
		for(int i=0; i<fArr.length;i++) {
			fInfo = sc.nextLine();
			name = fInfo.split(" ")[0];
			hp = fInfo.split(" ")[1];
			school = fInfo.split(" ")[2];
			fArr[i] = new Friend(name, hp, school);
		}
		
		for(int i=0;i<fArr.length;i++) {
			fArr[i].showInfo();
		}
		
		
		sc.close();

	}

}
