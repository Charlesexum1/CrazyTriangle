import java.util.Scanner;

public class CrazyTriangle {
	
	public void theCrazy(int newSize) {
		double size = newSize;
		int count = 0;
		String s = "*";
		
		for (int x = 1; x <= size; x++ ) {
			System.out.println(s);
			s += "*";
			count++;
			}
		
		s = s.substring (0, s.length() - 1);
		for (int x = 0; x < count - 1 ; x++) {
			s = s.substring(0, s.length() - 1);
			System.out.println(s);
			}
		}
	
	public static void main (String args[]) {
		CrazyTriangle demo = new CrazyTriangle();
		demo.theCrazy(10);
		}
	
	}
