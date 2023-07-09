package project.demo;

public class Question8 {
	public static int product(int A[], int n)
	{
		if(n == 1)
			return A[0];
		
		return A[n-1]* product(A, n-1);
	}

	public static void main(String args[])
	{
		int A[] = {1, 2,3,10};
		int n = A.length;
		System.out.println(product(A, n));
	}
}