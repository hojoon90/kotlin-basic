package com.basic.classes

class PersonWithConstructor constructor(private val name: String, private val age: Int) {

	private var etc: String = "no value"

	init {
		println("initializer block: $etc")
	}

	constructor(name: String) : this(name, 20)

	constructor(name: String, age: Int, etc: String) : this(name, age) {
		this.etc = etc
		println("additional constructor is called: ${this.etc}")
	}

	fun sayHello() {
		println("hello")
	}

	fun introduce() {
		println("My name is $name and my age is $age")
	}
}
