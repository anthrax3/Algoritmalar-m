package ktu.algorithms.squareandmultiply;

public class Square_and_Multiply {
	
	
	public Square_and_Multiply() {
		// TODO Auto-generated constructor stub
		
	}
	public static int SquareAndMultiply(int a,int b,int n) {
		char [] binary = convertBinary(b).toCharArray();
		int y=1;
		for (int i = 0; i<binary.length; i++) {
			if(binary[i] == '1') {
				y = (y*a)%n;
			}
			a = (a*a)%n;
		}
		return y;
	}
	public static String convertBinary(int n){
		StringBuilder binary = new StringBuilder();
		while(n>0){
			if ((n&1) == 1) {
				binary.append(1);
			}else
				binary.append(0);
			n>>=1;
		}
		//char [] binary2 = binary.toString().toCharArray();
		//System.out.println(binary2.length);

		return binary.toString();
	}

}
