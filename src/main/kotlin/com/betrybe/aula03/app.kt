package com.betrybe.aula03

/*
Arrays
*/

fun arrayOf() {//arrayOf
    val num = arrayOf(1, 2, 3, 4, 5)

    for(element in num) {
        println(element)
    }
}

fun array() {
    val n = Array(5) { i -> i * 2 }
    val fristElement = n[0]
    val secondElement = n[10]

    for(element in n) { //array
        println(element)
    }
    print("$fristElement, $secondElement")
}

fun loopFor() {
    val numbers = arrayOf(1, 2, 3, 4, 5)

    for(element in numbers){
        println(element)
    }
}
/*
Size: Propriedade que retorna o tamanho do array.
isEmpty() e isNotEmpty(): Funções que verificam se o array está vazio ou não.
sorted(): Função que retorna um novo array com os elementos classificados.
 */
fun forEach() {
    val num = arrayOf(1, 2, 3, 4, 5)

    num.forEach { number ->
        println(number)
    }
}

          /*COLEÇÕES*/
/*declarando listas*/
fun listOf() {
    val numbs = listOf(1, 2, 3, 4, 5)
    println(numbs)
}

/*listas mutáveis (onde você pode adicionar
e remover elementos) usando a função mutableListOf()*/
fun fruit() {
    val fruits = mutableListOf("maçã", "manga", "morango")
    println(fruits)
}

/*acessando e modificando em listas mutáveis*/
fun f() {
    val fruits = mutableListOf("maçã", "manga", "morango")
    val firstFruit = fruits[0]
    println(firstFruit)

    val addFruit = fruits.add("melancia")// add ao final
    println(addFruit)

    val removeFruit = fruits.remove("maçã")// remove primeiro item
    println(removeFruit)
    println(fruits)
}

/*iteração em listas mutables*/
fun main() {
    val fruits = mutableListOf("maçã", "manga", "morango")
    for(f in fruits) {
        println("* $f")
    }
}
/*
Kotlin fornece várias propriedades e
funções úteis para trabalhar com listas, incluindo:

size: Propriedade que retorna o tamanho da lista.
isEmpty(): Função que verifica se a lista está vazia.
isNotEmpty(): Função que verifica se a lista não está vazia.
sorted(): Função que retorna uma nova lista com os elementos classificados.
*/






