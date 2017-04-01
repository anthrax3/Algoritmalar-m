package ktu.algorithms.chineseremaindertheorem;

public class MainTest {

	static ChineseRemainder chinese = new ChineseRemainder();
	
	public static void main(String[] args) {
		
		
		
		int k=3;
		int [] a = {2,3,2};
		int [] m = {3,5,7};
		chinese.ChineseAlgorithm(k, a, m);//23 bekliyoruz
	}
}
