package ktu.algorithms.euclide;

public class MainTest {

	static Euclide euclide = new Euclide();
	
	public static void main(String[] args) {
		
		
		System.out.print("Mod alma islemli euclide : ");
		int resultMod = euclide.gcdMod(280, 160);
		System.out.println(resultMod);
		System.out.print("Cikarma  islemli euclide : ");
		int resultSub = euclide.gcdRecursive(280, 160);
		System.out.println(resultSub);
		System.out.print("Recursive alma islemli euclide : ");
		int resultRecursive = euclide.gcdRecursive(280,160);
		System.out.println(resultRecursive);

	}
	
}
