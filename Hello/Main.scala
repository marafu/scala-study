class Pessoa(val pessoa: String) {
  def imprimirNome() = println(pessoa) 
}

object Main extends App {
  val p = new Pessoa("Matheus")
  p.imprimirNome()
}