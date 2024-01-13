package com.leetcode

/**
 * https://leetcode.com/problems/number-of-arithmetic-triplets/description/
 */
class NumberOfArithmeticTriplets {
    fun arithmeticTriplets(nums: IntArray, diff: Int): Int {
        val arithmeticTriplets = ArithmeticTriplets(nums, diff)
        var result = 0

        for (i in 0 until nums.size - 2) {
            for (j in i + 1 until nums.size - 1) {
                for (k in j + 1 until nums.size) {
                    if (arithmeticTriplets.isArithmeticTriplets(i, j, k)) {
                        result++
                    }
                }
            }
        }

        return result
    }
}

data class ArithmeticTriplets(
    private val nums: IntArray,
    private val diff: Int,
) {
    fun isArithmeticTriplets(i: Int, j: Int, k: Int): Boolean = nums[k] - nums[j] == diff && nums[j] - nums[i] == diff
}