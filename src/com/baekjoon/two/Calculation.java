package com.baekjoon.two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
 * ��Ģ����
 *  - ����
 *    �� �ڿ��� A�� B�� �־�����. �� ��, A+B, A-B, A*B, A/B(��), A%B(������)�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
 *  - �Է�
 *    �� �ڿ��� A�� B�� �־�����. (1 �� A, B �� 10,000)
 *  - ���
 *    ù° �ٿ� A+B, ��° �ٿ� A-B, ��° �ٿ� A*B, ��° �ٿ� A/B, �ټ�° �ٿ� A%B�� ����Ѵ�.
 *    
 *  - Example
 *    �Է�
 *    7 3
 *    ���
 *    10
 *    4
 *    21
 *    2
 *    1
 */
public class Calculation {
	public static void main(String[] args) throws IOException {
		
		InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);

        String readString = br.readLine();
        
        String[] arrString = readString.split(" ");
        
        if (arrString.length > 2) {
        	return;
        }
        
        if (arrString.length == 0) {
        	return;
        }
        
        int a = 0;
        int c = 0;
		
        try {
		   a = Integer.parseInt(arrString[0]);
		   c = Integer.parseInt(arrString[1]);
		} catch(NumberFormatException e) {
		   System.out.println("���ڸ� �Է� �����մϴ�.");
		   System.exit(0);
		}
        
        if (a > 10000 || a < 0) {
        	return;
        }
        
        if (c > 10000 || c < 0) {
        	return;
        }
        
        System.out.println(a+c);
        System.out.println(a-c);
        System.out.println(a*c);
        System.out.println(a/c);
        System.out.println(a%c);
        
	}
}
