package project.demo;

public class Question2 {		

	static int calculateSum(int n)
	{
		int sum = 0;
		for (int i = 1; i <= n; i++)
			sum = sum + i;
		return sum;
	}
	public static void main(String args[])
	{
		int n = 20;
		System.out.println(calculateSum(n));
	}
}

