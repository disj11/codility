package com.programmers.lessons

import io.kotest.core.spec.style.FunSpec
import io.kotest.data.blocking.forAll
import io.kotest.data.row
import io.kotest.matchers.shouldBe

class Lesson155651Test : FunSpec({
    context("프로그래머스 호텔 대실 문제 테스트") {
        test("주어진 테스트케이스를 통과한다.") {
            forAll(
                row(
                    arrayOf(
                        arrayOf("15:00", "17:00"),
                        arrayOf("16:40", "18:20"),
                        arrayOf("14:20", "15:20"),
                        arrayOf("14:10", "19:20"),
                        arrayOf("18:20", "21:20"),
                    ),
                    3,
                ),
                row(
                    arrayOf(
                        arrayOf("09:10", "10:10"),
                        arrayOf("10:20", "12:20"),
                    ),
                    1,
                ),
                row(
                    arrayOf(
                        arrayOf("10:20", "12:30"),
                        arrayOf("10:20", "12:30"),
                        arrayOf("10:20", "12:30"),
                    ),
                    3,
                ),
            ) { given, expected ->
                val actual = Lesson155651().solution(given)
                actual shouldBe expected
            }
        }
    }
})
