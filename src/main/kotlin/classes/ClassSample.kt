package com.basic.classes

fun main() {
    var aMan = Person()
    aMan.sayHello()
    aMan.introduce()

    aMan.age=25
    println("Sorry. My real age is ${aMan.age}")

    println("=============================")

    val minsu = PersonWithConstructor("minsu", 30)
    val henry = PersonWithConstructor("henry")
    val sainz = PersonWithConstructor(name = "sainz", etc = "driver", age = 30)

    minsu.sayHello()
    minsu.introduce()

    henry.sayHello()
    henry.introduce()

    sainz.sayHello()
    sainz.introduce()


}