package com.leetcode

/**
 * https://leetcode.com/problems/add-two-numbers/submissions/1461219667/
 */
class AddTwoNumbers {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var l1Current = l1
        var l2Current = l2

        val head = ListNode(0)
        var current = head
        var carry = 0

        while (l1Current != null || l2Current != null) {
            val value = (l1Current?.`val` ?: 0) + (l2Current?.`val` ?: 0) + carry
            carry = value / 10

            current.next = ListNode(value % 10)
            current = current.next!!

            l1Current = l1Current?.next
            l2Current = l2Current?.next
        }

        if (carry > 0) {
            current.next = ListNode(carry)
        }

        return head.next
    }
}

class ListNode(val `val`: Int) {
    var next: ListNode? = null

    override fun toString(): String {
        var value = ""
        var current: ListNode? = this
        while (current != null) {
            value += current.`val`
            current = current.next
        }
        return value
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as ListNode
        return this.toString() == other.toString()
    }

    override fun hashCode(): Int {
        return toString().hashCode()
    }
}
