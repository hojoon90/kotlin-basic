package com.basic.variables

class DataTypeSample {

	companion object {

		@JvmStatic
		fun main(args: Array<String>) {
			val num1 = 123
			val num2 = 123L
			val num3 = -123
			val num4: Long = 123
			val num5: Any = 123
			val num6 = 123.456
			val num7: Double = 123.456
			val num8: Float = 123.456F

			val isTrue = true
			val isFalse: Boolean = false
			var isFalse2: Any = false

			val character = 'a'
			println(character)
			println(character + 1)

			val string1 = "text"
			val String2: Any = "text"
			isFalse2 = "oh"
		}
	}
}
