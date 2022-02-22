fun main(args: Array<String>) {
    atividade1()
    atividade2()
    atividade3()
    atividade4()
}

fun atividade1(): Unit {
    val pedro = Aluno("Pedro", 9f, 10f)
    println(pedro.verificarSituacao())
}

fun atividade2(): Unit {
    println("Digite o gênero com qual você se identifica:\nm - Masculino\nf - Feminino\no - Outro")
    val genero = readLine()!!

    if (genero.equals("m", true))
        println("Bem-vindo, senhor!")
    else if (genero.equals("f", true))
        println("Bem-vinda, senhora!")
    else if (genero.equals("o", true))
        println("Bem vindo!")
    else
        println("Gênero inválido!!")
}

fun atividade3(): Unit {
    println("Digite o primeiro número:")
    val num1 = readLine()!!.toFloat()
    println("Digite o segundo número:")
    val num2 = readLine()!!.toFloat()
    println("Digite o terceiro número:")
    val num3 = readLine()!!.toFloat()


    if (num1 > num2 && num1 > num3)
        println("O primeiro número é o maior deles!!")
    else if (num2 > num1 && num2 > num3)
        println("O segundo número é o maior deles!!")
    else (num3 > num1 && num3 > num2)
    println("O terceiro número é o maior deles!!")
}

//Faça um programa que pergunte em que turno você estuda.
// Peça para digitar M-matutino ou V-vespertino ou N-noturno.
// Imprima a mensagem “Bom dia!”, “Boa tarde!”, “Boa Noite!”
// ou “Valor inválido”, conforme o caso.

fun atividade4(): Unit {
    println("Digite o turno em que você estuda.\nM - Matutino\nV - Vespertino\nN - Noturno")
    val turno = readLine()!!
    if (turno.equals("m", true))
        println("Bom dia!")
    else if (turno.equals("v"))
        println("Boa tarde!")
    else if (turno.equals("n"))
        println("Boa noite!")
    else
        println("Inválido! Tente novamente.")
}
