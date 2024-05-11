package com.basic.operator

import kotlin.random.Random

class ComparisonOperator {

	companion object {
		@JvmStatic
		fun main(args: Array<String>) {
			var a = Random.nextInt(10)
			var b = Random.nextInt(10)
			println("a : $a")
			println("b : $b")

			println(a > b)
			println(a >= b)
			println(a < b)
			println(a <= b)
			println(a == b)
			println(a != b)
		}
	}
}
