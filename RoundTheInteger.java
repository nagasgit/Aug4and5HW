package Aug04th5th_HW.Aug4and5HW;

public class RoundTheInteger {
	
	/***
	 * Given a positive integer n, round it to nearest whole number having zero as last digit.

		Examples: 
		
		Input :  4722
		Output : 4720
		
		Input : 38
		Output : 40
		
		Input : 10
		Output: 10
		
		Input: 35
		Output: 30
			 * 
	 */
	
	/*Pseudo Code
	 * Get the number n
	 * Initialize two variables, rem and m
	 * int rem = n % 10
	 * int m = 10 - rem;
	 * if (n < 10) then return 10;
	 * if rem > 5 then n = n + m
	 * else n = n - rem
	 * return n
	 * 
	 */
	
	public int roundTheInt(int n)
	{
		int rem = n % 10;  //5
		int m = 10 - rem;  //5
		
		if (n <= 10)
			return 10;
		
		if (rem > 5)   // 5 > 5
		{
			n = n + m; //38 + 2 = 40
		}else {
			n = n - rem;
		}			
		return n;
	}
	

}
