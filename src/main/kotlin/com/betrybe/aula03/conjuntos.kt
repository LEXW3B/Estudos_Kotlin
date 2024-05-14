package com.betrybe.aula03

/*Declarando conjuntos*/
//setOf(): Esta função cria um conjunto
//imutável (não é possível adicionar ou
// remover elementos após a criação)
fun main() {
    val colors = setOf("vermelho", "azul", "verde")
    val itHasRed = "Vermelho" in colors

    for (cor in colors) {
        println(cor)
    }
    //pode add & remover
    val num = mutableSetOf(1, 2, 3, 4, 5)
    num.add(6)
    num.remove(3)

    println(num)
}
/*
Size: Propriedade que retorna o tamanho do conjunto.
isEmpty(): Função que verifica se o conjunto está vazio.
isNotEmpty(): Função que verifica se o conjunto não está vazio.
*/