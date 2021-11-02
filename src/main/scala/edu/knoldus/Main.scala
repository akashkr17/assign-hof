package edu.knoldus

object Main extends App {
  val square = new Square()
  val list = List(1,2,3,4)
  println(square.squareList(list))
  println(square.squareListMap(list))

}
