public class DeepestPit {
	public static void main(String[] args) {
		int[] a = { 0, 1, 3, -2, 0, 1, 0, -3, 2, 3 };

		System.out.println(solution(a));

	}

	public static int solution(int[] A) {
		/*int N = A.length;

		int depth = -1;
		int P, Q, R;
		int i = 0, j, k;
		while (i < N - 2) {
			P = A[i];

			j = i + 1;
			int p = P;
			while (j < N - 1 && A[j] < p) {
				p = A[j++];
			}
			if (j == N - 1) {
				break;
			}
			if (j > i + 1) {
				Q = A[j - 1];
			} else {
				i++;
				continue;
			}
			k = j;
			int q = Q;
			while (k < N && A[k] > q) {
				q = A[k++];
			}
            System.out.println(k +"<>"+ j);
			if (k > j) {
				R = A[k - 1];
				System.out.println("depth"+depth);
				depth = Math.max(depth, Math.min(P - Q, R - Q));
				i = k - 1;
			} else {
				i = j - 1;
			}
		}
		return Math.max(depth, -1);*/
		
		int pits = -1;
        int P, Q, R;
        int x = 0, y, z;
        while (x < (A.length-2)) {
            y = x + 1;
            int p = A[x];
            while (y < A.length - 1 && A[y] < p) {
				p = A[y++];
			}
			
			if (y == A.length - 1) {
				break;
			}
			
			int q;
			if (y > x + 1) {
				q = A[y - 1];
			} else {
				x++;
				continue;
			}
			
			z = y;
			while (z < A.length && A[z] > q) {
				q = A[z++];
			}
			System.out.println(z+"<> "+y);
			if (z > y) {
			    System.out.println("pits "+pits);
				pits = Math.max(pits, Math.min(A[x] - A[y - 1], A[z - 1] - A[y - 1]));
				x = z - 1;
			} else {
				x = y - 1;
			}
        }
        return Math.max(pits, -1);
	}

}
