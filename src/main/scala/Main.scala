object Main extends App {

  import NeverNull._

  def totalLista[A](lista: List[A]) {
    val total = lista.toOption.getOrElse(List()).size
    println(s"Total Lista: $total")
  }

  def totalCaracteres(valor: String) {
    val total = valor.toOption.getOrElse("").length
    println(s"Total Caracteres: $total")
  }


  totalLista(List("Fulano", "Sicrano", "Beltrano"))

  totalLista(null)

  totalCaracteres("Fulano da Silva")

  totalCaracteres(null)

}
