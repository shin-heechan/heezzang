package ps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
	
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				int a = Integer.valueOf(br.readLine());
				long sum = 0;
				String b = br.readLine();
				for(int i=0; i<a; i++) {
					sum += b.charAt(i)-'0';
				}
				System.out.println(sum);
			}
		

	}

