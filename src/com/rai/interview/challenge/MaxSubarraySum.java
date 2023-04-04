package com.rai.interview.challenge;

public class MaxSubarraySum {
	public static void main(String[] args) {
		int[] nums = { 1, 3, 5, 6, 8 };
		int maxSum = maxSubarraySum(nums);
		System.out.println("Maximum subarray sum: " + maxSum);
	}

	private static int maxSubarraySum(int[] nums) {
		int maxSoFar = nums[0];
		int maxEndingHere = nums[0];
		for (int i = 1; i < nums.length; i++) {
			maxEndingHere = Math.max(maxEndingHere + nums[i], nums[i]);
			maxSoFar = Math.max(maxSoFar, maxEndingHere);
		}
		return maxSoFar;
	}

}
