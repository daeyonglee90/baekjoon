package com.baekjoon.two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
 * ���� ���
 *  - ����
 *    ����̴� ���� �������忡�� ������ ����ϰ� �ִ�. ����̴� ���� �������Կ� ������ ��Ȯ�ϰ� Nų�α׷��� ����ؾ� �Ѵ�. �������忡�� ����� ������ ������ ����� �ִ�.
 *    ������ 3ų�α׷� ������ 5ų�α׷� ������ �ִ�. ����̴� ������ ������, �ִ��� ���� ������ ��� ������ �Ѵ�.
 *    ���� ���, 18ų�α׷� ������ ����ؾ� �� ��, 3ų�α׷� ���� 6���� �������� ������, 5ų�α׷� 3���� 3ų�α׷� 1���� ����ϸ�, �� ���� ������ ������ ����� �� �ִ�.
 *    ����̰� ������ ��Ȯ�ϰ� Nų�α׷� ����ؾ� �� ��, ���� �� ���� �������� �Ǵ��� �� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *	  
 *  - �Է�
 *    ù° �ٿ� N�� �־�����. (3 �� N �� 5000)
 *    
 *  - ���
 *    ����̰� ����ϴ� ������ �ּ� ������ ����Ѵ�. ����, ��Ȯ�ϰ� Nų�α׷��� ���� �� ���ٸ� -1�� ����Ѵ�.
 *    
 *  - Example
 *    �Է�       ���
 *    18     4
 *    4     -1
 *    6      2
 *    9      3
 *    11     3
 *    
 *    
 */
public class SugarDelivery {
	static int count2 = 1;
	public static void main(String[] args) throws IOException {
		InputStream in = System.in;
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		
		String string = br.readLine();
		
		int inputValue = 0;
		
		try {
			inputValue = Integer.valueOf(string);
		} catch(NumberFormatException e) {
			System.out.println("���ڸ� �Է����ּ���");
			System.exit(0);
		}
		
		if (inputValue < 3 | inputValue > 5000) {
			return;
		}
		
		// 3kg�� ���鼭 5�� ������� üũ.
		// 3kg�� ���ٰ� ������ �Ǿ������ -1���
		
		int threekg = 0;
		
		while(true) {
			
			if (inputValue % 5 == 0) {
				System.out.println(inputValue/5 + threekg);
				break;
			} else if (inputValue <= 0) {
				System.out.println("-1");
				break;
			}
			
			inputValue -= 3;
			threekg++;
		}
	}
}
