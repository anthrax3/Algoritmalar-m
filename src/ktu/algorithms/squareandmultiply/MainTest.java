package ktu.algorithms.squareandmultiply;

public class MainTest {

	
	static Square_and_Multiply algorithm = new Square_and_Multiply();
	
	public static void main(String[] args) {
		
		System.out.println("Algoritma sonucu : ");
		int result = algorithm.SquareAndMultiply(17, 22, 21);
		System.out.println("Sonuc 1 :"+result);
		int result2 = algorithm.SquareAndMultiply(21, 24, 8);
		System.out.println("Sonuc 2 : "+result);


	}
}
