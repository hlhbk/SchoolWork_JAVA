package W001;

import java.io.FileWriter;
import java.io.PrintStream;

public class Grandmother {// ÍâÆÅ
	private int n;
	public Grandmother(int n) {
		// TODO Auto-generated constructor stub
		this.n=n;
	}

	public void sing() throws Exception{// 99Êýµ½0£¬
		PrintStream pp=new PrintStream("src/W001/Grandmother.txt");
		System.setOut(pp);
		String bb = "bottle";
		while (n > 0) {
			if (n > 1) {
				bb="bottles";
			}
			System.out.println(n + " " + bb + " of beer on the wall!");
			System.out.println(n + " " + bb + " of beer!");
			System.out.println(" take one down!");
			System.out.println(" pass it around!");
			--n;
		}
		System.out.println("no more bottles of beer on the wall!");
		}
	public static void main(String[] args) throws Exception{
		Grandmother wolfpopo=new Grandmother(99);
		wolfpopo.sing();
	}
}
