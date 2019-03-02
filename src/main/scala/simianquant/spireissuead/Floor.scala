package simianquant.spireissuead

import spire.implicits._
import spire.math.{Jet, JetDim}

/** Spire implements floors incorrectly. Since the floor of a function is piecewise constant, the derivative, where is is
  * defined is zero.
  *
  * @author Harshad Deo
  * @since 0.1.0
  */
object Floor {

  implicit val _dim = JetDim(2)

  def main(args: Array[String]): Unit = {
    val a = Jet(math.Pi / 3) + Jet.h(0)
    val b = Jet(math.Pi / 4) + Jet.h(1)
    val c = (a + b).sin
    println(s"c: $c, c.floor: ${c.floor}")
  }

}
