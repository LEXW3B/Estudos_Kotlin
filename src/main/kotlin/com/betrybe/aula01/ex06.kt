package com.betrybe.aula01

/*
Escrevas um programa em Kotlin que receba três
notas de uma pessoa estudante e mostre a média
aritmética e a mensagem conforme as regras a
seguir:

Média aritmética igual ou maior que 0,0 e menor do que 3,0, exibir a mensagem REPROVADO
Média aritmética igual ou maior que 3,0 e menor do que 7,0, exibir a mensagem EXAME
Média aritmética igual ou maior que 7,0 e menor do que 10,0, exibir a mensagem APROVADO
*/

fun main() {
    print("Digite a primeira nota: ")
    val firstNote: Float = readln().toFloat()
    print("Digite a segunda nota: ")
    val secondNote: Float = readln().toFloat()
    print("Digite a terceira nota: ")
    val thirdNote: Float = readln().toFloat()

    val note:Float = midian(firstNote, secondNote, thirdNote)

    if (note in 0.0..3.0) {
        print("REPROVADO")
    } else if(note >= 3.0 && note < 7.0) {
        print("EXAME")
    } else {
        print("APROVADO")
    }
}

fun midian(a: Float, b: Float, c: Float) = (a + b + c) / 3