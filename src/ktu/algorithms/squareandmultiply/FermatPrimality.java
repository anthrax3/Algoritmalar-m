package ktu.algorithms.squareandmultiply;

public class FermatPrimality {

	static Square_and_Multiply algorithm = new Square_and_Multiply();
	
	public FermatPrimality() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 * @param a hagi tabanda 2,3,10 
	 * @param n asal testi yapmak istediğimiz sayi
	 * @return true ve ya false
	 */
	public boolean FertmatAsallikTesti(int a,int n){
		
		int y = algorithm.SquareAndMultiply(a, n-1, n);
		
		if (y == 1) 
			return true;
		return false;
		
	}
}
