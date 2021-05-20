import scala.io.StdIn.readLine

class MenorDeDois(val x: Int, val y: Int) {
  def run() = if (x < y) x else y
}


object Main extends App {
  print("Digite primeiro numero: ")
  val x = readLine()

  print("Digite segundo numero: ")
  val y = readLine()

  val menorDeDois = new MenorDeDois(x.toInt, y.toInt).run()
  
  println(menorDeDois)
}