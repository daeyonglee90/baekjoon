import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
 * ���� : �� �ڿ��� A�� B�� �־�����. �� ��, A+B, A-B, A*B, A/B(��), A%B(������)�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
 * �Է� : �� �ڿ��� A�� B�� �־�����. (1 �� A, B �� 10,000)
 * ��� : ù° �ٿ� A+B, ��° �ٿ� A-B, ��° �ٿ� A*B, ��° �ٿ� A/B, �ټ�° �ٿ� A%B�� ����Ѵ�.
 */
public class Calculator {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		
		String data = br.readLine();
		
		if (data.length() > 3)
		{
			return;
		}
		
		if (data.charAt(1) != ' ')
		{
			return;
		}
	}
}
