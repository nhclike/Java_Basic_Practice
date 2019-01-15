package com.nhc.test;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		//scannerLogin();
		printChart();
		
	}

	private static void printChart() {
		String string="heima";
		for(int i=0;i<string.length();i++){
			System.out.println(string.charAt(i));
		}
	}

	private static void scannerLogin() {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++){
			System.out.println("请输入用户名:");
			String useName=sc.nextLine();
			System.out.println("请输入密码:ad");
			String password=sc.nextLine();

			if("admin".equals(useName) && "admin".equals(password)){
				System.out.println("登录成功");
				break ;
			}
			else{
				if(i==2){
					System.out.println("您的错误次数已经到了，请明天再来");
				}
				else {
					System.out.println("输入错误,您还有"+(2-i)+"次机会");

				}
				continue ;
			}
		}
	}

}
