package problems;

public class Problem025 {

	public static void main(String[] args) {

		// http://de.wikipedia.org/wiki/Fibonacci-Folge#N.C3.A4herungsformel_f.C3.BCr_gro.C3.9Fe_Zahlen
		System.out.println((int)Math.ceil((999 - Math.log10(1 / Math.sqrt(5))) / Math.log10((1 + Math.sqrt(5)) / 2)));
	}
}
