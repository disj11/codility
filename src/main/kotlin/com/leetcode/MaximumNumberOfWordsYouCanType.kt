package com.leetcode

/**
 * https://leetcode.com/problems/maximum-number-of-words-you-can-type/description/
 */
class MaximumNumberOfWordsYouCanType {
    fun canBeTypedWords(text: String, brokenLetters: String): Int {
        val textTokens = text.split(" ")
        val brokenChars = brokenLetters.toCharArray()

        return textTokens
            .filterNot { token -> brokenChars.any { token.contains(it) } }
            .size
    }
}