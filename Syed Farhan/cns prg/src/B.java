import java.util.Scanner;

public class B {
	private int D[];
	private int num;
	public static final int Max = 999;

	public B(int num) {
		this.num = num;
		D = new int[num + 1];
	}

	public void BE(int s, int A[][]) {
		for (int node = 1; node <= num; node++) {
			D[node] = Max;
		}
		D[s] = 0;
		for (int node = 1; node <= num - 1; node++) {
			for (int sn = 1; sn <= num; sn++) {
				for (int dn = 1; dn <= num; dn++) {
					if (A[sn][dn] != Max) {
						if (D[dn] > D[sn] + A[sn][dn])
							D[dn] = D[sn] + A[sn][dn];
					}
				}
			}
		}
		for (int sn = 1; sn <= num; sn++) {
			for (int dn = 1; dn <= num; dn++) {
				if (A[sn][dn] != Max) {
					if (D[dn] > D[sn] + A[sn][dn])
						System.out.println("Negative cycle");
				}
			}
		}
		for (int v = 1; v <= num; v++) {
			System.out.println("Distance of source" + s + "to " + v + "is" + D[v]);
		}
	}

	public static void main(String args[]) {
		int num = 0;
		int s;
		Scanner input = new Scanner(System.in);
		System.out.println("Enetr vertex");
		num = input.nextInt();
		int A[][] = new int[num + 1][num + 1];
		System.out.println("enetr matrix");
		for (int sn = 1; sn <= num; sn++) {
			for (int dn = 1; dn <= num; dn++) {
				A[sn][dn] = input.nextInt();
				if (sn == dn) {
					A[sn][dn] = 0;
					continue;
				}
				if (A[sn][dn] == 0) {
					A[sn][dn] = Max;
				}
			}
		}
		System.out.println("Eneter source vertex");
		s = input.nextInt();
		B bb = new B(num);
		bb.BE(s, A);
		input.close();
	}
}