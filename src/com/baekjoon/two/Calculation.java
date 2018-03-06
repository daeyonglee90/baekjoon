package com.baekjoon.two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
 * 사칙연산
 *  - 문제
 *    두 자연수 A와 B가 주어진다. 이 때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오. 
 *  - 입력
 *    두 자연수 A와 B가 주어진다. (1 ≤ A, B ≤ 10,000)
 *  - 출력
 *    첫째 줄에 A+B, 둘째 줄에 A-B, 셋째 줄에 A*B, 넷째 줄에 A/B, 다섯째 줄에 A%B를 출력한다.
 *    
 *  - Example
 *    입력
 *    7 3
 *    출력
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
		   System.out.println("숫자만 입력 가능합니다.");
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
