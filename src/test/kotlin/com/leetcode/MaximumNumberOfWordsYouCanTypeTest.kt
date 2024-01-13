package com.leetcode

import io.kotest.core.spec.style.FunSpec
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.matchers.shouldBe

class MaximumNumberOfWordsYouCanTypeTest : FunSpec({
    val maximumNumberOfWordsYouCanType = MaximumNumberOfWordsYouCanType()

    context("테스트케이스에 통과한다.") {
        forAll(
            row("hello world", "ad", 1),
            row("leet code", "lt", 1),
            row("leet code", "e", 0),
        ) { text, brokenLetters, expected ->
            test("text=${text}, brokenLetters=${brokenLetters}, expected=${expected}") {
                maximumNumberOfWordsYouCanType.canBeTypedWords(text, brokenLetters) shouldBe expected
            }
        }
    }
})
