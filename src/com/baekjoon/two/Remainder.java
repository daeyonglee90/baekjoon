package com.baekjoon.two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 나머지
 *  - 문제
 *    (A+B)%C는 (A%C + B%C)%C 와 같을까?
 *
 *	  (A×B)%C는 (A%C × B%C)%C 와 같을까?
 *
 *	  세 수 A, B, C가 주어졌을 때, 위의 네가지 값을 구하는 프로그램을 작성하시오.
 *	  
 *  - 입력
 *    첫째 줄에 A, B, C가 순서대로 주어진다. (2 ≤ A, B, C ≤ 10000)
 *    
 *  - 출력
 *    첫째 줄에 (A+B)%C, 둘째 줄에 (A%C + B%C)%C, 셋째 줄에 (A×B)%C, 넷째 줄에 (A%C × B%C)%C를 출력한다.
 *    
 *  - Example
 *    입력
 *    5 8 4
 *    
 *    출력
 *    1
 *    1
 *    0
 *    0
 */
public class Remainder {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String string = br.readLine();
		
		String[] arrString = string.split(" ");
		
		if (arrString.length == 0 || arrString.length > 3)
		{
			System.out.println("인자가 너무 많습니다.");
			System.exit(0);
			return;
		}
		
		int a = 0;
		int b = 0;
		int c = 0;
		
		try {
			a = Integer.parseInt(arrString[0]);
			b = Integer.parseInt(arrString[1]);
			c = Integer.parseInt(arrString[2]);
		} catch (NumberFormatException e) {
			System.out.println("숫자만 입력해 주세요.");
			System.exit(0);
		}
		
		if (a < 2 | a > 10000 | b < 2 | b > 10000 | c < 2 | c > 10000)
		{
			System.out.println("숫자의 범위가 유효하지 않습니다.");
			System.exit(0);
		}
		
		// (A+B)%C
		long cal1 = (a+b) % c;
		// (A%C + B%C)%C
		long cal2 = (a%c + b%c)%c;
		// (A×B)%C
		long cal3 = (a*b)%c;
		// (A%C × B%C)%C
		long cal4 = (a%c * b%c)%c;
		
		System.out.println(cal1);
		System.out.println(cal2);
		System.out.println(cal3);
		System.out.println(cal4);
	}
}
