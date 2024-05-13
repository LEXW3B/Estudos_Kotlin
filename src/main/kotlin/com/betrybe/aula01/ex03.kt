package com.betrybe.aula01

/*
Escreva um programa usando Kotlin que receba o salário
de uma pessoa colaboradora, calcule e mostre o novo
salário, sabendo-se que este sofreu um aumento de 25%
 */

fun main() {
    print("Digite seu salário: ")
    val salary: Double = readln().toDouble()

    print("Seu novo salário com reajuste de 25% aumentou para ${readjustment(salary)}")
}

fun readjustment(a: Double): Double = (a * 0.25) + a