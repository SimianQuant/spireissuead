package simianquant.spireissue

import collection.mutable
import spire.implicits._
import spire.math.{Jet, JetDim}

/** Even though they are modelled as case classes, spire Jets are not immutable because the infinitesimal array is
  * modifiable by the calling code. This has two consequences:
  *
  * <ol>
  *   <li> It breaks referential transparency, i.e. two objects that are equal in one part of a function might not
  *     be equal in another </li>
  *   <li> The equality and hashcode comparisons are based on a mutable member, which means that maps/sets that use the
  *     Jet as a primary key are unlikely to be stable </li>
  * </ol>
  *
  * @author Harshad Deo
  * @since 0.1.0
  */
object MutableMember {

  implicit val _dim = JetDim(2)

  def main(arg: Array[String]): Unit = {
    val a = Jet(1.2) + Jet.h[Double](0)
    val b = Jet(1.2) + Jet.h[Double](0)
    println(s"Declared two identical jets a: $a, and b: $b, a == b: ${a == b}")
    // immutable sets with one member are a special case in scala, and not representative of how Sets, in general, would work
    val st = mutable.Set(a)
    println(s"Added a to a set st. st.contains(a): ${st.contains(a)}")
    a.infinitesimal(1) = 11
    println(s"Modified a. It is now $a")
    println(s"Checking equality: a == b: ${a == b}")
    println(s"Checking whether st contains a: st.contains(a): ${st.contains(a)}")

    println("ho gaya")
  }

}
