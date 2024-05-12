package com.betrybe.aula01

/*
Escreva e mostre o salário a receber, sabendo-se
que o funcionário tem gratifícação de 5% sobre o
salário base e paga imposto de 7% também sobre o
salário base.
*/

fun main() {
    print("Digite qual é o seu salário: ")
    val baseSalary: Double = readln().toDouble()

    val salaryGratification: Double = gratification(baseSalary)
    val taxedSalary: Double = (tax(baseSalary))
    val toReceive: Double = (salaryGratification - taxedSalary) + baseSalary

    println("O salário a receber é de $toReceive")
}

fun gratification(a: Double): Double = a * 0.05

fun tax(a:Double): Double = a * 0.07