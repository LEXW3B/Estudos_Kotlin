package com.betrybe.aula01

/*
Cada degrau de uma escada tem X de altura.
Escreva um programa usando Kotlin que receba
essa altura e a altura que uma pessoa deseja
alcançar usando a escada, calcule e mostro
quantos degraus ela deverá subir para atingir
o seu objetivo, sem se preocupar com a altura
da pessoa. Todas as medidas fornecidas devem
estar em metros.
*/

fun main() {
    print("Qual a altura do degrau: ")
    val step: Double = readln().toDouble()

    print("Qual a altura da escadaria: ")
    val staircase: Double = readln().toDouble()

    print("Deverá subir ${ladder(staircase, step)} degraus.")
}

fun ladder(a: Double, b: Double): Double = a / b