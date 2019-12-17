package funsets

object Main extends App {
  import FunSets._
  val s1 = singletonSet(1)
  val s2 = singletonSet(2)
  val s3 = singletonSet(3)
  println(FunSets.toString(map(union(s1, union(s2, s3)), e => e * 100)))

}
