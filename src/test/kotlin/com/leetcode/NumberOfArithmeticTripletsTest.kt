package com.leetcode

import io.kotest.core.spec.style.FunSpec
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.matchers.shouldBe

class NumberOfArithmeticTripletsTest : FunSpec({
    val numberOfArithmeticTriplets = NumberOfArithmeticTriplets()

    context("주어진 테스트케이스가 통과한다.") {
        forAll(
            row(intArrayOf(0, 1, 4, 6, 7, 10), 3, 2),
            row(intArrayOf(0, 1, 4, 6, 7, 10), 3, 2),
        ) { nums, diff, expected ->
            test("nums=${nums}, diff=${diff}, expected=${expected}") {
                numberOfArithmeticTriplets.arithmeticTriplets(nums, diff) shouldBe expected
            }
        }
    }
})
