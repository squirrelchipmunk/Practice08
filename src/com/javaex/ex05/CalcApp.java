package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	String exp;
    	String operator;
    	int num1, num2;
    
    	while(true) {
    		System.out.print(">> ");
    		exp = sc.nextLine();
    		if(exp.equals("/q")){
    			System.out.println("종료합니다.");
    			break;
    		}
    		operator = exp.split(" ")[1];
    		num1=Integer.parseInt(exp.split(" ")[0]);
    		num2=Integer.parseInt(exp.split(" ")[2]);
    		switch(operator){
    			case "+" :
    				Add add = new Add();
    				add.setValue(num1, num2);
    				System.out.println(add.calculate());
    				break;
    			case "-" :
    				Sub sub = new Sub();
    				sub.setValue(num1, num2);
    				System.out.println(sub.calculate());
    				break;
    			case "*" :
    				Mul mul = new Mul();
    				mul.setValue(num1, num2);
    				System.out.println(mul.calculate());
    				break;
    			case "/" :
    				Div div = new Div();
    				div.setValue(num1, num2);
    				System.out.println(div.calculate());
    				break;
    			default :
    				System.out.println("알 수 없는 연산입니다.");
    		}
    		
    		
    	}
    	sc.close();
    }
}
