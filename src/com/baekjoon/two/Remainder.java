package com.baekjoon.two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * ������
 *  - ����
 *    (A+B)%C�� (A%C + B%C)%C �� ������?
 *
 *	  (A��B)%C�� (A%C �� B%C)%C �� ������?
 *
 *	  �� �� A, B, C�� �־����� ��, ���� �װ��� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *	  
 *  - �Է�
 *    ù° �ٿ� A, B, C�� ������� �־�����. (2 �� A, B, C �� 10000)
 *    
 *  - ���
 *    ù° �ٿ� (A+B)%C, ��° �ٿ� (A%C + B%C)%C, ��° �ٿ� (A��B)%C, ��° �ٿ� (A%C �� B%C)%C�� ����Ѵ�.
 *    
 *  - Example
 *    �Է�
 *    5 8 4
 *    
 *    ���
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
			System.out.println("���ڰ� �ʹ� �����ϴ�.");
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
			System.out.println("���ڸ� �Է��� �ּ���.");
			System.exit(0);
		}
		
		if (a < 2 | a > 10000 | b < 2 | b > 10000 | c < 2 | c > 10000)
		{
			System.out.println("������ ������ ��ȿ���� �ʽ��ϴ�.");
			System.exit(0);
		}
		
		// (A+B)%C
		long cal1 = (a+b) % c;
		// (A%C + B%C)%C
		long cal2 = (a%c + b%c)%c;
		// (A��B)%C
		long cal3 = (a*b)%c;
		// (A%C �� B%C)%C
		long cal4 = (a%c * b%c)%c;
		
		System.out.println(cal1);
		System.out.println(cal2);
		System.out.println(cal3);
		System.out.println(cal4);
	}
}
