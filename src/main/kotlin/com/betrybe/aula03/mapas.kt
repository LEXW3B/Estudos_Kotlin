package com.betrybe.aula03

/*declarando mapas*/
//mapOf não pode add ou remove
fun map() {
    val students = mapOf("well" to 5, "niva's" to 6, "donna" to 9)
    val colors = mutableMapOf("vermelho" to "red", "blue" to "azul")

    println("$colors significa $colors")
}
/*acessando e modificando valores*/
fun main() {
    val estudanteNota = mapOf("João" to 8, "Maria" to 9, "Pedro" to 7)

    val dictionary = mutableMapOf("Maçã" to "Frutas", "Carro" to "Veículo")
    dictionary["Cachorro"] = "Animal" // Adiciona um novo par chave-valor
    dictionary["Carro"] = "Automóvel" // Atualiza o valor associado a "Carro"
    dictionary.remove("Maçã") // Remove o par chave-valor com a chave "Maçã"
    print(dictionary)

    val dicionario = mutableMapOf("Maçã" to "Fruta", "Carro" to "Veículo")

    for((palavra, significado) in dicionario) {
        println("$palavra significa $significado")
    }
}
/*
size: Propriedade que retorna o número de pares chave-valor no mapa.
isEmpty(): Função que verifica se o mapa está vazio.
isNotEmpty(): Função que verifica se o mapa não está vazio.
*/