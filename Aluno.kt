class Aluno(
   var nome: String,
    var nota1: Float,
    var nota2: Float
) {
    fun verificarSituacao(): String {
        val media = (nota1 + nota2) / 2

        if (media >= 9)
            return "$nome foi aprovado com Distinção!!"
            else if (media >= 6)
                return "$nome foi aprovado!!"
        else if(media >=4)
            return "$nome está em recuperação!!"
         return  "$nome está reprovado"
    }
}