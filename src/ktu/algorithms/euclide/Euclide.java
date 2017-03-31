package ktu.algorithms.euclide;

public class Euclide {

	/**
	 * 
	 * @param x
	 *            birinci sayiyi alir
	 * @param y
	 *            ikinci sayiyi alir
	 * @return bu iki sayinin en büyük böleninin bulur
	 */
	int gcdMod(int x, int y) {
		int tampon = 0;
		while (y != 0) {
			tampon = y;
			y = x % y;
			x = tampon;
		}
		return x;
	}

	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	int gcdSub(int a, int b) {
		while (a != b) { // a b'ye eşit olmayana kadar dönsün
			if (a > b) { // a b den büyük mü
				a -= b; // büyükse a = a-b
			} else { // degilse
				b -= a; // b = a-b
			}
		}
		return a;
	}

	/**
	 * 
	 * @param k
	 * @param l
	 * @return
	 */
	int gcdRecursive(int k, int l) {
		return (l == 0) ? k : gcdRecursive(l, k % l);
	}

}
