import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		List<List<Integer>> lines = new ArrayList<List<Integer>>();
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			List<Integer> line = new ArrayList<Integer>();
			int d = in.nextInt();
			for (int j = 0; j < d; j++) {
				line.add(in.nextInt());
			}
			lines.add(line);
		}

		int q = in.nextInt();
		for (int i = 0; i < q; i++) {
			int x = in.nextInt();
			int y = in.nextInt();
			if (y > lines.get(x - 1).size()) {
				System.out.println("ERROR!");
			} else {
				System.out.println(lines.get(x - 1).get(y - 1));
			}
		}

		in.close();
	}
}

#Sample Input :

5
5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33
5
1 3
3 4
3 1
4 3
5 5
  
  
#Sample Output :

74
52
37
ERROR!
ERROR!
