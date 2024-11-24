package com.leetcode

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class AddTwoNumbersTest : FunSpec({
    val solution = AddTwoNumbers()

    context("테스트케이스에 통과한다") {
        test("l1 = [2,4,3], l2 = [5,6,4], output = [7,0,8]") {
            val l1 = ListNode(2).apply {
                next = ListNode(4).apply {
                    next = ListNode(3)
                }
            }

            val l2 = ListNode(5).apply {
                next = ListNode(6).apply {
                    next = ListNode(4)
                }
            }

            val actual = solution.addTwoNumbers(l1, l2)

            actual shouldBe ListNode(7).apply {
                next = ListNode(0).apply {
                    next = ListNode(8)
                }
            }
        }

        test("l1 = [0], l2 = [0], output = [0]") {
            val l1 = ListNode(0)
            val l2 = ListNode(0)

            val actual = solution.addTwoNumbers(l1, l2)

            actual shouldBe ListNode(0)
        }

        test("l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9], output = [8,9,9,9,0,0,0,1]") {
            val l1 = ListNode(9).apply {
                next = ListNode(9).apply {
                    next = ListNode(9).apply {
                        next = ListNode(9).apply {
                            next = ListNode(9).apply {
                                next = ListNode(9).apply {
                                    next = ListNode(9)
                                }
                            }
                        }
                    }
                }
            }

            val l2 = ListNode(9).apply {
                next = ListNode(9).apply {
                    next = ListNode(9).apply {
                        next = ListNode(9)
                    }
                }
            }

            val actual = solution.addTwoNumbers(l1, l2)

            actual shouldBe ListNode(8).apply {
                next = ListNode(9).apply {
                    next = ListNode(9).apply {
                        next = ListNode(9).apply {
                            next = ListNode(0).apply {
                                next = ListNode(0).apply {
                                    next = ListNode(0).apply {
                                        next = ListNode(1)
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
})