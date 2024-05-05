package com.basic.variables

class VariableSample {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val name: String = "my name"
            val org = "Org Sample"
            var age = 20

            age = 15

            println("my name is ${name}")
            println("my organization is ${org}")
            println("my age is $age")
        }
    }
}