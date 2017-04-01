package ktu.algorithms.squareandmultiply;

public class MainTest {

	
	static Square_and_Multiply algorithm = new Square_and_Multiply();
	static FermatPrimality fermat = new FermatPrimality();
	
	public static void main(String[] args) {
		
		System.out.println("Algoritma sonucu : ");
		int result = algorithm.SquareAndMultiply(17, 22, 21);
		System.out.println("Sonuc 1 :"+result);
		int result2 = algorithm.SquareAndMultiply(21, 24, 8);
		System.out.println("Sonuc 2 : "+result);
		
		System.out.println();
		System.out.println("Fermat Asallik testi");
		int a=10,n=101;
		if (fermat.FertmatAsallikTesti(a,n)) {
			System.out.println(n +" Sayisi Asaldir");
		}else System.out.println(n + " Sayisi Asal degildir.");

	}
}
