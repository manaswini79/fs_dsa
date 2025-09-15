// An Isosceles triangle is a triangle having two sides with equal in length.
// for example: three points i, j, k are given, if the distance between i and j, 
// i and k are equal. So that, i, j, k can form isosceles triangle.

// You are given n points in a flat surface, the point consist of x and y co-ordinates.
// Your task is to findout the number of isosceles triangles can be formed.

// Input Format:
// -------------
// Line-1 : An integer N.
// Next N lines : Two space separated integers, x & y coordinates.

// Output Format:
// --------------
// Print an integers, number of Isosceles triangles


// Sample Input-1:
// ---------------
// 3
// 0 0
// 1 0
// 2 0

// Sample Output-1:
// ----------------
// 2

// Explanation:
// ------------
// The two isosceles triangles are [[1,0],[0,0],[2,0]] and [[1,0],[2,0],[0,0]]

import java.util.*;
class point{
	int x;
	int y;
	point(int x, int y){
		this.x = x;
		this.y = y;
	}
}
class test {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		point arr[] = new point[n];
		for(int i=0;i<n;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			arr[i] = new point(a,b);
		}
		
		int count=0;
		
		for(int i=0;i<n;i++) {
			Map<Integer, Integer> dist = new HashMap<>();
			
			for(int j=0;j<n;j++) {
				if(i==j)continue;
				
				int x = arr[i].x - arr[j].x;
				int y = arr[i].y - arr[j].y;
				int d = x*x + y*y;
				
				dist.put(d, dist.getOrDefault(d, 0)+1);
			}
			for(Integer d:dist.values()) {
				if(d>=2) {
					count+= d*(d-1);
				}
			}
		}
		System.out.println(count);
		
	}
}


