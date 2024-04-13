package com.leetcode

import io.kotest.core.spec.style.FunSpec
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.matchers.shouldBe

class DeleteColumnsToMakeSortedTest : FunSpec({
    val solution = DeleteColumnsToMakeSorted()

    context("테스트케이스에 통과한다.") {
        forAll(
            row(arrayOf("cba", "daf", "ghi"), 1),
            row(arrayOf("a", "b"), 0),
            row(arrayOf("zyx", "wvu", "tsr"), 3),
        ) { strs, expected ->
            test("주어진 테스트케이스 strs=${strs.toList()}, expected=$expected") {
                solution.minDeletionSize(strs) shouldBe expected
            }
        }
    }
})
