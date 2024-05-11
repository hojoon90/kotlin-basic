package com.basic.function

fun main(args: Array<String>) {
	println(sum1(1, 12))
	println(sum2(1, 12))
	noReturnFunction("unused value")
	defaultParameter("my value")
	defaultParameter()
	namedArgument(a = "aaa", c = "ccc", b = "bbb")
}

fun sum1(a: Int, b: Int): Int {
	return a + b
}

fun sum2(a: Int, b: Int) = a + b

fun noReturnFunction(a: String) {
	println("called: $a")
}

fun defaultParameter(a: String = "default value") {
	println(a)
}

fun namedArgument(a: String, b: String, c: String) {
	println("$a $b $c")
}
