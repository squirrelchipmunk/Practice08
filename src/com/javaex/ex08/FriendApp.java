package com.javaex.ex08;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Friend [] fArr = new Friend[3];
		System.out.println("친구를 3명 등록해주세요.");

		String [] fInfo = new String[3];
		for(int i=0; i<fInfo.length; i++) {
			fInfo[i] = sc.nextLine();
		}
		
		String name, hp, school;
		for(int i=0; i<fArr.length;i++) {
			name = fInfo[i].split(" ")[0];
			hp = fInfo[i].split(" ")[1];
			school = fInfo[i].split(" ")[2];
			fArr[i] = new Friend(name, hp, school);
		}
		
		for(int i=0;i<fArr.length;i++) {
			System.out.println("이름:"+fArr[i].getName()+"  핸드폰:"+fArr[i].getHp()+"  학교:"+fArr[i].getSchool());
		}
		
		
		sc.close();

	}

}
