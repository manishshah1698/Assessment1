package example;

public class exm {
	public String fizzBuzz(int num)
	{
		if(num % 15 ==0)
			return "FizzBuzz";
		else if(num % 3 ==0)
			return "Fizz";
		else if(num % 5 ==0)
			return "Buzz";
		else
			return String.valueOf(num);
	}
	public static void main(String [] args)
	{
		exm f = new exm();
		for(int i=1;i<=100;i++)
		{
			System.out.println(f.fizzBuzz(i));
		}
	}

}
