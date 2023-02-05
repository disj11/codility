package com.programmers.lessons

/**
 * @see <a href="https://school.programmers.co.kr/learn/courses/30/lessons/155651">호텔 대실</a>
 */
class Lesson155651 {
    fun solution(bookTimes: Array<Array<String>>): Int {
        val arr = Array(24 * 60 + 10) { 0 }
        for (bookTime in bookTimes.map(BookTime::from)) {
            arr[bookTime.checkInTime]++
            arr[bookTime.checkOutTime]--
        }

        var answer = 0
        for (i in 1 until arr.size) {
            arr[i] += arr[i - 1]
            answer = answer.coerceAtLeast(arr[i])
        }
        return answer
    }

    class BookTime(
        val checkInTime: Int,
        val checkOutTime: Int,
    ) {
        companion object {
            fun from(values: Array<String>): BookTime {
                val checkInTimes = values[0].split(":")
                val checkOutTimes = values[1].split(":")
                val checkInTime = checkInTimes[0].toInt() * 60 + checkInTimes[1].toInt()
                val checkOutTime = (checkOutTimes[0].toInt() * 60 + checkOutTimes[1].toInt() + 10).coerceAtMost(60 * 24)
                return BookTime(
                    checkInTime,
                    checkOutTime,
                )
            }
        }
    }
}
