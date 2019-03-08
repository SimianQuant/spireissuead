package simianquant.spireissuead

import spire.implicits._
import spire.math.{Jet, JetDim}

object Division {

  implicit val _dim = JetDim(1)

  def main(args: Array[String]): Unit = {
    val a = Jet(0.9244501466787859, Array(0.21762703730059696))
    val b = a / a
    val c = Jet(1)
    println(b == c)
  }

}