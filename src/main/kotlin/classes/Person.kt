package com.basic.classes

class Person {

	var name: String = "Minsu"
	var age: Int = 20
	var country: String = "South Korea"
	var heignt: Int = 170
	var weight: Int = 60

	fun sayHello() {
		println("hello")
	}

	fun introduce() {
		println("My name is $name and my age is $age")
	}
}
