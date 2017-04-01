package ktu.algorithms.chineseremaindertheorem;

public class ChineseRemainder {

	public ChineseRemainder() {
		// TODO Auto-generated constructor stub
	}

	/**Açıklama :
	 * 				x = 2mod3
	 * 				x = 3mod5
	 * 				x = 2mod2
	 * 
	 * @param k kaça bölünecek
	 * @param a kalanı ifade eder
	 * @param m modulü ifade eder
	 * @return
	 */
	public int ChineseAlgorithm(int k, int a[], int m[]) {

		int M = 1;
		int[] Ms = new int[k];
		int[] InvMs = new int[k];
		for (int i = 0; i < k; i++) {
			M = M * m[i];
		}
		for (int i = 0; i < k; i++) {
			Ms[i] = M / m[i];
			// InvMs[i] = (1/Ms[i]) % m[i];
			InvMs[i] = modInverse(Ms[i], m[i]);
		}
		int x = 0;
		for (int i = 0; i < k; i++) {
			x +=(a[i] * Ms[i] * InvMs[i]);
			x = x % M;
		}
		System.out.println(x);
		return x;
	}

	public int modInverse(int a, int m) {

		int i = 0;
		for (i = 1; i < a * a; i++) {
			if ((1 + m * i) % a == 1) {
				return i % m;
			}
		}
		return -1;

	}
}
