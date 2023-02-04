package com.programmers.lessons

import io.kotest.core.spec.style.FunSpec
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.matchers.shouldBe

class Lesson155652Test : FunSpec({
    context("둘만의 암호 문제 테스트") {
        test("테스트 케이스가 정상적으로 통과한다.") {
            forAll(
                row("aukks", "wbqd", 5, "happy"),
                row("xyzabc", "yzabcd", 1, "eeeeee"),
            ) {s, skip, index, expected ->
                val actual = Lesson155652().solution(s, skip, index)
                actual shouldBe expected
            }
        }
    }

})
