package com.programmers.lessons

/**
 * @see <a href="https://school.programmers.co.kr/learn/courses/30/lessons/43162">네트워크 문제</a>
 */
class Lesson43162 {
    fun solution(n: Int, computers: Array<IntArray>): Int {
        val unionFind = UnionFind(n)
        for ((i, computer) in computers.withIndex()) {
            for (j in i + 1 until computer.size) {
                if (computer[j] == 1) {
                    unionFind.union(i, j)
                }
            }
        }

        return (0 until n)
            .map { unionFind.find(it) }
            .distinct()
            .count()
    }

    class UnionFind(size: Int) {
        private val parents = IntArray(size) { it }

        fun find(n: Int): Int {
            if (parents[n] == n) {
                return n
            }

            parents[n] = find(parents[n])
            return parents[n]
        }

        fun union(a: Int, b: Int) {
            val parentA = find(a)
            val parentB = find(b)
            if (parentA != parentB) {
                parents[parentB] = parentA
            }
        }
    }
}
