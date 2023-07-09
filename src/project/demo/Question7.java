package project.demo;

public class Question7 {
	public static String swapString(String a, int i, int j) {    
		char[] b =a.toCharArray();    
		char ch;    
		ch = b[i];    
		b[i] = b[j];    
		b[j] = ch;    
		return String.valueOf(b);    
	}    

	public static void main(String[] args)    
	{    
		String str = "CAT";    
		int len = str.length();    
		System.out.println("permutations of the string are=> ");    
		permutation(str, 0, len);    
	}    

	public static void permutation(String str, int begin, int last)    
	{    
		if (begin == last-1)    
			System.out.println(str);    
		else    
		{    
			for (int i = begin; i < last; i++)    
			{    
				str = swapString(str,begin,i);    
				permutation(str,begin+1,last);    
				str = swapString(str,begin,i);    
			}    
		}    
	}    
}    