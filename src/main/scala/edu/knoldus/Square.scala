package edu.knoldus

import scala.annotation.tailrec

class Square {

@tailrec
final  def squareList(xs: List[Int],acc: List[Int]= List()): List[Int] =
    xs match {
      case List() => acc
      case head :: tail => squareList(tail,acc :+ (head*head) )
    }


  def squareListMap(xs: List[Int]): List[Int] = {
   xs.map( x => x * x)
  }
}

