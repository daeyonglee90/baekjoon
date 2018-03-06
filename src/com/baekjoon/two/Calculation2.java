package com.baekjoon.two;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
 * A+B - 2
 *  - 문제
 *    A+B를 계산하시오. 
 *    
 *  - 입력
 *    첫째 줄에 A, 둘째 줄에 B가 주어진다. (0 < A, B < 10)
 *    
 *  - 출력
 *    첫째 줄에 A+B를 출력한다. (A+B < 10)
 *    
 *  - Example
 *    입력
 *    1
 *    2
 *    출력
 *    3
 */
public class Calculation2 {
	public static void main(String[] args) throws IOException {
		
		InputStream in = System.in;
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		
		String read1 = br.readLine();
		String read2 = br.readLine();
		
		Integer a = 0;
		Integer b = 0;

		try {
			a = Integer.valueOf(read1);
			b = Integer.valueOf(read2);
		} catch(NumberFormatException e) {
			System.out.println("10이하의 숫자만 입력해주세요");
			System.exit(0);
		}
		
		if (a < 0 | a > 10 | b < 0 | b > 10) return;
		
		
		Integer c = a+b;
		
		if (c > 10) return;
		
		System.out.println(c);
	}
}
