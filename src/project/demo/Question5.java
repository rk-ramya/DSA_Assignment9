package project.demo;

public class Question5 {
	public static int findMaxRec(int A[], int n)
	{
		if(n == 1)
			return A[0];
		return Math.max(A[n-1], findMaxRec(A, n-1));
	}

	public static void main(String args[])
	{
		int A[] = {1, 4, 45, 6, -50, 10, 2};
		int n = A.length;
		System.out.println(findMaxRec(A, n));
	}
}
