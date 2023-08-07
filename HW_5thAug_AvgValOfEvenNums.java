package Aug04th5th_HW.Aug4and5HW;

import org.junit.Assert;
import org.junit.Test;

public class HW_5thAug_AvgValOfEvenNums {

	@Test
	public void test1()
	{
		int actual = avgValOfEvenNums(new int[] {1,3,6,10,12,15});
		Assert.assertEquals(actual, 9);
	}
	
	@Test
	public void test2()
	{
		int actual = avgValOfEvenNums(new int[] {1,2,4,7,10});
		Assert.assertEquals(actual, 0);
	}
	
	public int avgValOfEvenNums(int[] nums)
	{
		int len = nums.length;
		int sum = 0;
		int cnt = 0;
		int avg = 0;
		for (int i = 0; i < len; i++)
		{
			if ((nums[i] % 3) == 0 && (nums[i] % 2 ==0 ))
			{
				sum = sum + nums[i];
				cnt++;
			}
		}
		avg = sum / 2;
		return avg;
	}
}
