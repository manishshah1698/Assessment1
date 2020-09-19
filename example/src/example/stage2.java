package example;

public class stage2 {
	public String fizzBuzz(int num)
	{
		if(num % 15 ==0)
			return "FizzBuzz";
		else if(num % 5 == 0 || num / 10 == 5 || num % 10 == 5)
			return "Buzz";
		else if(num % 3 == 0 || num / 10 == 3 || num % 10 == 3)
			return "Fizz";
		else
			return String.valueOf(num);
	}
	public static void main(String [] args)
	{
		stage2 f = new stage2();
		for(int i=1;i<=100;i++)
		{
			System.out.println(f.fizzBuzz(i));
		}
	}

}
