package com.programmers.lessons

import io.kotest.core.spec.style.FunSpec
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.matchers.shouldBe

class Lesson43162Test : FunSpec({
    context("프로그래머스 네트워크 문제 테스트") {
        test("주어진 테스트케이스를 통과한다.") {
            forAll(
                row(
                    3,
                    arrayOf(
                        intArrayOf(1, 1, 0),
                        intArrayOf(1, 1, 0),
                        intArrayOf(0, 0, 1),
                    ),
                    2,
                ),
                row(
                    3,
                    arrayOf(
                        intArrayOf(1, 1, 0),
                        intArrayOf(1, 1, 1),
                        intArrayOf(0, 1, 1),
                    ),
                    1
                ),
            ) { n, computers, expected ->
                val actual = Lesson43162().solution(n, computers)
                actual shouldBe expected
            }
        }
    }
})
