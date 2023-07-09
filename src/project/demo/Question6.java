package project.demo;

public class Question6 {

	public static int arithmeticProg(int a,int d,int N)
	{
		return ( a + (N - 1) * d );
	}

	public static void main(String[] args)
	{
		int a = 2;

		int d = 1;

		int N = 5;

		System.out.print("The "+ N +"th term of the series is : " +
				arithmeticProg(a, d, N));
	}
}
