package com.basic.operator

class IncrementOperator {

	companion object {
		@JvmStatic
		fun main(args: Array<String>) {
			var a = 5
			var b = a++
			var c = a
			var d = ++a
			println(a)
			println(b)
			println(c)
			println(d)
			println()

			var e = 5
			println(e)
			println(e++)
			println(++e)
			println(e)
			println(e--)
			println(--e)
		}
	}
}
