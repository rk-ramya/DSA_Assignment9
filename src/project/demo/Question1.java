package project.demo;

public class Question1 {
	static boolean powerOf2(int n)
	{
		if (n == 1)
			return true;

		else if (n % 2 != 0 || n == 0)
			return false;

		return powerOf2(n / 2);
	}

	public static void main(String[] args)
	{
		int n = 64;

		if (powerOf2(n) == true)
			System.out.println("True");
		else
			System.out.println("False");


	}
}