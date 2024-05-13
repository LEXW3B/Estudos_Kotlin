package com.betrybe.aula01

/*
Escrevas um programa em Kotlin que
receba dois números e mostre o maior.
*/

fun main() {
    print("Digite o primeiro número: ")
    val firstNumber: Float = readln().toFloat()

    print("Digite o segundo número: ")
    val secondNumber: Float = readln().toFloat()

    if(firstNumber > secondNumber) {
        print("O maior número entre é $firstNumber")
    } else if(secondNumber > firstNumber) {
        print("O maior número entre é $secondNumber")
    } else {
        print("Tente novamente!")
    }
}