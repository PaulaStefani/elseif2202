fun main(args: Array<String>) {
    atividade1()
    atividade2()
    atividade3()
    atividade4()
    atividade5()
    atividade6()
    atividade7()
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

        //Atividade do WHEN
fun atividade5(): Unit {
    println("Digite o primeiro número:")
    val num1 = readLine()!!.toFloat()
    println("Digite o segundo número:")
    val num2 = readLine()!!.toFloat()
    println("Escolha a operação:\n1 - Somar\n2 - Subtrair\n3 - Multiplicar\n4 - Dividir")
    val operacao = readLine()!!.toInt()

    when (operacao) {
        1 -> println("A soma é ${num1 + num2}")
        2 -> println("A subtração é ${num1 - num2}")
        3 -> println("A multiplicação é ${num1 * num2}")
        4 -> println("A divisão é ${num1 / num2}")
        else -> println("Operação inválida!!")
    }
}
fun atividade6(): Unit {
    println("Digite o total da venda:")
    val totalDaVenda = readLine()!!.toFloat()
    println("Escolha o tipo de cliente?:\n1 - Funcionário\n2 - VIP\n3 - Comum")
    val tipoCliente = readLine()!!.toInt()

    when (tipoCliente) {
        1 -> println("total a pagar: ${totalDaVenda - totalDaVenda * 0.1}")
        2 -> println("Total a pagar: ${totalDaVenda - totalDaVenda * 0.05}")
        else -> println("Total a pagar: $totalDaVenda")
    }
}
fun atividade7(): Unit {
    println("Digite o número correspondente ao mês:")
    val num = readLine()!!.toInt()

    when (num) {
        1 -> println("Janeiro")
        2 -> println("Fevereiro")
        3 -> println("Março")
        4 -> println("Abril")
        5 -> println("Maio")
        6 -> println("Junho")
        7 -> println("Julho")
        8 -> println("Agosto")
        9 -> println("Setembro")
        10 -> println("Outubro")
        11 -> println("Novembro")
        12 -> println("Dezembro")
    }
}

