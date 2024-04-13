package com.leetcode

import java.util.concurrent.atomic.AtomicInteger

/**
 * https://leetcode.com/problems/delete-columns-to-make-sorted/
 */
class DeleteColumnsToMakeSorted {
    fun minDeletionSize(strs: Array<String>): Int {
        val columns = strs[0].length
        val rows = strs.size
        val result = AtomicInteger()

        for (column in 0 until columns) {
            for (row in 0 until rows - 1) {
                val current = strs[row][column]
                val next = strs[row + 1][column]
                if (next < current) {
                    result.incrementAndGet()
                    break
                }
            }
        }

        return result.get()
    }
}