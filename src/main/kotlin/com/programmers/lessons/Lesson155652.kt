package com.programmers.lessons

/**
 * @see <a href="https://school.programmers.co.kr/learn/courses/30/lessons/155652">둘만의 암호</a>
 */
class Lesson155652 {
    fun solution(s: String, skip: String, index: Int): String {
        val charArray = s.toCharArray()
        val skipArray = skip.toCharArray()
        for (i in charArray.indices) {
            charArray[i] = next(charArray[i], skipArray, index)
        }
        return String(charArray)
    }

    private fun next(char: Char, skipArray: CharArray, index: Int): Char {
        if (index == 0) {
            return char
        }

        return (char.code + 1)
            .toAlphabet()
            .let {
                return if (skipArray.contains(it)) {
                    next(it, skipArray, index)
                } else {
                    next(it, skipArray, index - 1)
                }
            }
    }

    private fun Int.toAlphabet() = if (this > 'z'.code) {
        (('a'.code - 1) + (this % 'z'.code)).toChar()
    } else {
        toChar()
    }
}