package com.example.myapplication

fun main() {
    while (true) {
        println("간단한 계산기 프로그램입니다.")
        println("지원하는 연산: +, -, *, /, % (나머지 연산)")
        println("프로그램을 종료하려면 'exit'을 입력하세요.")

        print("첫 번째 숫자를 입력하세요: ")
        val num1 = readLine()

        if (num1 == "exit") {
            break
        }

        print("연산자를 입력하세요: ")
        val operator = readLine()

        print("두 번째 숫자를 입력하세요: ")
        val num2 = readLine()

        try {
            val result = when (operator) {
                "+" -> num1!!.toDouble() + num2!!.toDouble()
                "-" -> num1!!.toDouble() - num2!!.toDouble()
                "*" -> num1!!.toDouble() * num2!!.toDouble()
                "/" -> {
                    if (num2!!.toDouble() != 0.0) {
                        num1!!.toDouble() / num2!!.toDouble()
                    } else {
                        throw ArithmeticException("Error: 나누는 수는 0이 될 수 없습니다.")
                    }
                }
                "%" -> {
                    if (num2!!.toDouble() != 0.0) {
                        num1!!.toDouble() % num2!!.toDouble()
                    } else {
                        throw ArithmeticException("Error: 나머지 연산의 나누는 수는 0이 될 수 없습니다.")
                    }
                }
                else -> throw IllegalArgumentException("Error: 지원하지 않는 연산자입니다.")
            }

            println("결과: $result")
        } catch (e: Exception) {
            println("오류 발생: ${e.message}")
        }

        println()
    }

    println("프로그램을 종료합니다.")
}
