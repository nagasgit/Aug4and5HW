package Aug04th5th_HW;

import org.junit.Assert;
import org.junit.Test;

public class HW_04Aug_SignOfTheProduct {

	@Test
	public void test1() {
		int actual = signFunc(new int[] {-1, -2, -3, -4, 3, 2, 1});
		Assert.assertEquals(actual, 1);
	}

	@Test
	public void test2() {
		int actual = signFunc(new int[] {1, 5, 0, 2, -3});
		Assert.assertEquals(actual, 0);
	}

	@Test
	public void test3() {
		int actual = signFunc(new int[] {-1, 1, -1, 1, -1});
		Assert.assertEquals(actual, -1);
	}

	public int signFunc(int[] input) {
		int len = input.length;
		int res = input[0] * input[1];
		for (int i = 2; i < len; i++) {
			res = res * input[i];
		}
		if (res > 1) {
			return 1;
		} else if (res == 0) {
			return 0;
		} else if (res < 0) {
			return -1;
		}
		return 0;
	}
}
