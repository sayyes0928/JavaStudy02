package team1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;

public class Output {

	void print() {
		System.out.println("1��");
		try {
			BufferedReader in = new BufferedReader(new FileReader("d:jsi0928.txt"));
			System.out.println("2��");
			String s;
			while ((s = in.readLine()) != null) {
				
				System.out.println("3��");
			
				String[]list = s.split(",");
				String id = list[0];
				String pw = list[0];
				System.out.println(id);
			}
		} catch (Exception e) {
		}
	}
}
