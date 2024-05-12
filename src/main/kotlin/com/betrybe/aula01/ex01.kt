package com.betrybe.aula01

/*
Escreva um programa que receba
três números inteiros.
calcule e mostre a média
aritimética simples entre os
números.
 */

fun main() {
    print("Digite o primeiro numero: ")
    val firstNote: Int = readln().toInt()

    print("Digite o segundo número: ")
    val secondNote: Int = readln().toInt()

    print("Digite o terçeiro número: ")
    val thirdNote: Int = readln().toInt()

    val midian: Int = calculateAverage(firstNote, secondNote, thirdNote)
    println("A média aritimética simples é: $midian")
}

fun calculateAverage(a: Int, b: Int, c: Int): Int = (a + b + c) / 3